from django.conf.urls.defaults import patterns, include, url

# Uncomment the next two lines to enable the admin:
# from django.contrib import admin
# admin.autodiscover()

urlpatterns = patterns('',
    # Examples:
    # url(r'^$', 'ecomstore.views.home', name='home'),
    # url(r'^ecomstore/', include('ecomstore.foo.urls')),

    # Uncomment the admin/doc line below to enable admin documentation:
    # url(r'^admin/doc/', include('django.contrib.admindocs.urls')),

    # Uncomment the next line to enable the admin:
    # url(r'^admin/', include(admin.site.urls)),
#    (r'^catalog/?', 'views.home'), 
 
    
)
urlpatterns += patterns('', 
    #other commented code here 
    (r'^catalog/$', 'preview.views.home'), 
#    (r'^catalog/?', 'views.home'),
    (r'^static/(?P<path>.*)$', 'django.views.static.serve', 
          { 'document_root' : 'D:/My Documents/Home/pythons/ecomstore' }),    
) 
