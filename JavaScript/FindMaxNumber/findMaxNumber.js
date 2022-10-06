
const findMaxNumber = (arr) => {

    const max = Math.max(...arr);

    const indexes = [];

    for (let index = 0; index < arr.length; index++) {
        if (arr[index] === max) {
            indexes.push(index);
        }
    }

    return indexes;
}