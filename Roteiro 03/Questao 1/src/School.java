public class School
{
    public static void main(String[] args)
    {
        LabClass labClass1 = new LabClass(3);
        LabClass labClass2 = new LabClass(3);

        labClass1.setInstructor("Gabriel Augusto");
        labClass1.setTime("Segunda, 7H");
        labClass1.setRoom("309");

        labClass2.setInstructor("Cláudio Pereira");
        labClass2.setTime("Terça, 9H");
        labClass2.setRoom("T03");

        Student student001 = new Student("Gilberto Gil", "001");
        labClass1.enrollStudent(student001);
        Student student002 = new Student("Marcelo Lopes", "002");
        labClass1.enrollStudent(student002);
        Student student003 = new Student("Diogo Carlo", "003");
        labClass1.enrollStudent(student003);

        Student student004 = new Student("Luis Souza", "004");
        labClass2.enrollStudent(student004);
        Student student005 = new Student("Cleber Barros", "005");
        labClass2.enrollStudent(student005);
        Student student006 = new Student("Vinícius Oliveira", "006");
        labClass2.enrollStudent(student006);

        student001.addCredits(3);
        student002.addCredits(9);
        student003.addCredits(1);
        student004.addCredits(4);
        student005.addCredits(7);
        student006.addCredits(2);

        labClass1.printList();
        labClass2.printList();
    }
}
