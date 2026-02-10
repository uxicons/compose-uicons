package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Burst: ImageVector? = null

val Icons.Ss.Burst: ImageVector
    get() = _Burst ?: UXIcon(name = "Burst") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.54f, 23.96f)
                lineToRelative(-2.96f, -5.53f)
                lineToRelative(-5.8f, 1.99f)
                lineToRelative(2.14f, -5.83f)
                lineTo(0.16f, 12.05f)
                lineToRelative(5.64f, -2.78f)
                lineTo(-0.01f, 0.15f)
                lineTo(9.61f, 5.32f)
                lineTo(12.42f, 0.03f)
                lineToRelative(2.91f, 5.45f)
                lineToRelative(7.07f, -3.0f)
                lineToRelative(-3.42f, 6.76f)
                lineToRelative(4.94f, 2.64f)
                lineToRelative(-4.82f, 2.58f)
                lineToRelative(4.58f, 8.66f)
                lineToRelative(-8.39f, -4.55f)
                lineToRelative(-2.76f, 5.39f)
                close()
            }
        }.also { _Burst = it}
