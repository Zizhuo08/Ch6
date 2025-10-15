public class Chapter6 {
    public static void main(String args[]){
        System.out.println(ppap("I have a pen, I have an apple."));
        System.out.println(isPalindrome("Amy, must I jujitsu my ma"));
        System.out.println(isPalindrome("A man, a plan, a canal: Panama."));
        System.out.println(isPalindrome("itiogjid"));
        System.out.println(convertToBinary(20));
        System.out.println(pigLatin("I love starcraft"));
    }
    
    public static String ppap (String str){
        String result = "";
        String Object1 = "";
        String Object2 = "";
        Object1 += str.substring(9, str.indexOf(",", 9));
        Object2 += str.substring(str.indexOf(",", 9) + 12, str.length() - 1);
        result += "Uh! " + Object2 + " " + Object1 + ".";
        return result;
    }
    
    public static boolean isPalindrome(String str){
        boolean result = false;
        String newStr = ""; 
        String nonLetters = ",.:;()[]{}!@#$%^&* ";
        for (int i = 0; i < str.length(); i ++){
            if (!nonLetters.contains(str.substring(i,i+1))){
                newStr += str.substring(i, i+1);
            }
        }
        newStr = newStr.toLowerCase();
        for (int i = 0; i < str.length() / 2; i ++){
            if (!newStr.substring(i, i + 1).equals(newStr.substring(newStr.length()-i-1,newStr.length()-i))){
                return false;
            } else {
                result = true;
            }
        }
        return result;
    } 
    
    public static String convertToBinary (int num){
        String result = "";
        int temp = num;
        while (temp > 0){
            result = temp % 2 + result;
            temp /= 2;
        }
        return result;
    }
    
    public static String pigLatin (String msg) {
        String result = "";
        String temp = "";
        int i = 0;
        while (i <= msg.length()){
            int spaceIndex = msg.indexOf(" ", i);
            if (spaceIndex == -1){
                temp = msg.substring(i);
            } else {
                temp = msg.substring(i, msg.indexOf(" ", i));
            }
            
            result += singlePigLatin(temp);
            result += " ";
            i += temp.length() + 1;
        }
        return result;
    }
    
    public static String singlePigLatin (String msg){
        String result = "";
        if (msg.length() > 2){
            result += msg.substring(1) + msg.substring(0,1) + "ay";
        } else {
            result += msg;
        }
        return result;
    }
}
