package com.app.captain.service;

import com.app.captain.mapper.GroupReplyMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class GroupReplyService {
    private final GroupReplyMapper groupReplyMapper;
}