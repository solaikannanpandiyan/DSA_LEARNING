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

    static void single_symbol(String str){
        ArrayDeque<Character> stack = new ArrayDeque<>();
        for(int i = 0;i<str.length();i++){
            char temp = str.charAt(i);
            if(temp == '('){
                stack.push(temp);
            }else{ // )
                // ( ( ) ) )
                if(stack.isEmpty()){
                    System.out.println("invalid");
                    return;
                }
                stack.pop();
            }
        }
        if(stack.isEmpty()){
            System.out.println("valid");
        }else{
            System.out.println("invalid");
        }
        System.out.println(stack);
    }


    static void multiplesymbols(String str){
        // () {} []
        // ()[]{{}
        ArrayDeque<Character> stack = new ArrayDeque<>();
        for(int i = 0;i<str.length();i++){
            char temp = str.charAt(i);
            if(temp == '(' || temp == '[' || temp == '{'){
                stack.push(temp);
            }else{ // ) ] }
                // ( == )
                // [ == ]
                // { == }
                if(stack.isEmpty()){
                    System.out.println("invalid");
                    return;
                }else{
                    switch (stack.peek()){
                        case '(':
                            if(temp == ')') {
                                stack.pop();
                            }else {
                                System.out.println("invalid");
                                return;
                            }
                            break;
                        case '[':
                            if(temp == ']')
                                stack.pop();
                            else{
                                System.out.println("invalid");
                                return;
                            }
                            break;
                        case '{':
                            if(temp == '}')
                                stack.pop();
                            else{
                                System.out.println("invalid");
                                return;
                            }
                            break;
                    }
                }

            }
        }
        if(stack.isEmpty()){
            System.out.println("valid");
        }else{
            System.out.println("invalid");
        }
        System.out.println(stack);
    }

    public static void main(String[] args) {
//        String str = ")";
        String str_multiple = "{[]}";
//        single_symbol(str);
        multiplesymbols(str_multiple);

    }


    //    ( [ ) ]
    //    ( [ ( { } ) ] )

}
