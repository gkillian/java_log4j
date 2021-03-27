class ShowMyClasspath
{
    public static void main(String[] args)
    {
        String cp = System.getProperty("java.class.path");
        System.out.println("classpath=" + cp);
    }
}
