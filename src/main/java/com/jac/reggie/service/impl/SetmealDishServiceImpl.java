package com.jac.reggie.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jac.reggie.dto.DishDto;
import com.jac.reggie.dto.SetmealDto;
import com.jac.reggie.entity.Dish;
import com.jac.reggie.entity.DishFlavor;
import com.jac.reggie.entity.Setmeal;
import com.jac.reggie.entity.SetmealDish;
import com.jac.reggie.mapper.SetmealDishMapper;
import com.jac.reggie.service.SetmealDishService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class SetmealDishServiceImpl extends ServiceImpl<SetmealDishMapper,SetmealDish> implements SetmealDishService {

}
