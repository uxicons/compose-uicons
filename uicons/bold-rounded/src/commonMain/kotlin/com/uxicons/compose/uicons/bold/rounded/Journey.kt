package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Journey: ImageVector? = null

val Icons.Br.Journey: ImageVector
    get() = _Journey ?: UXIcon(name = "Journey") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(1f, 16.5f)
            curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
            reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
            reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
            reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
            close()
            moveTo(19.5f, 14f)
            horizontalLineToRelative(-8f)
            curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
            reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            curveToRelative(-2.48f, 0f, -4.5f, 2.02f, -4.5f, 4.5f)
            reflectiveCurveToRelative(2.02f, 4.5f, 4.5f, 4.5f)
            horizontalLineToRelative(8f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-9f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(9f)
            curveToRelative(2.48f, 0f, 4.5f, -2.02f, 4.5f, -4.5f)
            reflectiveCurveToRelative(-2.02f, -4.5f, -4.5f, -4.5f)
            close()
            moveTo(3.5f, 20f)
            curveToRelative(-1.63f, 0f, -3.01f, 1.05f, -3.45f, 2.5f)
            curveToRelative(-0.1f, 0.32f, -0.19f, 1.5f, 1.4f, 1.5f)
            horizontalLineToRelative(4.12f)
            curveToRelative(1.58f, 0f, 1.49f, -1.18f, 1.4f, -1.5f)
            curveToRelative(-0.44f, -1.45f, -1.82f, -2.5f, -3.45f, -2.5f)
            close()
            moveTo(15.5f, 7.39f)
            lineToRelative(-0.86f, 2.77f)
            curveToRelative(-0.12f, 0.37f, 0.01f, 0.78f, 0.33f, 1.01f)
            curveToRelative(0.16f, 0.12f, 0.36f, 0.18f, 0.55f, 0.18f)
            curveToRelative(0.18f, 0f, 0.35f, -0.05f, 0.51f, -0.15f)
            lineToRelative(2.48f, -1.66f)
            lineToRelative(2.52f, 1.64f)
            curveToRelative(0.33f, 0.21f, 0.75f, 0.2f, 1.06f, -0.04f)
            curveToRelative(0.31f, -0.24f, 0.43f, -0.65f, 0.31f, -1.01f)
            lineToRelative(-0.9f, -2.73f)
            lineToRelative(2.17f, -1.77f)
            curveToRelative(0.29f, -0.25f, 0.4f, -0.65f, 0.27f, -1.02f)
            curveToRelative(-0.13f, -0.36f, -0.48f, -0.6f, -0.86f, -0.6f)
            horizontalLineToRelative(-2.75f)
            lineToRelative(-0.97f, -2.73f)
            curveToRelative(-0.13f, -0.36f, -0.48f, -0.6f, -0.86f, -0.6f)
            reflectiveCurveToRelative(-0.73f, 0.24f, -0.86f, 0.6f)
            lineToRelative(-0.97f, 2.73f)
            horizontalLineToRelative(-2.75f)
            curveToRelative(-0.38f, 0f, -0.73f, 0.24f, -0.86f, 0.6f)
            curveToRelative(-0.13f, 0.36f, -0.03f, 0.77f, 0.27f, 1.01f)
            lineToRelative(2.18f, 1.77f)
            close()
        }
    }.also { _Journey = it }
