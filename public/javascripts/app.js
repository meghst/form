var app=angular.module("sample",[]);
app.controller("formController",function($scope,$http)

{
	$scope.json=""
	$scope.show=true
	$scope.show_form=false

	$scope.getForm=function()
	{
		type_mapping={
						"String":"text",
					}
		

		var response=$http.get("/getData")
		response.success(function (data){
			//console.log(data)
			//console.log(JSON.parse(data))
			form=[]
			traverse(form,data,"Serviceablity")
			console.log(form)
			$scope.json=form
			$scope.show_form=true
			$scope.l=[1,2,3]
			
			
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
				form[form.length-1].fields.push({"name":i,"type":type_mapping[o[i]]})
				//wconsole.log(form)
				
			}
		}
	}
}

