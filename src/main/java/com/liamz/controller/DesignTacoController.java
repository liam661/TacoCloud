package com.liamz.controller;

import com.liamz.entites.Ingredient;
import com.liamz.entites.Taco;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Description
 * @Author liam661
 * @Date 2021/9/17 21:15
 **/
@Slf4j
@Controller
@RequestMapping("/design")
public class DesignTacoController {

    @GetMapping
    public String showDesignForm(Model model) {
        List<Ingredient> ingredients = Arrays.asList(
                new Ingredient("FLTO", "Flour Tortilla", Ingredient.Type.WRAP), //面粉玉米饼
                new Ingredient("COTO", "Corn Tortilla", Ingredient.Type.WRAP), // 玉米饼
                new Ingredient("GRBF", "Ground Beef", Ingredient.Type.PROTEIN), // 碎牛肉
                new Ingredient("CARN", "Caritas", Ingredient.Type.PROTEIN), // 猪肉丝
                new Ingredient("TMTO", "Diced Tomatoes", Ingredient.Type.VEGGIES), // 西红柿丁
                new Ingredient("LETC","Lettuce", Ingredient.Type.VEGGIES), // 生菜
                new Ingredient("CHED", "Cheddar", Ingredient.Type.CHEESE), // 切达奶酪
                new Ingredient("JACK","Monterrey Jack", Ingredient.Type.CHEESE), //蒙特雷杰克奶酪
                new Ingredient("SLSA","Salsa", Ingredient.Type.SAUCE), // 色拉
                new Ingredient("SRCR", "Source Cream", Ingredient.Type.SAUCE) // 酸奶油
        );

        Ingredient.Type[] types = Ingredient.Type.values();

        for (Ingredient.Type type : types) {
            model.addAttribute(type.toString().toLowerCase(),
                    filterByType(ingredients, type));
        }
        model.addAttribute("design", new Taco());
        return "design";
    }
    // 过滤符合条件的列表
    private List <Ingredient> filterByType(
            List<Ingredient> ingredients, final Ingredient.Type type)
    {
        return ingredients
                .stream()
                .filter(x -> x.getType().equals(type))
                .collect(Collectors.toList());
    }
}
