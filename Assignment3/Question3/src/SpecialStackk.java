import java.util.Stack;

public class SpecialStackk {

    private Stack<Integer> st;
    private int min;
    SpecialStackk(){
        st = new Stack<Integer>();
    }
    public void push(int num){
        if(st.isEmpty()){
            min = num;
            st.push(num);
        }
        else if(num<min){
            st.push(2*num - min);
            min = num;
        }
        else
            st.push(num);
    }
    public void pop(){
        if(st.isEmpty()){
            System.out.println("Stack is Empty!");
            return;
        }
        int top = st.pop();
        if(top<min)
        {
            min=2*min-top;
        }
        else{
            System.out.println(top+" is removed from the stack");
        }
    }
    public void isEmpty(){
        if(st.isEmpty())
            System.out.println("Stack is empty");
    }
    public void isFull()
    {


    }
    public int getMin()
    {
        return min;
    }
}
