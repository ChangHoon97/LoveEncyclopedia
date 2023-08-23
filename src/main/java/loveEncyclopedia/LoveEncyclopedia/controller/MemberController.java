package loveEncyclopedia.LoveEncyclopedia.controller;

import loveEncyclopedia.LoveEncyclopedia.domain.Member;
import loveEncyclopedia.LoveEncyclopedia.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MemberController {

    private final MemberService memberService;

    @Autowired
    public MemberController(MemberService memberService){
        this.memberService = memberService;
    }

}
