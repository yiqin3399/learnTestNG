package net.test.testng.service.servicetest;

import net.test.testng.service.ToBeTestedService;
import net.test.testng.service.impl.ToBeTestedServiceImpl;
import org.testng.Assert;
import org.testng.annotations.*;

public class ToBeTestedServiceTest {

    protected ToBeTestedService toBeTestedService = new ToBeTestedServiceImpl();

   //整个test case运行所需要的基本环境，包括业务开关，上下游业务中所需要的其他服务的引入以及服务引入成功的判断
    @BeforeClass
    public void initEnv(){

    }

    //提供本次测试方式所依赖的环境信息，如依赖了数据库
    @BeforeMethod
    public void initData(){

    }

    @Test
    public void testReturnString(){
        String result = toBeTestedService.returnString();
        Assert.assertNotNull(result);
        Assert.assertEquals(result,"a string");

    }

    @AfterMethod
    public void cleanData(){

    }

    @AfterClass
    public void restoreEnv(){

    }
}
