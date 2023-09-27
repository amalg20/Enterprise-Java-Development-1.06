
        import java.util.*;
        import java.io.File;
        import java.io.FileWriter;
        import java.io.*;
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args)throws IOException {
        String filePath = "src/employees.txt";
        Employee employee1= new Employee("Ahmed","Ahmed@gmail.com", 22, 24000);
        Employee employee2= new Employee("Saleh","Saleh@hmail.com", 25, 13000);
        Employee employee3= new Employee("Sara","Sara@gmail.com",23,22000);
        Employee employee4= new Employee("Manar","Manar@gmail.com",22,17000);
        Employee employee5= new Employee("Amal","Amal@gmail.com",23,19000);
        Intern employee6= new Intern("Nuha","Nuha@gmail.com",26,28000);
        Intern employee7= new Intern("Alaa","Alaa@gmail.com",23,18000);
        Intern employee8= new Intern("Khaled","Khaled@gmail.com",29,14000);
        Intern employee9= new Intern("Ali","Ali@gmail.com",27,15000);
        Intern employee10= new Intern("Reem","Reem@gmail.com",24,11000);

        File file = new File(filePath);
        FileWriter fileWriter = new FileWriter(filePath, false);
        fileWriter.write(String.valueOf(employee1+"\n"));
        fileWriter.write(String.valueOf(employee2+"\n"));
        fileWriter.write(String.valueOf(employee3+"\n"));
        fileWriter.write(String.valueOf(employee4+"\n"));
        fileWriter.write(String.valueOf(employee5+"\n"));
        fileWriter.write(String.valueOf(employee6+"\n"));
        fileWriter.write(String.valueOf(employee7+"\n"));
        fileWriter.write(String.valueOf(employee8+"\n"));
        fileWriter.write(String.valueOf(employee9+"\n"));
        fileWriter.write(String.valueOf(employee10+"\n"));
        fileWriter.close();

    }
}