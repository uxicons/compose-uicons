package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BracketCurly: ImageVector? = null

val Icons.Br.BracketCurly: ImageVector
    get() = _BracketCurly ?: UXIcon(name = "BracketCurly") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(14.5f, 24f)
            curveToRelative(-3.03f, 0f, -5.5f, -2.47f, -5.5f, -5.5f)
            verticalLineToRelative(-1.84f)
            curveToRelative(0f, -0.66f, -0.27f, -1.3f, -0.73f, -1.77f)
            lineToRelative(-1.83f, -1.83f)
            curveToRelative(-0.59f, -0.59f, -0.59f, -1.54f, 0f, -2.12f)
            lineToRelative(1.83f, -1.83f)
            curveToRelative(0.47f, -0.47f, 0.73f, -1.11f, 0.73f, -1.77f)
            verticalLineToRelative(-1.84f)
            curveToRelative(0f, -3.03f, 2.47f, -5.5f, 5.5f, -5.5f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
            curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
            verticalLineToRelative(1.84f)
            curveToRelative(0f, 1.47f, -0.57f, 2.85f, -1.61f, 3.89f)
            lineToRelative(-0.77f, 0.77f)
            lineToRelative(0.77f, 0.77f)
            curveToRelative(1.04f, 1.04f, 1.61f, 2.42f, 1.61f, 3.89f)
            verticalLineToRelative(1.84f)
            curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
            close()
        }
    }.also { _BracketCurly = it }
