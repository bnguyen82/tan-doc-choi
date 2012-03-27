from django.http import HttpResponse
from django.core.context_processors import request
import datetime
def hello(request):
    return HttpResponse("Hello world")
def current_time(request):
    now = datetime.datetime.now()
    html = "<html><body>It's now %s.</html></body>" % now
    return HttpResponse(html)