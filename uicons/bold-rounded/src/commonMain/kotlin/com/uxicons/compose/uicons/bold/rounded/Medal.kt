package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Medal: ImageVector? = null

val Icons.Br.Medal: ImageVector
    get() = _Medal ?: UXIcon(name = "Medal") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(16.16f, 14.41f)
            curveToRelative(0f, 0.36f, -0.25f, 0.67f, -0.54f, 0.82f)
            lineToRelative(-1.49f, 0.83f)
            lineToRelative(0.66f, 1.8f)
            curveToRelative(0.13f, 0.35f, 0.01f, 0.74f, -0.28f, 0.96f)
            horizontalLineToRelative(0f)
            curveToRelative(-0.3f, 0.23f, -0.72f, 0.23f, -1.02f, -0.01f)
            lineToRelative(-1.48f, -1.15f)
            lineToRelative(-1.48f, 1.15f)
            curveToRelative(-0.3f, 0.23f, -0.72f, 0.23f, -1.02f, 0.01f)
            horizontalLineToRelative(0f)
            curveToRelative(-0.3f, -0.22f, -0.41f, -0.61f, -0.28f, -0.96f)
            lineToRelative(0.66f, -1.8f)
            lineToRelative(-1.49f, -0.83f)
            curveToRelative(-0.29f, -0.16f, -0.54f, -0.46f, -0.54f, -0.82f)
            curveToRelative(0f, -0.31f, 0.27f, -0.64f, 0.7f, -0.64f)
            horizontalLineToRelative(2.14f)
            lineToRelative(0.57f, -2.17f)
            curveToRelative(0.09f, -0.34f, 0.4f, -0.58f, 0.76f, -0.59f)
            curveToRelative(0.35f, 0.01f, 0.67f, 0.25f, 0.76f, 0.59f)
            lineToRelative(0.57f, 2.17f)
            horizontalLineToRelative(2.14f)
            curveToRelative(0.43f, 0f, 0.7f, 0.34f, 0.7f, 0.64f)
            close()
            moveTo(22.24f, 3.59f)
            lineToRelative(-3.0f, 6.07f)
            curveToRelative(1.11f, 1.5f, 1.76f, 3.34f, 1.76f, 5.34f)
            curveToRelative(0f, 4.96f, -4.04f, 9f, -9f, 9f)
            reflectiveCurveTo(3f, 19.96f, 3f, 15f)
            curveToRelative(0f, -1.99f, 0.65f, -3.83f, 1.75f, -5.33f)
            lineTo(1.75f, 3.59f)
            curveToRelative(-0.38f, -0.78f, -0.34f, -1.68f, 0.12f, -2.42f)
            curveToRelative(0.46f, -0.74f, 1.25f, -1.18f, 2.11f, -1.18f)
            horizontalLineToRelative(2.48f)
            curveToRelative(1.73f, 0f, 3.27f, 0.96f, 4.04f, 2.51f)
            lineToRelative(1.5f, 3.03f)
            lineToRelative(1.5f, -3.04f)
            curveToRelative(0.76f, -1.54f, 2.31f, -2.5f, 4.03f, -2.5f)
            horizontalLineToRelative(2.48f)
            curveToRelative(0.87f, 0f, 1.66f, 0.44f, 2.12f, 1.18f)
            curveToRelative(0.46f, 0.74f, 0.5f, 1.64f, 0.12f, 2.42f)
            close()
            moveTo(16.18f, 3.83f)
            lineToRelative(-1.3f, 2.64f)
            curveToRelative(0.74f, 0.25f, 1.44f, 0.6f, 2.08f, 1.02f)
            lineToRelative(2.22f, -4.5f)
            horizontalLineToRelative(-1.66f)
            curveToRelative(-0.57f, 0f, -1.09f, 0.32f, -1.34f, 0.83f)
            close()
            moveTo(4.8f, 3.0f)
            lineToRelative(2.22f, 4.5f)
            curveToRelative(0.64f, -0.43f, 1.34f, -0.78f, 2.08f, -1.03f)
            lineToRelative(-1.3f, -2.64f)
            curveToRelative(-0.25f, -0.52f, -0.77f, -0.84f, -1.34f, -0.84f)
            horizontalLineToRelative(-1.66f)
            close()
            moveTo(18f, 15.0f)
            curveToRelative(0f, -3.31f, -2.69f, -6f, -6f, -6f)
            reflectiveCurveToRelative(-6f, 2.69f, -6f, 6f)
            reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
            reflectiveCurveToRelative(6f, -2.69f, 6f, -6f)
            close()
        }
    }.also { _Medal = it }
