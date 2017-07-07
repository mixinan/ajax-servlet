//获得ajax对象
	function getXhr(){
		var xhr = null;
		if (window.XMLHttpRequest) {
			//非IE
			xhr = new XMLHttpRequest();
		}else{
			xhr = new ActiveXObject("Microsoft.XMLHttp");
		}
		return xhr;
	}
	
//依据id查找节点
	function $(id){
		return document.getElementById(id);
	}
	
//依据id查找节点，然后返回节点的value
	function $F(id){
		return $(id).value;
	}
