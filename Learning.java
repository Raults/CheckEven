import java.util.*;
/**
 * Write a description of class Learning here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Learning
{
    public static void main(String args[]) {
    int n = 10;
    while(n>1){
        System.out.print(n);
        if(n%2 == 0){//checks to see if n is even
            n = n/2;
        }else{
            n = 3*n+1;
    }
}
}}