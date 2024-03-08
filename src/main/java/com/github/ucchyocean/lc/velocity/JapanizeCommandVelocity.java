/*
 * @author     Emorard
 * @license    LGPLv3
 * @copyright  Copyright Emorard 2020
 */
package com.github.ucchyocean.lc.velocity;

import com.github.ucchyocean.lc.command.LunaChatJapanizeCommand;
import com.github.ucchyocean.lc.member.ChannelMember;
import com.velocitypowered.api.command.SimpleCommand;

public class JapanizeCommandVelocity implements SimpleCommand {

    private LunaChatJapanizeCommand command;

    public JapanizeCommandVelocity() {
        command = new LunaChatJapanizeCommand();
    }

    @Override
    public void execute(Invocation invocation) {
        command.execute(ChannelMember.getChannelMember(invocation.source()), "jp", invocation.arguments());
    }
}
