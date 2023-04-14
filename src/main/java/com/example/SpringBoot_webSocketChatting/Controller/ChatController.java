package com.example.SpringBoot_webSocketChatting.Controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.SpringBoot_webSocketChatting.Dto.Member;
import com.example.SpringBoot_webSocketChatting.Service.MemberService;

@Controller
public class ChatController {

	@Autowired
	MemberService memberService;

	@GetMapping("/")
	public String loginGet(Member member) {
		return "index";
	}

	@PostMapping("/")
	public String loginPost(HttpSession session, Member member) {
		Member memberNow = memberService.findMemberById(member.getIdAuto());

		// 로그인 성공
		if (memberNow.getPw().equals(member.getPw())) {
			session.setAttribute("memberId", member.getId());
			System.out.println("로그인에 성공했습니다.");
			return "redirect:/chat";
		}

		// 로그인 실패
		else {
			System.out.println("패스워드가 일치하지 않습니다.");
			return "redirect:/";
		}

	}

	@GetMapping("/join")
	public String joinGet(Member member) {
		return "join";
	}

	@PostMapping("/join")
	public String joinPost(Member member) {

		memberService.save(member);
		System.out.println(member + "가 가입되었습니다.");

		return "redirect:/";
	}

	@GetMapping("/chat")
	public String chatGET(HttpSession session) {
		System.out.println("채팅을 불러옵니다.");
		return "chat"; // chat.html 파일
	}

}
