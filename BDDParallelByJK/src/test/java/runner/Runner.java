/*
 * @author: Jitendra
 */
package runner;

import cucumber.api.CucumberOptions;

@CucumberOptions(glue = "stepdef", features = "src/test/resources/features/")
public class Runner extends AbstractTestNGCucumberParallelTests {

}
