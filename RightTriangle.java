public class RightTriangle {
    public static void main(String[] args) {
        //int a = Integer.parseInt(args[0]);
        //int b = Integer.parseInt(args[1]);
        //int c = Integer.parseInt(args[2]);
        long a = Long.parseLong(args[0]);
        long b = Long.parseLong(args[1]);
        long c = Long.parseLong(args[2]);

        boolean isTure;
        isTure = ((a > 0) && (c > 0));
        isTure = (isTure && (b > 0));
        //System.out.println(a);
        //System.out.println(b);
        //System.out.println(c);


        //System.out.println(isTure);

        boolean isRightTriangle, isRightTriangle1, isRightTriangle2, isRightTriangle3;
        //long a2 = (long) (a * a);
        //long b2 = b * b;
        //System.out.println(a2);
        //System.out.println(b2);
        isRightTriangle1 = ((a * a + b * b) == (c * c));
        isRightTriangle2 = ((b * b + c * c) == (a * a));
        isRightTriangle3 = ((a * a + c * c) == (b * b));

        //System.out.println(isRightTriangle1);
        //isRightTriangle = isRightTriangle && isTure;
        //System.out.println(isRightTriangle2);

        //isRightTriangle = isRightTriangle || ((b * b + c * c) == (a * a));
        //System.out.println(isRightTriangle3);
        isRightTriangle = (isRightTriangle1 || isRightTriangle2 || isRightTriangle3);
        //isRightTriangle = (isRightTriangle || ((a * a + c * c) == (b * b)));
        System.out.println(isRightTriangle);
    }
}
