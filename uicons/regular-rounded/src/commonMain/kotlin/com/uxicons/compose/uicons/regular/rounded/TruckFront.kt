package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TruckFront: ImageVector? = null

val Icons.Rr.TruckFront: ImageVector
    get() = _TruckFront ?: UXIcon(name = "TruckFront") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 5f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                lineTo(5f, 0f)
                curveTo(2.24f, 0f, 0f, 2.24f, 0f, 5f)
                verticalLineToRelative(10f)
                curveToRelative(0f, 0.98f, 0.36f, 1.92f, 1f, 2.65f)
                verticalLineToRelative(0.35f)
                curveToRelative(0f, 1.48f, 0.81f, 2.77f, 2f, 3.46f)
                verticalLineToRelative(0.54f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                horizontalLineToRelative(10f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                verticalLineToRelative(-0.54f)
                curveToRelative(1.2f, -0.69f, 2f, -1.99f, 2f, -3.46f)
                verticalLineToRelative(-0.35f)
                curveToRelative(0.64f, -0.73f, 1f, -1.67f, 1f, -2.65f)
                lineTo(24f, 5f)
                close()
                moveTo(3.72f, 14f)
                lineToRelative(1.99f, -3.49f)
                curveToRelative(0.53f, -0.93f, 1.53f, -1.51f, 2.6f, -1.51f)
                horizontalLineToRelative(7.36f)
                curveToRelative(1.07f, 0f, 2.07f, 0.58f, 2.6f, 1.51f)
                lineToRelative(1.99f, 3.49f)
                lineTo(3.72f, 14f)
                close()
                moveTo(5f, 2f)
                horizontalLineToRelative(14f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                verticalLineToRelative(7.99f)
                lineToRelative(-1.98f, -3.47f)
                curveToRelative(-0.89f, -1.55f, -2.55f, -2.52f, -4.34f, -2.52f)
                horizontalLineToRelative(-7.36f)
                curveToRelative(-1.79f, 0f, -3.45f, 0.97f, -4.34f, 2.52f)
                lineToRelative(-1.98f, 3.47f)
                verticalLineToRelative(-7.99f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                close()
                moveTo(21f, 18f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                lineTo(5f, 20f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                verticalLineToRelative(-1.41f)
                curveToRelative(0f, -0.2f, 0.01f, -0.4f, 0.04f, -0.59f)
                horizontalLineToRelative(1.96f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(1.96f)
                curveToRelative(0.02f, 0.2f, 0.04f, 0.4f, 0.04f, 0.59f)
                verticalLineToRelative(1.41f)
                close()
            }
        }.also { _TruckFront = it}
