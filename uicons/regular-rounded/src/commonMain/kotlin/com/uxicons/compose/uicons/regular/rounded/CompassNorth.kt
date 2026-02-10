package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CompassNorth: ImageVector? = null

val Icons.Rr.CompassNorth: ImageVector
    get() = _CompassNorth ?: UXIcon(name = "CompassNorth") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
                moveTo(12f, 22f)
                curveToRelative(-5.51f, 0f, -10f, -4.49f, -10f, -10f)
                reflectiveCurveTo(6.49f, 2f, 12f, 2f)
                reflectiveCurveToRelative(10f, 4.49f, 10f, 10f)
                reflectiveCurveToRelative(-4.49f, 10f, -10f, 10f)
                close()
                moveTo(14.34f, 6.94f)
                curveToRelative(-0.45f, -0.88f, -1.35f, -1.44f, -2.34f, -1.44f)
                curveToRelative(-0.99f, 0.0f, -1.87f, 0.57f, -2.31f, 1.44f)
                curveToRelative(0f, 0f, -3.4f, 6.39f, -3.4f, 6.41f)
                curveToRelative(-0.44f, 0.97f, -0.24f, 2.1f, 0.53f, 2.88f)
                curveToRelative(0.72f, 0.73f, 1.82f, 0.97f, 2.79f, 0.56f)
                curveToRelative(0.12f, -0.06f, 1.62f, -0.83f, 2.4f, -1.23f)
                curveToRelative(0.93f, 0.48f, 2.04f, 1.05f, 2.25f, 1.18f)
                curveToRelative(0.35f, 0.17f, 0.73f, 0.25f, 1.1f, 0.25f)
                curveToRelative(0.35f, 0f, 0.71f, -0.07f, 1.04f, -0.22f)
                curveToRelative(0.63f, -0.28f, 1.12f, -0.79f, 1.36f, -1.43f)
                curveToRelative(0.25f, -0.65f, 0.23f, -1.35f, -0.05f, -1.98f)
                curveToRelative(-0.63f, -1.45f, -3.29f, -6.26f, -3.38f, -6.43f)
                close()
                moveTo(15.9f, 14.63f)
                curveToRelative(-0.06f, 0.14f, -0.17f, 0.26f, -0.31f, 0.32f)
                curveToRelative(-0.15f, 0.07f, -0.33f, 0.07f, -0.4f, 0.04f)
                curveToRelative(-0.3f, -0.17f, -2.33f, -1.22f, -2.74f, -1.43f)
                curveToRelative(-0.14f, -0.07f, -0.3f, -0.11f, -0.46f, -0.11f)
                curveToRelative(-0.16f, 0f, -0.31f, 0.04f, -0.46f, 0.11f)
                curveToRelative(0f, 0f, -2.68f, 1.37f, -2.78f, 1.42f)
                curveToRelative(-0.11f, 0.04f, -0.35f, 0.03f, -0.53f, -0.15f)
                curveToRelative(-0.18f, -0.18f, -0.23f, -0.44f, -0.13f, -0.65f)
                curveToRelative(0.18f, -0.34f, 0.84f, -1.57f, 3.36f, -6.33f)
                curveToRelative(0.15f, -0.3f, 0.43f, -0.34f, 0.54f, -0.34f)
                curveToRelative(0.14f, 0.02f, 0.39f, 0.03f, 0.56f, 0.36f)
                curveToRelative(0.03f, 0.05f, 2.73f, 4.93f, 3.32f, 6.29f)
                curveToRelative(0.06f, 0.15f, 0.07f, 0.31f, 0.01f, 0.46f)
                close()
            }
        }.also { _CompassNorth = it}
