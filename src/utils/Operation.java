package utils;

import java.io.Serializable;

public enum Operation implements Serializable{
	AND, OR, NOT, IMPLICATION , FALSE, TRUE;
	

    public String toString(){
        switch(this){
        case AND :
            return "AND";
        case OR :
            return "OR";
        case NOT :
            return "NOT";
        case IMPLICATION :
            return "IMPLICATION";
        case FALSE :
            return "FALSE";
        case TRUE :
            return "TRUE";
        }
        return null;
    }
// IMPLEMENTED BY DEFAULT ( METHOD VALUE OF)
//    public static Operation valueOf(Class<Operation> enumType, String value){
//        if(value.equalsIgnoreCase(AND.toString()))
//            return Operation.AND;
//        else if(value.equalsIgnoreCase(OR.toString()))
//            return Operation.OR;
//        else if(value.equalsIgnoreCase(NEGATION.toString()))
//            return Operation.NEGATION;
//        else
//            return null;
//    }
}
