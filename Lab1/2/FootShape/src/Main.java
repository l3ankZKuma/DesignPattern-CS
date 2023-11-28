import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        FootShape fs= new FootShape();
        Scanner sc= new Scanner(System.in);
        int shape = sc.nextInt();

        switch(shape){
            case 1:
                System.out.println(fs.drawAsEllipse());
                break;
            case 2:
                System.out.println(fs.drawAsRectangle());
                break;
        }
    }
}