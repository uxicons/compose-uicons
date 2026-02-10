package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _VolumeDown: ImageVector? = null

val Icons.Sr.VolumeDown: ImageVector
    get() = _VolumeDown ?: UXIcon(name = "VolumeDown") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(14.0f, 23.81f)
                curveToRelative(-0.06f, 0f, -0.12f, -0.01f, -0.18f, -0.02f)
                curveToRelative(-3.0f, -0.55f, -5.75f, -2.3f, -7.55f, -4.79f)
                horizontalLineToRelative(-1.27f)
                curveTo(2.24f, 19.0f, -0.0f, 16.76f, -0.0f, 14.0f)
                verticalLineToRelative(-4.0f)
                curveTo(-0.0f, 7.24f, 2.24f, 5.0f, 5.0f, 5.0f)
                horizontalLineToRelative(1.27f)
                curveTo(8.07f, 2.51f, 10.82f, 0.76f, 13.82f, 0.2f)
                curveToRelative(0.29f, -0.05f, 0.59f, 0.02f, 0.82f, 0.21f)
                curveToRelative(0.23f, 0.19f, 0.36f, 0.47f, 0.36f, 0.77f)
                verticalLineToRelative(21.63f)
                curveToRelative(0f, 0.3f, -0.13f, 0.58f, -0.36f, 0.77f)
                curveToRelative(-0.18f, 0.15f, -0.41f, 0.23f, -0.64f, 0.23f)
                close()
                moveTo(18.02f, 16.77f)
                curveToRelative(2.63f, -2.63f, 2.63f, -6.91f, 0f, -9.55f)
                curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0f)
                reflectiveCurveToRelative(-0.39f, 1.02f, 0f, 1.41f)
                curveToRelative(1.85f, 1.85f, 1.85f, 4.87f, 0f, 6.72f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0f, 1.41f)
                curveToRelative(0.2f, 0.2f, 0.45f, 0.29f, 0.71f, 0.29f)
                reflectiveCurveToRelative(0.51f, -0.1f, 0.71f, -0.29f)
                close()
            }
        }.also { _VolumeDown = it}
