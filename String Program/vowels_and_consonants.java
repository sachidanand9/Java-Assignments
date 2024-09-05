// Java Program to count the total number of vowels and consonants in a string

public class vowels_and_consonants{
    public static void main(String[] args) {
        String str = "Ant rides hores dies fish crys man fries";

// variable to store the count of vowels and consonant 
        int vowel_count = 0;
        int consonant_count = 0;

//Converting entire string to lower case to reduce the comparisons
        str = str.toLowerCase();
        
        for(int i = 0;i<str.length();i++){
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {    
                //Increments the vowel counter    
                vowel_count++;    
            }  

            //Checks whether a character is a consonant    
            else if(str.charAt(i) >= 'a' && str.charAt(i)<='z') {      
                //Increments the consonant counter    
                consonant_count++;    
            }    
        }    
        System.out.println("Number of vowels: " + vowel_count);    
        System.out.println("Number of consonants: " + consonant_count); 
        }


    }

