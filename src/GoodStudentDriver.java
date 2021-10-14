public class GoodStudentDriver
{
    public static void main (String[]args)
    {
        GoodStudent alan = new GoodStudent("Alan","Turning",191254,3.56,true);
        GoodStudent florence = new GoodStudent("Florence", "Nightningale", 182010, 3.89, false);
        GoodStudent grace = new GoodStudent("Grace", "Hopper", 190692, 3.99, true);

        System.out.println(alan.toString());
        System.out.println();

        florence.setIdNum(95366);
        florence.setGpa(3.92);
        System.out.println(florence.getIdNum());
        System.out.println(florence.getGpa());
        System.out.println(grace.getFirstName());
        System.out.println(grace.getInCs());

        System.out.println(alan.CreateId());
        System.out.println(florence.CreateId());
        System.out.println(grace.CreateId());
        System.out.println();

        System.out.println(alan.CSGPA());
        System.out.println(florence.CSGPA());
        System.out.println(grace.CSGPA());

    }//end main method
}//end class GoodStudentDriver
