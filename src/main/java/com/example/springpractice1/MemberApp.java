package com.example.springpractice1;

import com.example.springpractice1.member.Grade;
import com.example.springpractice1.member.Member;
import com.example.springpractice1.member.MemberService;
import com.example.springpractice1.member.MemberServiceImpl;

public class MemberApp {

    public static void main(String[] args) {
        MemberService memberService = new MemberServiceImpl();
        Member member = new Member(1L, "memberA", Grade.VIP);
        memberService.join(member);

        Member findMember = memberService.findMember(1L);
        System.out.println("new member = " + member.getName());
        System.out.println("find Memeber = " + findMember.getName());
    }
}
