package utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;


public class SetUpReport {
    ExtentReports extent;
    ExtentSparkReporter spark;
    public void setUp(){
         extent = new ExtentReports();
         spark = new ExtentSparkReporter("target/Spark.html");
         extent.attachReporter(spark);
    }
    public ExtentTest test(){
        ExtentTest test = extent.createTest("Login","Validacion de Inicio de sesion");
        return test;
    }
    public void tearDown(){
        extent.flush();
    }
}
