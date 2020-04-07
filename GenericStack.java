class StackFullException extends RuntimeException
 {
    public StackFullException()
      {
        super();
        }   
    public StackFullException(String message)
      {
        super(message);
        } 
 }
class Stack<T> 
{
    private int size;
    private T[] stackAr;
    private int top; 
    public Stack(int size) 
       {
           this.size = size;
           stackAr = (T[])new Object[size]; 
           top = -1; 
         }

    public void push(T value)
         {
           if(isFull())
             {
                  throw new StackFullException("Cannot push "+value+", Stack is full");
                }
           stackAr[++top] = value;
           }
    public T pop() 
        {
           if(isEmpty())
         {
                  throw new StackEmptyException("Stack is empty");
           }
           return stackAr[top--]; 
         }
    public boolean isEmpty()
      {
           return (top == -1);
        }
    public boolean isFull()
       {
           return (top == size - 1);
         }
}
public class GenericStack 
   {
    public static void main(String[] args) 
      {
           Stack<Integer> stack = new Stack<Integer>(10); // Creation of Generic Stack
           stack.push(11);
           stack.push(21);
           stack.push(31);
           stack.push(41);
           stack.push(51);  
           System.out.print("Popped items: ");
           System.out.print(stack.pop()+" ");
           System.out.print(stack.pop()+" ");
           System.out.print(stack.pop()+" ");
           System.out.print(stack.pop()+" ");
           System.out.print(stack.pop()+" ");       
         }
    }