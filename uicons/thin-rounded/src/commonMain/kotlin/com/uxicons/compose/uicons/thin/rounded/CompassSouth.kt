package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CompassSouth: ImageVector? = null

val Icons.Tr.CompassSouth: ImageVector
    get() = _CompassSouth ?: UXIcon(name = "CompassSouth") {
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
                moveTo(16.65f, 7.19f)
                curveToRelative(-0.6f, -0.27f, -1.29f, -0.26f, -1.92f, 0.05f)
                curveToRelative(-0.23f, 0.14f, -1.88f, 0.99f, -2.74f, 1.43f)
                curveToRelative(-0.7f, -0.36f, -2.79f, -1.43f, -2.98f, -1.52f)
                curveToRelative(-0.78f, -0.32f, -1.73f, -0.11f, -2.36f, 0.53f)
                curveToRelative(-0.67f, 0.68f, -0.85f, 1.67f, -0.46f, 2.52f)
                curveToRelative(0.01f, 0.01f, 0.01f, 0.02f, 0.01f, 0.03f)
                curveToRelative(0.03f, 0.06f, 3.76f, 7.07f, 3.76f, 7.07f)
                curveToRelative(0.39f, 0.78f, 1.17f, 1.26f, 2.04f, 1.27f)
                horizontalLineToRelative(0.01f)
                curveToRelative(0.86f, 0f, 1.65f, -0.48f, 2.03f, -1.24f)
                curveToRelative(0.12f, -0.23f, 3.07f, -5.56f, 3.76f, -7.14f)
                curveToRelative(0.25f, -0.56f, 0.26f, -1.17f, 0.04f, -1.74f)
                curveToRelative(-0.22f, -0.56f, -0.64f, -1.01f, -1.19f, -1.25f)
                close()
                moveTo(16.89f, 9.79f)
                curveToRelative(-0.67f, 1.54f, -3.69f, 7.0f, -3.72f, 7.07f)
                curveToRelative(-0.23f, 0.44f, -0.65f, 0.71f, -1.15f, 0.71f)
                horizontalLineToRelative(-0.01f)
                curveToRelative(-0.5f, -0.0f, -0.93f, -0.27f, -1.15f, -0.72f)
                curveToRelative(-3.19f, -6f, -3.67f, -6.92f, -3.75f, -7.07f)
                curveToRelative(-0.21f, -0.47f, -0.1f, -1.01f, 0.27f, -1.39f)
                curveToRelative(0.34f, -0.34f, 0.87f, -0.47f, 1.23f, -0.32f)
                curveToRelative(0.19f, 0.1f, 3.17f, 1.62f, 3.17f, 1.62f)
                curveToRelative(0.14f, 0.07f, 0.31f, 0.07f, 0.46f, 0f)
                curveToRelative(0.27f, -0.14f, 2.69f, -1.38f, 2.98f, -1.55f)
                curveToRelative(0.33f, -0.16f, 0.71f, -0.16f, 1.04f, -0.01f)
                curveToRelative(0.31f, 0.14f, 0.54f, 0.38f, 0.67f, 0.7f)
                curveToRelative(0.12f, 0.32f, 0.11f, 0.66f, -0.03f, 0.98f)
                close()
            }
        }.also { _CompassSouth = it}
