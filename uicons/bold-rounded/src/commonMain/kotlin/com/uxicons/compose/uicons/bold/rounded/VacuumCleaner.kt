package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _VacuumCleaner: ImageVector? = null

val Icons.Br.VacuumCleaner: ImageVector
    get() = _VacuumCleaner ?: UXIcon(name = "VacuumCleaner") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(16f, 21f)
            curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
            reflectiveCurveToRelative(-3f, -1.35f, -3f, -3f)
            reflectiveCurveToRelative(1.35f, -3f, 3f, -3f)
            reflectiveCurveToRelative(3f, 1.35f, 3f, 3f)
            close()
            moveTo(8.11f, 20f)
            horizontalLineToRelative(-5.11f)
            curveToRelative(-1.66f, 0f, -3f, 1.34f, -3f, 3f)
            curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
            horizontalLineToRelative(8.02f)
            curveToRelative(-0.63f, -0.84f, -1.02f, -1.87f, -1.02f, -3f)
            curveToRelative(0f, -0.34f, 0.04f, -0.68f, 0.11f, -1f)
            close()
            moveTo(24f, 1.5f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-0.42f)
            curveToRelative(-0.39f, 0f, -0.74f, 0.22f, -0.9f, 0.57f)
            lineToRelative(-6.14f, 12.87f)
            curveToRelative(-0.86f, -0.4f, -1.92f, -0.55f, -2.88f, -0.36f)
            lineToRelative(-1.63f, -0.81f)
            curveToRelative(-2.17f, -0.98f, -3.18f, -3.85f, -2.09f, -5.99f)
            lineToRelative(1.79f, -3.73f)
            curveToRelative(1.07f, -2.23f, 3.76f, -3.18f, 5.99f, -2.12f)
            lineToRelative(1.39f, 0.66f)
            lineToRelative(0.86f, -1.81f)
            curveToRelative(0.66f, -1.4f, 2.07f, -2.28f, 3.61f, -2.28f)
            horizontalLineToRelative(0.42f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            close()
            moveTo(16.32f, 6.81f)
            lineTo(14.93f, 6.15f)
            curveToRelative(-0.75f, -0.35f, -1.64f, -0.04f, -2.0f, 0.71f)
            lineToRelative(-1.79f, 3.73f)
            curveToRelative(-0.36f, 0.72f, -0.03f, 1.67f, 0.71f, 2.0f)
            lineToRelative(1.38f, 0.7f)
            lineToRelative(3.08f, -6.48f)
            close()
        }
    }.also { _VacuumCleaner = it }
