package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TruckPickup: ImageVector? = null

val Icons.Ts.TruckPickup: ImageVector
    get() = _TruckPickup ?: UXIcon(name = "TruckPickup") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 12.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                horizontalLineToRelative(-0.74f)
                lineTo(15.93f, 3.07f)
                curveToRelative(-0.47f, -0.67f, -1.23f, -1.07f, -2.05f, -1.07f)
                horizontalLineToRelative(-4.88f)
                lineTo(9f, 10f)
                lineTo(0f, 10f)
                verticalLineToRelative(7f)
                lineTo(2f, 17f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                reflectiveCurveToRelative(3f, -1.35f, 3f, -3f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                reflectiveCurveToRelative(3f, -1.35f, 3f, -3f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-4.5f)
                close()
                moveTo(10f, 3f)
                horizontalLineToRelative(3.88f)
                curveToRelative(0.49f, 0f, 0.95f, 0.24f, 1.23f, 0.64f)
                lineToRelative(4.43f, 6.36f)
                lineTo(10f, 10f)
                lineTo(10f, 3f)
                close()
                moveTo(7f, 18f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                verticalLineToRelative(-1f)
                lineTo(7f, 17f)
                verticalLineToRelative(1f)
                close()
                moveTo(21f, 18f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(1f)
                close()
                moveTo(23f, 16f)
                lineTo(1f, 16f)
                verticalLineToRelative(-5f)
                lineTo(21.5f, 11f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(3.5f)
                close()
            }
        }.also { _TruckPickup = it}
