package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Invest: ImageVector? = null

val Icons.Br.Invest: ImageVector
    get() = _Invest ?: UXIcon(name = "Invest") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(18.12f, 8.4f)
            curveToRelative(-0.61f, -0.56f, -1.56f, -0.53f, -2.12f, 0.08f)
            curveToRelative(-0.56f, 0.61f, -0.53f, 1.56f, 0.08f, 2.12f)
            curveToRelative(1.24f, 1.15f, 1.92f, 2.71f, 1.92f, 4.4f)
            curveToRelative(0f, 1.11f, -0.3f, 2.15f, -0.83f, 3.05f)
            lineToRelative(-3.67f, -3.67f)
            lineTo(13.5f, 5f)
            horizontalLineToRelative(1.56f)
            curveToRelative(0.86f, 0f, 1.29f, -1.04f, 0.69f, -1.65f)
            lineTo(12.69f, 0.28f)
            curveToRelative(-0.38f, -0.38f, -0.99f, -0.38f, -1.37f, 0f)
            lineToRelative(-3.06f, 3.06f)
            curveToRelative(-0.61f, 0.61f, -0.18f, 1.65f, 0.69f, 1.65f)
            horizontalLineToRelative(1.56f)
            verticalLineToRelative(1.13f)
            curveToRelative(-4.25f, 0.72f, -7.5f, 4.42f, -7.5f, 8.87f)
            curveToRelative(0f, 4.96f, 4.04f, 9f, 9f, 9f)
            reflectiveCurveToRelative(9f, -4.04f, 9f, -9f)
            curveToRelative(0f, -2.5f, -1.05f, -4.9f, -2.88f, -6.6f)
            close()
            moveTo(6f, 15f)
            curveToRelative(0f, -2.79f, 1.92f, -5.14f, 4.5f, -5.81f)
            verticalLineToRelative(5.81f)
            curveToRelative(0f, 0.4f, 0.16f, 0.78f, 0.44f, 1.06f)
            lineToRelative(4.11f, 4.11f)
            curveToRelative(-0.89f, 0.53f, -1.94f, 0.83f, -3.05f, 0.83f)
            curveToRelative(-3.31f, 0f, -6f, -2.69f, -6f, -6f)
            close()
        }
    }.also { _Invest = it }
