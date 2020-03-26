package com.douzone.container.videosystem;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import config.videosystem.mixing.DVDPlayerConfig;


@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(classes = {DVDConfig.class, DVDPlayerConfig.class})
@ContextConfiguration(classes = DVDPlayerConfig.class)
public class DVDPlayerMixingConfigTest02 {
	
	@Autowired
	private DVDPlayer player;
	
	@Test
	public void testPlayerNotNull() {
		assertNotNull(player);
	}

}
