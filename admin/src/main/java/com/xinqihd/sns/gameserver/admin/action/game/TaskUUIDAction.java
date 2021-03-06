package com.xinqihd.sns.gameserver.admin.action.game;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.SwingUtilities;

import com.xinqihd.sns.gameserver.admin.gui.MainPanel;
import com.xinqihd.sns.gameserver.admin.gui.TaskTipPanel;
import com.xinqihd.sns.gameserver.admin.gui.TaskUUIDPanel;
import com.xinqihd.sns.gameserver.admin.security.PriviledgeKey;
import com.xinqihd.sns.gameserver.admin.util.ImageUtil;

public class TaskUUIDAction extends AbstractAction {
	
	public TaskUUIDAction() {
		super("手机屏蔽设定", ImageUtil.createImageSmallIcon("Pen.png", "手机屏蔽设定"));
	}
	
	public PriviledgeKey getPriviledge() {
		return PriviledgeKey.task_game_tips;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		SwingUtilities.invokeLater(new Runnable(){
			public void run() {
				MainPanel.getInstance().setCenterPanel(TaskUUIDPanel.getInstance());
			}
		});
	}

}
