# Create your views here.
from django.utils.encoding import smart_unicode
from django.shortcuts import render_to_response 
 
def home(request): 
    return render_to_response("index.html") 
