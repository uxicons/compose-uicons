package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Explosion: ImageVector? = null

val Icons.Ss.Explosion: ImageVector
    get() = _Explosion ?: UXIcon(name = "Explosion") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 15f)
                lineToRelative(-4.97f, 0f)
                lineToRelative(4.91f, -15.07f)
                lineToRelative(-10.09f, 9.24f)
                lineToRelative(-5.85f, -8.38f)
                lineToRelative(0f, 10.13f)
                lineToRelative(-8.09f, -2.7f)
                lineToRelative(4.81f, 7.79f)
                lineToRelative(-4.53f, 0f)
                lineToRelative(5.03f, 6f)
                lineToRelative(-5.23f, 0f)
                lineToRelative(0f, 2f)
                lineToRelative(11.61f, 0f)
                lineToRelative(-3.11f, -4f)
                lineToRelative(1.5f, 0f)
                lineToRelative(0f, -4f)
                lineToRelative(1.84f, 1.84f)
                lineToRelative(2.16f, -2.84f)
                lineToRelative(-0.04f, 4f)
                lineToRelative(2.54f, 0f)
                lineToRelative(-3.5f, 5f)
                lineToRelative(11f, 0f)
                lineToRelative(0f, -2f)
                lineToRelative(-4.82f, 0f)
                lineToRelative(4.82f, -7f)
                close()
            }
        }.also { _Explosion = it}
