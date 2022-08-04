import org.junit.jupiter.api.Test

internal class MyTest {
    @Test
    fun myTest(){
        kotlin.test.assertEquals(2,1+1) //単独要素の比較
        kotlin.test.assertContentEquals(arrayOf(1, 2, 3), arrayOf(1, 2, 3)) //配列の比較
        //kotlin.test.assertContentEquals(arrayOf(1, 2, 3), arrayOf(3, 2, 1)) //配列の比較
        //↑これは失敗する。集合として同じでも、順番も等しくないとダメみたい
    }
}