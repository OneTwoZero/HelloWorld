package com.itheima.controller;

import com.itheima.domain.Product;
import com.itheima.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Map;

/**
 * ProductController
 *
 * @author Small
 */
@Controller
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;


    @RequestMapping("/findById")
    public Product findById(String id) throws Exception {
        return productService.findById(id);
    }

    /**
     * 查询Product表所有
     *
     * @return
     * @throws Exception
     */
    @RequestMapping("/findAll")
    public ModelAndView findAll() throws Exception {
        List<Product> products = productService.findAll();
        ModelAndView mav = new ModelAndView();
        mav.addObject("productList", products);
        mav.setViewName("product-list");
        return mav;
    }

    /**
     * 新建一条Product数据
     *
     * @param product
     */
    @RequestMapping("/save")
    public String save(Product product) throws Exception {
        productService.save(product);
        return "redirect:/product/findAll";
    }


}
