package com.sxq.common.config.activiti;

import org.activiti.engine.*;
import org.activiti.spring.ProcessEngineFactoryBean;
import org.activiti.spring.SpringProcessEngineConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.transaction.PlatformTransactionManager;

import javax.sql.DataSource;

/**
 * @Auther sun
 * @Date 2019/10/18 20:38
 * @Discription example
 */
@Component
public class ActivitiConfiguration {

    @Autowired
    private DataSource dataSource;
    @Autowired
    private PlatformTransactionManager transactionManager;
    @Bean("processConfiguration")
    public SpringProcessEngineConfiguration getProcessEngineConfiguration(){
        SpringProcessEngineConfiguration configuration = new SpringProcessEngineConfiguration();
        configuration.setDataSource(dataSource);
        configuration.setTransactionManager(transactionManager);
        configuration.setDatabaseSchemaUpdate("true");
        configuration.setJobExecutorActivate(false);

        configuration.setActivityFontName("宋体");
        configuration.setAnnotationFontName("宋体");
        configuration.setLabelFontName("宋体");

        return configuration;
    }

    @Bean
    public ProcessEngineFactoryBean getProcessEngineFactoryBean(){
        ProcessEngineFactoryBean processEngineFactoryBean = new ProcessEngineFactoryBean();
        processEngineFactoryBean.setProcessEngineConfiguration(this.getProcessEngineConfiguration());
        return processEngineFactoryBean;
    }

    @Bean("repositoryService")
    public RepositoryService getRepositoryService(){
        return this.getProcessEngineConfiguration().getRepositoryService();
    }

    @Bean("runtimeService")
    public RuntimeService getRuntimeService(){
        return this.getProcessEngineConfiguration().getRuntimeService();
    }

    @Bean("taskService")
    public TaskService getTaskService(){
        return this.getProcessEngineConfiguration().getTaskService();
    }

    @Bean("formService")
    public FormService getFormService(){
        return this.getProcessEngineConfiguration().getFormService();
    }

    @Bean("historyService")
    public HistoryService getHistoryService(){
        return this.getProcessEngineConfiguration().getHistoryService();
    }

    @Bean("identityService")
    public IdentityService getIdentityService(){
        return this.getProcessEngineConfiguration().getIdentityService();
    }

    @Bean("managementService")
    public ManagementService getManagementService(){
        return this.getProcessEngineConfiguration().getManagementService();
    }
}
