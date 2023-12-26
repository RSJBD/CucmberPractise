package practise;

import java.awt.Dimension;
import java.awt.Toolkit;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class Demo {

	public static void main(String[] args) throws InterruptedException {

		Toolkit defaultToolkit = Toolkit.getDefaultToolkit();
		Dimension dimension = defaultToolkit.getScreenSize();
		int height=dimension.height;
		int width=	dimension.width;		
		Playwright playwright = Playwright.create();
		Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false).setChannel("chrome"));
		Browser webkitBroswer = playwright.webkit().launch(new BrowserType.LaunchOptions().setChannel("webkit").setHeadless(false));

		BrowserContext browserContext = browser.newContext(new Browser.NewContextOptions().setViewportSize(width, height));
		BrowserContext webkitBrowsercontext = webkitBroswer.newContext(new Browser.NewContextOptions().setViewportSize(width, height));
		Page webkitpage = webkitBrowsercontext.newPage();
		Page page = browserContext.newPage();
		Page newPage = browserContext.newPage();
		webkitpage.navigate("https://zerodha.com/brokerage-calculator#tab-equities");

		page.navigate("https://playwright.dev/");

		newPage.navigate("https://www.myntra.com/");

		page.bringToFront();
		Thread.sleep(5000);
		webkitpage.bringToFront();
		page.close();
		playwright.close();

	}
}
