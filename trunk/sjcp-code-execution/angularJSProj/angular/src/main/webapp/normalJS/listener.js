document.querySelector('input[type="button"]').addEventListener('click', function() {
  var el = document.createElement('li');
  var id = new Date().getTime().toString();
  el.id = id;
  el.innerHTML = id;
  document.querySelector('.ct').appendChild(el);
});

document.querySelector('body').addEventListener('click', function(event) {
  if (event.target.tagName.toLowerCase() === 'li') {
    alert(event.target.id);
  }
});
  