public class Main
{
    public static void main(String[] args)
    {
        LongNumber a = new LongNumber(Long.MAX_VALUE);
        LongNumber b = new LongNumber(Long.MIN_VALUE);
        LongNumber c = a.Add(324).Multiply(b.Subtract(-43));
        System.out.println("(a + 324) * (b - (-43)) = " + c);
    }
}