package unitj;

import java.util.List;

import org.apache.poi.util.SystemOutLogger;
import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class RunnerClass {
@Test
public void tc30() {
Result rc = JUnitCore.runClasses(A.class, unitcase.class, B.class);
System.out.println(rc.getRunCount());
System.out.println(rc.getRunTime());
System.out.println(rc.getFailureCount());
System.out.println(rc.getIgnoreCount());

List<Failure> failures = rc.getFailures();
for (Failure f : failures) {
	System.out.println(f);
}
}
   
}
