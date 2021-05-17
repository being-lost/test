package com.fff.demo.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import com.fff.demo.pojo.*;

import java.util.List;

@Mapper
@Repository
public interface DataMapper {
    void insertMyData(MyData MyData);
    MyData selectMyDataById(Integer id);
    void updateMyData(MyData MyData);

    void insertMyDataList(List<MyData> list);

    void insertSellerShareSet(SellerShareSet SellerShareSet);
    SellerShareSet selectSellerShareSetById(Integer id);
    void updateSellerShareSet(SellerShareSet SellerShareSet);
    void insertSellerShareSetList(List<MyData> list);

    void insertAccountBaseSeller(AccountBaseSeller AccountBaseSeller);
    AccountBaseSeller selectAccountBaseSellerById(Integer id);
    void updateAccountBaseSeller(AccountBaseSeller AccountBaseSeller);




}
