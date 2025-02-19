package Stack;

public class Array_and_ArrayList_Implementation {


    public static class stack{
        private int[] arr = new int[5];
        private int idx = 0;

        void push(int x ){
              if(isfull()){
                  System.out.println("stack is full");
                  return;
              }

                  arr[idx] = x;
                  idx++;
        }

        int peek(){
            if(idx == 0){
                System.out.println("stack is empty");
            }

            return  arr[idx -1 ];
        }

        void display(){
            for(int i =0 ; i<= idx -1 ; i++){
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }

        int size(){
            return idx;
        }


        boolean isfull() {
            if(arr.length == idx ) {
                return true;
            }

          return false;
        }

        boolean isEmpty(){
            if(idx == 0 ) {
                return true;
            }

            return false;
        }

        int pop(){

            if(isEmpty()){
                System.out.println("stack is empty");
                return -1;
            }
            int top = arr[idx -1];
            arr[idx -1] = 0;
            idx--;

            return  top;
        }
    }
    public static void main(String[] args) {
      stack st = new stack();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        st.display();
        System.out.println(st.isfull());
        System.out.println(st.peek());
        System.out.println(st.isEmpty());
        System.out.println(st.pop());
        System.out.println(st.pop());


    }
}
