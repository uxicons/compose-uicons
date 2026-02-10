package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _WaterDrop: ImageVector? = null

val Icons.Br.WaterDrop: ImageVector
    get() = _WaterDrop ?: UXIcon(name = "WaterDrop") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(24f, 17f)
            curveToRelative(0f, 3.92f, -5.27f, 7f, -12f, 7f)
            reflectiveCurveToRelative(-12f, -3.08f, -12f, -7f)
            curveToRelative(0f, -2.48f, 1.98f, -4.63f, 5.44f, -5.91f)
            curveToRelative(0.78f, -0.29f, 1.64f, 0.11f, 1.93f, 0.89f)
            curveToRelative(0.29f, 0.78f, -0.11f, 1.64f, -0.89f, 1.93f)
            curveToRelative(-2.11f, 0.78f, -3.48f, 1.99f, -3.48f, 3.09f)
            curveToRelative(0f, 1.89f, 3.85f, 4f, 9f, 4f)
            reflectiveCurveToRelative(9f, -2.11f, 9f, -4f)
            curveToRelative(0f, -1.1f, -1.37f, -2.31f, -3.48f, -3.09f)
            curveToRelative(-0.78f, -0.29f, -1.18f, -1.15f, -0.89f, -1.93f)
            reflectiveCurveToRelative(1.15f, -1.18f, 1.93f, -0.89f)
            curveToRelative(3.46f, 1.27f, 5.44f, 3.43f, 5.44f, 5.91f)
            close()
            moveTo(12f, 5f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            reflectiveCurveToRelative(-1.12f, -2.5f, -2.5f, -2.5f)
            reflectiveCurveToRelative(-2.5f, 1.12f, -2.5f, 2.5f)
            reflectiveCurveToRelative(1.12f, 2.5f, 2.5f, 2.5f)
            close()
            moveTo(8f, 16f)
            horizontalLineToRelative(-0.79f)
            curveToRelative(-0.76f, 0.31f, -1.21f, 0.7f, -1.21f, 1.12f)
            curveToRelative(0f, 1.04f, 2.69f, 1.88f, 6f, 1.88f)
            reflectiveCurveToRelative(6f, -0.84f, 6f, -1.88f)
            curveToRelative(0f, -0.42f, -0.45f, -0.81f, -1.21f, -1.12f)
            horizontalLineToRelative(-0.79f)
            curveToRelative(-1.18f, 0f, -2.5f, -0.85f, -2.5f, -2f)
            curveToRelative(0.0f, -1.55f, 1.56f, -2.43f, 1.5f, -4f)
            curveToRelative(0f, -1.66f, -1.34f, -3f, -3f, -3f)
            reflectiveCurveToRelative(-3f, 1.34f, -3f, 3f)
            curveToRelative(-0.06f, 1.57f, 1.5f, 2.45f, 1.5f, 4f)
            curveToRelative(0f, 1.15f, -1.32f, 2f, -2.5f, 2f)
            close()
        }
    }.also { _WaterDrop = it }
