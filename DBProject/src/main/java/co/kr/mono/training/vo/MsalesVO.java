package co.kr.mono.training.vo;

public class MsalesVO {
	private String prodId;
	private String prodNm;
	private int saleCnt;
	
	public MsalesVO() {
	}
	public MsalesVO(String prodId, String prodNm, int saleCnt) {
		super();
		this.prodId = prodId;
		this.prodNm = prodNm;
		this.saleCnt = saleCnt;
	}
	
	public String getProdId() {
		System.out.println("getProdId 추출값 : " + prodId);
		return prodId;
	}
	public void setProdId(String prodId) {
		System.out.println("setProdId 세팅값 : " + prodId);
		this.prodId = prodId;
	}
	public String getProdNm() {
		System.out.println("getProdNm 추출값 : " + prodNm);
		return prodNm;
	}
	public void setProdNm(String prodNm) {
		System.out.println("setProdNm 세팅값 : " + prodNm);
		this.prodNm = prodNm;
	}
	public int getSaleCnt() {
		System.out.println("getSaleCnt 추출값 : " + saleCnt);
		return saleCnt;
	}
	public void setSaleCnt(int saleCnt) {
		System.out.println("setSaleCnt 세팅값 : " + saleCnt);
		this.saleCnt = saleCnt;
	}
	
//	@Override
//	public String toString() {
//		return "MsalesVO [prodId=" + prodId + ", prodNm=" + prodNm + ", saleCnt=" + saleCnt + "]";
//	}
	
}
