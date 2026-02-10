package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Navigation: ImageVector? = null

val Icons.Tc.Navigation: ImageVector
    get() = _Navigation ?: UXIcon(name = "Navigation") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 1f)
                curveTo(6.89f, 1f, 1.03f, 2.25f, 1.03f, 12f)
                curveToRelative(0f, 7.71f, 3.28f, 11f, 10.97f, 11f)
                curveToRelative(5.11f, 0f, 10.97f, -1.25f, 10.97f, -11f)
                curveToRelative(0f, -7.71f, -3.28f, -11f, -10.97f, -11f)
                close()
                moveTo(12f, 22f)
                curveToRelative(-7.08f, 0f, -9.97f, -2.9f, -9.97f, -10f)
                reflectiveCurveTo(4.92f, 2f, 12f, 2f)
                reflectiveCurveToRelative(9.97f, 2.9f, 9.97f, 10f)
                reflectiveCurveToRelative(-2.89f, 10f, -9.97f, 10f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.73f, 6.91f)
                curveToRelative(-0.24f, -0.04f, -5.95f, -0.87f, -10.96f, 4.15f)
                curveToRelative(-0.38f, 0.39f, -0.38f, 0.73f, -0.3f, 0.94f)
                curveToRelative(0.23f, 0.67f, 1.28f, 0.79f, 2.74f, 0.96f)
                curveToRelative(0.84f, 0.1f, 2.11f, 0.25f, 2.37f, 0.51f)
                curveToRelative(0.27f, 0.27f, 0.42f, 1.54f, 0.52f, 2.39f)
                curveToRelative(0.18f, 1.51f, 0.31f, 2.5f, 0.96f, 2.73f)
                curveToRelative(0.3f, 0.11f, 0.67f, -0.04f, 0.92f, -0.29f)
                curveToRelative(5.01f, -5.02f, 4.18f, -10.74f, 4.14f, -10.98f)
                curveToRelative(-0.03f, -0.21f, -0.2f, -0.38f, -0.42f, -0.42f)
                close()
                moveTo(12.4f, 17.5f)
                curveToRelative(-0.12f, -0.39f, -0.22f, -1.19f, -0.29f, -1.75f)
                curveToRelative(-0.18f, -1.49f, -0.34f, -2.51f, -0.81f, -2.98f)
                curveToRelative(-0.51f, -0.51f, -1.7f, -0.65f, -2.96f, -0.8f)
                curveToRelative(-0.57f, -0.07f, -1.38f, -0.16f, -1.77f, -0.29f)
                curveToRelative(3.9f, -3.85f, 8.32f, -3.91f, 9.63f, -3.82f)
                curveToRelative(0.08f, 1.31f, 0.03f, 5.73f, -3.8f, 9.64f)
                close()
            }
        }.also { _Navigation = it}
