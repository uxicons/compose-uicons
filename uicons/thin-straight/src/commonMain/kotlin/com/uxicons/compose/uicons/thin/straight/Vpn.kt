package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Vpn: ImageVector? = null

val Icons.Ts.Vpn: ImageVector
    get() = _Vpn ?: UXIcon(name = "Vpn") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 3f)
                curveTo(6.02f, 3f, 0f, 4.08f, 0f, 4.08f)
                verticalLineToRelative(15.83f)
                reflectiveCurveToRelative(6.02f, 1.08f, 12f, 1.08f)
                reflectiveCurveToRelative(12f, -1.08f, 12f, -1.08f)
                lineTo(24f, 4.08f)
                reflectiveCurveToRelative(-6.02f, -1.08f, -12f, -1.08f)
                close()
                moveTo(23f, 19.08f)
                curveToRelative(-1.38f, 0.23f, -6.04f, 0.92f, -11f, 0.92f)
                reflectiveCurveToRelative(-9.62f, -0.7f, -11f, -0.92f)
                lineTo(1f, 4.92f)
                curveToRelative(1.38f, -0.23f, 6.04f, -0.92f, 11f, -0.92f)
                reflectiveCurveToRelative(9.62f, 0.7f, 11f, 0.92f)
                verticalLineToRelative(14.15f)
                close()
                moveTo(7.9f, 8f)
                horizontalLineToRelative(1.04f)
                lineToRelative(-1.31f, 6.42f)
                curveToRelative(-0.13f, 0.65f, -0.69f, 1.57f, -1.63f, 1.57f)
                reflectiveCurveToRelative(-1.51f, -0.97f, -1.62f, -1.53f)
                lineToRelative(-1.38f, -6.47f)
                horizontalLineToRelative(1.03f)
                lineToRelative(1.33f, 6.26f)
                curveToRelative(0.04f, 0.23f, 0.32f, 0.74f, 0.64f, 0.74f)
                curveToRelative(0.33f, 0f, 0.59f, -0.49f, 0.65f, -0.77f)
                lineToRelative(1.25f, -6.24f)
                close()
                moveTo(10f, 16f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(1.5f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.12f, -2.5f, -2.5f, -2.5f)
                horizontalLineToRelative(-2.5f)
                verticalLineToRelative(8f)
                close()
                moveTo(11f, 9f)
                horizontalLineToRelative(1.5f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(-3f)
                close()
                moveTo(17f, 16f)
                horizontalLineToRelative(-1f)
                lineTo(16f, 8f)
                horizontalLineToRelative(0.79f)
                lineToRelative(3.21f, 5.67f)
                verticalLineToRelative(-5.67f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(-0.79f)
                lineToRelative(-3.21f, -5.63f)
                verticalLineToRelative(5.63f)
                close()
            }
        }.also { _Vpn = it}
