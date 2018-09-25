public class ArrayPalindrome{
    private ArrayStack<Character> stack0;
    private ArrayStack<Character> stack1;
    private ArrayStack<Character> stack2;

    public ArrayPalindrome(){
        stack0 = new ArrayStack<>();
        stack1 = new ArrayStack<>();
        stack2 = new ArrayStack<>();
    }

    public Boolean isPalindrome(String input){
        for (int i = input.length(); i >= 0; i--){
            stack0.push(input.charAt(i));
            stack1.push(input.charAt(i));
        }
        //stack1 = stack0;
        for (int i = 0; i<stack1.size(); i++){
            char element = stack1.pop();
            stack2.push(element);
        }
        for(int i = 0; i <stack0.size(); i++){
            char element0 = stack0.pop();
            char element1 = stack2.pop();
            if (element0 == element1){
                stack0.clear();
                stack1.clear();
                stack2.clear();
                return true;
            }
        }
        return false;
    }
}