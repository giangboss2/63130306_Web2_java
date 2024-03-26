package thigk.ntu63130306.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
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
        return "index"; // Đảm bảo tên view là chính xác và case-sensitive
    }

    @GetMapping("/timkiem")
    public String searchProduct(@RequestParam String code, Model model) {
        Product product = productService.findByCode(code);
        model.addAttribute("product", product);
        return "searchResult"; // Đảm bảo bạn có một view tên là searchResult.html
    }

    @PostMapping("/them")
    public String addProduct(Product product) {
        productService.addProduct(product);
        return "addProduct";
    }
    @PostMapping("/hienthi")
    public String showHomePage(Model model) {
        model.addAttribute("products", productService.findAll());
        return "show";
    }
}