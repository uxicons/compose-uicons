package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LimitSpeedometer: ImageVector? = null

val Icons.Sr.LimitSpeedometer: ImageVector
    get() = _LimitSpeedometer ?: UXIcon(name = "LimitSpeedometer") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15.65f, 13.77f)
                lineToRelative(-4.6f, 7.88f)
                curveToRelative(-0.61f, 1.04f, 0.14f, 2.34f, 1.35f, 2.34f)
                horizontalLineToRelative(9.2f)
                curveToRelative(1.2f, 0f, 1.95f, -1.3f, 1.35f, -2.34f)
                lineToRelative(-4.6f, -7.88f)
                curveToRelative(-0.6f, -1.03f, -2.09f, -1.03f, -2.69f, 0f)
                close()
                moveTo(17f, 23f)
                horizontalLineToRelative(0f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                horizontalLineToRelative(0f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(0f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                horizontalLineToRelative(0f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                close()
                moveTo(16f, 19f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(0f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(0f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                close()
                moveTo(13.93f, 12.77f)
                curveToRelative(0.65f, -1.11f, 1.79f, -1.77f, 3.07f, -1.77f)
                reflectiveCurveToRelative(2.43f, 0.66f, 3.07f, 1.77f)
                lineToRelative(1.21f, 2.08f)
                curveToRelative(0.05f, -0.11f, 0.1f, -0.22f, 0.15f, -0.34f)
                curveToRelative(0.44f, -1.1f, 0.57f, -2.3f, 0.57f, -3.5f)
                curveToRelative(0f, -3.13f, -1.34f, -6.12f, -3.67f, -8.2f)
                curveTo(16.0f, 0.71f, 12.86f, -0.28f, 9.73f, 0.07f)
                curveTo(4.77f, 0.63f, 0.72f, 4.62f, 0.09f, 9.57f)
                curveToRelative(-0.44f, 3.44f, 0.72f, 6.81f, 3.17f, 9.24f)
                curveToRelative(0.53f, 0.52f, 1.22f, 0.78f, 1.92f, 0.78f)
                curveToRelative(0.65f, 0f, 1.31f, -0.23f, 1.84f, -0.69f)
                lineToRelative(1.59f, -1.48f)
                horizontalLineToRelative(2.6f)
                lineToRelative(2.71f, -4.65f)
                close()
                moveTo(9f, 11f)
                curveToRelative(0f, -0.18f, 0.03f, -0.35f, 0.07f, -0.51f)
                lineToRelative(-3.78f, -3.78f)
                curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0f, -1.41f)
                reflectiveCurveToRelative(1.02f, -0.39f, 1.41f, 0f)
                lineToRelative(3.78f, 3.78f)
                curveToRelative(0.16f, -0.04f, 0.33f, -0.07f, 0.51f, -0.07f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                close()
            }
        }.also { _LimitSpeedometer = it}
