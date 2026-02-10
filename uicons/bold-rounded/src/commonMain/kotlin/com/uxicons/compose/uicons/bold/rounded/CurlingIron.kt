package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CurlingIron: ImageVector? = null

val Icons.Br.CurlingIron: ImageVector
    get() = _CurlingIron ?: UXIcon(name = "CurlingIron") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(24.0f, 4.02f)
            curveToRelative(0f, -1.07f, -0.42f, -2.07f, -1.17f, -2.83f)
            curveToRelative(-1.49f, -1.55f, -4.17f, -1.55f, -5.66f, 0f)
            lineToRelative(-6.16f, 6.16f)
            verticalLineToRelative(-5.85f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
            verticalLineToRelative(7.67f)
            lineToRelative(-0.16f, -0.07f)
            curveToRelative(-2.49f, -1.13f, -5.47f, -0.59f, -7.4f, 1.34f)
            curveToRelative(-0.59f, 0.59f, -0.59f, 1.54f, 0f, 2.12f)
            reflectiveCurveToRelative(1.54f, 0.59f, 2.12f, 0f)
            curveToRelative(0.83f, -0.82f, 2.0f, -1.18f, 3.12f, -1f)
            lineToRelative(-4.27f, 4.27f)
            curveToRelative(-1.86f, 1.86f, -1.86f, 4.9f, 0f, 6.76f)
            curveToRelative(1.86f, 1.86f, 4.9f, 1.86f, 6.76f, 0f)
            lineToRelative(4.9f, -4.9f)
            lineToRelative(0.39f, 0.38f)
            curveToRelative(0.59f, 0.58f, 1.54f, 0.57f, 2.12f, -0.02f)
            reflectiveCurveToRelative(0.57f, -1.54f, -0.02f, -2.12f)
            lineToRelative(-0.92f, -0.9f)
            lineToRelative(8.19f, -8.19f)
            curveToRelative(0.76f, -0.76f, 1.17f, -1.76f, 1.17f, -2.83f)
            close()
            moveTo(6.05f, 20.48f)
            curveToRelative(-0.7f, 0.7f, -1.82f, 0.69f, -2.52f, 0f)
            reflectiveCurveToRelative(-0.69f, -1.82f, 0f, -2.52f)
            lineToRelative(4.85f, -4.85f)
            lineToRelative(2.55f, 2.49f)
            lineToRelative(-4.88f, 4.88f)
            close()
            moveTo(20.7f, 4.72f)
            lineTo(12.53f, 12.9f)
            lineTo(11.11f, 11.49f)
            lineTo(19.29f, 3.31f)
            curveToRelative(0.38f, -0.38f, 1.03f, -0.38f, 1.41f, 0f)
            curveToRelative(0.39f, 0.37f, 0.39f, 1.04f, 0f, 1.42f)
            close()
        }
    }.also { _CurlingIron = it }
