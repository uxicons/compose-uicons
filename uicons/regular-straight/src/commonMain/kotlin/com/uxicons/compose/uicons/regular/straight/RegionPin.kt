package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RegionPin: ImageVector? = null

val Icons.Rs.RegionPin: ImageVector
    get() = _RegionPin ?: UXIcon(name = "RegionPin") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(10.5f, 5.51f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                close()
                moveTo(8.15f, 9.43f)
                curveToRelative(-1.07f, -1.07f, -1.65f, -2.46f, -1.65f, -3.93f)
                reflectiveCurveToRelative(0.57f, -2.85f, 1.61f, -3.89f)
                curveToRelative(1.04f, -1.04f, 2.42f, -1.61f, 3.89f, -1.61f)
                reflectiveCurveToRelative(2.85f, 0.57f, 3.89f, 1.61f)
                curveToRelative(1.04f, 1.04f, 1.61f, 2.42f, 1.61f, 3.89f)
                reflectiveCurveToRelative(-0.57f, 2.85f, -1.61f, 3.89f)
                lineToRelative(-3.89f, 3.61f)
                lineToRelative(-3.85f, -3.57f)
                close()
                moveTo(8.5f, 5.5f)
                curveToRelative(0f, 0.94f, 0.37f, 1.82f, 1.04f, 2.48f)
                lineToRelative(2.46f, 2.28f)
                lineToRelative(2.5f, -2.32f)
                curveToRelative(0.63f, -0.64f, 1.0f, -1.51f, 1.0f, -2.45f)
                reflectiveCurveToRelative(-0.36f, -1.81f, -1.02f, -2.48f)
                horizontalLineToRelative(0f)
                curveToRelative(-0.66f, -0.66f, -1.54f, -1.02f, -2.47f, -1.02f)
                reflectiveCurveToRelative(-1.81f, 0.36f, -2.47f, 1.02f)
                curveToRelative(-0.66f, 0.66f, -1.03f, 1.54f, -1.03f, 2.48f)
                close()
                moveTo(24f, 22.5f)
                verticalLineToRelative(1.5f)
                lineTo(0f, 24f)
                lineToRelative(0.01f, -1.66f)
                lineToRelative(2.23f, -13.82f)
                curveToRelative(0.2f, -1.23f, 1.12f, -2.17f, 2.29f, -2.44f)
                curveToRelative(0.05f, 0.67f, 0.2f, 1.33f, 0.43f, 1.96f)
                curveToRelative(-0.38f, 0.1f, -0.68f, 0.4f, -0.74f, 0.8f)
                lineToRelative(-0.27f, 1.66f)
                lineToRelative(6.44f, 5.72f)
                lineToRelative(9.87f, -4.49f)
                lineToRelative(-0.47f, -2.9f)
                curveToRelative(-0.06f, -0.4f, -0.36f, -0.7f, -0.73f, -0.8f)
                curveToRelative(0.23f, -0.63f, 0.37f, -1.28f, 0.42f, -1.96f)
                curveToRelative(1.17f, 0.27f, 2.09f, 1.21f, 2.29f, 2.44f)
                lineToRelative(2.24f, 13.98f)
                close()
                moveTo(2.09f, 22f)
                horizontalLineToRelative(11.78f)
                lineTo(3.57f, 12.85f)
                lineToRelative(-1.48f, 9.15f)
                close()
                moveTo(21.91f, 22f)
                lineToRelative(-1.32f, -8.21f)
                lineToRelative(-8.56f, 3.89f)
                lineToRelative(4.86f, 4.32f)
                horizontalLineToRelative(5.03f)
                close()
            }
        }.also { _RegionPin = it}
