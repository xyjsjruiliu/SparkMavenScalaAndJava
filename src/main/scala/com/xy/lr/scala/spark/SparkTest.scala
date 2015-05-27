package com.xy.lr.scala.spark

import com.xy.lr.java.spark.SparkTestJava
import org.apache.spark.{SparkContext, SparkConf}

/**
 * Created by xylr on 15-5-26.
 */
object SparkTest {
  def main(args : Array[String]): Unit ={
    val conf = new SparkConf().setAppName("first maven spark")
    val sc = new SparkContext(conf)

    val sparkTestJava = new SparkTestJava()
    println("------------------------------------------------")
    println(sparkTestJava.getString)
    println("------------------------------------------------")
    val rdd = sc.textFile(args(0))

    rdd.saveAsTextFile(args(1))
  }
}
