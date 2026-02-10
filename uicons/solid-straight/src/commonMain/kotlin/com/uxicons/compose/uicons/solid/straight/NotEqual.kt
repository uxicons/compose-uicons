package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _NotEqual: ImageVector? = null

val Icons.Ss.NotEqual: ImageVector
    get() = _NotEqual ?: UXIcon(name = "NotEqual") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 9f)
                lineToRelative(0f, -2f)
                lineToRelative(-8.63f, 0f)
                lineToRelative(2.79f, -6.14f)
                lineToRelative(-1.82f, -0.83f)
                lineToRelative(-3.17f, 6.96f)
                lineToRelative(-13.17f, 0f)
                lineToRelative(0f, 2f)
                lineToRelative(12.27f, 0f)
                lineToRelative(-2.73f, 6f)
                lineToRelative(-9.54f, 0f)
                lineToRelative(0f, 2f)
                lineToRelative(8.63f, 0f)
                lineToRelative(-2.79f, 6.14f)
                lineToRelative(1.82f, 0.83f)
                lineToRelative(3.17f, -6.96f)
                lineToRelative(13.17f, 0f)
                lineToRelative(0f, -2f)
                lineToRelative(-12.27f, 0f)
                lineToRelative(2.73f, -6f)
                lineToRelative(9.54f, 0f)
                close()
            }
        }.also { _NotEqual = it}
