package org.testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\UsEr\\eclipse-workspace\\Class57JavaSeleniumCucumber\\src\\test\\resources\\FeatureFiles\\01JavaStringIfLoop.feature",
				 glue="org.stepdefinitionclass",
				 snippets=SnippetType.CAMELCASE,
				 monochrome=true)
public class Tsk01TestRunnerJavaString {

}
