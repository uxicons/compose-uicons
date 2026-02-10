package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FonduePot: ImageVector? = null

val Icons.Br.FonduePot: ImageVector
    get() = _FonduePot ?: UXIcon(name = "FonduePot") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(22.5f, 7f)
            horizontalLineToRelative(-1.93f)
            lineToRelative(2.22f, -3.73f)
            curveToRelative(0.42f, -0.71f, 0.19f, -1.63f, -0.52f, -2.06f)
            curveToRelative(-0.71f, -0.42f, -1.63f, -0.19f, -2.06f, 0.52f)
            lineToRelative(-3.14f, 5.27f)
            horizontalLineToRelative(-2.21f)
            lineToRelative(1.19f, -5.16f)
            curveToRelative(0.19f, -0.81f, -0.32f, -1.61f, -1.13f, -1.8f)
            curveToRelative(-0.81f, -0.18f, -1.61f, 0.32f, -1.8f, 1.13f)
            lineToRelative(-1.34f, 5.84f)
            horizontalLineToRelative(-4.86f)
            lineTo(3.79f, 1.73f)
            curveToRelative(-0.42f, -0.71f, -1.35f, -0.95f, -2.06f, -0.52f)
            curveToRelative(-0.71f, 0.42f, -0.94f, 1.34f, -0.52f, 2.06f)
            lineToRelative(2.22f, 3.73f)
            horizontalLineToRelative(-1.94f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(0.5f)
            verticalLineToRelative(2.5f)
            curveToRelative(0f, 2.76f, 1.32f, 5.22f, 3.37f, 6.77f)
            curveToRelative(-0.84f, 0.82f, -1.37f, 1.96f, -1.37f, 3.23f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
            horizontalLineToRelative(7f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            curveToRelative(0f, -1.26f, -0.53f, -2.41f, -1.37f, -3.23f)
            curveToRelative(2.04f, -1.55f, 3.37f, -4.01f, 3.37f, -6.77f)
            verticalLineToRelative(-2.5f)
            horizontalLineToRelative(0.5f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            close()
            moveTo(19f, 12.5f)
            curveToRelative(0f, 3.03f, -2.47f, 5.5f, -5.5f, 5.5f)
            horizontalLineToRelative(-3f)
            curveToRelative(-3.03f, 0f, -5.5f, -2.47f, -5.5f, -5.5f)
            verticalLineToRelative(-2.5f)
            horizontalLineToRelative(14f)
            verticalLineToRelative(2.5f)
            close()
        }
    }.also { _FonduePot = it }
