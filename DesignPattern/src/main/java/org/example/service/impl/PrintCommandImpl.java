package org.example.service.impl;

import org.example.service.Command;

/**
 * @author luyingjian
 * @date 2024/9/18
 */
public class PrintCommandImpl implements Command {
    @Override
    public String execute() {
        return "print";
    }
}
