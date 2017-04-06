package com.ming.finance.mapper;

import com.ming.finance.pojo.FinanceUser;
import com.ming.finance.pojo.FinanceUserQuery;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface FinanceUserDao {
    int countByExample(FinanceUserQuery example);

    int deleteByExample(FinanceUserQuery example);

    int insert(FinanceUser record);

    int insertSelective(FinanceUser record);

    List<FinanceUser> selectByExample(FinanceUserQuery example);

    int updateByExampleSelective(@Param("record") FinanceUser record, @Param("example") FinanceUserQuery example);

    int updateByExample(@Param("record") FinanceUser record, @Param("example") FinanceUserQuery example);
}