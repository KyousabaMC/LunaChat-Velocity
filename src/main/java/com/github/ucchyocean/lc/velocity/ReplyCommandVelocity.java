/*
 * @author     Emorard
 * @license    LGPLv3
 * @copyright  Copyright Emorard 2020
 */
package com.github.ucchyocean.lc.velocity;

import com.github.ucchyocean.lc.command.LunaChatReplyCommand;
import com.github.ucchyocean.lc.member.ChannelMember;
import com.velocitypowered.api.command.SimpleCommand;

public class ReplyCommandVelocity implements SimpleCommand {

    private LunaChatReplyCommand command;

    public ReplyCommandVelocity() {
        command = new LunaChatReplyCommand();
    }

    @Override
    public void execute(Invocation invocation) {
        command.execute(ChannelMember.getChannelMember(invocation.source()), "r", invocation.arguments());
    }
}
