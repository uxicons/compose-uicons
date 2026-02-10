package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RegionPin: ImageVector? = null

val Icons.Bs.RegionPin: ImageVector
    get() = _RegionPin ?: UXIcon(name = "RegionPin") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 11.99f)
                lineToRelative(3.54f, -3.46f)
                curveToRelative(0.94f, -0.94f, 1.47f, -2.2f, 1.47f, -3.54f)
                reflectiveCurveToRelative(-0.52f, -2.59f, -1.46f, -3.54f)
                reflectiveCurveToRelative(-2.2f, -1.47f, -3.54f, -1.47f)
                reflectiveCurveToRelative(-2.59f, 0.52f, -3.54f, 1.47f)
                curveToRelative(-0.94f, 0.94f, -1.46f, 2.2f, -1.46f, 3.54f)
                reflectiveCurveToRelative(0.52f, 2.59f, 1.48f, 3.55f)
                lineToRelative(3.52f, 3.45f)
                close()
                moveTo(10.59f, 3.59f)
                curveToRelative(0.38f, -0.38f, 0.88f, -0.59f, 1.42f, -0.59f)
                reflectiveCurveToRelative(1.04f, 0.21f, 1.41f, 0.59f)
                horizontalLineToRelative(0f)
                curveToRelative(0.38f, 0.38f, 0.58f, 0.88f, 0.58f, 1.41f)
                reflectiveCurveToRelative(-0.21f, 1.04f, -0.57f, 1.4f)
                lineToRelative(-1.43f, 1.4f)
                lineToRelative(-1.42f, -1.38f)
                curveToRelative(-0.38f, -0.38f, -0.58f, -0.88f, -0.58f, -1.41f)
                reflectiveCurveToRelative(0.21f, -1.04f, 0.58f, -1.41f)
                close()
                moveTo(22.22f, 9.02f)
                curveToRelative(-0.23f, -1.67f, -1.64f, -2.93f, -3.31f, -3.01f)
                curveToRelative(-0.16f, 1.08f, -0.56f, 2.1f, -1.18f, 2.98f)
                horizontalLineToRelative(1.02f)
                curveToRelative(0.25f, 0f, 0.46f, 0.19f, 0.5f, 0.43f)
                lineToRelative(0.29f, 2.08f)
                lineToRelative(-9.04f, 4.11f)
                lineToRelative(-5.88f, -5.21f)
                lineToRelative(0.14f, -0.99f)
                curveToRelative(0.03f, -0.25f, 0.25f, -0.43f, 0.5f, -0.43f)
                horizontalLineToRelative(1.02f)
                curveToRelative(-0.63f, -0.9f, -1.03f, -1.91f, -1.18f, -2.98f)
                curveToRelative(-1.67f, 0.08f, -3.08f, 1.34f, -3.31f, 3.01f)
                lineTo(0.01f, 21.8f)
                lineToRelative(-0.01f, 2.21f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(-2f)
                lineToRelative(-1.78f, -12.98f)
                close()
                moveTo(4.12f, 13.99f)
                lineToRelative(7.92f, 7.01f)
                lineTo(3.15f, 21f)
                lineToRelative(0.97f, -7.01f)
                close()
                moveTo(16.57f, 21f)
                lineToRelative(-3.61f, -3.2f)
                lineToRelative(7.01f, -3.19f)
                lineToRelative(0.88f, 6.38f)
                horizontalLineToRelative(-4.28f)
                close()
            }
        }.also { _RegionPin = it}
