public class Main {

    private int m_b;

    public static void main(String[] args) {
        Main m = new Main(5);
        System.out.format("Hello World number %d!", m.get());
    }

    public Main(int a)
    {
        m_b = a;
    }

    public int get()
    {
        return m_b;
    }
}
