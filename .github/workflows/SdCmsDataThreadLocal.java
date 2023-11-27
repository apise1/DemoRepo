package org.jlrdigital.sta.sd.presentation;

import org.jlrdigital.sta.cms.dto.SdProcessBackingData;

public class SdCmsDataThreadLocal {
	 private static final ThreadLocal<SdProcessBackingData> cmsData = new ThreadLocal<SdProcessBackingData>();

	    public static SdProcessBackingData get() {
	    	return cmsData.get();
	    }

	    public static void set(SdProcessBackingData request) {
	    	cmsData.set(request);
	    }
}
