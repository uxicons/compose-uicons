package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PointOfSaleSignal: ImageVector? = null

val Icons.Bs.PointOfSaleSignal: ImageVector
    get() = _PointOfSaleSignal ?: UXIcon(name = "PointOfSaleSignal") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(8f, 14f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(3f)
                close()
                moveTo(5f, 19f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(3f)
                close()
                moveTo(10f, 19f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(3f)
                close()
                moveTo(10f, 14f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(3f)
                close()
                moveTo(15f, 10f)
                verticalLineToRelative(11f)
                lineTo(3f, 21f)
                lineTo(3f, 3.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(1.39f)
                lineToRelative(1.05f, -1.05f)
                curveToRelative(0.77f, -0.77f, 1.61f, -1.41f, 2.49f, -1.95f)
                lineTo(3.5f, 0f)
                curveTo(1.57f, 0f, 0f, 1.57f, 0f, 3.5f)
                verticalLineToRelative(20.5f)
                horizontalLineToRelative(18f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-10f)
                horizontalLineToRelative(-5f)
                close()
                moveTo(7.5f, 5f)
                horizontalLineToRelative(-2.5f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(6.5f)
                lineToRelative(-4f, -4f)
                close()
                moveTo(16.91f, 8.59f)
                lineToRelative(2.12f, -2.12f)
                curveToRelative(-1.95f, -1.95f, -5.12f, -1.95f, -7.07f, 0f)
                lineToRelative(2.12f, 2.12f)
                curveToRelative(0.78f, -0.78f, 2.05f, -0.78f, 2.83f, 0f)
                close()
                moveTo(15.5f, 0f)
                curveToRelative(-2.67f, 0f, -5.18f, 1.04f, -7.07f, 2.93f)
                lineToRelative(2.12f, 2.12f)
                curveToRelative(1.32f, -1.32f, 3.08f, -2.05f, 4.95f, -2.05f)
                reflectiveCurveToRelative(3.63f, 0.73f, 4.95f, 2.05f)
                lineToRelative(2.12f, -2.12f)
                curveToRelative(-1.89f, -1.89f, -4.4f, -2.93f, -7.07f, -2.93f)
                close()
            }
        }.also { _PointOfSaleSignal = it}
