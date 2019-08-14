package Firefly.RegistrationWebsite.dao;

import Firefly.RegistrationWebsite.entity.Notepad;
import Firefly.RegistrationWebsite.entity.NotepadExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface NotepadMapper {
    int deleteByPrimaryKey(Integer code);

    int insert(Notepad record);

    int  updateFlagBycode(Notepad record);

    int insertSelective(Notepad record);

    List<Notepad> selectByExample(NotepadExample example);

    Notepad selectByPrimaryKey(Integer code);

    int updateByExampleSelective(@Param("record") Notepad record, @Param("example") NotepadExample example);

    int updateByExample(@Param("record") Notepad record, @Param("example") NotepadExample example);

    int updateByPrimaryKeySelective(Notepad record);

    int updateByPrimaryKey(Notepad record);
}