package com.sequarius.titan.sample.repository;

import com.sequarius.titan.sample.domain.SysPermissionDO;
import com.sequarius.titan.sample.domain.SysPermissionDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface SysPermissionDOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_permission
     *
     * @mbg.generated Thu Feb 06 14:35:27 CST 2020
     */
    long countByExample(SysPermissionDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_permission
     *
     * @mbg.generated Thu Feb 06 14:35:27 CST 2020
     */
    int deleteByExample(SysPermissionDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_permission
     *
     * @mbg.generated Thu Feb 06 14:35:27 CST 2020
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_permission
     *
     * @mbg.generated Thu Feb 06 14:35:27 CST 2020
     */
    int insert(SysPermissionDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_permission
     *
     * @mbg.generated Thu Feb 06 14:35:27 CST 2020
     */
    int insertSelective(SysPermissionDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_permission
     *
     * @mbg.generated Thu Feb 06 14:35:27 CST 2020
     */
    List<SysPermissionDO> selectByExample(SysPermissionDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_permission
     *
     * @mbg.generated Thu Feb 06 14:35:27 CST 2020
     */
    SysPermissionDO selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_permission
     *
     * @mbg.generated Thu Feb 06 14:35:27 CST 2020
     */
    int updateByExampleSelective(@Param("record") SysPermissionDO record, @Param("example") SysPermissionDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_permission
     *
     * @mbg.generated Thu Feb 06 14:35:27 CST 2020
     */
    int updateByExample(@Param("record") SysPermissionDO record, @Param("example") SysPermissionDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_permission
     *
     * @mbg.generated Thu Feb 06 14:35:27 CST 2020
     */
    int updateByPrimaryKeySelective(SysPermissionDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_permission
     *
     * @mbg.generated Thu Feb 06 14:35:27 CST 2020
     */
    int updateByPrimaryKey(SysPermissionDO record);
}