employees = [{
			name: 'ABC',
			age: 35,
			salary: 500,
			dob: '01.01.1980'
		},

		{	
			name: 'DEF',
			age: 20,
			salary: 10000,
			dob: '02.02.1995'

		},

		{
			name: 'GHI',
			age: 30,
			salary: 100,
			dob: '03.03.1985'
		},

		{
			name: 'JKL',
			age: 25,
			salary: 6000,
			dob: '04.04.1990'
		}]

console.log(employees);

salGreaterThan5000();

groupByAge();

filterBySalAndAge();


function salGreaterThan5000(){
	
	newArr = []
	for(var i = 0; i < employees.length; i++){
		if(employees[i].salary > 5000){
			newArr.push(employees[i]);
		}
	}	

	console.log(newArr);
}

function groupByAge() {

	groups = {}
	interval_range = 10;

	for(var i = 0; i < employees.length; i++){
		max_range = Math.floor(employees[i].age / interval_range) * interval_range;
		range = max_range.toString() + '-' + (max_range + interval_range - 1).toString();
		if(range in groups){
			groups[range].push(employees[i]);
		}

		else{
			groups[range] = [employees[i]];
		}

	}

	console.log(groups);
}

function filterBySalAndAge(){

	newArr = []
	for(var i = 0; i < employees.length; i++){
		if(employees[i].salary < 1000 && employees[i].age > 20){
			employees[i].salary *= 5;
			newArr.push(employees[i])
		}
	}

	console.log(newArr);
} 