package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LimitSpeedometer: ImageVector? = null

val Icons.Rr.LimitSpeedometer: ImageVector
    get() = _LimitSpeedometer ?: UXIcon(name = "LimitSpeedometer") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 14f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                curveToRelative(0f, -0.18f, 0.03f, -0.35f, 0.07f, -0.51f)
                lineToRelative(-3.78f, -3.78f)
                curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0f, -1.41f)
                reflectiveCurveToRelative(1.02f, -0.39f, 1.41f, 0f)
                lineToRelative(3.78f, 3.78f)
                curveToRelative(0.16f, -0.04f, 0.33f, -0.07f, 0.51f, -0.07f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
                close()
                moveTo(20.0f, 3.05f)
                curveTo(17.45f, 0.78f, 14.03f, -0.31f, 10.62f, 0.08f)
                curveTo(5.21f, 0.69f, 0.79f, 5.04f, 0.1f, 10.44f)
                curveToRelative(-0.48f, 3.76f, 0.78f, 7.43f, 3.46f, 10.08f)
                curveToRelative(0.58f, 0.57f, 1.34f, 0.86f, 2.1f, 0.86f)
                curveToRelative(0.7f, 0f, 1.4f, -0.24f, 1.97f, -0.73f)
                lineToRelative(1.03f, -0.89f)
                curveToRelative(0.42f, -0.36f, 0.46f, -0.99f, 0.1f, -1.41f)
                reflectiveCurveToRelative(-0.99f, -0.46f, -1.41f, -0.1f)
                lineToRelative(-1.03f, 0.89f)
                curveToRelative(-0.4f, 0.34f, -0.99f, 0.32f, -1.36f, -0.04f)
                curveToRelative(-2.23f, -2.21f, -3.28f, -5.27f, -2.88f, -8.4f)
                curveTo(2.65f, 6.2f, 6.34f, 2.57f, 10.84f, 2.06f)
                curveToRelative(2.9f, -0.33f, 5.67f, 0.56f, 7.82f, 2.48f)
                curveToRelative(2.12f, 1.9f, 3.34f, 4.61f, 3.34f, 7.46f)
                curveToRelative(0f, 1.09f, -0.17f, 2.16f, -0.52f, 3.18f)
                curveToRelative(-0.17f, 0.52f, 0.11f, 1.09f, 0.63f, 1.27f)
                curveToRelative(0.52f, 0.17f, 1.09f, -0.1f, 1.27f, -0.63f)
                curveToRelative(0.41f, -1.23f, 0.62f, -2.51f, 0.62f, -3.82f)
                curveToRelative(0f, -3.41f, -1.46f, -6.67f, -4.0f, -8.95f)
                close()
                moveTo(22.95f, 21.66f)
                curveToRelative(0.61f, 1.04f, -0.14f, 2.34f, -1.35f, 2.34f)
                horizontalLineToRelative(-9.2f)
                curveToRelative(-1.2f, 0f, -1.95f, -1.3f, -1.35f, -2.34f)
                lineToRelative(4.6f, -7.88f)
                curveToRelative(0.6f, -1.03f, 2.09f, -1.03f, 2.69f, 0f)
                lineToRelative(4.6f, 7.88f)
                close()
                moveTo(18f, 22f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                close()
                moveTo(18f, 17f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-2f)
                close()
            }
        }.also { _LimitSpeedometer = it}
