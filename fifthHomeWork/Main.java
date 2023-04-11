import java.util.Arrays;
import java.util.Stack;

/**
 *Implement a function that performs the "normalization" of a given path, that is,
 *removing unnecessary directories from it, taking into account the transitions "." and "..".
 */


public class Main {

    public static String normalization(String str){
        StringBuilder output = new StringBuilder();
        String[] buff = str.split("/");
        Stack<String> stack = new Stack<>();

        //Use stack because out path start from the end and we just find first ".."
        stack.addAll(Arrays.asList(buff));
        boolean work = true;
        while(work){
            System.out.println(stack.peek());
            if(stack.peek().equals("..")){
                System.out.println("kok");
                work = false;
                output.insert(0, stack.pop());
            }else if(stack.peek().equals(".")){
                System.out.println("op");
                work = false;
                output.insert(0, "..");
            }else{
                output.insert(0,"/" + stack.pop());
            }
        }

        return output.toString() ;
    }


    public static void main(String[] args) {

        System.out.println(normalization("КРОК/task_5_2/src/./../../task_5_1/../../../мемы/котики"));

    }


}

/*Не совсем понял это задание и как оно должно работать, в основном из-за примера, потому что с помощью стека
 это очень легко реализовать, если конечно следовать примеру.
 В общем не совсем понял суть задания и как его правильно выполнять
 */
