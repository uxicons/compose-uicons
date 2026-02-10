package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _NotEqual: ImageVector? = null

val Icons.Rr.NotEqual: ImageVector
    get() = _NotEqual ?: UXIcon(name = "NotEqual") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 16f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-12.17f)
                lineToRelative(-2.92f, 6.41f)
                curveToRelative(-0.17f, 0.37f, -0.53f, 0.59f, -0.91f, 0.59f)
                curveToRelative(-0.14f, 0f, -0.28f, -0.03f, -0.41f, -0.09f)
                curveToRelative(-0.5f, -0.23f, -0.72f, -0.82f, -0.5f, -1.32f)
                lineToRelative(2.54f, -5.59f)
                horizontalLineTo(1f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(8.54f)
                lineToRelative(2.73f, -6f)
                horizontalLineTo(1f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(12.17f)
                lineToRelative(2.92f, -6.41f)
                curveToRelative(0.23f, -0.5f, 0.82f, -0.73f, 1.32f, -0.5f)
                curveToRelative(0.5f, 0.23f, 0.72f, 0.82f, 0.5f, 1.32f)
                lineToRelative(-2.54f, 5.59f)
                horizontalLineToRelative(7.63f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-8.54f)
                lineToRelative(-2.73f, 6f)
                horizontalLineToRelative(11.27f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                close()
            }
        }.also { _NotEqual = it}
