package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Italic: ImageVector? = null

val Icons.Sc.Italic: ImageVector
    get() = _Italic ?: UXIcon(name = "Italic") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.46f, 1f)
                horizontalLineToRelative(-5.66f)
                curveToRelative(-0.01f, 0f, -0.02f, 0f, -0.03f, 0f)
                horizontalLineToRelative(-5.82f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(3.41f)
                curveToRelative(-2.16f, 4.71f, -3.62f, 11.07f, -4.33f, 16f)
                horizontalLineTo(3.54f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                horizontalLineTo(15.05f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-3.99f)
                curveToRelative(0.77f, -5.09f, 2.33f, -11.59f, 4.61f, -15.93f)
                lineToRelative(0.04f, -0.07f)
                horizontalLineToRelative(4.76f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                close()
            }
        }.also { _Italic = it}
