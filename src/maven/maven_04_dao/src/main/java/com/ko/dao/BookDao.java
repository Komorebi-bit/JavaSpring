package com.ko.dao;

import com.ko.domain.Book;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * @author Komorebi
 * @date 2022.07.17.22:45
 */

public interface BookDao {
    @Insert("insert into book values(null,#{type},#{name},#{description})")
    public int save(Book book);

    @Update("update book set type = #{type}, name = #{name}, description = #{description} where id = #{id}")
    public int update(Book book);

    @Delete("delete from book where id = #{id}")
    public int delete(Integer id);

    @Select("select * from book where id = #{id}")
    public Book getById(Integer id);

    @Select("select * from book")
    public List<Book> getAll();
}
