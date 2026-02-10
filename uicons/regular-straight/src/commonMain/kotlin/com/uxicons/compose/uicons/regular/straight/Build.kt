package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Build: ImageVector? = null

val Icons.Rs.Build: ImageVector
    get() = _Build ?: UXIcon(name = "Build") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(1.28f, 8.06f)
                lineToRelative(9.72f, 3.92f)
                verticalLineToRelative(-4.98f)
                horizontalLineToRelative(2.28f)
                curveToRelative(0.35f, 0.59f, 0.98f, 1f, 1.72f, 1f)
                horizontalLineToRelative(5f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                reflectiveCurveToRelative(-0.9f, -2f, -2f, -2f)
                horizontalLineToRelative(-5f)
                curveToRelative(-0.74f, 0f, -1.38f, 0.41f, -1.72f, 1f)
                horizontalLineToRelative(-2.28f)
                lineTo(11f, 0.02f)
                lineTo(1.28f, 3.94f)
                curveToRelative(-0.79f, 0.4f, -1.28f, 1.19f, -1.28f, 2.06f)
                reflectiveCurveToRelative(0.49f, 1.66f, 1.28f, 2.06f)
                close()
                moveTo(2.1f, 5.76f)
                lineToRelative(6.89f, -2.78f)
                verticalLineToRelative(6.04f)
                lineToRelative(-6.84f, -2.76f)
                curveToRelative(-0.13f, -0.08f, -0.16f, -0.18f, -0.16f, -0.26f)
                curveToRelative(0f, -0.08f, 0.03f, -0.2f, 0.1f, -0.24f)
                close()
                moveTo(13f, 10.0f)
                verticalLineToRelative(6f)
                lineTo(0f, 16.0f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(-14f)
                horizontalLineToRelative(-11f)
                close()
                moveTo(16f, 18.0f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(8f)
                close()
                moveTo(2f, 18.0f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(4f)
                lineTo(2f, 22.0f)
                verticalLineToRelative(-4f)
                close()
                moveTo(22f, 22.0f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(4f)
                close()
                moveTo(15f, 16.0f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-7f)
                close()
            }
        }.also { _Build = it}
