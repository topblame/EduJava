package kr.co.soldesk.config;

import javax.servlet.Filter;
import javax.servlet.MultipartConfigElement;
import javax.servlet.ServletRegistration.Dynamic;

import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class SpringConfigClass extends AbstractAnnotationConfigDispatcherServletInitializer {
	// DispatcherServlet에 매핑할 요청 주소를 셋팅한다.
	@Override
	protected String[] getServletMappings() {
		// TODO Auto-generated method stub
		return new String[] { "/" };
	}

	// Spring MVC 프로젝트 설정을 위한 클래스를 지정한다.
	@Override
	protected Class<?>[] getServletConfigClasses() {
		// TODO Auto-generated method stub
		return new Class[] { ServletAppContext.class };
	}

	// 프로젝트에서 사용할 Bean들을 정의기 위한 클래스를 지정한다.
	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return new Class[] { RootAppContext.class };
	}

	// 파라미터 인코딩 필터 설정
	@Override
	protected Filter[] getServletFilters() {
		// TODO Auto-generated method stub
		CharacterEncodingFilter encodingFilter = new CharacterEncodingFilter();
		encodingFilter.setEncoding("UTF-8");
		return new Filter[] { encodingFilter };
	}
	// Multipart 정보구현
	// null: 사용자가 입력한 내용을 임시기억할 아파치톰켁에서 제공하는 서버의 임시기억장소
	// 52428800 : 업로드 데이터의 용량 (1024*50) 50M로 설정
	// 524288000 : 파일데이터를 포함한 전체용량 500M 설정
	// 0 : 파일의 임계값

	@Override
   protected void customizeRegistration(Dynamic registration) {
      // TODO Auto-generated method stub
      super.customizeRegistration(registration);
      MultipartConfigElement config1 = new MultipartConfigElement(null, 52428800, 524288000, 0);
      registration.setMultipartConfig(config1);
   }
}
