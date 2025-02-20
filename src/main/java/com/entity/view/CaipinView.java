package com.entity.view;

import com.entity.CaipinEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * 菜品
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email
 * @date 2021-04-15
 */
@TableName("caipin")
public class CaipinView extends CaipinEntity implements Serializable {
    private static final long serialVersionUID = 1L;
		/**
		* 菜品类型的值
		*/
		private String caipinValue;



	public CaipinView() {

	}

	public CaipinView(CaipinEntity caipinEntity) {
		try {
			BeanUtils.copyProperties(this, caipinEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 菜品类型的值
			*/
			public String getCaipinValue() {
				return caipinValue;
			}
			/**
			* 设置： 菜品类型的值
			*/
			public void setCaipinValue(String caipinValue) {
				this.caipinValue = caipinValue;
			}











}
