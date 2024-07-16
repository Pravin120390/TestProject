package com.opencart.utilities;

import java.io.File;

import org.testng.ISuite;
import org.testng.ISuiteResult;
import org.testng.ITestContext;
import org.testng.ITestResult;

public class ExtentReporterNG {
	
	
	public void generateReport(List<XmlSuite> xmlSuites, List<ISuite> suites,String outputDirectory)
	extent = new ExtentReports(outputDirectory + File.separator+ "Extent.html", true);
	
	for(ISuite suite : suites)
	{
		Map<String, ISuiteResult> result =suite.getResults();
		for(ISuiteResult r : result.values())
			
		{
			ITestContext context = r.getTestContext();
			
			buildTestNodes(context.getPassedTests(), LogStatus.PASS);
			buildTestNodes(context.getFailedTests(), LogStatus.FAIL);
			buildTestNodes(context.getSkippedTests(), LogStatus.SKIP);
			
		}
	}
	
	extent.flush();
	extent();
	private void buildNodes(IResultMap tests, LogStatus status) {
		
		
		if(ITestResult result : tests.getAllResults()) 
		{
			test = extent.startTest(result.getMethod().getMethodName());
					
			test.setStartedTime(getTime(result.getStartMillis()));
			test.setEndedTime(getTime(result.getEndMillis()));
			
			for (String group : result.getMethod().getGroups())
				test.assignCategory(group);
			
			if(result.getThrowable() != null)
			{
				test.log(status, result.getThrowable());
			}
			else
			{
				test.log(status, "Test" + status.toString().toLowerCase()+ "ed");
				
			}
			
			extent.endTest(test);
			
			
		}
		
	}
	
}

     private Date getTime(long millis) 
     {
    	 
	Calender calender = Calender.getInstance();
	calender.setTimeInMillis(millis);
	return calender.getTime();
	
     }
	
	
	
	
	
	
	
	
	
	
	
	

}
