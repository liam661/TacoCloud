package com.liamz.entites;

import com.oracle.webservices.internal.api.databinding.DatabindingMode;
import lombok.Data;
import lombok.RequiredArgsConstructor;

/**
 * @Description ingredient : 成分类：包含名字和类型
 * @Author liam661
 * @Date 2021/9/16 22:34
 **/
@Data
@RequiredArgsConstructor
public class Ingredient {
    private final String id;
    private final String name;
    private final Type type;

    // warp : 扭曲
    // PROTEIN : 蛋白质
    // VEGGIES : 蔬菜
    // CHEESE : 起司
    // SAUCE : 酱
    public static enum Type {
        WRAP, PROTEIN, VEGGIES, CHEESE, SAUCE
    }
}
