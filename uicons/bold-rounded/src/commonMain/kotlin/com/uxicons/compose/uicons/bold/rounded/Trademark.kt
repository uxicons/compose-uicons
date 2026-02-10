package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Trademark: ImageVector? = null

val Icons.Br.Trademark: ImageVector
    get() = _Trademark ?: UXIcon(name = "Trademark") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(11f, 6.5f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-2.5f)
            verticalLineToRelative(9.5f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            lineTo(4f, 8f)
            lineTo(1.5f, 8f)
            curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
            reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
            lineTo(9.5f, 5f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            close()
            moveTo(21.63f, 5f)
            curveToRelative(-0.88f, 0f, -1.69f, 0.48f, -2.1f, 1.28f)
            lineToRelative(-1.52f, 2.95f)
            lineToRelative(-1.53f, -2.96f)
            curveToRelative(-0.41f, -0.78f, -1.22f, -1.27f, -2.1f, -1.27f)
            curveToRelative(-1.31f, 0f, -2.37f, 1.06f, -2.37f, 2.37f)
            verticalLineToRelative(10.13f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            verticalLineToRelative(-7.54f)
            lineToRelative(1.67f, 3.23f)
            curveToRelative(0.26f, 0.5f, 0.77f, 0.81f, 1.33f, 0.81f)
            reflectiveCurveToRelative(1.08f, -0.31f, 1.33f, -0.81f)
            lineToRelative(1.67f, -3.23f)
            verticalLineToRelative(7.54f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            lineTo(24.01f, 7.37f)
            curveToRelative(0f, -1.31f, -1.06f, -2.37f, -2.37f, -2.37f)
            close()
        }
    }.also { _Trademark = it }
