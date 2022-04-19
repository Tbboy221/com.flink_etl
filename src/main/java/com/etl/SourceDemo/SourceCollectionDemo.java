package com.etl.SourceDemo;

import com.etl.bean.SensorRead;
import org.apache.flink.streaming.api.datastream.DataStream;
import org.apache.flink.streaming.api.datastream.DataStreamSource;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;

import java.util.Arrays;
import java.util.Date;

public class SourceCollectionDemo {
    public static void main(String[] args) throws Exception{
        //获取执行环境
        StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();

        //读取source
        DataStream<SensorRead> dataStream = env.fromCollection(Arrays.asList(new SensorRead("sensor_1", "2022-04-06 00:00:00", 37.6),
                new SensorRead("sensor_2", "2022-04-01 00:00:00", 31.6),
                new SensorRead("sensor_3", "2022-04-02 00:00:00", 32.6),
                new SensorRead("sensor_4", "2022-04-03 00:00:00", 37.3),
                new SensorRead("sensor_5", "2022-04-04 00:00:00", 34.6)


        ));

        DataStream<Integer> eleStream = env.fromElements(111,23, 1, 2, 3);
        dataStream.print("dataStream").setParallelism(1);
        eleStream.print("eleStream").setParallelism(1);

        env.execute();

    }
}
