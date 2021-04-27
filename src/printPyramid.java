//Print:
//1
//12
//123
//1234
//12345

/*
 print pass through
 * x = 1, y = 1; y -> 1 -> 1
 * 1
 * x = 2, y = 1; y -> 1 -> 2
 * 12
 * x = 3, y = 1; y -> 1 -> 3
 * 123
 */

public class printPyramid{

    public static void main(String args[]){
        for(int x = 1; x <= 5; x++){
            for(int y = 1; y <= x; y++){
                System.out.print(y);
            }
            System.out.println("");
        }
    }
}