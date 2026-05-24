// Write a program to print the length of a string.

// public class string {
//     public static void main(String[] args) {
//         String name = "Rahul";
//         System.out.println(name.length());
//     }
// }

// Write a program to print the string in reverse order.

// public class string {
//     public static void main(String[] args) {
//         String name = "Rahul";
//         for (int i = name.length() - 1; i >= 0; i--) {
//             System.out.print(name.charAt(i));
//         }
//     }
// }

// Write a program to check if a string is palindrome or not.

// public class string {    
//     public static void main(String[] args) {
//         String name = "Rahul";
//         String rev = "";
//         for (int i = name.length() - 1; i >= 0; i--) {
//             rev = rev + name.charAt(i);
//         }
//         if (name.equals(rev)) {
//             System.out.println("Palindrome");
//         } else {
//             System.out.println("Not Palindrome");
//         }
//     }
// }

// Write a program to count the number of vowels in a string.

// public class string {    
//     public static void main(String[] args) {
//         String name = "Rahul";
//         int count = 0;
//         for (int i = 0; i < name.length(); i++) {
//             if (name.charAt(i) == 'a' || name.charAt(i) == 'e' || name.charAt(i) == 'i' || name.charAt(i) == 'o' || name.charAt(i) == 'u') {
//                 count++;
//             }
//         }
//         System.out.println(count);
//     }
// }

// Write a program to count the number of words in a string.

// public class string {    
//     public static void main(String[] args) {
//         String name = "Rahul is a good boy";
//         int count = 1;
//         for (int i = 0; i < name.length(); i++) {
//             if (name.charAt(i) == ' ') {
//                 count++;
//             }
//         }
//         System.out.println(count);
//     }
// }

// Write a program to print the string in uppercase.

// public class string {    
//     public static void main(String[] args) {
//         String name = "Rahul";
//         System.out.println(name.toUpperCase());
//     }
// }

// Write a program to print the string in lowercase.

// public class string {    
//     public static void main(String[] args) {
//         String name = "Rahul";
//         System.out.println(name.toLowerCase());
//     }
// }    

// Write a program to check if a string contains a word.

// public class string {    
//     public static void main(String[] args) {
//         String name = "Rahul is a good boy";
//         String word = "good";
//         if (name.contains(word)) {
//             System.out.println("Contains");
//         } else {
//             System.out.println("Not Contains");
//         }
//     }
// }

// Write a program to check to check how many word, special character and integer are there in a string.

// public class string {    
//     public static void main(String[] args) {
//         String name = "Rahul is a good boy 123!@#";
//         int word = 1;
//         int special = 0;
//         int integer = 0;
//         for (int i = 0; i < name.length(); i++) {
//             if (name.charAt(i) == ' ') {
//                 word++;
//             } else if (name.charAt(i) >= '0' && name.charAt(i) <= '9') {
//                 integer++;
//             } else if (name.charAt(i) >= '!' && name.charAt(i) <= '/') {
//                 special++;
//             }
//         }
//         System.out.println("Word: " + word);
//         System.out.println("Special: " + special);
//         System.out.println("Integer: " + integer);
//     }
// }


// Write a program to check if a string is a valid email address.

// public class string {
//     public static void main(String[] args) {
//         String email = "rahul@gmail.com";
//         if (email.contains("@") && email.contains(".")) {
//             System.out.println("Valid");
//         } else {
//             System.out.println("Invalid");
//         }
//     }
// }


// Write a program to check if a string is a valid phone number.

// public class string {
//     public static void main(String[] args) {
//         String phone = "9876543210";
//         if (phone.length() == 10) {
//             System.out.println("Valid");
//         } else {
//             System.out.println("Invalid");
//         }
//     }
// }


// Write a program to check if a string is a valid password. A password must have at least 8 characters, at least one uppercase letter, at least one lowercase letter, at least one digit and at least one special character.

// public class string {
//     public static void main(String[] args) {
//         String password = "Rahul@123";
//         if (password.length() >= 8 && password.contains("A") && password.contains("a") && password.contains("0") && password.contains("!")) {
//             System.out.println("Valid");
//         } else {
//             System.out.println("Invalid");
//         }
//     }
// }


// Write a program to take the input from the user and find the largest and the smallest word in a string.

// import java.util.*;
// public class string {    
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a string: ");
//         String name = sc.nextLine();
//         String[] words = name.split(" ");
//         String largest = words[0];
//         String smallest = words[0];
//         for (int i = 0; i < words.length; i++) {
//             if (words[i].length() > largest.length()) {
//                 largest = words[i];
//             }
//             if (words[i].length() < smallest.length()) {
//                 smallest = words[i];
//             }
//         }
//         System.out.println("Largest: " + largest);
//         System.out.println("Smallest: " + smallest);
//         sc.close();
//     }
// }

