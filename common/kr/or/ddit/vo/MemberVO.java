package kr.or.ddit.vo;

import java.io.File;
import java.util.List;

public class MemberVO {
	//SELECT 'String ' ||LOWER(COLUMN_NAME)||';'
	//  FROM USER_TAB_COLUMNS
	// WHERE TABLE_NAME='MEMBER';	
	String mem_id;
	String mem_pass;
	String mem_name;
	String mem_regno1;
	String mem_regno2;
	String mem_bir;
	String mem_zip;
	String mem_add1;
	String mem_add2;
	String mem_hometel;
	String mem_comtel;
	String mem_hp;
	String mem_mail;
	String mem_job;
	String mem_like;
	String mem_memorial;
	String mem_memorialday;
	String mem_mileage;
	String mem_delete;
	String mem_calendar;
	//	전송되는 파일, 파일 컨텐츠 타입, 파일명
	//	input type=file name=files
	//	전송되는 파일(변수명 필드네임)
	private List<File> files;
	//	전송되는 파일 컨텐츠 타입
	//	변수명명규칠 : 필드네임 + ContenType
	private List<String> filesContentType;
	//	전송되는 파일명
	//	변수명명규칙 : 필드네임 + FileName
	private List<String> filesFileName;
	
	
	
	public String getMem_id() {
		return mem_id;
	}
	public void setMem_id(String mem_id) {
		this.mem_id = mem_id;
	}
	public String getMem_pass() {
		return mem_pass;
	}
	public void setMem_pass(String mem_pass) {
		this.mem_pass = mem_pass;
	}
	public String getMem_name() {
		return mem_name;
	}
	public void setMem_name(String mem_name) {
		this.mem_name = mem_name;
	}
	public String getMem_regno1() {
		return mem_regno1;
	}
	public void setMem_regno1(String mem_regno1) {
		this.mem_regno1 = mem_regno1;
	}
	public String getMem_regno2() {
		return mem_regno2;
	}
	public void setMem_regno2(String mem_regno2) {
		this.mem_regno2 = mem_regno2;
	}
	public String getMem_bir() {
		return mem_bir;
	}
	public void setMem_bir(String mem_bir) {
		this.mem_bir = mem_bir;
	}
	public String getMem_zip() {
		return mem_zip;
	}
	public void setMem_zip(String mem_zip) {
		this.mem_zip = mem_zip;
	}
	public String getMem_add1() {
		return mem_add1;
	}
	public void setMem_add1(String mem_add1) {
		this.mem_add1 = mem_add1;
	}
	public String getMem_add2() {
		return mem_add2;
	}
	public void setMem_add2(String mem_add2) {
		this.mem_add2 = mem_add2;
	}
	public String getMem_hometel() {
		return mem_hometel;
	}
	public void setMem_hometel(String mem_hometel) {
		this.mem_hometel = mem_hometel;
	}
	public String getMem_comtel() {
		return mem_comtel;
	}
	public void setMem_comtel(String mem_comtel) {
		this.mem_comtel = mem_comtel;
	}
	public String getMem_hp() {
		return mem_hp;
	}
	public void setMem_hp(String mem_hp) {
		this.mem_hp = mem_hp;
	}
	public String getMem_mail() {
		return mem_mail;
	}
	public void setMem_mail(String mem_mail) {
		this.mem_mail = mem_mail;
	}
	public String getMem_job() {
		return mem_job;
	}
	public void setMem_job(String mem_job) {
		this.mem_job = mem_job;
	}
	public String getMem_like() {
		return mem_like;
	}
	public void setMem_like(String mem_like) {
		this.mem_like = mem_like;
	}
	public String getMem_memorial() {
		return mem_memorial;
	}
	public void setMem_memorial(String mem_memorial) {
		this.mem_memorial = mem_memorial;
	}
	public String getMem_memorialday() {
		return mem_memorialday;
	}
	public void setMem_memorialday(String mem_memorialday) {
		this.mem_memorialday = mem_memorialday;
	}
	public String getMem_mileage() {
		return mem_mileage;
	}
	public void setMem_mileage(String mem_mileage) {
		this.mem_mileage = mem_mileage;
	}
	public String getMem_delete() {
		return mem_delete;
	}
	public void setMem_delete(String mem_delete) {
		this.mem_delete = mem_delete;
	}
	public List<File> getFiles() {
		return files;
	}
	public void setFiles(List<File> files) {
		this.files = files;
	}
	public List<String> getFilesContentType() {
		return filesContentType;
	}
	public void setFilesContentType(List<String> filesContentType) {
		this.filesContentType = filesContentType;
	}
	public List<String> getFilesFileName() {
		return filesFileName;
	}
	public void setFilesFileName(List<String> filesFileName) {
		this.filesFileName = filesFileName;
	}
	public String getMem_calendar() {
		return mem_calendar;
	}
	public void setMem_calendar(String mem_calendar) {
		this.mem_calendar = mem_calendar;
	}
	
	
}
