package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RegionPin: ImageVector? = null

val Icons.Ss.RegionPin: ImageVector
    get() = _RegionPin ?: UXIcon(name = "RegionPin") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15.89f, 1.61f)
                curveToRelative(-1.04f, -1.04f, -2.42f, -1.61f, -3.89f, -1.61f)
                reflectiveCurveToRelative(-2.85f, 0.57f, -3.89f, 1.61f)
                curveToRelative(-1.04f, 1.04f, -1.61f, 2.42f, -1.61f, 3.89f)
                reflectiveCurveToRelative(0.58f, 2.85f, 1.65f, 3.93f)
                lineToRelative(3.85f, 3.57f)
                lineToRelative(3.89f, -3.61f)
                curveToRelative(1.04f, -1.04f, 1.61f, -2.42f, 1.61f, -3.89f)
                reflectiveCurveToRelative(-0.57f, -2.85f, -1.61f, -3.89f)
                close()
                moveTo(12f, 7.01f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(1.74f, 11.63f)
                lineToRelative(0.5f, -3.11f)
                curveToRelative(0.2f, -1.23f, 1.12f, -2.17f, 2.29f, -2.44f)
                curveToRelative(0.14f, 1.79f, 0.91f, 3.46f, 2.26f, 4.81f)
                lineToRelative(5.21f, 4.83f)
                lineToRelative(5.3f, -4.92f)
                curveToRelative(1.28f, -1.28f, 2.03f, -2.94f, 2.17f, -4.72f)
                curveToRelative(1.17f, 0.27f, 2.09f, 1.21f, 2.29f, 2.44f)
                lineToRelative(0.84f, 5.24f)
                lineToRelative(-12.21f, 5.55f)
                lineTo(1.74f, 11.63f)
                close()
                moveTo(22.93f, 15.81f)
                lineToRelative(1.07f, 6.69f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(-8.35f)
                lineToRelative(-3.63f, -3.23f)
                lineToRelative(10.91f, -4.96f)
                close()
                moveTo(12.64f, 24f)
                lineTo(0f, 24f)
                lineToRelative(0.01f, -1.66f)
                lineToRelative(1.35f, -8.37f)
                lineToRelative(11.28f, 10.03f)
                close()
            }
        }.also { _RegionPin = it}
