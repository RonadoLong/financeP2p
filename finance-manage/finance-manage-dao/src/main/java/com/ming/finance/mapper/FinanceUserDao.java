package com.ming.finance.mapper;

import com.ming.finance.pojo.FinanceUser;
import com.ming.finance.pojo.FinanceUserQuery;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface FinanceUserDao {
    int countByExample(FinanceUserQuery example);

    int deleteByExample(FinanceUserQuery example);

    int deleteByPrimaryKey(Long sysUserId);

    int insert(FinanceUser record);

    int insertSelective(FinanceUser record);

    List<FinanceUser> selectByExample(FinanceUserQuery example);

    FinanceUser selectByPrimaryKey(Long sysUserId);

    int updateByExampleSelective(@Param("record") FinanceUser record, @Param("example") FinanceUserQuery example);

    int updateByExample(@Param("record") FinanceUser record, @Param("example") FinanceUserQuery example);

    int updateByPrimaryKeySelective(FinanceUser record);

    int updateByPrimaryKey(FinanceUser record);
}