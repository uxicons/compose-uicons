package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GasStation: ImageVector? = null

val Icons.Br.GasStation: ImageVector
    get() = _GasStation ?: UXIcon(name = "GasStation") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(19.78f, 3.24f)
            curveToRelative(-2.08f, -2.09f, -4.84f, -3.24f, -7.78f, -3.24f)
            reflectiveCurveToRelative(-5.7f, 1.15f, -7.78f, 3.24f)
            curveToRelative(-4.29f, 4.31f, -4.29f, 11.31f, 0.04f, 15.66f)
            lineToRelative(3.73f, 3.47f)
            curveToRelative(1.08f, 1.06f, 2.5f, 1.64f, 4.0f, 1.64f)
            reflectiveCurveToRelative(2.93f, -0.58f, 3.97f, -1.61f)
            lineToRelative(3.81f, -3.54f)
            curveToRelative(4.28f, -4.31f, 4.28f, -11.31f, 0f, -15.62f)
            close()
            moveTo(17.7f, 16.7f)
            lineTo(13.9f, 20.22f)
            curveToRelative(-1.02f, 1.01f, -2.75f, 1.03f, -3.83f, -0.03f)
            lineToRelative(-3.72f, -3.46f)
            curveToRelative(-3.12f, -3.14f, -3.12f, -8.24f, 0f, -11.38f)
            curveToRelative(1.51f, -1.52f, 3.52f, -2.35f, 5.65f, -2.35f)
            reflectiveCurveToRelative(4.14f, 0.84f, 5.65f, 2.35f)
            curveToRelative(3.12f, 3.14f, 3.12f, 8.24f, 0.04f, 11.34f)
            close()
            moveTo(17.7f, 7.67f)
            curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0f)
            lineToRelative(-0.89f, 0.89f)
            curveToRelative(-0.25f, 0.24f, -0.39f, 0.59f, -0.39f, 0.94f)
            verticalLineToRelative(3.5f)
            horizontalLineToRelative(-1f)
            verticalLineToRelative(-4f)
            curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
            horizontalLineToRelative(-2f)
            curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
            verticalLineToRelative(5f)
            curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
            horizontalLineToRelative(2f)
            curveToRelative(0.74f, 0f, 1.38f, -0.41f, 1.72f, -1f)
            horizontalLineToRelative(1.28f)
            curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
            verticalLineToRelative(-3.22f)
            lineToRelative(0.7f, -0.7f)
            curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0f, -1.41f)
            close()
            moveTo(10.0f, 9f)
            horizontalLineToRelative(2f)
            verticalLineToRelative(2f)
            horizontalLineToRelative(-2f)
            close()
        }
    }.also { _GasStation = it }
