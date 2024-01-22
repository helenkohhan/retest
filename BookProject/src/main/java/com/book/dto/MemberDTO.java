package com.book.dto;

import org.apache.ibatis.type.Alias;

@Alias("member")
public class MemberDTO {
	
	private String mid;
	private String mpassword;
	private String mname;
	private String mtel;
	private int mlisence;
	
	public MemberDTO() {

	}

	public MemberDTO(String mid, String mpassword, String mname, String mtel, int mlisence) {
		this.mid = mid;
		this.mpassword = mpassword;
		this.mname = mname;
		this.mtel = mtel;
		this.mlisence = mlisence;
	}

	public String getMid() {
		return mid;
	}

	public void setMid(String mid) {
		this.mid = mid;
	}

	public String getMpassword() {
		return mpassword;
	}

	public void setMpassword(String mpassword) {
		this.mpassword = mpassword;
	}

	public String getMname() {
		return mname;
	}

	public void setMname(String mname) {
		this.mname = mname;
	}

	public String getMtel() {
		return mtel;
	}

	public void setMtel(String mtel) {
		this.mtel = mtel;
	}

	public int getMlisence() {
		return mlisence;
	}

	public void setMlisence(int mlisence) {
		this.mlisence = mlisence;
	}

	@Override
	public String toString() {
		return "MemberDTO [mid=" + mid + ", mpassword=" + mpassword + ", mname=" + mname + ", mtel=" + mtel + ", mlisence="
				+ mlisence + "]";
	}
	

	
	

}
