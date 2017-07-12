package com.hanbit.member.service;

import java.util.List;

import com.hanbit.member.domain.MemberBean;

public interface MemberService {
	public void addMember(MemberBean bean);
	public List<MemberBean> list();
	public List<MemberBean> findByName(String name);
	public MemberBean findById(String id);
	public int count();
	public void update(MemberBean bean);
	public void delete(String id);
}
