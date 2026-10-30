//package com.mtms.main;
//
//import com.mtms.domain.ReplaySpeed;
//import com.mtms.domain.Track;
//import com.mtms.service.*;
//import com.mtms.simulator.TrackSimulator;
//
//import java.time.LocalDateTime;
//import java.util.List;
//
//
//public class MTMSApplication {
//    public static void main(String[] args) {
//
//        //APPLICATION STARTS HERE
//        System.out.println("===============================");
//        System.out.println("MTMS APPLICATION STARTS HERE");
//        System.out.println("===============================");
//
//        // Simulating tracks
//        TrackSimulator simulator = new TrackSimulator();
//        List<Track> listOfTracks = simulator.generateTracks();
//
//        // Processing tracks and saving to database
//        System.out.println("\nProcessing Tracks: ");
//        for(Track track : listOfTracks)
//            TrackService.processTrack(track);
//
//        System.out.println("\n--------------------------------\n");  //formatting
//
//        // Displaying tracks with delay
//        System.out.println("Displaying Tracks (DOUBLE speed): ");
//        ReplayService.replayTracks(ReplaySpeed.DOUBLE);
//
//        // Displaying tracks with delay and time frame
//        System.out.println("\nDisplaying Tracks (HALF speed) with a time frame: ");
//        ReplayService.replayTracks(ReplaySpeed.HALF,
//                LocalDateTime.of(2026, 10, 28, 7, 41, 25, 123_000_000),
//                LocalDateTime.of(2026, 10, 28, 7, 55, 25, 123_000_000));
//
//        System.out.println("\n--------------------------------\n");  //formatting
//
//        // Generate track reports
//        System.out.println("Displaying Track Analytics: ");
//        TrackAnalyticsService.showReportStat();
//
//        System.out.println("\n--------------------------------");  //formatting
//
//        // Displaying all alerts
//        AlertService.getAllAlerts();
//
//        System.out.println("\n--------------------------------\n");  //formatting
//
//        // Display severity summary
//        System.out.println("Displaying severity summary of the alerts: ");
//        AlertAnalyticsService analyticsService = new AlertAnalyticsService();
//        analyticsService.displaySeveritySummary();
//
//
//        //APPLICATION ENDS HERE
//        System.out.println("\n===============================");
//        System.out.println("MTMS APPLICATION ENDS HERE ");
//        System.out.println("===============================");
//
//    }
//}