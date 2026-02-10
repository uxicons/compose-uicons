package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GaugeCircleBolt: ImageVector? = null

val Icons.Rr.GaugeCircleBolt: ImageVector
    get() = _GaugeCircleBolt ?: UXIcon(name = "GaugeCircleBolt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13f, 11f)
                curveToRelative(0f, -0.74f, -0.41f, -1.38f, -1f, -1.72f)
                verticalLineToRelative(-4.28f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(4.28f)
                curveToRelative(-0.59f, 0.35f, -1f, 0.98f, -1f, 1.72f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18f, 12.0f)
                curveToRelative(-3.31f, 0f, -6f, 2.69f, -6f, 6f)
                reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
                reflectiveCurveToRelative(6f, -2.69f, 6f, -6f)
                reflectiveCurveToRelative(-2.69f, -6f, -6f, -6f)
                close()
                moveTo(20.73f, 19.49f)
                lineToRelative(-1.82f, 2.64f)
                curveToRelative(-0.31f, 0.45f, -0.93f, 0.57f, -1.38f, 0.26f)
                curveToRelative(-0.46f, -0.31f, -0.58f, -0.94f, -0.26f, -1.4f)
                lineToRelative(1.39f, -1.99f)
                horizontalLineToRelative(-2.04f)
                curveToRelative(-0.51f, 0f, -0.99f, -0.24f, -1.3f, -0.65f)
                curveToRelative(-0.3f, -0.41f, -0.4f, -0.94f, -0.25f, -1.43f)
                lineToRelative(1.93f, -3.01f)
                curveToRelative(0.3f, -0.47f, 0.93f, -0.59f, 1.39f, -0.28f)
                curveToRelative(0.46f, 0.3f, 0.58f, 0.92f, 0.28f, 1.38f)
                lineToRelative(-1.3f, 2.0f)
                horizontalLineToRelative(2.03f)
                curveToRelative(0.59f, 0f, 1.13f, 0.32f, 1.41f, 0.85f)
                reflectiveCurveToRelative(0.25f, 1.15f, -0.08f, 1.65f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(6.71f, 16.61f)
                lineToRelative(-0.93f, 0.81f)
                curveToRelative(-0.32f, 0.28f, -0.81f, 0.27f, -1.11f, -0.03f)
                curveToRelative(-2.0f, -1.99f, -2.95f, -4.74f, -2.59f, -7.57f)
                curveToRelative(0.51f, -4.04f, 3.83f, -7.3f, 7.88f, -7.76f)
                curveToRelative(5.1f, -0.56f, 9.5f, 3.07f, 10.0f, 8.02f)
                curveToRelative(0.06f, 0.55f, 0.54f, 0.95f, 1.1f, 0.89f)
                curveToRelative(0.55f, -0.06f, 0.95f, -0.55f, 0.89f, -1.1f)
                curveTo(21.33f, 3.83f, 15.9f, -0.62f, 9.73f, 0.07f)
                curveTo(4.77f, 0.63f, 0.72f, 4.62f, 0.09f, 9.57f)
                curveToRelative(-0.44f, 3.44f, 0.72f, 6.81f, 3.17f, 9.24f)
                curveToRelative(0.54f, 0.54f, 1.26f, 0.81f, 1.98f, 0.81f)
                curveToRelative(0.66f, 0f, 1.32f, -0.23f, 1.85f, -0.69f)
                lineToRelative(0.93f, -0.81f)
                curveToRelative(0.42f, -0.36f, 0.46f, -0.99f, 0.1f, -1.41f)
                curveToRelative(-0.36f, -0.42f, -0.99f, -0.46f, -1.41f, -0.1f)
                close()
            }
        }.also { _GaugeCircleBolt = it}
