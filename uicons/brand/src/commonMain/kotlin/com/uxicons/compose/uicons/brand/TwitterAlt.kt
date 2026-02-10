package com.uxicons.compose.uicons.brand

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TwitterAlt: ImageVector? = null

val Icons.Brand.TwitterAlt: ImageVector
    get() = _TwitterAlt ?: UXIcon(name = "TwitterAlt") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(18.9f, 1.15f)
            horizontalLineToRelative(3.68f)
            lineToRelative(-8.04f, 9.19f)
            lineToRelative(9.46f, 12.51f)
            horizontalLineToRelative(-7.41f)
            lineToRelative(-5.8f, -7.58f)
            lineToRelative(-6.63f, 7.58f)
            lineTo(0.47f, 22.85f)
            lineToRelative(8.6f, -9.83f)
            lineTo(0f, 1.15f)
            horizontalLineToRelative(7.59f)
            lineToRelative(5.24f, 6.93f)
            lineToRelative(6.07f, -6.93f)
            close()
            moveTo(17.61f, 20.65f)
            horizontalLineToRelative(2.04f)
            lineTo(6.48f, 3.24f)
            horizontalLineToRelative(-2.19f)
            lineToRelative(13.31f, 17.41f)
            close()
        }
    }.also { _TwitterAlt = it }
