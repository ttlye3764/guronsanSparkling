package kr.or.ddit.member.dao;

import java.util.List;
import java.util.Map;

import kr.or.ddit.vo.MemberVO;

public interface IMemberDao {
	public MemberVO memberInfo(Map<String, String> params) throws Exception;
	public List<MemberVO> memberList(Map<String, String> params) throws Exception;
	public void deleteMemberInfo(Map<String,String> params) throws Exception;
	public void updateMemberInfo(MemberVO memberInfo) throws Exception;
	public void insertMember(MemberVO vo) throws Exception;
	public int totalCount(Map<String,String> params) throws Exception;
	public int updateAdminMember(MemberVO vo) throws Exception;
	public MemberVO selectByID(String string) throws Exception;
}
