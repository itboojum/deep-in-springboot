package com.boojum.deepinspringboot.util;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.core.toolkit.StringPool;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.InjectionConfig;
import com.baomidou.mybatisplus.generator.config.*;
import com.baomidou.mybatisplus.generator.config.po.TableInfo;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

import java.io.File;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CodeGenerator {

    private static String packageName = "com.boojum.deepinspringboot";
    private static String outDir = "D:\\Study\\projects\\deep-in-springboot\\src\\main\\java";
    private static String entity = "entity";
    private static String mapper = "mapper";
    private static String service = "service";
    private static String impl = "service.impl";
    private static String controller = "controller";
//    private static String xml = "mapper.xml";
    private static boolean isOverEntity = true;
    private static boolean isOverController = true;
    private static boolean isOverService = true;
    private static boolean isOverServiceImpl = true;
    private static boolean isOverMapper = true;
    private static boolean isOverXml = true;

    private static String entityVM = "/templates/entity.vm";
    private static String controllerVM = "/templates/controller.vm";
    private static String serviceVM = "";
    private static String serviceImplVM = "";
    private static String mapperVM = "";
    private static String xmlVM = "";

    private static String [] baseDir = {entity, mapper, service, impl, controller};
    public static void main(String[] args) {
        //user -> UserService, 设置成true: user -> IUserService
        boolean serviceNameStartWithI = false;
        generateByTables(serviceNameStartWithI, packageName,
                "ums_admin","ums_role","ums_permission","ums_admin_role_relation","ums_role_permission_relation","ums_admin_permission_relation");
    }

    private static void generateByTables(boolean serviceNameStartWithI, String packageName, String... tableNames) {
        GlobalConfig config = new GlobalConfig();
        String dbUrl = "jdbc:mysql://192.168.75.131:3306/mall?characterEncoding=UTF-8";
        DataSourceConfig dataSourceConfig = new DataSourceConfig();
        dataSourceConfig.setDbType(DbType.MYSQL)
                .setUrl(dbUrl)
                .setUsername("root")
                .setPassword("root")
                .setDriverName("com.mysql.cj.jdbc.Driver");
        StrategyConfig strategyConfig = new StrategyConfig();
        strategyConfig
                .setCapitalMode(false)
                .setEntityLombokModel(true)
                .setRestControllerStyle(true)
                .entityTableFieldAnnotationEnable(false)
                .setNaming(NamingStrategy.underline_to_camel)
                .setColumnNaming(NamingStrategy.underline_to_camel)
                //修改替换成你需要的表名，多个表名传数组
                //如果要对库里的所有表生成，则不进行设置即可
                .setInclude(tableNames);
        config.setActiveRecord(true)
                .setAuthor("boojum")
                .setOutputDir(outDir)
                .setOpen(false)
                .setBaseResultMap(true)
                .setBaseColumnList(true)
                .setFileOverride(true)
                .setEnableCache(false)
                // XML ResultMap
                .setBaseResultMap(true)
                // XML columList;
                .setBaseColumnList(true);
        if (!serviceNameStartWithI) {
            config.setServiceName("%sService");
        }

        PackageConfig pcf = initPackage();

        TemplateConfig tc = initTemplateConfig(packageName);

        // 自定义配置
        InjectionConfig cfg = new InjectionConfig() {
            @Override
            public void initMap() {
                // to do nothing
            }
        };

        String templatePath = "/templates/mapper.xml.vm";
        // 自定义输出配置
        List<FileOutConfig> focList = new ArrayList<>();
        // 自定义配置会被优先输出
        focList.add(new FileOutConfig(templatePath) {
            @Override
            public String outputFile(TableInfo tableInfo) {
                // 自定义输出文件名 ， 如果你 Entity 设置了前后缀、此处注意 xml 的名称会跟着发生变化！！
                return "D:/Study/projects/deep-in-springboot/src/main/resources/mapper/" + tableInfo.getEntityName() + "Mapper" + StringPool.DOT_XML;
            }
        });
        cfg.setFileOutConfigList(focList);

        new AutoGenerator().setGlobalConfig(config)
                .setDataSource(dataSourceConfig)
                .setStrategy(strategyConfig)
                .setPackageInfo(pcf)
                .setTemplate(tc)
                .setCfg(cfg)
                .execute();
    }

    /**
     * 根据自己的需要，修改哪些包下面的 要覆盖还是不覆盖
     * @param packageName
     */
    private static TemplateConfig initTemplateConfig(String packageName) {
        TemplateConfig tc = new TemplateConfig();
        for(String tmp : baseDir) {
            initVM(tc);
            File file = new File(Paths.get(outDir, String.join("/", packageName.split("\\.")), tmp).toString());
            String[] list = file.list();
            if(list != null && list.length > 0) {
                if(!isOverController) {
                    tc.setController(null);
                }
                if(!isOverService) {
                    tc.setService(null);
                }
                if(!isOverServiceImpl) {
                    tc.setServiceImpl(null);
                }
                if(!isOverEntity) {
                    tc.setEntity(null);
                }
                if(!isOverMapper) {
                    tc.setEntity(null);
                }
                if(!isOverXml) {
                    tc.setXml(null);
                }
            }
        }
        return tc;
    }

    private static void initVM(TemplateConfig tc) {
        if(stringIsNotNull(entityVM)) {
            tc.setEntity(entityVM);
        }
        if(stringIsNotNull(mapperVM)) {
            tc.setMapper(mapperVM);
        }
        if(stringIsNotNull(serviceImplVM)) {
            tc.setServiceImpl(serviceImplVM);
        }
        if(stringIsNotNull(serviceVM)) {
            tc.setService(serviceVM);
        }
        if(stringIsNotNull(xmlVM)) {
            tc.setXml(xmlVM);
        }
        if(stringIsNotNull(controllerVM)) {
            tc.setController(controllerVM);
        }
    }

    /**
     * 简单判断字符串是不是为空
     * @param s
     * @return
     */
    private static boolean stringIsNotNull(String s) {
        if(null != s && !s.equals("") && s.length() > 0 && s.trim().length() > 0) {
            return true;
        }
        return false;
    }

    /**
     * 初始化包目录配置
     * @return
     */
    private static PackageConfig initPackage() {
        PackageConfig packageConfig = new PackageConfig();
        packageConfig.setParent(packageName);
        packageConfig.setService(service);
        packageConfig.setServiceImpl(impl);
        packageConfig.setController(controller);
        packageConfig.setEntity(entity);
//        packageConfig.setXml(xml);
        return packageConfig;
    }
}
