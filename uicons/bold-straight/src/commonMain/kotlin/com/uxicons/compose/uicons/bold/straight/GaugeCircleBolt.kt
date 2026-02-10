package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GaugeCircleBolt: ImageVector? = null

val Icons.Bs.GaugeCircleBolt: ImageVector
    get() = _GaugeCircleBolt ?: UXIcon(name = "GaugeCircleBolt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(7.57f, 16.33f)
                lineToRelative(1.87f, 2.35f)
                lineToRelative(-3.62f, 2.88f)
                lineToRelative(-0.92f, -0.65f)
                curveTo(1.83f, 18.75f, 0f, 15.24f, 0f, 11.5f)
                curveTo(0f, 5.16f, 5.16f, 0f, 11.5f, 0f)
                reflectiveCurveToRelative(11.5f, 5.16f, 11.5f, 11.5f)
                curveToRelative(0f, 0.09f, -0.01f, 0.17f, -0.01f, 0.25f)
                curveToRelative(-0.89f, -0.71f, -1.94f, -1.24f, -3.09f, -1.52f)
                curveToRelative(-0.61f, -4.09f, -4.14f, -7.24f, -8.4f, -7.24f)
                curveTo(6.81f, 3f, 3f, 6.81f, 3f, 11.5f)
                curveToRelative(0f, 2.39f, 1.02f, 4.66f, 2.76f, 6.26f)
                lineToRelative(1.8f, -1.44f)
                close()
                moveTo(13.5f, 11.5f)
                curveToRelative(0f, -0.5f, -0.19f, -0.96f, -0.5f, -1.31f)
                verticalLineToRelative(-5.19f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(5.19f)
                curveToRelative(-0.31f, 0.35f, -0.5f, 0.81f, -0.5f, 1.31f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                close()
                moveTo(24f, 18f)
                curveToRelative(0f, 3.31f, -2.69f, 6f, -6f, 6f)
                reflectiveCurveToRelative(-6f, -2.69f, -6f, -6f)
                reflectiveCurveToRelative(2.69f, -6f, 6f, -6f)
                reflectiveCurveToRelative(6f, 2.69f, 6f, 6f)
                close()
                moveTo(20.81f, 17.85f)
                curveToRelative(-0.28f, -0.52f, -0.82f, -0.85f, -1.41f, -0.85f)
                horizontalLineToRelative(-2.03f)
                lineToRelative(1.84f, -2.83f)
                lineToRelative(-1.66f, -1.11f)
                lineToRelative(-2.48f, 3.85f)
                curveToRelative(-0.15f, 0.49f, -0.06f, 1.02f, 0.25f, 1.43f)
                curveToRelative(0.3f, 0.41f, 0.79f, 0.65f, 1.3f, 0.65f)
                horizontalLineToRelative(2.04f)
                lineToRelative(-1.96f, 2.82f)
                lineToRelative(1.66f, 1.12f)
                lineToRelative(2.38f, -3.45f)
                curveToRelative(0.33f, -0.49f, 0.36f, -1.12f, 0.08f, -1.65f)
                close()
            }
        }.also { _GaugeCircleBolt = it}
