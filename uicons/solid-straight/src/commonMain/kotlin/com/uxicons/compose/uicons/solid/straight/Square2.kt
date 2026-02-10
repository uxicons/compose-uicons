package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Square2: ImageVector? = null

val Icons.Ss.Square2: ImageVector
    get() = _Square2 ?: UXIcon(name = "Square2") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 0f)
                horizontalLineTo(3f)
                curveTo(1.35f, 0f, 0f, 1.35f, 0f, 3f)
                verticalLineTo(24f)
                horizontalLineTo(24f)
                verticalLineTo(3f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(12.18f, 14.93f)
                curveToRelative(-0.7f, 0.4f, -1.26f, 0.74f, -1.63f, 1.07f)
                horizontalLineToRelative(5.46f)
                verticalLineToRelative(2f)
                horizontalLineTo(8f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -1.97f, 1.69f, -2.94f, 3.18f, -3.8f)
                curveToRelative(1.76f, -1.01f, 2.82f, -1.74f, 2.82f, -3.2f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                reflectiveCurveToRelative(-2f, 0.9f, -2f, 2f)
                horizontalLineToRelative(-2f)
                curveToRelative(0f, -2.21f, 1.79f, -4f, 4f, -4f)
                reflectiveCurveToRelative(4f, 1.79f, 4f, 4f)
                curveToRelative(0f, 2.72f, -2.12f, 3.94f, -3.82f, 4.93f)
                close()
            }
        }.also { _Square2 = it}
