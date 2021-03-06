package config.dagger.module;

import config.GUIConfig;
import dagger.Module;
import dagger.Provides;
import gui.BasicFrame;
import gui.MainTabbedPane;
import gui.StatusBar;
import gui.events.GlobalKeyBindings;

import javax.inject.Named;
import javax.inject.Singleton;
import javax.swing.*;

@Module
public class ModuleComponent {
    @Provides @Singleton @Named("mainJToolBar") public JToolBar getJToolBar() { return new JToolBar(); }
    @Provides @Singleton @Named("connectToDbButton") public JButton getConnectToDbButton() { return new JButton("Connect"); }
    @Provides @Singleton @Named("startStopButton") public JButton getStartStopButton() { return new JButton(); }
    @Provides @Singleton @Named("mainTabPane") public MainTabbedPane getMainTabbedPane(BasicFrame basicFrame) { return new MainTabbedPane(basicFrame); }
    @Provides @Singleton @Named("mainStatusBar") public StatusBar getStatusBar() { return new StatusBar(); }

    @Provides @Singleton public BasicFrame getBasicFrame(GUIConfig guiConfig, GlobalKeyBindings globalKeyBindings)
            { return new BasicFrame(guiConfig, globalKeyBindings); }


    /*@Provides @Singleton public XstreamSerializer getXstreamSer() { return new XstreamSerializer(); }*/

   /* @Provides @Named("TabsForProfileChartArea") public JTabbedPane getJTabbedPane() { return new JTabbedPane(); }

    @Provides @Named("startStopButton") public JButton getStartStopButton() { return new JButton(); }
    @Provides @Named("settingsButton") public JButton getSettingsButton() { return new JButton(); }
    @Provides @Named("profileNameJTextArea") public JTextArea getProfileNameJText() { return new JTextArea(); }*/

/*    @Provides @Singleton public GUIUtility guiUtility() { return new GUIUtility(); }

    @Provides @Singleton Labels getLabels() { return Labels.getInstance(); }*/

     /* Bug in Idea
         https://stackoverflow.com/questions/42200958/non-static-method-cannot-be-referenced-from-a-static-context-in-java-8-streams
          return profileList
             .stream()
              .collect(
                Collectors.toMap(Profile::getName,
                  new StartStopAction(basicFrame))
         );*/
}
