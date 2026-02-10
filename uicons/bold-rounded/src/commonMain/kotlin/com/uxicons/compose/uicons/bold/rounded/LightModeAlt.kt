package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LightModeAlt: ImageVector? = null

val Icons.Br.LightModeAlt: ImageVector
    get() = _LightModeAlt ?: UXIcon(name = "LightModeAlt") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(16f, 13f)
            curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
            reflectiveCurveToRelative(-1.35f, 3f, -3f, 3f)
            reflectiveCurveToRelative(-3f, -1.35f, -3f, -3f)
            reflectiveCurveToRelative(1.35f, -3f, 3f, -3f)
            close()
            moveTo(7.62f, 7.42f)
            curveToRelative(0.27f, 0.49f, 0.89f, 0.66f, 1.36f, 0.39f)
            lineToRelative(0.57f, -0.31f)
            curveToRelative(0.4f, 0.39f, 0.9f, 0.68f, 1.45f, 0.84f)
            verticalLineToRelative(0.66f)
            curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
            reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
            verticalLineToRelative(-0.66f)
            curveToRelative(0.55f, -0.17f, 1.05f, -0.45f, 1.45f, -0.84f)
            lineToRelative(0.57f, 0.31f)
            curveToRelative(0.47f, 0.27f, 1.09f, 0.1f, 1.36f, -0.39f)
            curveToRelative(0.27f, -0.48f, 0.09f, -1.09f, -0.39f, -1.36f)
            lineToRelative(-0.57f, -0.31f)
            curveToRelative(0.05f, -0.24f, 0.08f, -0.49f, 0.08f, -0.75f)
            reflectiveCurveToRelative(-0.03f, -0.51f, -0.08f, -0.75f)
            lineToRelative(0.57f, -0.31f)
            curveToRelative(0.48f, -0.27f, 0.66f, -0.88f, 0.39f, -1.36f)
            curveToRelative(-0.27f, -0.48f, -0.88f, -0.66f, -1.36f, -0.39f)
            lineToRelative(-0.57f, 0.31f)
            curveToRelative(-0.4f, -0.39f, -0.9f, -0.68f, -1.45f, -0.84f)
            verticalLineToRelative(-0.66f)
            curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
            reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
            verticalLineToRelative(0.66f)
            curveToRelative(-0.55f, 0.17f, -1.05f, 0.45f, -1.45f, 0.84f)
            lineToRelative(-0.57f, -0.31f)
            curveToRelative(-0.48f, -0.27f, -1.09f, -0.09f, -1.36f, 0.39f)
            reflectiveCurveToRelative(-0.09f, 1.09f, 0.39f, 1.36f)
            lineToRelative(0.57f, 0.31f)
            curveToRelative(-0.05f, 0.24f, -0.08f, 0.49f, -0.08f, 0.75f)
            reflectiveCurveToRelative(0.03f, 0.51f, 0.08f, 0.75f)
            lineToRelative(-0.57f, 0.31f)
            curveToRelative(-0.48f, 0.27f, -0.66f, 0.88f, -0.39f, 1.36f)
            close()
            moveTo(19.08f, 8.62f)
            curveToRelative(-0.76f, -0.32f, -1.64f, 0.04f, -1.96f, 0.81f)
            reflectiveCurveToRelative(0.04f, 1.64f, 0.81f, 1.96f)
            curveToRelative(1.87f, 0.78f, 3.07f, 2.59f, 3.07f, 4.62f)
            curveToRelative(0f, 2.76f, -2.24f, 5f, -5f, 5f)
            horizontalLineToRelative(-8f)
            curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
            curveToRelative(0f, -2.02f, 1.21f, -3.84f, 3.07f, -4.62f)
            curveToRelative(0.77f, -0.32f, 1.12f, -1.2f, 0.81f, -1.96f)
            curveToRelative(-0.32f, -0.77f, -1.2f, -1.12f, -1.96f, -0.81f)
            curveToRelative(-2.99f, 1.25f, -4.92f, 4.15f, -4.92f, 7.38f)
            curveToRelative(0f, 4.41f, 3.59f, 8f, 8f, 8f)
            horizontalLineToRelative(8f)
            curveToRelative(4.41f, 0f, 8f, -3.59f, 8f, -8f)
            curveToRelative(0f, -3.24f, -1.93f, -6.14f, -4.92f, -7.38f)
            close()
        }
    }.also { _LightModeAlt = it }
