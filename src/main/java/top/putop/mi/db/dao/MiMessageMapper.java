package top.putop.mi.db.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import top.putop.mi.db.model.MiMessage;

@Mapper
public interface MiMessageMapper {
	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table mi_message
	 * 
	 * @mbg.generated Wed May 02 11:47:06 AWST 2018
	 */
	int deleteByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table mi_message
	 * 
	 * @mbg.generated Wed May 02 11:47:06 AWST 2018
	 */
	int insert(MiMessage record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table mi_message
	 * 
	 * @mbg.generated Wed May 02 11:47:06 AWST 2018
	 */
	int insertSelective(MiMessage record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table mi_message
	 * 
	 * @mbg.generated Wed May 02 11:47:06 AWST 2018
	 */
	MiMessage selectByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table mi_message
	 * 
	 * @mbg.generated Wed May 02 11:47:06 AWST 2018
	 */
	int updateByPrimaryKeySelective(MiMessage record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table mi_message
	 * 
	 * @mbg.generated Wed May 02 11:47:06 AWST 2018
	 */
	int updateByPrimaryKey(MiMessage record);

	/**
	 * 获取数据信息
	 * 
	 * @return
	 */
	List<MiMessage> getAllMess(@Param(value = "miName") String miName, @Param(value = "miType") String miType,
			@Param(value = "beforeNum") Integer beforeNum, @Param(value = "limitNum") Integer limitNum);

	/**
	 * 获取总数
	 * 
	 * @return
	 */
	int selectCount();
}