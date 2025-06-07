class Solution {
    fun fizzBuzz(n: Int): List<String> {
        val list: MutableList<String> = mutableListOf()
        for (i in 1..n) {
            var str: String = "";
            if (i % 3 == 0)
                str += "Fizz"
            if (i % 5 == 0)
                str += "Buzz"
            list.add(str.ifEmpty { i.toString() })
        }
        return list
    }
}
