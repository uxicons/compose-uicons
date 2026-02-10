package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _OpenMailClip: ImageVector? = null

val Icons.Sr.OpenMailClip: ImageVector
    get() = _OpenMailClip ?: UXIcon(name = "OpenMailClip") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(14.12f, 17.12f)
                lineToRelative(6.88f, -6.88f)
                verticalLineToRelative(-6.24f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                lineTo(7f, 0.0f)
                curveTo(4.79f, 0f, 3f, 1.79f, 3f, 4f)
                verticalLineToRelative(6.24f)
                lineToRelative(6.88f, 6.88f)
                curveToRelative(1.13f, 1.13f, 3.11f, 1.13f, 4.24f, 0f)
                close()
                moveTo(6f, 7f)
                curveToRelative(0f, -2.21f, 1.79f, -4f, 4f, -4f)
                horizontalLineToRelative(5.5f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                horizontalLineToRelative(-4.5f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(4.5f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                reflectiveCurveToRelative(-0.23f, -0.5f, -0.5f, -0.5f)
                horizontalLineToRelative(-5.5f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(5f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-5f)
                curveToRelative(-2.21f, 0f, -4f, -1.79f, -4f, -4f)
                close()
                moveTo(24f, 12.71f)
                verticalLineToRelative(6.29f)
                curveToRelative(0f, 2.76f, -2.24f, 5f, -5f, 5f)
                lineTo(5f, 24f)
                curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                verticalLineToRelative(-6.29f)
                curveToRelative(0f, -0.75f, 0.18f, -1.47f, 0.5f, -2.14f)
                lineToRelative(7.96f, 7.97f)
                curveToRelative(0.94f, 0.94f, 2.2f, 1.46f, 3.54f, 1.46f)
                reflectiveCurveToRelative(2.59f, -0.52f, 3.54f, -1.46f)
                lineToRelative(7.96f, -7.97f)
                curveToRelative(0.32f, 0.67f, 0.5f, 1.39f, 0.5f, 2.14f)
                close()
            }
        }.also { _OpenMailClip = it}
