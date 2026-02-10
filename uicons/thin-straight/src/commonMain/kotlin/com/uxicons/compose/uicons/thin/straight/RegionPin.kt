package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RegionPin: ImageVector? = null

val Icons.Ts.RegionPin: ImageVector
    get() = _RegionPin ?: UXIcon(name = "RegionPin") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 7.01f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                reflectiveCurveToRelative(-0.9f, -2f, -2f, -2f)
                reflectiveCurveToRelative(-2f, 0.9f, -2f, 2f)
                reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
                close()
                moveTo(12f, 4.01f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                close()
                moveTo(12f, 11.82f)
                lineToRelative(3.54f, -3.28f)
                curveToRelative(0.94f, -0.94f, 1.47f, -2.2f, 1.47f, -3.54f)
                reflectiveCurveToRelative(-0.52f, -2.59f, -1.47f, -3.54f)
                curveToRelative(-0.94f, -0.94f, -2.2f, -1.47f, -3.54f, -1.47f)
                reflectiveCurveToRelative(-2.59f, 0.52f, -3.54f, 1.47f)
                curveToRelative(-0.94f, 0.94f, -1.47f, 2.2f, -1.47f, 3.54f)
                reflectiveCurveToRelative(0.52f, 2.6f, 1.49f, 3.56f)
                lineToRelative(3.51f, 3.26f)
                close()
                moveTo(9.17f, 2.17f)
                curveToRelative(0.76f, -0.76f, 1.76f, -1.17f, 2.83f, -1.17f)
                reflectiveCurveToRelative(2.07f, 0.42f, 2.83f, 1.17f)
                curveToRelative(0.76f, 0.76f, 1.17f, 1.76f, 1.17f, 2.83f)
                reflectiveCurveToRelative(-0.42f, 2.07f, -1.16f, 2.81f)
                lineToRelative(-2.84f, 2.64f)
                lineToRelative(-2.82f, -2.61f)
                curveToRelative(-0.76f, -0.76f, -1.18f, -1.77f, -1.18f, -2.84f)
                reflectiveCurveToRelative(0.42f, -2.07f, 1.17f, -2.83f)
                close()
                moveTo(23.99f, 22.91f)
                lineToRelative(-2.7f, -14.86f)
                curveToRelative(-0.21f, -1.16f, -1.2f, -2.0f, -2.37f, -2.04f)
                curveToRelative(-0.05f, 0.34f, -0.11f, 0.67f, -0.21f, 0.99f)
                horizontalLineToRelative(0.12f)
                curveToRelative(0.72f, 0f, 1.35f, 0.52f, 1.48f, 1.23f)
                lineToRelative(0.72f, 3.93f)
                lineToRelative(-10.72f, 4.66f)
                lineToRelative(-7.03f, -6.3f)
                lineToRelative(0.42f, -2.29f)
                curveToRelative(0.13f, -0.71f, 0.75f, -1.23f, 1.48f, -1.23f)
                horizontalLineToRelative(0.13f)
                curveToRelative(-0.1f, -0.32f, -0.17f, -0.66f, -0.21f, -0.99f)
                curveToRelative(-1.17f, 0.04f, -2.16f, 0.89f, -2.37f, 2.04f)
                lineTo(0f, 23f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(24f)
                lineToRelative(-0.01f, -1.09f)
                close()
                moveTo(3.07f, 11.68f)
                lineToRelative(12.63f, 11.32f)
                lineTo(1.01f, 23f)
                lineToRelative(2.06f, -11.32f)
                close()
                moveTo(17.19f, 23f)
                lineToRelative(-6.07f, -5.44f)
                lineToRelative(10.09f, -4.38f)
                lineToRelative(1.79f, 9.83f)
                horizontalLineToRelative(-5.81f)
                close()
            }
        }.also { _RegionPin = it}
