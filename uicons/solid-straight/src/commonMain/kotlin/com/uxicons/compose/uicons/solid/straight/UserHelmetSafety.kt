package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserHelmetSafety: ImageVector? = null

val Icons.Ss.UserHelmetSafety: ImageVector
    get() = _UserHelmetSafety ?: UXIcon(name = "UserHelmetSafety") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19f, 5f)
                verticalLineToRelative(2f)
                lineTo(5f, 7f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(1.02f)
                curveTo(6.26f, 2.37f, 8.37f, 0.26f, 11f, 0.02f)
                verticalLineToRelative(3.98f)
                horizontalLineToRelative(2f)
                lineTo(13f, 0.02f)
                curveToRelative(2.63f, 0.24f, 4.74f, 2.34f, 4.98f, 4.98f)
                horizontalLineToRelative(1.02f)
                close()
                moveTo(16f, 16f)
                horizontalLineToRelative(-8f)
                curveToRelative(-2.76f, 0f, -5f, 2.24f, -5f, 5f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(18f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                close()
                moveTo(6.0f, 9.15f)
                curveToRelative(0.08f, 3.24f, 2.74f, 5.85f, 6.0f, 5.85f)
                reflectiveCurveToRelative(5.92f, -2.61f, 6.0f, -5.85f)
                lineToRelative(0.0f, -0.15f)
                lineTo(6f, 9f)
                lineToRelative(0.0f, 0.15f)
                close()
            }
        }.also { _UserHelmetSafety = it}
