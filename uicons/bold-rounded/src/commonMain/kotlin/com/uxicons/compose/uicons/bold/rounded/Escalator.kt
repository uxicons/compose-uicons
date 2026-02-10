package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Escalator: ImageVector? = null

val Icons.Br.Escalator: ImageVector
    get() = _Escalator ?: UXIcon(name = "Escalator") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(6f, 2.5f)
            curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
            reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
            reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
            reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
            close()
            moveTo(24f, 9.5f)
            curveToRelative(0f, 2.32f, -1.72f, 4.21f, -3.92f, 4.47f)
            lineToRelative(-10.23f, 8.53f)
            curveToRelative(-1.17f, 0.97f, -2.64f, 1.51f, -4.16f, 1.51f)
            horizontalLineToRelative(-1.19f)
            curveToRelative(-2.48f, 0f, -4.5f, -2.02f, -4.5f, -4.5f)
            curveToRelative(0f, -2.32f, 1.72f, -4.21f, 3.92f, -4.47f)
            lineToRelative(1.08f, -0.9f)
            verticalLineToRelative(-4.63f)
            curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
            horizontalLineToRelative(0f)
            curveToRelative(1.56f, 0f, 2.88f, 1.02f, 3.33f, 2.44f)
            lineToRelative(2.31f, -1.93f)
            curveToRelative(1.17f, -0.97f, 2.64f, -1.51f, 4.16f, -1.51f)
            horizontalLineToRelative(1.19f)
            curveToRelative(2.48f, 0f, 4.5f, 2.02f, 4.5f, 4.5f)
            close()
            moveTo(21f, 9.55f)
            curveToRelative(0f, -0.88f, -0.67f, -1.55f, -1.5f, -1.55f)
            horizontalLineToRelative(-1.19f)
            curveToRelative(-0.82f, 0f, -1.61f, 0.29f, -2.24f, 0.81f)
            lineToRelative(-10.61f, 8.84f)
            curveToRelative(-0.27f, 0.23f, -0.61f, 0.35f, -0.96f, 0.35f)
            curveToRelative(-0.85f, 0f, -1.5f, 0.65f, -1.5f, 1.45f)
            curveToRelative(0f, 0.88f, 0.67f, 1.55f, 1.5f, 1.55f)
            horizontalLineToRelative(1.19f)
            curveToRelative(0.82f, 0f, 1.61f, -0.29f, 2.24f, -0.81f)
            lineToRelative(10.61f, -8.84f)
            curveToRelative(0.27f, -0.23f, 0.61f, -0.35f, 0.96f, -0.35f)
            curveToRelative(0.85f, 0f, 1.5f, -0.65f, 1.5f, -1.45f)
            close()
        }
    }.also { _Escalator = it }
