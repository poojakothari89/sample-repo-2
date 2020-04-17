package org.jaxb.util;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileReader;
import java.io.InputStream;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.jaxb.model.BugCollection;
import org.jaxb.model.Employee;
import org.jaxb.model.IssueDetails;
import org.jaxb.model.IssuePriority;
import org.jaxb.model.IssueType;
import org.jaxb.model.Project;

public class PrepareDataUtil {

	public static BugCollection prepareBugSampleData() {
		BugCollection collection = new BugCollection();
		List<IssueDetails> issueList = new ArrayList<IssueDetails>();
		Employee owner = new Employee(1, "Pooja","Kothari","abc");
		Employee seeker = new Employee(2, "Rahul","Barfa","xyz");
		Project project = new Project("P01","Yo Uganda",new Employee(3, "Rajendra","Malviya","qwe"));
		
		
		IssueDetails issue1 = new IssueDetails();
		issue1.setIssueId(1);
		issue1.setIssueType(IssueType.CODE_LEVEL);
		issue1.setPriority(IssuePriority.HIGH);
		//issue1.setCloseDate(new Date());
		issue1.setIssueOwner(owner);
		issue1.setIssueSeeker(seeker);
		issue1.setLogDate( yesterday());
		issue1.setProjectDetails(project);
		issue1.setSummary("This issue is related to null pointer Exception in xyz.java file");
		
		issueList.add(issue1);
		
		IssueDetails issue2 = new IssueDetails();
		issue2.setIssueId(2);
		issue2.setIssueType(IssueType.FORMAT_LEVEL);
		issue2.setPriority(IssuePriority.LOW);
		issue2.setCloseDate(new Date());
		issue2.setIssueOwner(owner);
		issue2.setIssueSeeker(seeker);
		issue2.setLogDate(yesterday());
		issue2.setProjectDetails(project);
		issue2.setSummary("This issue is related to intentation in xyz.java file");
		
		issueList.add(issue2);
		
		collection.setIssueDetailsList(issueList);
		
		return collection;
	}
	
	private static Date yesterday() {
	    final Calendar cal = Calendar.getInstance();
	    cal.add(Calendar.DATE, -1);
	    return cal.getTime();
	}

	public static InputStream getBugCollectionResponse() throws Exception {
		
		// our XML file for this example
        File xmlFile = new File("./XML/Bug-Collection.xml");
        
        // Let's get XML file as String using BufferedReader
        // FileReader uses platform's default character encoding
        // if you need to specify a different encoding, use InputStreamReader
        Reader fileReader = new FileReader(xmlFile);
        @SuppressWarnings("resource")
		BufferedReader bufReader = new BufferedReader(fileReader);
        
        StringBuilder sb = new StringBuilder();
        String line = bufReader.readLine();
        while( line != null){
            sb.append(line).append("\n");
            line = bufReader.readLine();
        }
      
        InputStream response = new ByteArrayInputStream(sb.toString().getBytes());
       
		return response;
		
	}
}
