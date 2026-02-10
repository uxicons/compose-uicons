package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CupStrawSwoosh: ImageVector? = null

val Icons.Ss.CupStrawSwoosh: ImageVector
    get() = _CupStrawSwoosh ?: UXIcon(name = "CupStrawSwoosh") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.5f, 14.86f)
                lineToRelative(-0.77f, 6.49f)
                curveToRelative(-0.18f, 1.51f, -1.46f, 2.65f, -2.98f, 2.65f)
                lineTo(7.32f, 24.0f)
                curveToRelative(-1.52f, 0f, -2.8f, -1.14f, -2.98f, -2.65f)
                lineToRelative(-0.63f, -5.37f)
                curveToRelative(1.23f, -0.82f, 3.39f, -1.98f, 4.79f, -1.98f)
                curveToRelative(0.81f, 0f, 1.99f, 0.47f, 3.13f, 0.93f)
                curveToRelative(1.32f, 0.53f, 2.68f, 1.07f, 3.87f, 1.07f)
                curveToRelative(1.87f, 0f, 3.64f, -0.55f, 5.0f, -1.14f)
                close()
                moveTo(14.54f, 5f)
                lineToRelative(0.38f, -3f)
                horizontalLineToRelative(5.12f)
                lineTo(20.04f, 0f)
                horizontalLineToRelative(-6.88f)
                lineToRelative(-0.63f, 5f)
                lineTo(1.04f, 5f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(1.61f)
                lineToRelative(0.8f, 6.79f)
                curveToRelative(1.4f, -0.84f, 3.37f, -1.79f, 5.05f, -1.79f)
                curveToRelative(1.19f, 0f, 2.55f, 0.55f, 3.87f, 1.07f)
                curveToRelative(1.14f, 0.46f, 2.32f, 0.93f, 3.13f, 0.93f)
                curveToRelative(2.1f, 0f, 4.17f, -0.89f, 5.27f, -1.46f)
                lineToRelative(0.65f, -5.54f)
                horizontalLineToRelative(1.61f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-8.49f)
                close()
            }
        }.also { _CupStrawSwoosh = it}
