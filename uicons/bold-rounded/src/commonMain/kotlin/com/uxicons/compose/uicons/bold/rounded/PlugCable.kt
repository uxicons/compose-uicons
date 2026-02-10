package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PlugCable: ImageVector? = null

val Icons.Br.PlugCable: ImageVector
    get() = _PlugCable ?: UXIcon(name = "PlugCable") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(22.5f, 9f)
            horizontalLineToRelative(-1f)
            curveToRelative(-3.03f, 0f, -5.5f, 2.47f, -5.5f, 5.5f)
            verticalLineToRelative(3f)
            curveToRelative(0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
            reflectiveCurveToRelative(-3.5f, -1.57f, -3.5f, -3.5f)
            verticalLineToRelative(-2.67f)
            curveToRelative(2.86f, -0.68f, 5f, -3.26f, 5f, -6.33f)
            verticalLineToRelative(-1.59f)
            curveToRelative(0.58f, -0.21f, 1f, -0.76f, 1f, -1.41f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            horizontalLineToRelative(-1.5f)
            lineTo(12f, 1.5f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
            verticalLineToRelative(2.5f)
            horizontalLineToRelative(-3f)
            lineTo(6f, 1.5f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
            verticalLineToRelative(2.5f)
            horizontalLineToRelative(-1.5f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            curveToRelative(0f, 0.65f, 0.42f, 1.21f, 1f, 1.41f)
            verticalLineToRelative(1.59f)
            curveToRelative(0f, 3.07f, 2.14f, 5.65f, 5f, 6.33f)
            verticalLineToRelative(2.67f)
            curveToRelative(0f, 3.58f, 2.92f, 6.5f, 6.5f, 6.5f)
            reflectiveCurveToRelative(6.5f, -2.92f, 6.5f, -6.5f)
            verticalLineToRelative(-3f)
            curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
            horizontalLineToRelative(1f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            close()
            moveTo(4f, 8.5f)
            verticalLineToRelative(-1.5f)
            horizontalLineToRelative(7f)
            verticalLineToRelative(1.5f)
            curveToRelative(0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
            reflectiveCurveToRelative(-3.5f, -1.57f, -3.5f, -3.5f)
            close()
        }
    }.also { _PlugCable = it }
