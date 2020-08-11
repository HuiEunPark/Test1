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
		System.out.println("getProdId ���Ⱚ : " + prodId);
		return prodId;
	}
	public void setProdId(String prodId) {
		System.out.println("setProdId ���ð� : " + prodId);
		this.prodId = prodId;
	}
	public String getProdNm() {
		System.out.println("getProdNm ���Ⱚ : " + prodNm);
		return prodNm;
	}
	public void setProdNm(String prodNm) {
		System.out.println("setProdNm ���ð� : " + prodNm);
		this.prodNm = prodNm;
	}
	public int getSaleCnt() {
		System.out.println("getSaleCnt ���Ⱚ : " + saleCnt);
		return saleCnt;
	}
	public void setSaleCnt(int saleCnt) {
		System.out.println("setSaleCnt ���ð� : " + saleCnt);
		this.saleCnt = saleCnt;
	}
	
//	@Override
//	public String toString() {
//		return "MsalesVO [prodId=" + prodId + ", prodNm=" + prodNm + ", saleCnt=" + saleCnt + "]";
//	}
	
}
