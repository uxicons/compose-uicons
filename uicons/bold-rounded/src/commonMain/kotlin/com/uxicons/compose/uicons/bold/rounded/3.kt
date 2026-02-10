package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _3: ImageVector? = null

val Icons.Br.Three: ImageVector
    get() = _3 ?: UXIcon(name = "Three") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(16.39f, 10.09f)
            curveToRelative(1f, -1.07f, 1.61f, -2.51f, 1.61f, -4.09f)
            curveToRelative(0f, -3.31f, -2.69f, -6f, -6f, -6f)
            horizontalLineTo(5.5f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(6.5f)
            curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
            reflectiveCurveToRelative(-1.35f, 3f, -3f, 3f)
            horizontalLineTo(7.5f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(5f)
            curveToRelative(2.48f, 0f, 4.5f, 2.02f, 4.5f, 4.5f)
            reflectiveCurveToRelative(-2.02f, 4.5f, -4.5f, 4.5f)
            horizontalLineTo(5.5f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(7f)
            curveToRelative(4.14f, 0f, 7.5f, -3.36f, 7.5f, -7.5f)
            curveToRelative(0f, -2.71f, -1.45f, -5.09f, -3.61f, -6.41f)
            close()
        }
    }.also { _3 = it }
