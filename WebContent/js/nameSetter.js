function nameSetter(){
	localStorage.setItem("name", document.getElementByName("name"));
	alert(localStorage.getItem('name'));
	return false;
}