package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GaugeCirclePlus: ImageVector? = null

val Icons.Sr.GaugeCirclePlus: ImageVector
    get() = _GaugeCirclePlus ?: UXIcon(name = "GaugeCirclePlus") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18f, 12f)
                curveToRelative(-3.31f, 0f, -6f, 2.69f, -6f, 6f)
                reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
                reflectiveCurveToRelative(6f, -2.69f, 6f, -6f)
                reflectiveCurveToRelative(-2.69f, -6f, -6f, -6f)
                close()
                moveTo(21f, 19f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                close()
                moveTo(10.26f, 16f)
                horizontalLineToRelative(-2.14f)
                curveToRelative(-0.38f, 0f, -0.72f, 0.21f, -0.89f, 0.55f)
                lineToRelative(-0.71f, 1.43f)
                curveToRelative(-0.44f, 0.74f, -1.1f, 1.27f, -1.93f, 1.27f)
                curveToRelative(-0.46f, 0f, -1.14f, -0.23f, -1.71f, -0.84f)
                curveTo(0.56f, 15.88f, -0.44f, 12.4f, 0.18f, 8.97f)
                curveTo(0.87f, 5.15f, 3.63f, 1.9f, 7.3f, 0.62f)
                curveToRelative(3.87f, -1.35f, 8.09f, -0.45f, 11.03f, 2.17f)
                curveToRelative(2.33f, 2.09f, 3.67f, 5.08f, 3.67f, 8.2f)
                curveToRelative(0f, 0.03f, -0.0f, 0.05f, -0.0f, 0.08f)
                curveToRelative(-1.18f, -0.68f, -2.54f, -1.08f, -4.0f, -1.08f)
                curveToRelative(-2.02f, 0f, -3.87f, 0.76f, -5.28f, 2.0f)
                curveToRelative(0.17f, -0.29f, 0.28f, -0.63f, 0.28f, -1.0f)
                curveToRelative(0f, -0.74f, -0.4f, -1.39f, -1f, -1.73f)
                verticalLineToRelative(-4.27f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(4.27f)
                curveToRelative(-0.6f, 0.35f, -1f, 0.99f, -1f, 1.73f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                curveToRelative(0.36f, 0f, 0.7f, -0.1f, 1.0f, -0.28f)
                curveToRelative(-0.81f, 0.93f, -1.42f, 2.04f, -1.73f, 3.28f)
                close()
            }
        }.also { _GaugeCirclePlus = it}
