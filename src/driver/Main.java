package driver;

import java.io.FileNotFoundException;
import models.Clause;
import models.Formula;
import models.Literal;
import utils.FileManager;
import utils.Operation;

public class Main {

	public static void main(String[] args) {
		try {
			String formulaString = FileManager.openFileOrDie(null);
			Formula formula = formulaParsing(formulaString);
			formula.printFormula();
		} catch (FileNotFoundException e) {
			System.out.println("File not Found!");
		}
	}

	public static Formula formulaParsing(String formula) {
		String[] result = formula.split("[\\(||\\)]");
		Operation SingleOperation = null;
		Operation operation;
		Formula leftClause = null;
		Formula rightClause = null;
		Boolean isLeftClause = false;
		for (int i = 0; i < result.length; i++) {
			if (result[i].trim().equals("")) {
				continue;
			}
			String[] content = result[i].trim().split(" ");
			// in case we have an operation, queue the operation until the next
			// formula is read
			if (content.length == 1) {
				SingleOperation = Operation.valueOf(content[0]);
			} else {
				/*
				 * we have three cases 1- Both literals are positive, we have
				 * length 3 2- Both literals are negative we have length 5 3-
				 * One literal is positive and the other is negative, we have
				 * length 4
				 */
				if (content.length == 3) {
					operation = Operation.valueOf(content[1]);
					/*
					 * a clause could be a part of a larger clause, so we need
					 * to have two different references for left and right and
					 * will be build recursively
					 */
					if (!isLeftClause) {
						leftClause = new Clause(new Literal(content[0]), new Literal(content[2]), operation);
						isLeftClause = true;
					} else {
						rightClause = new Clause(new Literal(content[0]), new Literal(content[2]), operation);
						leftClause = new Clause(leftClause, rightClause, SingleOperation);
					}
				} else if (content.length == 5) {
					// case of both literal are negated

					operation = Operation.valueOf(content[2]);
					/*
					 * a clause could be a part of a larger clause, so we need
					 * to have two different references for left and right and
					 * will be build recursively
					 */
					if (!isLeftClause) {
						leftClause = new Clause(new Literal(content[1], true), new Literal(content[4], true),
								operation);
						isLeftClause = true;
					} else {
						rightClause = new Clause(new Literal(content[1], true), new Literal(content[4], true),
								operation);
						leftClause = new Clause(leftClause, rightClause, SingleOperation);
					}
				} else if (content.length == 4) {
					/*
					 * in this case we have only one negation either in the
					 * first part of the formula or in the second part of the
					 * formula
					 */
					/*
					 * if we have the first string as NOT, then the other
					 * literal will be positive, otherwise, the second literal
					 * is negative
					 */
					if (content[0].equals(Operation.NOT.toString())) {
						operation = Operation.valueOf(content[2]);
						/*
						 * a clause could be a part of a larger clause, so we
						 * need to have two different references for left and
						 * right and will be build recursively
						 */
						if (!isLeftClause) {
							leftClause = new Clause(new Literal(content[1], true), new Literal(content[3]), operation);
							isLeftClause = true;
						} else {
							rightClause = new Clause(new Literal(content[1], true), new Literal(content[3]), operation);
							leftClause = new Clause(leftClause, rightClause, SingleOperation);
						}
					} else {
						operation = Operation.valueOf(content[1]);
						/*
						 * a clause could be a part of a larger clause, so we
						 * need to have two different references for left and
						 * right and will be build recursively
						 */
						if (!isLeftClause) {
							leftClause = new Clause(new Literal(content[0]), new Literal(content[3], true), operation);
							isLeftClause = true;
						} else {
							rightClause = new Clause(new Literal(content[0]), new Literal(content[3], true), operation);
							leftClause = new Clause(leftClause, rightClause, SingleOperation);
						}
					}

				}
			}
		}
		return leftClause;
	}
}
