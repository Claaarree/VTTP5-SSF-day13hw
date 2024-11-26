package sg.edu.nus.iss.vttp5a_ssf_day13hw.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import sg.edu.nus.iss.vttp5a_ssf_day13hw.model.Product;
import sg.edu.nus.iss.vttp5a_ssf_day13hw.service.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



@Controller
@RequestMapping("/products")
public class ProductController {
    
    @Autowired
    ProductService pdtService;

    @GetMapping()
    public String getProducts(Model model) {
        List<Product> productsList = pdtService.getProductsList();
        // System.out.println(productsList.get(0).getId());
        model.addAttribute("products", productsList);

        return "products1";
    }

    @GetMapping("/buy/{id}")
    public String buyProduct(@PathVariable String id) {
        System.out.println(id);
        Product productFound = pdtService.findById(id);
        pdtService.saveProductfile(productFound);

        return "redirect:/products";
    }
    
    
}
