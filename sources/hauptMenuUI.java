/****************************************************************************
 *   Copyright (C) 2004 by Dominic Hopf										*
 *																			*
 *   This program is free software; you can redistribute it and/or modify	*
 *   it under the terms of the GNU General Public License as published by	*
 *   the Free Software Foundation; either version 2 of the License, or		*
 *   (at your option) any later version.									*
 *																			*
 *   This program is distributed in the hope that it will be useful,		*
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of			*
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the			*
 *   GNU General Public License for more details.							*
 *																			*
 *   You should have received a copy of the GNU General Public License		*
 *   along with this program; if not, write to the							*
 *   Free Software Foundation, Inc.,										*
 *   59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.				*
 ***************************************************************************/

// in dieser Klasse brauchen wir nur Swing, da sie
// von der hauptFensterUI aus weiterverwendet wird
import javax.swing.*;


class hauptMenuUI {
	// alle Bestandteile des Menüs als Klassenatrribute deklarieren
	private JMenuBar mainMenuBar = new JMenuBar();
		private JMenu dateiMenu = new JMenu("Datei");
			private JMenuItem importiereTabelleMenuItem = new JMenuItem("Tabelle importieren");
			private JMenuItem exportiereTabelleMenuItem = new JMenuItem("Tabelle exportieren");
			private JMenuItem exportiereGrafikMenuItem = new JMenuItem("Grafik exportieren");
			private JMenuItem druckenMenuItem = new JMenuItem("Drucken");
			private JMenuItem beendenMenuItem = new JMenuItem("Programm beenden");
		private JMenu bearbeitenMenu = new JMenu("Bearbeiten");
		private JMenu tabelleMenu = new JMenu("Tabelle");
		private JMenu ansichtMenu = new JMenu("Ansicht");
			private JMenuItem zeigeGitterMenuItem = new JMenuItem("Gitter anzeigen");
		private JMenu hilfeMenu = new JMenu("Hilfe");
			private JMenuItem kurzAnleitungMenuItem = new JMenuItem("Kurzanleitung");
			private JMenuItem dokuMenuItem = new JMenuItem("Dokumentation");
			private JMenuItem aboutMenuItem = new JMenuItem("Über");

	// konstruktor
	public hauptMenuUI(){
		this.pack();
	} // hauptMenuUI

	public void pack(){
		/**
			Die Methode setzt das HauptMenue aus den Klassenattributen zusammen.
		*/
		// die elemente des menues werden "rückwärts" zusammengesetzt
		// d.h. erst setze ich das dateimenü zusammen, bevor ich es zur MenuBar adde usw.

		// beginn dateiMenu
			this.dateiMenu.add(importiereTabelleMenuItem);
			this.dateiMenu.add(exportiereTabelleMenuItem);
			this.dateiMenu.add(exportiereGrafikMenuItem);
			this.dateiMenu.add(druckenMenuItem);
				this.druckenMenuItem.setEnabled(false);
			this.dateiMenu.add(beendenMenuItem);
				this.beendenMenuItem.addActionListener(new beendenListener());
		this.mainMenuBar.add(dateiMenu);
		// ende dateiMenu

		// beginn bearbeitenMenu
		this.mainMenuBar.add(bearbeitenMenu);
		// ende bearbeitenMenu

		// beginn tabelleMenu
		this.mainMenuBar.add(tabelleMenu);
		// ende tabelleMenu

		// beginn ansichtMenu
			this.ansichtMenu.add(zeigeGitterMenuItem);
		this.mainMenuBar.add(ansichtMenu);
		// ende ansichtMenu

		// beginn hilfeMenu
			this.hilfeMenu.add(kurzAnleitungMenuItem);
			this.hilfeMenu.add(dokuMenuItem);
			this.hilfeMenu.add(aboutMenuItem);
		this.mainMenuBar.add(hilfeMenu);
		// ende hilfeMenu
	} // pack()


	public JMenuBar getHauptMenu(){
		// wird von der hauptFensterUI aufgerufen und
		// liefert das hauptmenu zurück
		return this.mainMenuBar;
	}
} // hauptMenuUI