package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Build: ImageVector? = null

val Icons.Ts.Build: ImageVector
    get() = _Build ?: UXIcon(name = "Build") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(1.08f, 7.81f)
                lineToRelative(9.92f, 4.21f)
                verticalLineToRelative(-5.51f)
                horizontalLineToRelative(2.07f)
                curveToRelative(0.22f, 0.86f, 1f, 1.5f, 1.93f, 1.5f)
                horizontalLineToRelative(5f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                reflectiveCurveToRelative(-0.9f, -2f, -2f, -2f)
                horizontalLineToRelative(-5f)
                curveToRelative(-0.93f, 0f, -1.71f, 0.64f, -1.93f, 1.5f)
                horizontalLineToRelative(-2.07f)
                lineTo(11f, -0.01f)
                lineTo(1.08f, 4.19f)
                curveToRelative(-0.67f, 0.35f, -1.08f, 1.05f, -1.08f, 1.81f)
                reflectiveCurveToRelative(0.41f, 1.45f, 1.08f, 1.81f)
                close()
                moveTo(15f, 5f)
                horizontalLineToRelative(5f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-5f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                close()
                moveTo(1.51f, 5.1f)
                lineTo(10f, 1.5f)
                verticalLineToRelative(9.0f)
                lineTo(1.53f, 6.91f)
                curveToRelative(-0.33f, -0.18f, -0.53f, -0.53f, -0.53f, -0.91f)
                curveToRelative(0f, -0.4f, 0.2f, -0.74f, 0.51f, -0.9f)
                close()
                moveTo(13f, 11f)
                verticalLineToRelative(6f)
                lineTo(0f, 17f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(-13f)
                horizontalLineToRelative(-11f)
                close()
                moveTo(16f, 18f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(8f)
                close()
                moveTo(1f, 18f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(5f)
                lineTo(1f, 23f)
                verticalLineToRelative(-5f)
                close()
                moveTo(23f, 23f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(5f)
                close()
                moveTo(14f, 17f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(9f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-9f)
                close()
            }
        }.also { _Build = it}
