public class ClockDisplayTest
{
    public void test()
    {
        ClockDisplay clock = new ClockDisplay(0, 0, 0);
        System.out.println(clock.getTime());

        clock.setTime(9, 30, 15);
        System.out.println(clock.getTime());

        clock.setTime(11, 59, 59);
        System.out.println(clock.getTime());

        clock.setTime(12, 0, 0);
        System.out.println(clock.getTime());

        clock.setTime(16, 23, 15);
        System.out.println(clock.getTime());

        clock.setTime(23, 59, 59);
        System.out.println(clock.getTime());

        clock.timeTick();
        System.out.println(clock.getTime());
    }
}