package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TruckFront: ImageVector? = null

val Icons.Bs.TruckFront: ImageVector
    get() = _TruckFront ?: UXIcon(name = "TruckFront") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.5f, 0f)
                lineTo(3.5f, 0f)
                curveTo(1.57f, 0f, 0f, 1.57f, 0f, 3.5f)
                verticalLineToRelative(15.5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(2f)
                lineTo(24f, 3.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(6.5f, 19f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(6.49f, 13f)
                lineToRelative(1.31f, -2.72f)
                curveToRelative(0.08f, -0.17f, 0.26f, -0.28f, 0.45f, -0.28f)
                horizontalLineToRelative(7.49f)
                curveToRelative(0.19f, 0f, 0.37f, 0.11f, 0.45f, 0.28f)
                lineToRelative(1.31f, 2.72f)
                lineTo(6.49f, 13f)
                close()
                moveTo(17.5f, 19f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(21f, 13.37f)
                curveToRelative(-0.08f, -0.18f, -0.16f, -0.36f, -0.24f, -0.54f)
                lineToRelative(-1.86f, -3.85f)
                curveToRelative(-0.58f, -1.2f, -1.82f, -1.98f, -3.15f, -1.98f)
                horizontalLineToRelative(-7.49f)
                curveToRelative(-1.33f, 0f, -2.57f, 0.78f, -3.15f, 1.98f)
                lineToRelative(-1.86f, 3.85f)
                curveToRelative(-0.09f, 0.18f, -0.17f, 0.36f, -0.24f, 0.54f)
                lineTo(3.0f, 3.5f)
                curveToRelative(0f, -0.28f, 0.23f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(17f)
                curveToRelative(0.28f, 0f, 0.5f, 0.23f, 0.5f, 0.5f)
                verticalLineToRelative(9.87f)
                close()
            }
        }.also { _TruckFront = it}
