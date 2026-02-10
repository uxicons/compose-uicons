package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HeartSlash: ImageVector? = null

val Icons.Ss.HeartSlash: ImageVector
    get() = _HeartSlash ?: UXIcon(name = "HeartSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 7.6f)
                curveToRelative(0f, -3.58f, -2.92f, -6.5f, -6.5f, -6.5f)
                curveToRelative(-2.29f, 0f, -4.34f, 1.35f, -5.5f, 3.34f)
                curveToRelative(-1.16f, -1.99f, -3.21f, -3.34f, -5.5f, -3.34f)
                curveToRelative(-1.11f, 0f, -2.19f, 0.3f, -3.15f, 0.83f)
                lineTo(1.46f, 0.04f)
                lineTo(0.04f, 1.46f)
                lineTo(22.54f, 23.96f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(-5.14f, -5.14f)
                curveToRelative(3.43f, -3.6f, 5.18f, -6.9f, 5.18f, -9.81f)
                close()
                moveTo(15.93f, 20.17f)
                curveToRelative(-1.39f, 1.2f, -2.6f, 2.12f, -3.34f, 2.65f)
                lineToRelative(-0.58f, 0.41f)
                lineToRelative(-0.58f, -0.41f)
                curveTo(9.51f, 21.45f, 0f, 14.32f, 0f, 7.6f)
                curveToRelative(0f, -0.96f, 0.22f, -1.89f, 0.62f, -2.74f)
                lineToRelative(15.31f, 15.31f)
                close()
            }
        }.also { _HeartSlash = it}
