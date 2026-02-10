package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CompassNorth: ImageVector? = null

val Icons.Tr.CompassNorth: ImageVector
    get() = _CompassNorth ?: UXIcon(name = "CompassNorth") {
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
                moveTo(14.05f, 6.69f)
                curveToRelative(-0.39f, -0.77f, -1.17f, -1.25f, -2.04f, -1.25f)
                horizontalLineToRelative(-0.01f)
                curveToRelative(-0.87f, 0.0f, -1.65f, 0.49f, -2.03f, 1.25f)
                curveToRelative(0f, 0f, -3.73f, 7.02f, -3.76f, 7.08f)
                curveToRelative(-0.0f, 0.01f, -0.01f, 0.02f, -0.01f, 0.03f)
                curveToRelative(-0.39f, 0.85f, -0.21f, 1.84f, 0.46f, 2.52f)
                curveToRelative(0.63f, 0.64f, 1.58f, 0.85f, 2.39f, 0.51f)
                curveToRelative(0.15f, -0.08f, 2.24f, -1.15f, 2.94f, -1.51f)
                curveToRelative(0.85f, 0.44f, 2.51f, 1.3f, 2.77f, 1.45f)
                curveToRelative(0.3f, 0.15f, 0.64f, 0.22f, 0.97f, 0.22f)
                curveToRelative(0.31f, 0f, 0.62f, -0.06f, 0.91f, -0.19f)
                curveToRelative(0.55f, -0.24f, 0.98f, -0.69f, 1.19f, -1.25f)
                curveToRelative(0.22f, -0.56f, 0.2f, -1.18f, -0.04f, -1.73f)
                curveToRelative(-0.69f, -1.58f, -3.63f, -6.91f, -3.75f, -7.12f)
                close()
                moveTo(16.91f, 15.19f)
                curveToRelative(-0.12f, 0.31f, -0.36f, 0.56f, -0.67f, 0.7f)
                curveToRelative(-0.34f, 0.15f, -0.72f, 0.14f, -1.01f, 0.01f)
                curveToRelative(-0.32f, -0.19f, -2.74f, -1.43f, -3.02f, -1.57f)
                curveToRelative(-0.07f, -0.04f, -0.15f, -0.06f, -0.23f, -0.06f)
                reflectiveCurveToRelative(-0.16f, 0.02f, -0.23f, 0.06f)
                curveToRelative(0f, 0f, -2.98f, 1.53f, -3.14f, 1.6f)
                curveToRelative(-0.39f, 0.16f, -0.93f, 0.03f, -1.26f, -0.3f)
                curveToRelative(-0.37f, -0.38f, -0.48f, -0.93f, -0.27f, -1.4f)
                curveToRelative(0.08f, -0.15f, 0.57f, -1.07f, 3.76f, -7.08f)
                curveToRelative(0.22f, -0.45f, 0.65f, -0.71f, 1.15f, -0.71f)
                curveToRelative(0.47f, 0f, 0.93f, 0.26f, 1.16f, 0.72f)
                curveToRelative(0.03f, 0.06f, 3.05f, 5.51f, 3.72f, 7.06f)
                curveToRelative(0.14f, 0.31f, 0.15f, 0.66f, 0.03f, 0.97f)
                close()
            }
        }.also { _CompassNorth = it}
