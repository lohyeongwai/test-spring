package com.sla.springmvc.repo;
/*
 * this after 1st commit
 * 
 */
import java.util.List;

import com.sla.springmvc.domain.Member;

public interface MemberDao
{
    public Member findById(Long id);

    public Member findByEmail(String email);

    public List<Member> findAllOrderedByName();

    public void register(Member member);
}
