package be.intecbrussel.hoofdstuk7.lookupTables;

public class LookupTable
{
    public static void main(String[] args)
    {
    int[] months = {31, 28, 31, 30, 31};
    int thatMonth = 2;
    System.out.println(months[thatMonth - 1]);
    }
}
