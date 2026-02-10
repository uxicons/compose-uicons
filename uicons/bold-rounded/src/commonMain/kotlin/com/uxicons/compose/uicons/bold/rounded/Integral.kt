package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Integral: ImageVector? = null

val Icons.Br.Integral: ImageVector
    get() = _Integral ?: UXIcon(name = "Integral") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(19f, 4.25f)
            verticalLineToRelative(0.25f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            verticalLineToRelative(-0.25f)
            curveToRelative(0f, -0.69f, -0.56f, -1.25f, -1.25f, -1.25f)
            reflectiveCurveToRelative(-1.25f, 0.56f, -1.25f, 1.25f)
            verticalLineToRelative(15.5f)
            curveToRelative(0f, 2.34f, -1.91f, 4.25f, -4.25f, 4.25f)
            reflectiveCurveToRelative(-4.25f, -1.91f, -4.25f, -4.25f)
            verticalLineToRelative(-0.25f)
            curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
            reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
            verticalLineToRelative(0.25f)
            curveToRelative(0f, 0.69f, 0.56f, 1.25f, 1.25f, 1.25f)
            reflectiveCurveToRelative(1.25f, -0.56f, 1.25f, -1.25f)
            verticalLineTo(4.25f)
            curveToRelative(0f, -2.34f, 1.91f, -4.25f, 4.25f, -4.25f)
            reflectiveCurveToRelative(4.25f, 1.91f, 4.25f, 4.25f)
            close()
        }
    }.also { _Integral = it }
