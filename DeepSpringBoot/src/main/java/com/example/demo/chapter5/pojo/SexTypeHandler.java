package com.example.demo.chapter5.pojo;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;
import org.apache.ibatis.type.MappedTypes;

// 声明JdbcType为整型
@MappedJdbcTypes(JdbcType.INTEGER)
// 声明JavaType为SexEnum
@MappedTypes(value = SexEnum.class)
public class SexTypeHandler extends BaseTypeHandler<SexEnum> {

	// 通过列名读取性别
	@Override
	public SexEnum getNullableResult(ResultSet arg0, String arg1) throws SQLException {
		// TODO Auto-generated method stub
		int sex = arg0.getInt(arg1);
		if (sex != 1 && sex != 2) {
			return null;
		}
		return SexEnum.getEnumById(sex);
	}
	
	// 通过下标读取性别
	@Override
	public SexEnum getNullableResult(ResultSet arg0, int arg1) throws SQLException {
		// TODO Auto-generated method stub
		int sex = arg0.getInt(arg1);
		if (sex != 1 && sex != 2) {
			return null;
		}
		return SexEnum.getEnumById(sex);
	}

	// 设置非空性别参数
	@Override
	public void setNonNullParameter(PreparedStatement arg0, int arg1, SexEnum arg2, JdbcType arg3) throws SQLException {
		// TODO Auto-generated method stub
		arg0.setInt(arg1, arg2.getId());
	}

	// 通过存储过程读取性别
	@Override
	public SexEnum getNullableResult(CallableStatement arg0, int arg1) throws SQLException {
		// TODO Auto-generated method stub
		int sex = arg0.getInt(arg1);
		if (sex != 1 && sex != 2) {
			return null;
		}
		return SexEnum.getEnumById(sex);
	}
}
