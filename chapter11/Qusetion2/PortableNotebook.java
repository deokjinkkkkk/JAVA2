package Qusetion2;

public class PortableNotebook implements Notebook, Tablet {
	int MODE;
	String document;
	String browser;
	String videoType;
	String appType;
	
	public  PortableNotebook(int MODE,String document,String browser,String videoType,String appType) {
		this.MODE = MODE;
		this.document = document;
		this.browser = browser;
		this.videoType = videoType;
		this.appType = appType;
		if (MODE == NOTEBOOK_MODE) {
			System.out.println("NOTEBOOK_MODE");
		}else if(MODE == TABLET_MODE) {
			System.out.println("TABLET_MODE");
		}
	}
	@Override
	public void watchVideo() {
		System.out.println(videoType +"를 시청.");

	}

	@Override
	public void useApp() {
		
		if(MODE == NOTEBOOK_MODE){
			MODE = TABLET_MODE;
			System.out.println(appType+"를 실행");
		}else if(MODE == TABLET_MODE) {
			System.out.println(appType+"를 실행");
		}
	}	
	

	@Override
	public void writeDocumentaion() {
		System.out.println(document +"을 통해 문서를 작성");
	}

	@Override
	public void searchInternet() {
		System.out.println(browser+"를 통해 인터넷을 검색.");

	}
	public void changeMode() {
		switch(MODE) {
		case 1:
			MODE = TABLET_MODE;
			System.out.println("TABLET_MODE");
			break;
		case 2:
			MODE = NOTEBOOK_MODE;
			System.out.println("NOTEBOOK_MODE");
			break;
		}
	}

}
