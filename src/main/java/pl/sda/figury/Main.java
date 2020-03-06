package pl.sda.figury;

public class Main {

    public static void main(String[] args) {
        obliczTringle ();
        obliczRectangle ();

    }
	// write your code here
        private static void obliczTringle () {
            Tringle trojkat = new Tringle ( );

            double getPerimeter = trojkat.getPerimeter (5, 3);
            double getArea = trojkat.getArea (5, 3);
            System.out.println ("Obwód trójkąta: " + getPerimeter);
            System.out.println ("Pole powierzchni trójkąta " + getArea);
        }
        private static void obliczRectangle () {
            Rectangle prostokat = new Rectangle ( );
            double getPerimeter = prostokat.getPerimeter (5, 3);
            double getArea = prostokat.getArea (5, 3);

            System.out.println ("Obwód prostokąta: " + getPerimeter);
            System.out.println ("Pole powierzchni prostokąta " + getArea);
        }

}
