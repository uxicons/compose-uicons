package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Timeline: ImageVector? = null

val Icons.Bs.Timeline: ImageVector
    get() = _Timeline ?: UXIcon(name = "Timeline") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13.5f, 13.5f)
                verticalLineToRelative(3.85f)
                curveToRelative(1.18f, 0.56f, 2f, 1.76f, 2f, 3.15f)
                curveToRelative(0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                reflectiveCurveToRelative(-3.5f, -1.57f, -3.5f, -3.5f)
                curveToRelative(0f, -1.39f, 0.82f, -2.59f, 2f, -3.15f)
                verticalLineToRelative(-3.85f)
                horizontalLineToRelative(-10.5f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-3.85f)
                curveToRelative(-1.18f, -0.56f, -2f, -1.76f, -2f, -3.15f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                reflectiveCurveToRelative(3.5f, 1.57f, 3.5f, 3.5f)
                curveToRelative(0f, 1.39f, -0.82f, 2.59f, -2f, 3.15f)
                verticalLineToRelative(3.85f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(-3.85f)
                curveToRelative(-1.18f, -0.56f, -2f, -1.76f, -2f, -3.15f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                reflectiveCurveToRelative(3.5f, 1.57f, 3.5f, 3.5f)
                curveToRelative(0f, 1.39f, -0.82f, 2.59f, -2f, 3.15f)
                verticalLineToRelative(3.85f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(3f)
                close()
            }
        }.also { _Timeline = it}
