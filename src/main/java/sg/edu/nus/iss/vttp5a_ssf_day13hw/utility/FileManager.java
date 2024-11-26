package sg.edu.nus.iss.vttp5a_ssf_day13hw.utility;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import sg.edu.nus.iss.vttp5a_ssf_day13hw.model.Product;

public class FileManager {
    private static File pdtFile = new File(".\\src\\main\\resources\\static\\text\\products.txt");

    public static List<Product> readProductFile(){
        List<Product> productsList = new ArrayList<>();
        try {
            FileReader fr = new FileReader(pdtFile);
            BufferedReader br = new BufferedReader(fr);
    
            // Reading headers
            String line = br.readLine();
            while ((line = br.readLine()) != null) {

                // System.out.println(line);

                String id = line.split(", ")[0];
                String item = line.split(", ")[1];
                String sold = line.split(", ")[2];
                String quantity = line.split(", ")[3];
                String picture = line.split(", ")[4];
    
                Product p = new Product(id, item, Integer.parseInt(sold), Integer.parseInt(quantity), picture);
                productsList.add(p);
            }
            br.close();
            fr.close();
            
        } catch (IOException e) {
            System.out.println("Error in reading product file!");
            e.printStackTrace();
        }
        return productsList;
    }

    public static void saveProductfile(List<Product> newProductsList) {
        try {
            FileWriter fw = new FileWriter(pdtFile, false);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("id, item, sold, quantity, picture\n");
    
            for (Product pdt : newProductsList) {
                bw.write(pdt.toString() + "\n");
            }
            bw.flush();
            fw.flush();
            bw.close();
            fw.close();
            
        } catch (IOException e) {
            System.out.println("Error in writing to file!");
            e.printStackTrace();
        }
        

    }
}
