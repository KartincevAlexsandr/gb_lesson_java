package dz1;

public class ReverseWordsInAString {
    class Solution {
        public String reverseWords(String s) {
            String newString = new String();
            String tempString = new String();
            for(int i = s.length()-1; i >= 0 ; i--){
                if( s.charAt(i) == ' ' ){
                    if( tempString.length() > 0){
                        newString += newString.length()>0 ? " " : "";
                        newString += tempString;
                        tempString = new String();
                    }
                }else{
                    tempString = s.charAt(i) + tempString;
                }
            }
            newString += tempString.length()>0 ? " " + tempString : "";

            return newString;
        }
    }
}
