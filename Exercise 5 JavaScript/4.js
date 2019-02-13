var obj = {a: 1, b: 2};
console.log('obj', obj);

var deepCopy = JSON.parse(JSON.stringify(obj));
console.log('deepCopy', deepCopy);

var shallowCopy = obj;
console.log('shallowCopy', shallowCopy);

obj.a = 3;
console.log('Value changed');
console.log('obj', obj);
console.log('deepCopy', deepCopy);
console.log('shallowCopy', shallowCopy);