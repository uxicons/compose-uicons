package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ThermometerQuarter: ImageVector? = null

val Icons.Ts.ThermometerQuarter: ImageVector
    get() = _ThermometerQuarter ?: UXIcon(name = "ThermometerQuarter") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12.5f, 15.05f)
                verticalLineToRelative(-4.05f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(4.05f)
                curveToRelative(-1.14f, 0.23f, -2f, 1.24f, -2f, 2.45f)
                curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.12f, 2.5f, -2.5f)
                curveToRelative(0f, -1.21f, -0.86f, -2.22f, -2f, -2.45f)
                close()
                moveTo(12f, 19f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(16.5f, 12.82f)
                lineTo(16.5f, 4.5f)
                curveToRelative(0f, -2.48f, -2.02f, -4.5f, -4.5f, -4.5f)
                reflectiveCurveToRelative(-4.5f, 2.02f, -4.5f, 4.5f)
                verticalLineToRelative(8.32f)
                curveToRelative(-1.63f, 1.56f, -2.32f, 3.81f, -1.86f, 6.05f)
                curveToRelative(0.51f, 2.47f, 2.51f, 4.48f, 4.97f, 4.99f)
                curveToRelative(0.46f, 0.1f, 0.92f, 0.14f, 1.38f, 0.14f)
                curveToRelative(1.5f, 0f, 2.94f, -0.5f, 4.11f, -1.45f)
                curveToRelative(1.52f, -1.24f, 2.4f, -3.08f, 2.4f, -5.04f)
                curveToRelative(0f, -1.76f, -0.73f, -3.46f, -2f, -4.68f)
                close()
                moveTo(15.47f, 21.77f)
                curveToRelative(-1.29f, 1.05f, -2.99f, 1.45f, -4.65f, 1.11f)
                curveToRelative(-2.08f, -0.43f, -3.77f, -2.12f, -4.2f, -4.21f)
                curveToRelative(-0.4f, -1.97f, 0.24f, -3.93f, 1.71f, -5.26f)
                lineToRelative(0.17f, -0.15f)
                lineTo(8.5f, 4.5f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                reflectiveCurveToRelative(3.5f, 1.57f, 3.5f, 3.5f)
                verticalLineToRelative(8.76f)
                lineToRelative(0.17f, 0.15f)
                curveToRelative(1.17f, 1.05f, 1.83f, 2.54f, 1.83f, 4.09f)
                curveToRelative(0f, 1.66f, -0.74f, 3.22f, -2.03f, 4.27f)
                close()
            }
        }.also { _ThermometerQuarter = it}
