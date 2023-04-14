package com.example.SpringBoot_webSocketChatting.Mapper;

import com.example.SpringBoot_webSocketChatting.Dto.Member;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface MemberMapper {
    @Select("SELECT * FROM MEMBER WHERE MEMBER_ID = #{idAuto}")
    Member selectMemberByIdAuto(Long idAuto);

    @Select("SELECT * FROM MEMBER WHERE ID = #{id}")
    Member selectMemberById(String id);

    @Insert("INSERT INTO MEMBER (ID, PW) VALUES (#{id}, #{pw})")
    void insertMember(Member member);

/*
    @Update("UPDATE MEMBER SET PW = #{pw} WHERE ID_AUTO = #{idAuto}")
    void updateMemberPw();

    @Delete("DELETE FROM MEMBER WHERE ID_AUTO = #{idAuto}")
    void deleteMemberByIdAuto();
*/

    @Select("SELECT * FROM MEMBER")
    List<Member> selectAllMembers();
}
