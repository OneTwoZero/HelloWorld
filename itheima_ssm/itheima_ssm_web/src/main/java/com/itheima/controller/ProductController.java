package com.itheima.controller;

import com.itheima.domain.Product;
import com.itheima.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

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

    public ModelAndView findAll() throws Exception {
        List<Product> products = productService.findAll();
        ModelAndView mad = new ModelAndView();
        mad.addObject("products", products);
        return mad;
    }
}
