public class ArrayPalindrome{
    private ArrayStack<Character> stack0;
    private ArrayStack<Character> stack1;
    private ArrayStack<Character> stack2;

    public ArrayPalindrome(){
        stack0 = new ArrayStack<Character>();
        stack1 = new ArrayStack<Character>();
        stack2 = new ArrayStack<Character>();
    }

    public Boolean isPalindrome(String input){
        for (int i = 0; i < input.length(); i++){
            stack0.push(input.charAt(i));
            stack1.push(input.charAt(i));     
        }
        for(int i = 0; i < stack0.size(); i++){
            char element0 = stack1.pop();
            stack2.push(element0);
        }
        stack1.clear();
        for(int i = 0; i < stack0.size(); i++){
            char compare0 = stack0.pop();
            char compare1 = stack2.pop();
            if (!(compare0 == compare1)){
                stack0.clear();
                stack2.clear();
                return false;
            }
        }
        stack0.clear();
        stack2.clear();
        return true;
    }
    
    public static void main(String[] args) {
        ArrayPalindrome tests = new ArrayPalindrome();
        System.out.println(tests.isPalindrome("elle"));
        System.out.println(tests.isPalindrome("racecar"));
        System.out.println(tests.isPalindrome("202"));
        System.out.println(tests.isPalindrome("235"));
        System.out.println(tests.isPalindrome("bill"));
        System.out.println(tests.isPalindrome("computers"));
        System.out.println(tests.isPalindrome(""));
        System.out.println(tests.isPalindrome("a"));
    }
}