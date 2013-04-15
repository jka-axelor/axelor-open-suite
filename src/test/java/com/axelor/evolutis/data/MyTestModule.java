package com.axelor.evolutis.data;

import net.sf.ehcache.CacheManager;

import com.axelor.auth.AuthModule;
import com.axelor.db.JpaModule;
import com.google.inject.AbstractModule;

public class MyTestModule extends AbstractModule {
    
    @Override
    protected void configure() {   	
    	// shutdown the cache manager if running
		if (CacheManager.ALL_CACHE_MANAGERS.size() > 0) {
			CacheManager.getInstance().shutdown();
		}
        install(new JpaModule("testUnit", true, true));
        install(new AuthModule.Simple());
        configureImport();
    }
    
    protected void configureImport() {
        
    }
}
