package data_structure;

import java.util.EmptyStackException;
import java.util.Stack;

/**
 * 栈 是 Vector 的子类
 * Created by admin on 2017/4/13.
 */
public class StackDemo {

    static void showstack(Stack st){
        System.out.println("stack: "+st);
    }
    static void showpush(Stack st,int a){
        st.push(new Integer(a));
        System.out.println("push("+a+")");
        showstack(st);
    }

    static void showpop(Stack st){
        System.out.print("pop ->");
        Integer a = (Integer) st.pop();
        System.out.println(a);
        showstack(st);
    }

    public static void main(String args[]){
        Stack st = new Stack();
        showstack(st);
        showpush(st,42);
        showpush(st,55);
        showpush(st,98);
        showpop(st);
        showpop(st);
        showpop(st);

        try{
            showstack(st);
        }catch (EmptyStackException e){
            System.out.println("empty stack");
        }
    }
}
