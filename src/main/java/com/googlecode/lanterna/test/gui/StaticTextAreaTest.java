/*
 * This file is part of lanterna (http://code.google.com/p/lanterna/).
 * 
 * lanterna is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 * 
 * Copyright (C) 2010-2012 Martin
 */
package com.googlecode.lanterna.test.gui;

import com.googlecode.lanterna.gui.Action;
import com.googlecode.lanterna.gui.Border;
import com.googlecode.lanterna.gui.GUIScreen;
import com.googlecode.lanterna.gui.Window;
import com.googlecode.lanterna.gui.component.Button;
import com.googlecode.lanterna.gui.component.EmptySpace;
import com.googlecode.lanterna.gui.component.Panel;
import com.googlecode.lanterna.gui.component.TextArea;
import com.googlecode.lanterna.gui.layout.LinearLayout;
import com.googlecode.lanterna.test.TestTerminalFactory;

/**
 *
 * @author Martin
 */
public class StaticTextAreaTest {

    public static void main(String[] args) {
        final GUIScreen guiScreen = new TestTerminalFactory(args).createGUIScreen();
        guiScreen.getScreen().startScreen();
        final Window window1 = new Window("Text window");
        //window1.addComponent(new Widget(1, 1));

        TextArea staticTextArea = new TextArea(//new TerminalSize(40, 20),
                "                   GNU LESSER GENERAL PUBLIC LICENSE\n"
                + "                       Version 3, 29 June 2007\n"
                + "\n"
                + " Copyright (C) 2007 Free Software Foundation, Inc. <http://fsf.org/>\n"
                + " Everyone is permitted to copy and distribute verbatim copies\n"
                + " of this license document, but changing it is not allowed.\n"
                + "\n"
                + "\n"
                + "  This version of the GNU Lesser General Public License incorporates\n"
                + "the terms and conditions of version 3 of the GNU General Public\n"
                + "License, supplemented by the additional permissions listed below.\n"
                + "\n"
                + "  0. Additional Definitions.\n"
                + "\n"
                + "  As used herein, \"this License\" refers to version 3 of the GNU Lesser\n"
                + "General Public License, and the \"GNU GPL\" refers to version 3 of the GNU\n"
                + "General Public License.\n"
                + "\n"
                + "  \"The Library\" refers to a covered work governed by this License,\n"
                + "other than an Application or a Combined Work as defined below.\n"
                + "\n"
                + "  An \"Application\" is any work that makes use of an interface provided\n"
                + "by the Library, but which is not otherwise based on the Library.\n"
                + "Defining a subclass of a class defined by the Library is deemed a mode\n"
                + "of using an interface provided by the Library.\n"
                + "\n"
                + "  A \"Combined Work\" is a work produced by combining or linking an\n"
                + "Application with the Library.  The particular version of the Library\n"
                + "with which the Combined Work was made is also called the \"Linked\n"
                + "Version\".\n"
                + "\n"
                + "  The \"Minimal Corresponding Source\" for a Combined Work means the\n"
                + "Corresponding Source for the Combined Work, excluding any source code\n"
                + "for portions of the Combined Work that, considered in isolation, are\n"
                + "based on the Application, and not on the Linked Version.\n"
                + "\n"
                + "  The \"Corresponding Application Code\" for a Combined Work means the\n"
                + "object code and/or source code for the Application, including any data\n"
                + "and utility programs needed for reproducing the Combined Work from the\n"
                + "Application, but excluding the System Libraries of the Combined Work.\n"
                + "\n"
                + "  1. Exception to Section 3 of the GNU GPL.\n"
                + "\n"
                + "  You may convey a covered work under sections 3 and 4 of this License\n"
                + "without being bound by section 3 of the GNU GPL.\n"
                + "\n"
                + "  2. Conveying Modified Versions.\n"
                + "\n"
                + "  If you modify a copy of the Library, and, in your modifications, a\n"
                + "facility refers to a function or data to be supplied by an Application\n"
                + "that uses the facility (other than as an argument passed when the\n"
                + "facility is invoked), then you may convey a copy of the modified\n"
                + "version:\n"
                + "\n"
                + "   a) under this License, provided that you make a good faith effort to\n"
                + "   ensure that, in the event an Application does not supply the\n"
                + "   function or data, the facility still operates, and performs\n"
                + "   whatever part of its purpose remains meaningful, or\n"
                + "\n"
                + "   b) under the GNU GPL, with none of the additional permissions of\n"
                + "   this License applicable to that copy.\n"
                + "\n"
                + "  3. Object Code Incorporating Material from Library Header Files.\n"
                + "\n"
                + "  The object code form of an Application may incorporate material from\n"
                + "a header file that is part of the Library.  You may convey such object\n"
                + "code under terms of your choice, provided that, if the incorporated\n"
                + "material is not limited to numerical parameters, data structure\n"
                + "layouts and accessors, or small macros, inline functions and templates\n"
                + "(ten or fewer lines in length), you do both of the following:\n"
                + "\n"
                + "   a) Give prominent notice with each copy of the object code that the\n"
                + "   Library is used in it and that the Library and its use are\n"
                + "   covered by this License.\n"
                + "\n"
                + "   b) Accompany the object code with a copy of the GNU GPL and this license\n"
                + "   document.\n"
                + "\n"
                + "  4. Combined Works.\n"
                + "\n"
                + "  You may convey a Combined Work under terms of your choice that,\n"
                + "taken together, effectively do not restrict modification of the\n"
                + "portions of the Library contained in the Combined Work and reverse\n"
                + "engineering for debugging such modifications, if you also do each of\n"
                + "the following:\n"
                + "\n"
                + "   a) Give prominent notice with each copy of the Combined Work that\n"
                + "   the Library is used in it and that the Library and its use are\n"
                + "   covered by this License.\n"
                + "\n"
                + "   b) Accompany the Combined Work with a copy of the GNU GPL and this license\n"
                + "   document.\n"
                + "\n"
                + "   c) For a Combined Work that displays copyright notices during\n"
                + "   execution, include the copyright notice for the Library among\n"
                + "   these notices, as well as a reference directing the user to the\n"
                + "   copies of the GNU GPL and this license document.\n"
                + "\n"
                + "   d) Do one of the following:\n"
                + "\n"
                + "       0) Convey the Minimal Corresponding Source under the terms of this\n"
                + "       License, and the Corresponding Application Code in a form\n"
                + "       suitable for, and under terms that permit, the user to\n"
                + "       recombine or relink the Application with a modified version of\n"
                + "       the Linked Version to produce a modified Combined Work, in the\n"
                + "       manner specified by section 6 of the GNU GPL for conveying\n"
                + "       Corresponding Source.\n"
                + "\n"
                + "       1) Use a suitable shared library mechanism for linking with the\n"
                + "       Library.  A suitable mechanism is one that (a) uses at run time\n"
                + "       a copy of the Library already present on the user's computer\n"
                + "       system, and (b) will operate properly with a modified version\n"
                + "       of the Library that is interface-compatible with the Linked\n"
                + "       Version.\n"
                + "\n"
                + "   e) Provide Installation Information, but only if you would otherwise\n"
                + "   be required to provide such information under section 6 of the\n"
                + "   GNU GPL, and only to the extent that such information is\n"
                + "   necessary to install and execute a modified version of the\n"
                + "   Combined Work produced by recombining or relinking the\n"
                + "   Application with a modified version of the Linked Version. (If\n"
                + "   you use option 4d0, the Installation Information must accompany\n"
                + "   the Minimal Corresponding Source and Corresponding Application\n"
                + "   Code. If you use option 4d1, you must provide the Installation\n"
                + "   Information in the manner specified by section 6 of the GNU GPL\n"
                + "   for conveying Corresponding Source.)\n"
                + "\n"
                + "  5. Combined Libraries.\n"
                + "\n"
                + "  You may place library facilities that are a work based on the\n"
                + "Library side by side in a single library together with other library\n"
                + "facilities that are not Applications and are not covered by this\n"
                + "License, and convey such a combined library under terms of your\n"
                + "choice, if you do both of the following:\n"
                + "\n"
                + "   a) Accompany the combined library with a copy of the same work based\n"
                + "   on the Library, uncombined with any other library facilities,\n"
                + "   conveyed under the terms of this License.\n"
                + "\n"
                + "   b) Give prominent notice with the combined library that part of it\n"
                + "   is a work based on the Library, and explaining where to find the\n"
                + "   accompanying uncombined form of the same work.\n"
                + "\n"
                + "  6. Revised Versions of the GNU Lesser General Public License.\n"
                + "\n"
                + "  The Free Software Foundation may publish revised and/or new versions\n"
                + "of the GNU Lesser General Public License from time to time. Such new\n"
                + "versions will be similar in spirit to the present version, but may\n"
                + "differ in detail to address new problems or concerns.\n"
                + "\n"
                + "  Each version is given a distinguishing version number. If the\n"
                + "Library as you received it specifies that a certain numbered version\n"
                + "of the GNU Lesser General Public License \"or any later version\"\n"
                + "applies to it, you have the option of following the terms and\n"
                + "conditions either of that published version or of any later version\n"
                + "published by the Free Software Foundation. If the Library as you\n"
                + "received it does not specify a version number of the GNU Lesser\n"
                + "General Public License, you may choose any version of the GNU Lesser\n"
                + "General Public License ever published by the Free Software Foundation.\n"
                + "\n"
                + "  If the Library as you received it specifies that a proxy can decide\n"
                + "whether future versions of the GNU Lesser General Public License shall\n"
                + "apply, that proxy's public statement of acceptance of any version is\n"
                + "permanent authorization for you to choose that version for the\n"
                + "Library.");

        window1.addComponent(staticTextArea);

        Panel buttonPanel = new Panel(new Border.Invisible(), Panel.Orientation.HORISONTAL);
        Button exitButton = new Button("Exit", new Action() {

            public void doAction() {
                guiScreen.closeWindow();
            }
        });
        buttonPanel.addComponent(new EmptySpace(), LinearLayout.MAXIMIZES_HORIZONTALLY);
        buttonPanel.addComponent(exitButton);
        window1.addComponent(buttonPanel);
        guiScreen.showWindow(window1, GUIScreen.Position.CENTER);
        guiScreen.getScreen().stopScreen();
    }
}