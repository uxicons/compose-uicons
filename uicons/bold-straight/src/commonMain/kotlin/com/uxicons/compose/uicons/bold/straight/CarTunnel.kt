package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CarTunnel: ImageVector? = null

val Icons.Bs.CarTunnel: ImageVector
    get() = _CarTunnel ?: UXIcon(name = "CarTunnel") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 12f)
                verticalLineToRelative(12f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-12f)
                curveToRelative(0f, -4.96f, -4.04f, -9f, -9f, -9f)
                reflectiveCurveTo(3f, 7.04f, 3f, 12f)
                verticalLineToRelative(12f)
                lineTo(0f, 24f)
                verticalLineToRelative(-12f)
                curveTo(0f, 5.38f, 5.38f, 0f, 12f, 0f)
                reflectiveCurveToRelative(12f, 5.38f, 12f, 12f)
                close()
                moveTo(18.56f, 16.22f)
                curveToRelative(0.29f, 0.93f, 0.44f, 1.89f, 0.44f, 2.85f)
                verticalLineToRelative(2.92f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2.92f)
                curveToRelative(0f, -0.97f, 0.15f, -1.93f, 0.44f, -2.85f)
                lineToRelative(1.19f, -3.77f)
                curveToRelative(0.46f, -1.47f, 1.8f, -2.45f, 3.34f, -2.45f)
                horizontalLineToRelative(4.07f)
                curveToRelative(1.53f, 0f, 2.88f, 0.98f, 3.34f, 2.45f)
                lineToRelative(1.19f, 3.77f)
                close()
                moveTo(15f, 17.5f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(8.65f, 16f)
                horizontalLineToRelative(6.69f)
                lineToRelative(-0.83f, -2.65f)
                curveToRelative(-0.07f, -0.21f, -0.26f, -0.35f, -0.48f, -0.35f)
                horizontalLineToRelative(-4.07f)
                curveToRelative(-0.22f, 0f, -0.41f, 0.14f, -0.48f, 0.35f)
                lineToRelative(-0.83f, 2.65f)
                close()
                moveTo(7.5f, 19f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                close()
            }
        }.also { _CarTunnel = it}
