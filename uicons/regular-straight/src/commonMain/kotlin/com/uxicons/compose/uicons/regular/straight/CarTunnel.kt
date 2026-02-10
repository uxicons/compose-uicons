package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CarTunnel: ImageVector? = null

val Icons.Rs.CarTunnel: ImageVector
    get() = _CarTunnel ?: UXIcon(name = "CarTunnel") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 12f)
                verticalLineToRelative(12f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-12f)
                curveToRelative(0f, -5.51f, -4.49f, -10f, -10f, -10f)
                reflectiveCurveTo(2f, 6.49f, 2f, 12f)
                verticalLineToRelative(12f)
                lineTo(0f, 24f)
                verticalLineToRelative(-12f)
                curveTo(0f, 5.38f, 5.38f, 0f, 12f, 0f)
                reflectiveCurveToRelative(12f, 5.38f, 12f, 12f)
                close()
                moveTo(20.04f, 22f)
                horizontalLineToRelative(-2.04f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-1.96f)
                lineToRelative(-0.13f, -3.23f)
                curveToRelative(0f, -1.3f, 0.21f, -2.55f, 0.64f, -3.74f)
                lineToRelative(1.44f, -4.04f)
                curveToRelative(0.42f, -1.19f, 1.56f, -1.99f, 2.83f, -1.99f)
                horizontalLineToRelative(6.18f)
                curveToRelative(1.26f, 0f, 2.4f, 0.8f, 2.83f, 1.99f)
                lineToRelative(1.44f, 4.04f)
                curveToRelative(0.42f, 1.19f, 0.64f, 2.44f, 0.64f, 3.7f)
                lineToRelative(0.13f, 3.27f)
                close()
                moveTo(7.88f, 11.66f)
                lineToRelative(-0.83f, 2.34f)
                horizontalLineToRelative(9.73f)
                lineToRelative(-0.83f, -2.34f)
                curveToRelative(-0.14f, -0.4f, -0.52f, -0.66f, -0.94f, -0.66f)
                horizontalLineToRelative(-6.18f)
                curveToRelative(-0.42f, 0f, -0.8f, 0.27f, -0.94f, 0.66f)
                close()
                moveTo(17.96f, 20f)
                lineToRelative(-0.05f, -1.23f)
                curveToRelative(0f, -0.97f, -0.15f, -1.89f, -0.43f, -2.77f)
                horizontalLineToRelative(-1.48f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-1.66f)
                curveToRelative(-0.28f, 0.88f, -0.43f, 1.8f, -0.43f, 2.73f)
                lineToRelative(0.05f, 1.27f)
                horizontalLineToRelative(12.0f)
                close()
            }
        }.also { _CarTunnel = it}
