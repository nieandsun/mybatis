package cn.nrsc.generator;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;
import org.mybatis.generator.config.Configuration;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * @author : Sun Chuan
 * @date : 2019/10/31 23:08
 * Description：
 */
public class MybatisGenerator {
    public void generator() throws Exception {

        List<String> warnings = new ArrayList<String>();
        boolean overwrite = true;
        // 指定 逆向工程配置文件
        File configFile = new File(MybatisGenerator.class.getClassLoader().getResource("mbg.xml").getPath());
        ConfigurationParser cp = new ConfigurationParser(warnings);
        Configuration config = cp.parseConfiguration(configFile);
        DefaultShellCallback callback = new DefaultShellCallback(overwrite);
        MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
        myBatisGenerator.generate(null);

    }

    public static void main(String[] args) throws Exception {
        try {
            MybatisGenerator generatorSqlmap = new MybatisGenerator();
            generatorSqlmap.generator();

            System.out.println("finish....");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
