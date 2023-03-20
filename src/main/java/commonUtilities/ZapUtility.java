package commonUtilities;
import org.openqa.selenium.Proxy;
import org.zaproxy.clientapi.core.ClientApi;

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
		proxy=new Proxy().setSslProxy(zapProxyAddress+":"+zapProxyPort).setHttpProxy(zapProxyAddress+":"+zapProxyPort);
	}

}
