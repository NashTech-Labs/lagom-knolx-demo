/*
package com.knoldus.hello.impl;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static org.quartz.DateBuilder.futureDate;

@Singleton
public class SchedulerMain {

    @Inject
    public void setScheduler() throws SchedulerException,ParseException {

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
        String strdate2 = "04-06-2017 14:48:00";
        Date newdate = dateFormat.parse(strdate2);


        JobDetail job = JobBuilder.newJob(ScheduledJob.class)
                .withIdentity("dummyJobName", "group1").build();

        Trigger trigger = TriggerBuilder
                .newTrigger()
                .withIdentity("dummyTriggerName" +
                        "", "group1")
                .*/
/*startAt(futureDate(500, DateBuilder
                        .IntervalUnit.SECOND))*//*

       startAt(newdate)
                .withSchedule(
                        SimpleScheduleBuilder.simpleSchedule()
                                .withIntervalInSeconds(5).repeatForever())
                .build();

        Scheduler scheduler = new StdSchedulerFactory().getScheduler();
        scheduler.start();
        scheduler.scheduleJob(job, trigger);
    }
}
*/
