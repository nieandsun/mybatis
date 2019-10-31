package cn.nrsc.study.repository;

import cn.nrsc.study.entity.TCompany;

public interface TCompanyMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TCompany record);

    int insertSelective(TCompany record);

    TCompany selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TCompany record);

    int updateByPrimaryKey(TCompany record);
}