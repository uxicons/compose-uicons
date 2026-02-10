package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _VideoCameraAlt: ImageVector? = null

val Icons.Sr.VideoCameraAlt: ImageVector
    get() = _VideoCameraAlt ?: UXIcon(name = "VideoCameraAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5f, 20f)
                horizontalLineTo(13f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                verticalLineToRelative(-6f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                horizontalLineTo(5f)
                curveTo(2.24f, 4f, 0f, 6.24f, 0f, 9f)
                verticalLineToRelative(6f)
                curveTo(0f, 17.76f, 2.24f, 20f, 5f, 20f)
                close()
                moveTo(24f, 8.31f)
                verticalLineToRelative(7.32f)
                curveToRelative(0f, 0.76f, -0.42f, 1.44f, -1.1f, 1.77f)
                curveToRelative(-0.28f, 0.14f, -0.59f, 0.21f, -0.89f, 0.21f)
                curveToRelative(-0.42f, 0f, -0.84f, -0.14f, -1.19f, -0.4f)
                curveToRelative(-0.04f, -0.03f, -0.82f, -0.81f, -0.82f, -0.81f)
                verticalLineTo(7.54f)
                reflectiveCurveToRelative(0.79f, -0.79f, 0.82f, -0.82f)
                curveToRelative(0.6f, -0.45f, 1.4f, -0.53f, 2.08f, -0.19f)
                reflectiveCurveToRelative(1.1f, 1.02f, 1.1f, 1.77f)
                close()
            }
        }.also { _VideoCameraAlt = it}
