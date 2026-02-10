package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _OpenMailClip: ImageVector? = null

val Icons.Ss.OpenMailClip: ImageVector
    get() = _OpenMailClip ?: UXIcon(name = "OpenMailClip") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(14.12f, 17.12f)
                lineToRelative(6.88f, -6.88f)
                lineTo(21f, 3f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                lineTo(6f, 0f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(7.24f)
                lineToRelative(6.88f, 6.88f)
                curveToRelative(1.13f, 1.13f, 3.11f, 1.13f, 4.24f, 0f)
                close()
                moveTo(6f, 7f)
                curveToRelative(0f, -2.21f, 1.79f, -4f, 4f, -4f)
                horizontalLineToRelative(5.5f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                horizontalLineToRelative(-5.5f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(5.5f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                reflectiveCurveToRelative(-0.23f, -0.5f, -0.5f, -0.5f)
                horizontalLineToRelative(-5.5f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-6f)
                curveToRelative(-2.21f, 0f, -4f, -1.79f, -4f, -4f)
                close()
                moveTo(24f, 12.23f)
                verticalLineToRelative(11.77f)
                lineTo(0f, 24f)
                verticalLineToRelative(-11.77f)
                curveToRelative(0.0f, -0.61f, 0.16f, -1.2f, 0.42f, -1.74f)
                lineToRelative(8.05f, 8.05f)
                curveToRelative(0.94f, 0.94f, 2.2f, 1.46f, 3.54f, 1.46f)
                reflectiveCurveToRelative(2.59f, -0.52f, 3.54f, -1.46f)
                lineToRelative(8.05f, -8.05f)
                curveToRelative(0.26f, 0.54f, 0.42f, 1.13f, 0.42f, 1.74f)
                close()
            }
        }.also { _OpenMailClip = it}
