package co.kr.mono.training.nvo;

public class AreaSaleNVO {
	private String areaCd;
	private String regionArea;
	private String prodId;
	private int saleCnt;
	
	
	public AreaSaleNVO() {
		
	}

	public AreaSaleNVO(String areaCd, String regionArea, String prodId, int saleCnt) {
		super();
		this.areaCd = areaCd;
		this.regionArea = regionArea;
		this.prodId = prodId;
		this.saleCnt = saleCnt;
	}

	public String getAreaCd() {
		return areaCd;
	}

	public void setAreaCd(String areaCd) {
		this.areaCd = areaCd;
	}

	public String getRegionArea() {
		return regionArea;
	}

	public void setRegionArea(String regionArea) {
		this.regionArea = regionArea;
	}

	public String getProdId() {
		return prodId;
	}

	public void setProdId(String prodId) {
		this.prodId = prodId;
	}

	public int getSaleCnt() {
		return saleCnt;
	}

	public void setSaleCnt(int saleCnt) {
		this.saleCnt = saleCnt;
	}

	@Override
	public String toString() {
		return "AreaSaleVO [areaCd=" + areaCd + ", regionArea=" + regionArea + ", prodId=" + prodId + ", saleCnt="
				+ saleCnt + "]";
	}
	
}
