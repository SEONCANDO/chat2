package com.example.SpringBoot_webSocketChatting.Service;


import com.example.SpringBoot_webSocketChatting.Mapper.MemberMapper;
import org.springframework.stereotype.Service;

import com.example.SpringBoot_webSocketChatting.Dto.Member;

import java.util.List;

@Service
public class MemberService {

	private final MemberMapper memberMapper;

	public MemberService(MemberMapper memberMapper) {
		this.memberMapper = memberMapper;
	}

	public Member findMemberById(Long memberId) {
		return memberMapper.selectMemberById(String.valueOf(memberId));
	}

	public List<Member> findAllMembers() {
		return memberMapper.selectAllMembers();
	}

	public void save(Member member) {
		memberMapper.insertMember(member);
	}

/*	public void updateMember(Member member) {
		memberMapper.updateMemberPw();
	}

	public void deleteMemberById(Long memberId) {
		memberMapper.deleteMemberByIdAuto();
	}*/
}

