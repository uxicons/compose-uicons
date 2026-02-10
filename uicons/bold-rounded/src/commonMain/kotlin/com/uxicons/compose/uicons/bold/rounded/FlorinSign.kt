package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FlorinSign: ImageVector? = null

val Icons.Br.FlorinSign: ImageVector
    get() = _FlorinSign ?: UXIcon(name = "FlorinSign") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(24f, 1.5f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-3.15f)
            curveToRelative(-0.98f, 0f, -1.87f, 0.58f, -2.28f, 1.47f)
            lineToRelative(-2.06f, 4.53f)
            horizontalLineToRelative(2.49f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-3.85f)
            lineToRelative(-3.99f, 8.78f)
            curveToRelative(-0.89f, 1.96f, -2.86f, 3.22f, -5.01f, 3.22f)
            horizontalLineTo(1.5f)
            curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
            reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
            horizontalLineToRelative(3.15f)
            curveToRelative(0.98f, 0f, 1.87f, -0.58f, 2.28f, -1.47f)
            lineToRelative(3.42f, -7.53f)
            horizontalLineToRelative(-2.85f)
            curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
            reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
            horizontalLineToRelative(4.22f)
            lineToRelative(2.63f, -5.78f)
            curveToRelative(0.89f, -1.96f, 2.86f, -3.22f, 5.01f, -3.22f)
            horizontalLineToRelative(3.15f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            close()
        }
    }.also { _FlorinSign = it }
