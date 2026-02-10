package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BikeMoving: ImageVector? = null

val Icons.Bs.BikeMoving: ImageVector
    get() = _BikeMoving ?: UXIcon(name = "BikeMoving") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11f, 3f)
                lineTo(2f, 3f)
                lineTo(2f, 0f)
                lineTo(11f, 0f)
                lineTo(11f, 3f)
                close()
                moveTo(9f, 5f)
                lineTo(1f, 5f)
                verticalLineToRelative(3f)
                lineTo(9f, 8f)
                verticalLineToRelative(-3f)
                close()
                moveTo(24f, 19f)
                curveToRelative(0f, 2.76f, -2.24f, 5f, -5f, 5f)
                reflectiveCurveToRelative(-5f, -2.24f, -5f, -5f)
                curveToRelative(0f, -2.04f, 1.23f, -3.79f, 2.98f, -4.57f)
                curveToRelative(-0.03f, -0.79f, -0.12f, -1.55f, -0.26f, -2.28f)
                lineToRelative(-5.43f, 4.33f)
                curveToRelative(0.44f, 0.74f, 0.7f, 1.59f, 0.7f, 2.51f)
                curveToRelative(0f, 2.76f, -2.24f, 5f, -5f, 5f)
                reflectiveCurveToRelative(-5f, -2.24f, -5f, -5f)
                reflectiveCurveToRelative(2.24f, -5f, 5f, -5f)
                curveToRelative(0.73f, 0f, 1.42f, 0.17f, 2.04f, 0.45f)
                lineToRelative(0.99f, -0.79f)
                lineToRelative(-3.65f, -3.65f)
                horizontalLineToRelative(4.24f)
                lineToRelative(1.77f, 1.77f)
                lineToRelative(3.49f, -2.79f)
                curveToRelative(-0.38f, -1.1f, -0.72f, -1.79f, -0.73f, -1.81f)
                lineToRelative(-0.69f, -1.4f)
                reflectiveCurveToRelative(2.97f, -1.33f, 4.18f, -1.66f)
                curveToRelative(1.04f, -0.28f, 2.11f, -0.08f, 2.92f, 0.54f)
                curveToRelative(0.93f, 0.71f, 1.44f, 1.9f, 1.44f, 3.35f)
                horizontalLineToRelative(-3f)
                curveToRelative(0f, -0.57f, -0.14f, -0.88f, -0.26f, -0.98f)
                curveToRelative(-0.09f, -0.07f, -0.24f, -0.04f, -0.32f, -0.02f)
                curveToRelative(-0.3f, 0.08f, -0.62f, 0.19f, -0.94f, 0.3f)
                curveToRelative(0.57f, 1.5f, 1.34f, 4.0f, 1.49f, 6.77f)
                curveToRelative(2.29f, 0.45f, 4.03f, 2.48f, 4.03f, 4.9f)
                close()
                moveTo(9f, 19f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                reflectiveCurveToRelative(-2f, 0.9f, -2f, 2f)
                reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
                reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                close()
                moveTo(21f, 19f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                reflectiveCurveToRelative(-2f, 0.9f, -2f, 2f)
                reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
                reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                close()
                moveTo(5f, 10f)
                lineTo(0f, 10f)
                verticalLineToRelative(3f)
                lineTo(5f, 13f)
                verticalLineToRelative(-3f)
                close()
            }
        }.also { _BikeMoving = it}
