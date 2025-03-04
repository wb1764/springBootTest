package com.mybatis.mapper;

import com.mybatis.entity.MyBatisInttLdgr;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
public interface MyBatisInttLdgrMapper {

    @Insert("INSERT INTO intt_ldgr (use_intt_id, biz_no, use_intt_nm) VALUES (#{useInttId}, #{bizNo}, #{useInttNm})")
    int insertInttLdgr(MyBatisInttLdgr inttLdgr);

    @Select("SELECT * FROM intt_ldgr WHERE use_intt_id = #{useInttId}")
    MyBatisInttLdgr getInttLdgrById(String useInttId);

    @Update("UPDATE intt_ldgr SET biz_no = #{bizNo}, use_intt_nm = #{useInttNm} WHERE use_intt_id = #{useInttId}")
    int updateInttLdgr(MyBatisInttLdgr inttLdgr);

    @Delete("DELETE FROM intt_ldgr WHERE use_intt_id = #{useInttId}")
    int deleteInttLdgr(String useInttId);

    @Select("SELECT use_intt_id,biz_no,use_intt_nm FROM intt_ldgr")
	
	/*dks
	 * @Results({
	 * 
	 * @Result(column = "use_intt_id", property = "useInttId"),
	 * 
	 * @Result(column = "biz_no", property = "bizNo"),
	 * 
	 * @Result(column = "use_intt_nm", property = "useInttNm") })
	 */
	 
    List<MyBatisInttLdgr> getAllInttLdgr();
}