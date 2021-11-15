package org.itstack.demo.design;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class DecorationPackageMenu2 implements IMenu{

    private List<Matter> list = new ArrayList<>(); ///装修清单
    private BigDecimal price =  BigDecimal.ZERO;  ///装修价格

    private BigDecimal area; ///面积
    private String grade; ///装修等级：豪华欧式、轻奢田园、现代简约

    private DecorationPackageMenu2(){

    }

    public DecorationPackageMenu2(Double area,String grade){
        this.area = new BigDecimal(area);
        this.grade = grade;
    }

    @Override
    public IMenu appendCeiling(Matter matter) {
        list.add(matter);
// todo       price = price.add(area.mu)
        return null;
    }

    @Override
    public IMenu appendCoat(Matter matter) {
        return null;
    }

    @Override
    public IMenu appendFloor(Matter matter) {
        return null;
    }

    @Override
    public IMenu appendTile(Matter matter) {
        return null;
    }

    @Override
    public String getDetail() {
        return null;
    }
}
