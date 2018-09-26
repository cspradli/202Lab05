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
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        ArrayPalindrome test1 = new ArrayPalindrome();
        System.out.println(test1.isPalindrome("elle"));
        ArrayPalindrome test2 = new ArrayPalindrome();
        System.out.println(test2.isPalindrome("bill"));
        ArrayPalindrome test3 = new ArrayPalindrome();
        System.out.println(test3.isPalindrome("fellef"));
        ArrayPalindrome test5 = new ArrayPalindrome();
        System.out.println(test5.isPalindrome(""));
        ArrayPalindrome test6 = new ArrayPalindrome();
        System.out.println(test6.isPalindrome("a"));
        ArrayPalindrome test7 = new ArrayPalindrome();
        System.out.println(test7.isPalindrome("racecar"));
    }
}