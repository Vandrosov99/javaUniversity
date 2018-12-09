import java.util.HashSet;
import java.util.Set;

public class Triangle {

    private double side1;
    private double side2;
    private double side3;

    public Triangle(double side1, double side2, double side3) throws TriangleException {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;

        if (allSidesAreZero() || hasImpossibleSides() || violatesTriangleInequality()) {
            throw new TriangleException();
        }
    }

    public String getKind() {
        int uniqueSides = getNumberOfUniqueSides();

        if (uniqueSides == 1) {
            return "rivnostoronniy";
        }

        if (uniqueSides == 2) {
            return "rivnobedreniy";
        }

        return "riznostoronniy";
    }
    public  void getKinds () {
        int uniqueSides = getNumberOfUniqueSides();

        if (uniqueSides == 1) {
            System.out.print( "rivnostoronniy");
        }

        if (uniqueSides == 2) {
            System.out.print( "rivnobedreniy");
        }

        System.out.print( "riznostoronniy");
    }
    private boolean allSidesAreZero() {
        return side1 == 0 && side2 == 0 && side3 == 0;
    }

    private boolean hasImpossibleSides() {
        return side1 < 0 || side2 < 0 || side3 < 0;
    }

    private boolean violatesTriangleInequality() {
        return side1 + side2 <= side3 || side1 + side3 <= side2 || side2 + side3 <= side1;
    }


    public int getNumberOfUniqueSides() {
        Set<Double> sides = new HashSet<>();

        sides.add(side1);
        sides.add(side2);
        sides.add(side3);

        return sides.size();
    }
}
