package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TruckFront: ImageVector? = null

val Icons.Rs.TruckFront: ImageVector
    get() = _TruckFront ?: UXIcon(name = "TruckFront") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 3f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                lineTo(3f, 0f)
                curveTo(1.35f, 0f, 0f, 1.35f, 0f, 3f)
                verticalLineToRelative(16f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(1f)
                lineTo(24f, 3f)
                close()
                moveTo(3f, 2f)
                horizontalLineToRelative(18f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(10.8f)
                curveToRelative(-0.08f, -0.19f, -0.17f, -0.38f, -0.27f, -0.57f)
                lineToRelative(-2.29f, -4.57f)
                curveToRelative(-0.51f, -1.02f, -1.54f, -1.66f, -2.68f, -1.66f)
                lineTo(7.24f, 7f)
                curveToRelative(-1.14f, 0f, -2.17f, 0.64f, -2.68f, 1.66f)
                lineToRelative(-2.29f, 4.57f)
                curveToRelative(-0.09f, 0.19f, -0.18f, 0.38f, -0.27f, 0.57f)
                lineTo(2.0f, 3f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                close()
                moveTo(4.12f, 14f)
                lineToRelative(2.22f, -4.45f)
                curveToRelative(0.17f, -0.34f, 0.51f, -0.55f, 0.9f, -0.55f)
                horizontalLineToRelative(9.53f)
                curveToRelative(0.38f, 0f, 0.72f, 0.21f, 0.9f, 0.55f)
                lineToRelative(2.22f, 4.45f)
                lineTo(4.12f, 14f)
                close()
                moveTo(21f, 20f)
                lineTo(3f, 20f)
                verticalLineToRelative(-1.4f)
                curveToRelative(0f, -0.88f, 0.12f, -1.75f, 0.34f, -2.6f)
                horizontalLineToRelative(1.66f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(1.66f)
                curveToRelative(0.23f, 0.85f, 0.34f, 1.72f, 0.34f, 2.6f)
                verticalLineToRelative(1.4f)
                close()
            }
        }.also { _TruckFront = it}
