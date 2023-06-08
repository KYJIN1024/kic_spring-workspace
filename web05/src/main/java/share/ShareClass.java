package share;

public class ShareClass {
	private String shareData1;
	
	public ShareClass() {
		// TODO Auto-generated constructor stub
		System.out.println("ShareClass() 호출");
	}

	public String getShareData1() {
		System.out.println("getShareData1() 호출");
		return shareData1;
	}

	public void setShareData1(String shareData1) {
		System.out.println("setShareData1() 호출");
		this.shareData1 = shareData1;
	}
	
}
