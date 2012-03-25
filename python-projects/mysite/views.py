from django.http import HttpResponse
from django.core.context_processors import request
def hello(request):
    return HttpResponse("Hello world")