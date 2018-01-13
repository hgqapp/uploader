package com.am.jlfu.authorizer.impl;


import com.am.jlfu.authorizer.Authorizer;
import com.am.jlfu.fileuploader.exception.AuthorizationException;
import com.am.jlfu.fileuploader.web.UploadServletAction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.util.UUID;



/**
 * Default {@link Authorizer} that never throws an {@link AuthorizationException}.
 * 
 * @author antoinem
 * 
 */
@Component
public class DefaultAuthorizer
		implements Authorizer {

    private static final Logger log = LoggerFactory.getLogger(DefaultAuthorizer.class);

    @Override
	public void getAuthorization(HttpServletRequest request, UploadServletAction action, UUID clientId, UUID... optionalFileId) {
		// by default, all calls are authorized

	}

}
