package commonUtilities;
import org.openqa.selenium.Proxy;
import org.zaproxy.clientapi.core.ApiResponse;
import org.zaproxy.clientapi.core.ClientApi;
import org.zaproxy.clientapi.core.ClientApiException;

public class ZapUtility {
	private static ClientApi clientApi;
	public static Proxy proxy;
	
	//static is used to call the methods or variable without instantiation
	//only static variables cann be called inside static method
	//we directly call static method or variable using className.method/variable
	final static String zapProxyAddress="localhost";
	final static int zapProxyPort=8080;
	final static String zapApiKey="qmo82tk3gte2cacg44077qmdsc";
	
	static {
		clientApi=new ClientApi(zapProxyAddress, zapProxyPort, zapApiKey);
		proxy=new Proxy();
		proxy.setSslProxy(zapProxyAddress+":"+zapProxyPort);
		proxy.setHttpProxy(zapProxyAddress+":"+zapProxyPort);
	}
	
	public static void zapReport() throws ClientApiException {
		
		String title="Security testing";
		String template="traditional-html";
		String filename="zap-report.html";
		String desc="this is a zap report";
		//String sites=url;
		String reportdir=System.getProperty("user.dir");
		
		ApiResponse resp= clientApi.reports.generate(title, template, null, desc, null, null, null, null, null, filename,null , reportdir, null);
		System.out.println("Report is Generated at this location :"+ resp.toString());
	}
	
	

}
