package Stack;

public class StackChallenge {

    //Solution for palindrome
    public void checkForPalindrome(String input){

        LinkedStack ds = new LinkedStack();

        input = input.toLowerCase();
        input = input.replaceAll(" ", "");
        char[] cInput= input.toCharArray();
        char[] palindrome = new char[cInput.length];

        for(char temp : cInput){
            ds.push(temp);
        }

        for(int i = 0; i < cInput.length; i++){
            palindrome[i] = ds.pop();
        }

        if(input.equals(String.valueOf(palindrome)))
            System.out.println("Is palindrome");
        else
            System.out.println("Is not palindrome");
    }
}
