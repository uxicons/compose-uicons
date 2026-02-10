package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RampLoading: ImageVector? = null

val Icons.Br.RampLoading: ImageVector
    get() = _RampLoading ?: UXIcon(name = "RampLoading") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(18.7f, 24f)
            lineTo(5.24f, 24f)
            curveToRelative(-1.15f, 0f, -2.2f, -0.58f, -2.81f, -1.56f)
            curveToRelative(-0.6f, -0.98f, -0.66f, -2.18f, -0.14f, -3.21f)
            lineToRelative(2.45f, -4.9f)
            curveToRelative(0.72f, -1.43f, 2.15f, -2.32f, 3.76f, -2.32f)
            horizontalLineToRelative(6.94f)
            curveToRelative(1.6f, 0f, 3.04f, 0.89f, 3.76f, 2.32f)
            lineToRelative(2.45f, 4.9f)
            curveToRelative(0.52f, 1.03f, 0.46f, 2.23f, -0.14f, 3.21f)
            curveToRelative(-0.6f, 0.98f, -1.66f, 1.56f, -2.81f, 1.56f)
            close()
            moveTo(8.5f, 15f)
            curveToRelative(-0.46f, 0f, -0.87f, 0.25f, -1.07f, 0.66f)
            lineToRelative(-2.45f, 4.9f)
            curveToRelative(-0.06f, 0.12f, -0.03f, 0.23f, 0.01f, 0.29f)
            curveToRelative(0.04f, 0.07f, 0.12f, 0.14f, 0.26f, 0.14f)
            horizontalLineToRelative(13.45f)
            curveToRelative(0.14f, 0f, 0.22f, -0.08f, 0.26f, -0.14f)
            curveToRelative(0.04f, -0.06f, 0.07f, -0.17f, 0.01f, -0.29f)
            lineToRelative(-2.45f, -4.9f)
            curveToRelative(-0.2f, -0.41f, -0.61f, -0.66f, -1.07f, -0.66f)
            horizontalLineToRelative(-6.94f)
            close()
            moveTo(22f, 10.5f)
            lineTo(22f, 5.5f)
            curveToRelative(0f, -3.03f, -2.47f, -5.5f, -5.5f, -5.5f)
            lineTo(7.5f, 0f)
            curveTo(4.47f, 0f, 2f, 2.47f, 2f, 5.5f)
            verticalLineToRelative(5f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            lineTo(5f, 5.5f)
            curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
            horizontalLineToRelative(9f)
            curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
            verticalLineToRelative(5f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            close()
        }
    }.also { _RampLoading = it }
