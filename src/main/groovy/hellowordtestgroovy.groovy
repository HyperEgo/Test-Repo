class TestClass {
    String someString
    String getString(){
        return someString
    }
    void setString (def something) {
        someString=something
    }
}
TestClass instance = new TestClass()
instance.setString('boogie man')
println instance.getString()


class TestClass2 {
    def eatIt
}

TestClass2 insta = new TestClass2()
insta.eatIt='watermelon'
println insta.eatIt


class MathTest {
    def square = { num ->
        return num*num
    }
}

MathTest math = new MathTest()
println math.square(51)


class MathTest2 {
    def cube = {
        it*it*it
    }
}

MathTest2 ma2 = new MathTest2()
println ma2.cube(67)

println 'hi there'
