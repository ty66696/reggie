package com.jac.reggie.dto;

import com.jac.reggie.entity.Setmeal;
import com.jac.reggie.entity.SetmealDish;
import lombok.Data;
import java.util.List;

@Data
public class SetmealDto extends Setmeal {

    private List<SetmealDish> setmealDishes;

    private String categoryName;
}
