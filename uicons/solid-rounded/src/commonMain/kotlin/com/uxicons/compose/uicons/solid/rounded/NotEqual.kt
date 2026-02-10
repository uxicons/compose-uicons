package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _NotEqual: ImageVector? = null

val Icons.Sr.NotEqual: ImageVector
    get() = _NotEqual ?: UXIcon(name = "NotEqual") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23f, 15f)
                horizontalLineToRelative(-11.27f)
                lineToRelative(2.73f, -6f)
                horizontalLineToRelative(8.54f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-7.63f)
                lineToRelative(2.54f, -5.59f)
                curveToRelative(0.23f, -0.5f, 0.01f, -1.1f, -0.5f, -1.32f)
                curveToRelative(-0.51f, -0.23f, -1.1f, -0.01f, -1.32f, 0.5f)
                lineToRelative(-2.92f, 6.41f)
                horizontalLineTo(1f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(11.27f)
                lineToRelative(-2.73f, 6f)
                horizontalLineTo(1f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(7.63f)
                lineToRelative(-2.54f, 5.59f)
                curveToRelative(-0.23f, 0.5f, -0.01f, 1.1f, 0.5f, 1.32f)
                curveToRelative(0.14f, 0.06f, 0.28f, 0.09f, 0.41f, 0.09f)
                curveToRelative(0.38f, 0f, 0.74f, -0.22f, 0.91f, -0.59f)
                lineToRelative(2.92f, -6.41f)
                horizontalLineToRelative(12.17f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
            }
        }.also { _NotEqual = it}
