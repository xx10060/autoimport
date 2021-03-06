package com.chilioil.autoimport.mapper;

import com.chilioil.autoimport.bean.TImgUrl;
import com.chilioil.autoimport.bean.TImgUrlExample;

import java.io.Serializable;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface TImgUrlMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_img_url
     *
     * @mbg.generated Sat Jul 11 17:57:21 CST 2020
     */
    long countByExample(TImgUrlExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_img_url
     *
     * @mbg.generated Sat Jul 11 17:57:21 CST 2020
     */
    int deleteByExample(TImgUrlExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_img_url
     *
     * @mbg.generated Sat Jul 11 17:57:21 CST 2020
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_img_url
     *
     * @mbg.generated Sat Jul 11 17:57:21 CST 2020
     */
    int insert(TImgUrl record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_img_url
     *
     * @mbg.generated Sat Jul 11 17:57:21 CST 2020
     */
    int insertSelective(TImgUrl record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_img_url
     *
     * @mbg.generated Sat Jul 11 17:57:21 CST 2020
     */
    List<TImgUrl> selectByExample(TImgUrlExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_img_url
     *
     * @mbg.generated Sat Jul 11 17:57:21 CST 2020
     */
    TImgUrl selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_img_url
     *
     * @mbg.generated Sat Jul 11 17:57:21 CST 2020
     */
    int updateByExampleSelective(@Param("record") TImgUrl record, @Param("example") TImgUrlExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_img_url
     *
     * @mbg.generated Sat Jul 11 17:57:21 CST 2020
     */
    int updateByExample(@Param("record") TImgUrl record, @Param("example") TImgUrlExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_img_url
     *
     * @mbg.generated Sat Jul 11 17:57:21 CST 2020
     */
    int updateByPrimaryKeySelective(TImgUrl record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_img_url
     *
     * @mbg.generated Sat Jul 11 17:57:21 CST 2020
     */
    int updateByPrimaryKey(TImgUrl record);
}