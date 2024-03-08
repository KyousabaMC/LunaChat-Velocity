/*
 * @author     Emorard
 * @license    LGPLv3
 * @copyright  Copyright Emorard 2020
 */
package com.github.ucchyocean.lc.velocity;

import com.github.ucchyocean.lc.command.LunaChatCommand;
import com.github.ucchyocean.lc.member.ChannelMember;
import com.velocitypowered.api.command.SimpleCommand;

import java.util.List;

public class LunaChatCommandVelocity implements SimpleCommand {

    private LunaChatCommand command;

    public LunaChatCommandVelocity() {
        command = new LunaChatCommand();
    }

    @Override
    public void execute(Invocation invocation) {
        command.execute(ChannelMember.getChannelMember(invocation.source()), "ch", invocation.arguments());
    }

    @Override
    public List<String> suggest(Invocation invocation) {
        return command.onTabComplete(ChannelMember.getChannelMember(invocation.source()), "ch", invocation.arguments());
    }
}
