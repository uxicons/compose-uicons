package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Build: ImageVector? = null

val Icons.Ss.Build: ImageVector
    get() = _Build ?: UXIcon(name = "Build") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 16f)
                horizontalLineToRelative(-11f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(11f)
                verticalLineToRelative(6f)
                close()
                moveTo(22f, 6f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                horizontalLineToRelative(-5f)
                curveToRelative(-0.74f, 0f, -1.38f, -0.41f, -1.72f, -1f)
                horizontalLineToRelative(-2.28f)
                verticalLineToRelative(4.98f)
                lineTo(1.28f, 8.06f)
                curveToRelative(-0.79f, -0.4f, -1.28f, -1.19f, -1.28f, -2.06f)
                reflectiveCurveToRelative(0.49f, -1.66f, 1.28f, -2.06f)
                lineTo(11f, 0.02f)
                verticalLineToRelative(4.98f)
                horizontalLineToRelative(2.28f)
                curveToRelative(0.35f, -0.59f, 0.98f, -1f, 1.72f, -1f)
                horizontalLineToRelative(5f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                close()
                moveTo(18f, 18f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(-6f)
                close()
                moveTo(8f, 24f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(6f)
                close()
                moveTo(6f, 18f)
                lineTo(0f, 18f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-6f)
                close()
            }
        }.also { _Build = it}
