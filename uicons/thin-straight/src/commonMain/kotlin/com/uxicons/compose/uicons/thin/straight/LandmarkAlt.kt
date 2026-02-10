package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LandmarkAlt: ImageVector? = null

val Icons.Ts.LandmarkAlt: ImageVector
    get() = _LandmarkAlt ?: UXIcon(name = "LandmarkAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 23f)
                verticalLineToRelative(1f)
                lineTo(0f, 24f)
                verticalLineToRelative(-1f)
                lineTo(24f, 23f)
                close()
                moveTo(23f, 20f)
                lineTo(1f, 20f)
                verticalLineToRelative(-1f)
                lineTo(3f, 19f)
                verticalLineToRelative(-7f)
                lineTo(1f, 12f)
                verticalLineToRelative(-1f)
                lineTo(3f, 11f)
                curveTo(3f, 6.21f, 6.77f, 2.27f, 11.5f, 2.01f)
                lineTo(11.5f, 0f)
                horizontalLineToRelative(1f)
                lineTo(12.5f, 2.01f)
                curveToRelative(4.73f, 0.26f, 8.5f, 4.19f, 8.5f, 8.99f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(1f)
                close()
                moveTo(20f, 12f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-7f)
                close()
                moveTo(9f, 12f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-7f)
                horizontalLineToRelative(-6f)
                close()
                moveTo(4f, 11f)
                lineTo(20f, 11f)
                curveToRelative(0f, -4.41f, -3.59f, -8f, -8f, -8f)
                reflectiveCurveTo(4f, 6.59f, 4f, 11f)
                close()
                moveTo(4f, 19f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-7f)
                lineTo(4f, 12f)
                verticalLineToRelative(7f)
                close()
            }
        }.also { _LandmarkAlt = it}
