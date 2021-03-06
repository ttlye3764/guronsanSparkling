package kr.or.ddit.thumbnail.controller;

import java.lang.reflect.InvocationTargetException;

import javax.servlet.http.HttpServletRequest;

import kr.or.ddit.thumbnail.service.IThumbnailService;
import kr.or.ddit.thumbnail.service.ThumbnailServiceImpl;
import kr.or.ddit.vo.ThumbnailVO;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ModelDriven;

public class UpdateThumbnailAction implements ModelDriven<ThumbnailVO>{
	private ThumbnailVO thumbnailInfo;
	
	public String execute(){	
		HttpServletRequest request = ServletActionContext.getRequest();
				

		IThumbnailService service = ThumbnailServiceImpl.getInstance();
		service.updateThumbnail(thumbnailInfo);
		
		
		
		return "success";
	}

	@Override
	public ThumbnailVO getModel() {
		this.thumbnailInfo = new ThumbnailVO();
		return this.thumbnailInfo;
	}
}
