


var app=angular.module("sample",[]);
app.controller("formController",function($scope,$http)

{
	$scope.json=""
	$scope.show=true
	$scope.show_form=false
	
	//get options for entity names
	var response=$http.get("/getEntities")
	
	response.success(function(data){
		console.log(data);
		select=document.getElementById("entityName");
		data=data.split(",");
		data.pop()
		$scope.options=[]
		
		for(var i in data)
			{
				$scope.options.push({"label":data[i],"value":data[i]})
			}
		console.log($scope.options)
		$scope.selected=$scope.options[1]
	});
	
	$scope.getForm=function()
	{

		var response=$http.get("/getData/"+$scope.selected.label)
		response.success(function (data){
			//console.log(data)
			//console.log(JSON.parse(data))
			form=[]
			traverse(form,data.template,$scope.selected.label)
			console.log(form)
			$scope.json=form
			$scope.show_form=true
		
			
			
		} );
	}
});

function traverse(form,o,heading) {
	form.push({"type":"heading","value":heading,"fields":[]})
	//console.log(heading)
	//console.log(form)
	for (var i in o) {
		if(i!="_id"){
			//console.log(i)
			if(typeof(o[i])=="object")
			{
				//console.log(i)
				traverse(form,o[i],i)
			}
			else
			{
				form[form.length-1].fields.push({"name":i,"type":o[i]})
				//wconsole.log(form)
				
			}
		}
	}
}

