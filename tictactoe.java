import java.io.*;
import java.util.Scanner;

public class tictactoe {
    public static void main(String args[]){
        char a[] = new char[9];
        Scanner in; 
        int move; 
        in = new Scanner(System.in);

    

        for( int i=0; i<a.length; i++){
            a[i]=(char) ('1' + i); 
        }

        displayBoard(a);
        System.out.println("Player X enter your move (1-9):   ");
        move = in.nextInt(); 
        while(!isMoveCorrect(move, a)){
        System.out.println("Incorrect Number! Player X enter your move (1-9):   ");
        move = in.nextInt(); 
        }
        a[move-1]='X';
          

    displayBoard(a);
        System.out.println("Player O enter your move (1-9): ");
        move = in.nextInt();

        while(!isMoveCorrect(move, a)){
            System.out.println("Incorrect Number! Player O enter your move (1-9):   ");
            move = in.nextInt(); 
            }

            a[move-1]='O';


        displayBoard(a);

    }

    static boolean isMoveCorrect(int move, char a[]){
        if (move < 1 || move >9)
        return false;
        if(a[move-1] == 'X' || a[move - 1] =='O')
            return false;

        return true;
    }
    public static void displayBoard(char c[]){
        for(int i=0; i<35; i++)
            System.out.println();
        System.out.println(" " + c[0] + " | " + c[1] + " | " + c[2]);
        System.out.println("---+---+---");
        System.out.println(" " + c[3] + " | " + c[4] + " | " + c[5]);
        System.out.println("---+---+---");
        System.out.println(" " + c[6] + " | " + c[7] + " | " + c[8]);
    }
}