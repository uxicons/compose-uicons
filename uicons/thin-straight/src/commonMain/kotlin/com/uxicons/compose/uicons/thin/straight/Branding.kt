package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Branding: ImageVector? = null

val Icons.Ts.Branding: ImageVector
    get() = _Branding ?: UXIcon(name = "Branding") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(2.5f, 0f)
                curveTo(1.12f, 0f, 0f, 1.12f, 0f, 2.5f)
                verticalLineToRelative(11.21f)
                lineToRelative(2.5f, 2.5f)
                lineToRelative(2.5f, -2.5f)
                lineTo(5f, 2.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(4f, 13.29f)
                lineToRelative(-1.5f, 1.5f)
                lineToRelative(-1.5f, -1.5f)
                lineTo(1f, 2.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(10.79f)
                close()
                moveTo(17.5f, 14f)
                horizontalLineToRelative(-8f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(7.5f)
                horizontalLineToRelative(13f)
                verticalLineToRelative(-7.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(9.5f, 15f)
                horizontalLineToRelative(8f)
                curveToRelative(0.48f, 0f, 0.91f, 0.23f, 1.18f, 0.59f)
                lineToRelative(-3.86f, 3.86f)
                curveToRelative(-0.7f, 0.7f, -1.93f, 0.7f, -2.64f, 0f)
                lineToRelative(-3.86f, -3.86f)
                curveToRelative(0.28f, -0.36f, 0.7f, -0.59f, 1.18f, -0.59f)
                close()
                moveTo(8f, 23f)
                verticalLineToRelative(-6.31f)
                lineToRelative(3.47f, 3.47f)
                curveToRelative(0.54f, 0.54f, 1.26f, 0.84f, 2.03f, 0.84f)
                reflectiveCurveToRelative(1.48f, -0.3f, 2.03f, -0.84f)
                lineToRelative(3.47f, -3.47f)
                verticalLineToRelative(6.31f)
                horizontalLineToRelative(-11f)
                close()
                moveTo(17.81f, 0f)
                horizontalLineToRelative(-8.63f)
                curveToRelative(-1.2f, 0f, -2.19f, 0.98f, -2.19f, 2.19f)
                verticalLineToRelative(10.58f)
                curveToRelative(0.31f, -0.21f, 0.65f, -0.36f, 1f, -0.48f)
                lineTo(8.0f, 2.19f)
                curveToRelative(0f, -0.65f, 0.53f, -1.19f, 1.19f, -1.19f)
                horizontalLineToRelative(7.82f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(13f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(2f)
                lineTo(24.0f, 6.19f)
                lineTo(17.81f, 0f)
                close()
                moveTo(18f, 1.6f)
                lineToRelative(4.4f, 4.4f)
                horizontalLineToRelative(-4.4f)
                lineTo(18f, 1.6f)
                close()
            }
        }.also { _Branding = it}
