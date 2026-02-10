package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CompassWest: ImageVector? = null

val Icons.Tr.CompassWest: ImageVector
    get() = _CompassWest ?: UXIcon(name = "CompassWest") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
                moveTo(12f, 23f)
                curveToRelative(-6.07f, 0f, -11f, -4.93f, -11f, -11f)
                reflectiveCurveTo(5.93f, 1f, 12f, 1f)
                reflectiveCurveToRelative(11f, 4.93f, 11f, 11f)
                reflectiveCurveToRelative(-4.93f, 11f, -11f, 11f)
                close()
                moveTo(16.81f, 7.35f)
                curveToRelative(-0.24f, -0.55f, -0.69f, -0.98f, -1.25f, -1.19f)
                curveToRelative(-0.56f, -0.22f, -1.18f, -0.2f, -1.73f, 0.04f)
                curveToRelative(-1.58f, 0.69f, -6.91f, 3.63f, -7.12f, 3.75f)
                curveToRelative(-0.78f, 0.4f, -1.25f, 1.18f, -1.25f, 2.05f)
                curveToRelative(0.0f, 0.87f, 0.49f, 1.65f, 1.25f, 2.03f)
                curveToRelative(0f, 0f, 7.02f, 3.73f, 7.08f, 3.76f)
                curveToRelative(0.01f, 0.0f, 0.02f, 0.01f, 0.03f, 0.01f)
                curveToRelative(0.3f, 0.14f, 0.61f, 0.2f, 0.92f, 0.2f)
                curveToRelative(0.58f, 0f, 1.16f, -0.23f, 1.6f, -0.66f)
                curveToRelative(0.64f, -0.63f, 0.85f, -1.58f, 0.51f, -2.39f)
                curveToRelative(-0.08f, -0.15f, -1.15f, -2.24f, -1.51f, -2.94f)
                curveToRelative(0.44f, -0.85f, 1.3f, -2.51f, 1.45f, -2.77f)
                curveToRelative(0.28f, -0.59f, 0.29f, -1.28f, 0.03f, -1.88f)
                close()
                moveTo(15.9f, 8.76f)
                curveToRelative(-0.19f, 0.32f, -1.43f, 2.74f, -1.57f, 3.02f)
                curveToRelative(-0.07f, 0.14f, -0.07f, 0.31f, 0f, 0.46f)
                curveToRelative(0f, 0f, 1.53f, 2.98f, 1.6f, 3.14f)
                curveToRelative(0.16f, 0.39f, 0.03f, 0.93f, -0.3f, 1.26f)
                curveToRelative(-0.38f, 0.37f, -0.93f, 0.48f, -1.4f, 0.27f)
                curveToRelative(-0.15f, -0.08f, -1.07f, -0.57f, -7.08f, -3.76f)
                curveToRelative(-0.45f, -0.22f, -0.71f, -0.65f, -0.71f, -1.15f)
                curveToRelative(-0.0f, -0.5f, 0.26f, -0.93f, 0.72f, -1.16f)
                curveToRelative(0.06f, -0.03f, 5.51f, -3.05f, 7.06f, -3.72f)
                curveToRelative(0.31f, -0.14f, 0.66f, -0.15f, 0.97f, -0.03f)
                curveToRelative(0.31f, 0.12f, 0.56f, 0.36f, 0.7f, 0.67f)
                curveToRelative(0.15f, 0.34f, 0.14f, 0.72f, 0.01f, 1.01f)
                close()
            }
        }.also { _CompassWest = it}
