package DAY_2.problem;

import java.util.ArrayDeque;

public class ValidParanthesis {
//    find if a string is a valid parenthesis pattern
//    ((()())) - valid
//    ())(()) - invalid
//    ) - invalid
//    ( - invalid
//    )))((( - invalid
//
//   Assumption to better understand:
//            ( == get a loan
//            ) == repay a loan
//*Should always repay the loan you got
//*you cannot repay a loan you don’t have
//*you cannot get a loan not repay it.
    public static void main(String[] args) {
        String str = "((()))";
        ArrayDeque<Character> stack = new ArrayDeque<>();
        for(int i = 0;i<str.length();i++){
            char temp = str.charAt(i);
            if(temp == '('){
                stack.push(temp);
            }else{ // )
                // ( ( ) ) ) ( )
                if(stack.isEmpty()){
                    System.out.println("invalid");
                    break;
                }
                stack.pop();
            }
        }


        System.out.println(stack);

    }




}
