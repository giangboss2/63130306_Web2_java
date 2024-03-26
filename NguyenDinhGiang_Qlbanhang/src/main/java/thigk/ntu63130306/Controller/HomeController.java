package thigk.ntu63130306.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import thigk.ntu63130306.Models.Product;
import thigk.ntu63130306.Service.ProductService;

@Controller
public class HomeController {

    @Autowired
    private ProductService productService;

    @GetMapping({"/", "/home"})
    public String index(Model model) {
        model.addAttribute("products", productService.findAll());
        return "index";
    }

    @GetMapping("/timkiem")
    public String searchProduct(@RequestParam String code, Model model) {
        Product foundProduct = productService.findByCode(code);
        model.addAttribute("foundProduct", foundProduct);
        return "searchResult"; // Trả về một trang mới với kết quả tìm kiếm
    }

    @GetMapping("/them")
    public String showAddProductForm(Model model) {
        model.addAttribute("product", new Product());
        return "addProduct";
    }

    @PostMapping("/them")
    public String addProduct(@ModelAttribute Product product) {
        productService.addProduct(product);
        return "redirect:/hienthi";
    }
    @GetMapping("/hienthi")
    public String showHomePage(Model model) {
        model.addAttribute("products", productService.findAll());
        return "show";
    }

}