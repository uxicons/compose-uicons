package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HeartUpsideDown: ImageVector? = null

val Icons.Ss.HeartUpsideDown: ImageVector
    get() = _HeartUpsideDown ?: UXIcon(name = "HeartUpsideDown") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.5f, 23f)
                curveToRelative(-2.31f, 0f, -4.35f, -1.32f, -5.5f, -3.3f)
                curveToRelative(-1.15f, 1.98f, -3.19f, 3.3f, -5.5f, 3.3f)
                curveToRelative(-3.58f, 0f, -6.5f, -3.16f, -6.5f, -7.05f)
                curveTo(0f, 9.18f, 10.96f, 1.35f, 11.42f, 1.02f)
                lineToRelative(0.58f, -0.41f)
                lineToRelative(0.58f, 0.41f)
                curveToRelative(0.47f, 0.33f, 11.42f, 8.16f, 11.42f, 14.93f)
                curveToRelative(0f, 3.89f, -2.92f, 7.05f, -6.5f, 7.05f)
                close()
            }
        }.also { _HeartUpsideDown = it}
