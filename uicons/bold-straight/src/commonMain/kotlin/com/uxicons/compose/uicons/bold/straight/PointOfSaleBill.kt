package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PointOfSaleBill: ImageVector? = null

val Icons.Bs.PointOfSaleBill: ImageVector
    get() = _PointOfSaleBill ?: UXIcon(name = "PointOfSaleBill") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(5f, 10f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(-3f)
                close()
                moveTo(5f, 16f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                close()
                moveTo(8f, 16f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                close()
                moveTo(5f, 19f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                close()
                moveTo(8f, 19f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                close()
                moveTo(24f, 6.75f)
                verticalLineToRelative(11.73f)
                lineToRelative(-3.61f, -2.19f)
                lineToRelative(-2.22f, 1.54f)
                lineToRelative(-1.18f, -0.82f)
                verticalLineToRelative(-3.65f)
                lineToRelative(1.18f, 0.82f)
                lineToRelative(2.11f, -1.47f)
                lineToRelative(0.72f, 0.44f)
                verticalLineToRelative(-6.4f)
                curveToRelative(0f, -2.07f, -1.68f, -3.75f, -3.75f, -3.75f)
                curveToRelative(-1.72f, 0f, -3.16f, 1.17f, -3.6f, 2.76f)
                curveToRelative(0.82f, 0.64f, 1.35f, 1.62f, 1.35f, 2.74f)
                verticalLineToRelative(15.5f)
                lineTo(0f, 24.0f)
                verticalLineToRelative(-15.5f)
                curveToRelative(0f, -1.19f, 0.6f, -2.23f, 1.5f, -2.87f)
                verticalLineToRelative(-0.14f)
                curveTo(1.5f, 2.47f, 3.97f, 0f, 7f, 0f)
                horizontalLineToRelative(10.25f)
                curveToRelative(3.72f, 0f, 6.75f, 3.03f, 6.75f, 6.75f)
                close()
                moveTo(4.55f, 5f)
                horizontalLineToRelative(6.19f)
                curveToRelative(0.19f, -0.72f, 0.5f, -1.4f, 0.9f, -2f)
                horizontalLineToRelative(-4.64f)
                curveToRelative(-1.21f, 0f, -2.22f, 0.86f, -2.45f, 2f)
                close()
                moveTo(12f, 8.5f)
                curveToRelative(0f, -0.28f, -0.23f, -0.5f, -0.5f, -0.5f)
                lineTo(3.5f, 8f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.23f, -0.5f, 0.5f)
                verticalLineToRelative(12.5f)
                horizontalLineToRelative(9f)
                verticalLineToRelative(-12.5f)
                close()
            }
        }.also { _PointOfSaleBill = it}
