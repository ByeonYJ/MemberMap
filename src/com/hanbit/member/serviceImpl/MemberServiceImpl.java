package com.hanbit.member.serviceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.hanbit.member.domain.MemberBean;
import com.hanbit.member.service.MemberService;

public class MemberServiceImpl implements MemberService{
	List<MemberBean> list;
	Map<String,MemberBean> map;
	MemberBean member;
	int count;//count를 instance variable로 만드는 곳
	public MemberServiceImpl() {
		member = new MemberBean();
		list=new ArrayList<MemberBean>();//아래의 count와 다르다 그냥 문자 x,d,count 등등
	}
	@Override
	public void addMember(MemberBean bean) {
			//list=bean;//list에 bean을 넣어준다
		map.put(bean.getId(),bean);//list는 동일된 ID의 정보만 다 들어가지만 Map의 put은 동일된 ID의 세부정보까지 다 들어간다
	}
	@Override
	public List<MemberBean> list() {
		List<MemberBean>list = new ArrayList<>();
		Set<String>keys=map.keySet();
		for(String s:keys){
			list.add(map.get(s));
		}
		return list;
	}

	@Override//수정중
	public List<MemberBean> findByName(String name) {
		List<MemberBean> temp=new ArrayList<MemberBean>();
		for(MemberBean mem:list){
			if(name.equals(mem.getName())){
				temp.add(map.get(mem));
			}
		}
		return temp;
	}

	@Override
	public MemberBean findById(String id) {
		return map.get(id);
	}

	@Override
	public int count() {
		// TODO Auto-generated method stub
		return list.size();//회원수를 한번에 count 해주는것
	}

	@Override
	public void update(MemberBean bean) {
		findById(bean.getId()).setName(bean.getName());//아이디로 받아서 이름을 바꿔준다
		findById(bean.getId()).setSsn(bean.getSsn());//아이디로 받아서 주민번호를 바꿔준다
		findById(bean.getId()).setPassWord(bean.getPassWord());//아이디로 받아서 비밀번호를 바꿔준다
	}

	@Override
	public void delete(String id) {
		for(MemberBean mem:list){
			if(id.equals(mem.getId())){
				list.remove(mem);
			}
		}
	}
}
