package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RemoteControlHand: ImageVector? = null

val Icons.Ts.RemoteControlHand: ImageVector
    get() = _RemoteControlHand ?: UXIcon(name = "RemoteControlHand") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4f, 7.5f)
                curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                reflectiveCurveToRelative(3.5f, -1.57f, 3.5f, -3.5f)
                reflectiveCurveToRelative(-1.57f, -3.5f, -3.5f, -3.5f)
                reflectiveCurveToRelative(-3.5f, 1.57f, -3.5f, 3.5f)
                close()
                moveTo(10f, 7.5f)
                curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                reflectiveCurveToRelative(1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                close()
                moveTo(13.39f, 11.66f)
                lineToRelative(4.44f, 4.0f)
                lineToRelative(-0.67f, 0.74f)
                lineToRelative(-4.44f, -4f)
                curveToRelative(-0.6f, -0.54f, -1.53f, -0.54f, -2.15f, -0.02f)
                curveToRelative(-0.69f, 0.56f, -0.77f, 1.65f, -0.19f, 2.31f)
                lineToRelative(4.61f, 6.64f)
                verticalLineToRelative(2.66f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-2.34f)
                lineToRelative(-1.15f, -1.66f)
                lineTo(0f, 20.0f)
                lineTo(0f, 7.5f)
                curveTo(0f, 3.36f, 3.36f, 0f, 7.5f, 0f)
                reflectiveCurveToRelative(7.5f, 3.36f, 7.5f, 7.5f)
                verticalLineToRelative(2.92f)
                curveToRelative(-0.3f, -0.28f, -0.65f, -0.57f, -1f, -0.77f)
                verticalLineToRelative(-2.15f)
                curveToRelative(0f, -3.58f, -2.92f, -6.5f, -6.5f, -6.5f)
                reflectiveCurveTo(1f, 3.92f, 1f, 7.5f)
                verticalLineToRelative(11.5f)
                lineTo(12.16f, 19f)
                lineToRelative(-2.56f, -3.69f)
                curveToRelative(-0.91f, -1.02f, -0.76f, -2.82f, 0.33f, -3.69f)
                curveToRelative(1.0f, -0.84f, 2.48f, -0.83f, 3.46f, 0.04f)
                close()
                moveTo(24f, 12.78f)
                verticalLineToRelative(11.22f)
                horizontalLineToRelative(-1f)
                lineTo(23f, 13.22f)
                lineToRelative(-6f, -5.57f)
                verticalLineToRelative(-1.36f)
                lineToRelative(7f, 6.5f)
                close()
            }
        }.also { _RemoteControlHand = it}
