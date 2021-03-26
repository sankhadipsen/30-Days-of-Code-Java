package com.queueandstack;

import java.util.*;

class Solution{
    Stack<Character> st;
    LinkedList<Character> queue;

    //Initialize the Stack and Queue.
    public Solution(){
        st = new Stack<>();
        queue = new LinkedList<>();
    }
    //Enqueue from STDIN.
    public void enqueueCharacter(char data){
        queue.addLast(data);
    }
    public void pushCharacter(char data){
        st.push(data);
    }

    //Dequeue from Stack and Queue.
    public char popCharacter(){
        return st.pop();
    }
    public char dequeueCharacter(){
        return st.remove(0);
    }
}

public class Palindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();

        // Convert input String to an array of characters:
        char[] s = input.toCharArray();

        // Create a Solution object:
        Solution p = new Solution();

        // Enqueue/Push all chars to their respective data structures:
        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        // Pop/Dequeue the chars at the head of both data structures and compare them:
        boolean isPalindrome = true;
        for (int i = 0; i < s.length/2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;                
                break;
            }
        }

        //Finally, print whether string s is palindrome or not.
        System.out.println( "The word, " + input + ", is " 
                           + ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ) );
    }
}
