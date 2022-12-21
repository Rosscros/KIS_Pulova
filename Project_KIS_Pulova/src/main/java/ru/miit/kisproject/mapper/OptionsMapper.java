package ru.miit.kisproject.mapper;

import java.util.List;
import ru.miit.kisproject.model.SysOptions;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.type.JdbcType;
import org.springframework.stereotype.Repository;

@Repository
public interface OptionsMapper {
    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @Insert({
        "insert into options (opt_name, opt_value)",
        "values (#{optName,jdbcType=VARCHAR}, #{optValue,jdbcType=VARCHAR})"
    })
    int insert(Options row);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @Select({
        "select",
        "opt_name, opt_value",
        "from tdma.options"
    })
    @Results({
        @Result(column="opt_name", property="optName", jdbcType=JdbcType.VARCHAR),
        @Result(column="opt_value", property="optValue", jdbcType=JdbcType.VARCHAR)
    })
    List<Options> selectAll();
}