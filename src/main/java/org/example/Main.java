package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");


            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
        System.out.println(strStr("mississippi", "issi"));

    }

    public static int strStr(String s1, String s2) {
        int j=0;
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i) == s2.charAt(j)){
                j++;
            }
            else{
                i = i-j+1;
                j=0;
            }
            if(j==s2.length()){
                return i-s2.length()+1;
            }
        }
        return -1;

    }



}