package com.etl.SourceDemo;

import org.apache.flink.streaming.api.datastream.DataStream;
import org.apache.flink.streaming.api.datastream.DataStreamSource;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;

public class SourceFileDemo {
    public static void main(String[] args) throws Exception{
        StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();

        env.setParallelism(1);
        String path = "D:\\Code\\flink_tour\\src\\main\\resources\\sensor.txt";
        DataStream<String> dataFile = env.readTextFile(path);

        dataFile.print("datafile");
        env.execute();
    }
}
