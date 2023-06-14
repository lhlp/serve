package com.example.shopserve.controller;
import com.example.shopserve.result.Result;
import com.example.shopserve.entity.Shop;
import com.example.shopserve.service.ShopService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/shop")//客户端访问控制器类得请求地址
@Api(tags = "店铺相关业务的接口文档")
@CrossOrigin(origins="/*") //服务器端解决跨域问题
public class StoresController {
    @Autowired
    private ShopService shopService;

    @GetMapping("/indexAll")
    public Result<List<Shop>> getIndexShop(){
        try{
            List<Shop> list = shopService.getIndexShowShops();
            return Result.ok(list);
        }catch (Exception e){
            return Result.error(500,"服务器繁忙，请稍后重试");
        }
    }
    @Operation(summary = "排序展示首页商品列表",
            description = "是否是推荐图片",
            responses = {
                    @ApiResponse(description = "返回：排序后的商品列表"),
            }
    )
    @ApiImplicitParams({
            @ApiImplicitParam(name = "condition", value = "排序条件", defaultValue = "price" ,required = true, dataTypeClass = java.lang.String.class)
    })
    @GetMapping("/indexSortByCondition/{condition}")
    public Result<List<Shop>> getSortedShopByScore(@PathVariable(name="condition") String conditionVal){
        try{
            List<Shop> list = shopService.sortShopByCondition(conditionVal);
            return Result.ok(list);
        }catch (Exception e){
            return Result.error(500,"服务器繁忙，请稍后重试");
        }
    }



}
