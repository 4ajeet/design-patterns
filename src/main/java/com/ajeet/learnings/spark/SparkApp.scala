package com.ajeet.learnings.spark

import org.apache.spark.sql.{Column, SparkSession}
import org.apache.spark.sql.expressions.Window
import org.apache.spark.sql.functions._

object SparkApp extends App {

  val sparkSession = SparkSession.builder()
    .appName("Learning Spark")
    .master("local")
    .config("spark.sql.shuffle.partitions", "5")
    .getOrCreate()

  import sparkSession.implicits._

  case class Flight(ORIGIN_COUNTRY_NAME:String, DEST_COUNTRY_NAME:String, count:BigInt)

  /*
  sparkSession.read
    .parquet("G:\\Study\\Spark-The-Definitive-Guide-master\\data\\flight-data\\parquet\\2010-summary.parquet\\")
    .as[Flight]
    .groupBy($"ORIGIN_COUNTRY_NAME")
    .agg(sum("count").alias("flights"))
    .orderBy($"flights".desc)
    .show()
*/
//  sparkSession.sql("set spark.sql.caseSensitive=true")

/*
  val window = Window.orderBy($"Flights".desc).partitionBy($"ORIGIN_COUNTRY_NAME")

  val withinCountry = (source:String, destination:String) =>  if(source == destination) "Local" else "International"
  val withIncountryUDF = udf(withinCountry)

  val seed = 5
  val withReplacement = false
  val fraction = 0.5

  val filter = col("ORIGIN_COUNTRY_NAME").eqNullSafe(col("DEST_COUNTRY_NAME"))

  sparkSession.read
    .parquet("G:\\Study\\Spark-The-Definitive-Guide-master\\data\\flight-data\\parquet\\2010-summary.parquet\\")
 //   .groupBy($"ORIGIN_COUNTRY_NAME")
//    .agg(sum("count").alias("Flights"))
   .where(filter)
    .withColumn("Type", withIncountryUDF('ORIGIN_COUNTRY_NAME, 'DEST_COUNTRY_NAME))
 //   .withColumn("rank", rank().over(window))
  // .orderBy($"rank")
    .distinct()
    .sample(withReplacement, fraction, seed)
    .show()
*/

/*
  val df = sparkSession.read.format("csv")
    .option("header", "true")
    .option("inferSchema", "true")
    .load("G:\\Study\\Spark-The-Definitive-Guide-master\\data\\retail-data\\by-day\\2010-12-01.csv")
  df.printSchema()
  df.createOrReplaceTempView("dfTable")

  val simpleColors = Seq("black", "white", "red", "green", "blue")
  val selectedColumns = simpleColors.map(color => {
    col("Description").contains(color.toUpperCase).alias(s"is_$color")})//:+expr("*") // could also append this value

  df.na
  println(selectedColumns)
*/
  sparkSession.range(100).toDF("number").show()
   sparkSession.close()
}
