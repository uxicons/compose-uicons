package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RemoteControlHand: ImageVector? = null

val Icons.Bs.RemoteControlHand: ImageVector
    get() = _RemoteControlHand ?: UXIcon(name = "RemoteControlHand") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11.25f, 14.15f)
                curveToRelative(-0.29f, 0.34f, -0.31f, 0.53f, -0.07f, 0.9f)
                lineToRelative(4.84f, 6.3f)
                lineToRelative(-0.02f, 2.66f)
                lineToRelative(-3f, -0.02f)
                lineToRelative(0.01f, -1.63f)
                lineToRelative(-1.05f, -1.36f)
                lineTo(0f, 21f)
                lineTo(0f, 8f)
                curveTo(0f, 3.59f, 3.59f, 0f, 8f, 0f)
                reflectiveCurveToRelative(8f, 3.59f, 8f, 8f)
                verticalLineToRelative(2.95f)
                lineToRelative(-0.59f, -0.53f)
                curveToRelative(-0.7f, -0.62f, -1.54f, -1.02f, -2.4f, -1.23f)
                verticalLineToRelative(-1.19f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                reflectiveCurveTo(3f, 5.24f, 3f, 8f)
                verticalLineToRelative(10f)
                horizontalLineToRelative(6.66f)
                lineToRelative(-0.81f, -1.06f)
                curveToRelative(-1.25f, -1.4f, -1.03f, -3.88f, 0.46f, -5.08f)
                curveToRelative(1.37f, -1.17f, 3.42f, -1.15f, 4.77f, 0.05f)
                lineToRelative(3.92f, 3.47f)
                lineToRelative(-1.99f, 2.25f)
                lineToRelative(-3.92f, -3.47f)
                curveToRelative(-0.24f, -0.21f, -0.6f, -0.21f, -0.84f, -0.01f)
                close()
                moveTo(5f, 8f)
                curveToRelative(0f, 1.66f, 1.34f, 3f, 3f, 3f)
                reflectiveCurveToRelative(3f, -1.34f, 3f, -3f)
                reflectiveCurveToRelative(-1.34f, -3f, -3f, -3f)
                reflectiveCurveToRelative(-3f, 1.34f, -3f, 3f)
                close()
                moveTo(17.98f, 6.87f)
                curveToRelative(0.01f, 0.15f, 0.02f, 0.3f, 0.02f, 0.45f)
                verticalLineToRelative(3.56f)
                lineToRelative(3f, 2.62f)
                verticalLineToRelative(10.5f)
                horizontalLineToRelative(3f)
                lineTo(24f, 12.14f)
                lineToRelative(-6.02f, -5.26f)
                close()
            }
        }.also { _RemoteControlHand = it}
