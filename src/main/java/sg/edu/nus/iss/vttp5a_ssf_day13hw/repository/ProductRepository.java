package sg.edu.nus.iss.vttp5a_ssf_day13hw.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import sg.edu.nus.iss.vttp5a_ssf_day13hw.model.Product;
import sg.edu.nus.iss.vttp5a_ssf_day13hw.utility.FileManager;

@Repository
public class ProductRepository {
    private List<Product> productsList;

    public List<Product> getProductsList(){
        productsList = FileManager.readProductFile();
        return productsList;
    }

    public Product findById(String id){
        // System.out.println("in findbyid pdtrepo");

        Product productFound = null;
        for (Product p : productsList) {
            // System.out.println(p.getId());
            if (p.getId().equals(id)) {
                productFound = p;
            }
        }
        return productFound;
    }

    public void saveProductfile() {
        FileManager.saveProductfile(productsList);
    }
}
