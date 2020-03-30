栈和队列：

1.通过两个栈实现队列
    `Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();
    public void push(int node) {
        stack1.push(node);
    }
    public int pop() {
        while(!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
        int first = stack2.pop();
        while(!stack2.isEmpty()){
            stack1.push(stack2.pop());
        }
        return first;
    }`

2.栈的压入、弹出序列(输入两个整数序列，第一个序列表示栈的压入顺序，请判断第二个序列是否可能为该栈的弹出顺序)
    `public boolean IsPopOrder(int [] pushA,int [] popA) {
      if(pushA.length==0||popA.length==0){
          return false;
      }
      Stack<Integer> s = new Stack<Integer>();
      int index = 0;
        for(int i=0;i<pushA.length;i++){
            s.push(pushA[i]);
            while(!s.isEmpty()&&s.peek() == popA[index]){
                s.pop();
                index++;
            }     
        }
        return s.isEmpty();
    }`