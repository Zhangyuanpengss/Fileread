import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Main {
    public static void main(String[] args) throws Exception {
        String [] array=new String[4];
        String id;
        String itemName;
        String quantity;
        double price;
        String separator=",";
        double total=0;

        String filePath="C:\\Users\\豆腐脑\\Downloads\\Groceries.txt";
        String filePathForMac="C:\\Users\\豆腐脑\\Downloads\\IKUN.txt";
        

        FileReader fileReader=new FileReader(filePath);
        FileWriter fileWriter=new FileWriter((filePathForMac));
        BufferedReader reader=new BufferedReader(fileReader);
        BufferedWriter writer =new BufferedWriter(fileWriter);

        String s = reader.readLine();
        String heading = "ID#"+"\t"+"Item"+"\t\t"+"Quantity"+"\t"+"Price ($)"+".";
        System.out.println(heading);
        writer.write("****************************************");
        writer.newLine();
        writer.write(heading);
        writer.newLine();


        String line;

        while((line=reader.readLine())!=null){
            System.out.println(line);
            array=line.split(separator);
            price=Double.parseDouble(array[3]);
            total +=price;
            writer.write(line);
        }
        System.out.println("\n"+"Total price of groceries:"+Math.round(total));
        writer.write(0+"\n"+"Total price of groceries:"+Math.round(total));
        reader.close();
        writer.flush();
        writer.close();
        s=reader.readLine();
    }
}
