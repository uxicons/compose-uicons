package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RoadMapPin: ImageVector? = null

val Icons.Bs.RoadMapPin: ImageVector
    get() = _RoadMapPin ?: UXIcon(name = "RoadMapPin") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10.49f, 13f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-4f)
                close()
                moveTo(8.48f, 8.55f)
                curveToRelative(-0.96f, -0.96f, -1.48f, -2.21f, -1.48f, -3.55f)
                reflectiveCurveToRelative(0.52f, -2.59f, 1.47f, -3.54f)
                curveToRelative(0.94f, -0.94f, 2.2f, -1.46f, 3.54f, -1.46f)
                reflectiveCurveToRelative(2.59f, 0.52f, 3.54f, 1.46f)
                curveToRelative(0.94f, 0.94f, 1.47f, 2.2f, 1.47f, 3.54f)
                reflectiveCurveToRelative(-0.52f, 2.59f, -1.47f, 3.54f)
                lineToRelative(-3.54f, 3.46f)
                lineToRelative(-3.52f, -3.45f)
                close()
                moveTo(10.0f, 5f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                reflectiveCurveToRelative(-0.9f, -2f, -2f, -2f)
                reflectiveCurveToRelative(-2f, 0.9f, -2f, 2f)
                close()
                moveTo(21.29f, 7.92f)
                curveToRelative(-0.22f, -1.29f, -1.12f, -2.31f, -2.3f, -2.71f)
                curveToRelative(-0.03f, 1.06f, -0.29f, 2.08f, -0.76f, 3.0f)
                curveToRelative(0.05f, 0.06f, 0.09f, 0.14f, 0.1f, 0.22f)
                lineToRelative(2.13f, 12.58f)
                horizontalLineToRelative(-6.97f)
                lineToRelative(-0.01f, -2.01f)
                lineToRelative(-3f, 0.01f)
                lineToRelative(0.01f, 1.99f)
                lineTo(3.53f, 21f)
                lineToRelative(2.12f, -12.58f)
                curveToRelative(0.01f, -0.09f, 0.06f, -0.17f, 0.12f, -0.24f)
                curveToRelative(-0.47f, -0.92f, -0.73f, -1.93f, -0.76f, -2.98f)
                curveToRelative(-1.19f, 0.41f, -2.1f, 1.43f, -2.32f, 2.73f)
                lineTo(-0.02f, 24f)
                lineTo(24.02f, 24f)
                lineToRelative(-2.73f, -16.09f)
                close()
            }
        }.also { _RoadMapPin = it}
