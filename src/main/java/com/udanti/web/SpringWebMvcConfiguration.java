package com.udanti.web;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Properties;

import javax.annotation.Resource;

import org.apache.commons.dbcp.BasicDataSource;
import org.hibernate.ejb.event.EntityCallbackHandler;
import org.hibernate.envers.event.AuditEventListener;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.http.MediaType;
import org.springframework.http.converter.json.MappingJacksonHttpMessageConverter;
import org.springframework.orm.hibernate3.HibernateTransactionManager;
import org.springframework.orm.hibernate3.annotation.AnnotationSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.validation.Validator;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.i18n.CookieLocaleResolver;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;
import org.springframework.web.servlet.mvc.annotation.DefaultAnnotationHandlerMapping;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter;
import org.springframework.web.servlet.view.ContentNegotiatingViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.json.MappingJacksonJsonView;

/*import com.serb.listener.SaveOrUpdateEventListener;*/

/**
 * 
 * 
 */
@Configuration
@EnableWebMvc
@EnableTransactionManagement
@ComponentScan(basePackages = { "com.udanti" })
@PropertySource("classpath:application.properties")
public class SpringWebMvcConfiguration extends WebMvcConfigurationSupport {

	private static final String VIEW_RESOLVER_PREFIX 					= "/WEB-INF/views/";
	private static final String VIEW_RESOLVER_SUFFIX 					= ".jsp";

	private static final String PROPERTY_NAME_DATABASE_DRIVER 			= "db.driver";
	private static final String PROPERTY_NAME_DATABASE_URL 				= "db.url";
	private static final String PROPERTY_NAME_DATABASE_USERNAME 		= "db.username";
	private static final String PROPERTY_NAME_DATABASE_PASSWORD 		= "db.password";
	/*private static final String PROPERTY_NAME_VALIDATION_QUERY			= "db.validationQuery";*/
	private static final String PROPERTY_NAME_TEST_ON_BORROW 			= "db.testOnBorrow";

	private static final String PROPERTY_NAME_HIBERNATE_DIALECT 		= "hibernate.dialect";
	private static final String PROPERTY_NAME_HIBERNATE_SHOW_SQL 		= "hibernate.show_sql";
	private static final String PROPERTY_NAME_ANNOTATED_PACKAGE 		= "hibernate.annotatedPackage";
	private static final String PROPERTY_NAME_HBM2DDL_AUTO 				= "hibernate.hbm2ddl.auto";
	
	/*private static final String PROPERTY_NAME_SAVE_UPDATE 				= "save-update";*/
	private static final String PROPERTY_NAME_POST_INSERT 				= "post-insert";
	private static final String PROPERTY_NAME_POST_UPDATE 				= "post-update";
	private static final String PROPERTY_NAME_POST_DELETE 				= "post-delete";
	private static final String PROPERTY_NAME_PRE_COLl_UPDATE 			= "pre-collection-update";
	private static final String PROPERTY_NAME_PRE_COLL_REMOVE 			= "pre-collection-remove";
	private static final String PROPERTY_NAME_PRE_COLL_RECREATE 		= "post-collection-recreate";

	/*private static final String PROPERTY_NAME_MESSAGE_BASENAME 			= "message.basename";
	private static final String PROPERTY_NAME_LABEL_BASENAME 			= "label.basename";
	private static final String PROPERTY_NAME_MESSAGE_DEFAULT_ENCODING 	= "message.encoding";*/

	@Resource
	private Environment environment;

	@Bean
	public ViewResolver viewResolver() {
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setPrefix(VIEW_RESOLVER_PREFIX);
		resolver.setSuffix(VIEW_RESOLVER_SUFFIX);

		return resolver;
	}

	@Bean
	public ViewResolver contentNegotiatingViewResolver() {
		ContentNegotiatingViewResolver resolver = new ContentNegotiatingViewResolver();
		resolver.setOrder(1);
		Map<String, String> mediaTypes = new HashMap<String, String>();
		mediaTypes.put("json", "application/json");
		resolver.setMediaTypes(mediaTypes);
		List<View> defaultViews = new ArrayList<View>();
		defaultViews.add(jacksonJsonView());
		resolver.setDefaultViews(defaultViews);

		return resolver;
	}

	@Bean
	public MultipartResolver multipartResolver() {
		CommonsMultipartResolver mr = new CommonsMultipartResolver();
		mr.setMaxUploadSize(105000000);
		return mr;
	}

	@Bean
	public CookieLocaleResolver localeResolver() {
		CookieLocaleResolver localeResolver = new CookieLocaleResolver();
		localeResolver.setDefaultLocale(new Locale("en", "US"));
		return localeResolver;
	}

	@Bean
	public MappingJacksonJsonView jacksonJsonView() {
		return new MappingJacksonJsonView();
	}

	@Bean
	public LocaleChangeInterceptor localeChangeInterceptor() {
		return new LocaleChangeInterceptor();
	}

	@Bean
	public DefaultAnnotationHandlerMapping handlerMapping() {
		DefaultAnnotationHandlerMapping handlerMapping = new DefaultAnnotationHandlerMapping();
		handlerMapping.setInterceptors(new Object[] { localeChangeInterceptor() });
		return handlerMapping;
	}

	/*@Bean
	public ReloadableResourceBundleMessageSource messageSource() {
		ReloadableResourceBundleMessageSource messageSource = new ReloadableResourceBundleMessageSource();
		messageSource
				.setBasenames(new String[] {
						environment
								.getRequiredProperty(PROPERTY_NAME_MESSAGE_BASENAME),
						environment
								.getRequiredProperty(PROPERTY_NAME_LABEL_BASENAME) });
		messageSource.setDefaultEncoding(environment
				.getRequiredProperty(PROPERTY_NAME_MESSAGE_DEFAULT_ENCODING));

		return messageSource;
	}
*/
	@Bean
	public HibernateTransactionManager hibernateTransactionManager(){
		HibernateTransactionManager hibernateTransactionManager=new HibernateTransactionManager();
		hibernateTransactionManager.setSessionFactory(sessionFactory().getObject());
		return hibernateTransactionManager;
		
	}
	@Bean
	public BasicDataSource dataSource() {
		BasicDataSource dataSource = new BasicDataSource();
		dataSource.setDriverClassName(environment
				.getRequiredProperty(PROPERTY_NAME_DATABASE_DRIVER));
		dataSource.setUrl(environment
				.getRequiredProperty(PROPERTY_NAME_DATABASE_URL));
		dataSource.setUsername(environment
				.getRequiredProperty(PROPERTY_NAME_DATABASE_USERNAME));
		dataSource.setPassword(environment
				.getRequiredProperty(PROPERTY_NAME_DATABASE_PASSWORD));

		dataSource.setTestOnBorrow(Boolean.parseBoolean(environment
				.getRequiredProperty(PROPERTY_NAME_TEST_ON_BORROW)));

		return dataSource;
	}

	@Bean
	public AnnotationSessionFactoryBean sessionFactory() {
		AnnotationSessionFactoryBean sessionFactory = new AnnotationSessionFactoryBean();
		sessionFactory.setDataSource(dataSource());
		// setting hibernate properties
		Properties hibernateProperties = new Properties();
		hibernateProperties.put(PROPERTY_NAME_HIBERNATE_DIALECT, environment
				.getRequiredProperty(PROPERTY_NAME_HIBERNATE_DIALECT));
		hibernateProperties.put(PROPERTY_NAME_HIBERNATE_SHOW_SQL, environment
				.getRequiredProperty(PROPERTY_NAME_HIBERNATE_SHOW_SQL));

		hibernateProperties.put(PROPERTY_NAME_HBM2DDL_AUTO,
				environment.getRequiredProperty(PROPERTY_NAME_HBM2DDL_AUTO));

		sessionFactory.setHibernateProperties(hibernateProperties);

		sessionFactory.setPackagesToScan(new String[] { environment
				.getRequiredProperty(PROPERTY_NAME_ANNOTATED_PACKAGE) });

		// attaching event listener
		Map<String, Object> eventListeners = new HashMap<String, Object>();
		/*eventListeners.put(PROPERTY_NAME_SAVE_UPDATE,
				saveOrUpdateEventListener());*/
		eventListeners.put(PROPERTY_NAME_POST_INSERT, new AuditEventListener());
		eventListeners.put(PROPERTY_NAME_POST_UPDATE, new AuditEventListener());
		eventListeners.put(PROPERTY_NAME_POST_DELETE, new AuditEventListener());
		eventListeners.put(PROPERTY_NAME_PRE_COLl_UPDATE,
				new AuditEventListener());
		eventListeners.put(PROPERTY_NAME_PRE_COLL_REMOVE,
				new AuditEventListener());
		eventListeners.put(PROPERTY_NAME_PRE_COLL_RECREATE,
				new AuditEventListener());

		sessionFactory.setEventListeners(eventListeners);

		return sessionFactory;
	}

/*@Bean
	public SaveOrUpdateEventListener saveOrUpdateEventListener() {
		SaveOrUpdateEventListener saveOrUpdateEventListener = new SaveOrUpdateEventListener();
		saveOrUpdateEventListener.setCallbackHandler(callbackHandler());
		return saveOrUpdateEventListener;
	}
*/
	@Bean
	public EntityCallbackHandler callbackHandler() {
		return new EntityCallbackHandler();
	}
/*	@Bean
	@PersistenceContext(type = PersistenceContextType.EXTENDED)
	public HibernateTransactionManager txManager() {
		HibernateTransactionManager txManager = new HibernateTransactionManager();
		txManager.setHibernateManagedSession(true);
		txManager.setSessionFactory(sessionFactory().getObject());
		return txManager;
	}
*/
	@Bean
	public MappingJacksonHttpMessageConverter jacksonMessageConverter() {
		MappingJacksonHttpMessageConverter converter = new MappingJacksonHttpMessageConverter();
		List<MediaType> supportedMediaTypes = new ArrayList<MediaType>();
		supportedMediaTypes.add(MediaType.APPLICATION_JSON);
		converter.setSupportedMediaTypes(supportedMediaTypes);
		return new MappingJacksonHttpMessageConverter();
	}

	@Bean
	public RequestMappingHandlerAdapter requestMappingHandlerAdapter() {
		RequestMappingHandlerAdapter handlerAdapter = super.requestMappingHandlerAdapter();
		handlerAdapter.getMessageConverters().add(0, jacksonMessageConverter());
		return handlerAdapter;
	}
	
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/resources/**").addResourceLocations(
				"/resources/");
	}

	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/").setViewName("welcome");
	}

	@Override
	public Validator getValidator() {
		return new LocalValidatorFactoryBean();
	}


}
