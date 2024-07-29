import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int yil;
        System.out.println("lutfen dogum yılınızı gırınız: ");
        yil = inp.nextInt();
        if(yil%12 == 0)
        {
            System.out.println("Çin zodayğına gore burcunuz MAYMUN dur.");
        }
        else if(yil%12 ==1)
        {
            System.out.println("Çin zodayğına gore burcunuz HOROZ dur.");
        }
        else if(yil%12 ==2)
        {
            System.out.println("Çin zodayğına gore burcunuz köpek dur.");
        }
        else if(yil%12 ==3)
        {
            System.out.println("Çin zodayğına gore burcunuz DOMUZ dur.");
        }
        else if(yil%12 ==4)
        {
            System.out.println("Çin zodayğına gore burcunuz FARE dur.");
        }
        else if(yil%12 ==5)
        {
            System.out.println("Çin zodayğına gore burcunuz ÖKÜZ dur.");
        }
        else if(yil%12 ==6)
        {
            System.out.println("Çin zodayğına gore burcunuz KAPLAN dur.");
        }
        else if(yil%12 ==7)
        {
            System.out.println("Çin zodayğına gore burcunuz TAVŞAN dur.");
        }
        else if(yil%12 ==8)
        {
            System.out.println("Çin zodayğına gore burcunuz EJDERHA dur.");
        }
        else if(yil%12 ==9)
        {
            System.out.println("Çin zodayğına gore burcunuz YILAN dur.");
        }
        else if(yil%12 ==10)
        {
            System.out.println("Çin zodayğına gore burcunuz AT dur.");
        }
        else
        {
            System.out.println("Çin zodayğına gore burcunuz KOYUN dur.");
        }
    }
}