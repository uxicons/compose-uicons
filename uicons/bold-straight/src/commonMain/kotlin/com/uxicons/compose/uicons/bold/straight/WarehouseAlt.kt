package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _WarehouseAlt: ImageVector? = null

val Icons.Bs.WarehouseAlt: ImageVector
    get() = _WarehouseAlt ?: UXIcon(name = "WarehouseAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10f, 21f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-3f)
                close()
                moveTo(10f, 19f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(3f)
                close()
                moveTo(24f, 10.15f)
                verticalLineToRelative(13.85f)
                horizontalLineToRelative(-8f)
                lineTo(16f, 14.5f)
                curveToRelative(0f, -0.28f, -0.23f, -0.5f, -0.5f, -0.5f)
                horizontalLineToRelative(-7f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(9.5f)
                lineTo(0f, 24f)
                lineTo(0f, 10.15f)
                curveToRelative(0f, -1.08f, 0.49f, -2.09f, 1.34f, -2.76f)
                lineTo(9.84f, 0.74f)
                curveToRelative(1.27f, -0.99f, 3.04f, -0.99f, 4.31f, 0f)
                lineToRelative(8.5f, 6.65f)
                curveToRelative(0.85f, 0.67f, 1.34f, 1.67f, 1.34f, 2.76f)
                close()
                moveTo(21f, 10.15f)
                curveToRelative(0f, -0.15f, -0.07f, -0.3f, -0.19f, -0.39f)
                lineTo(12.31f, 3.11f)
                curveToRelative(-0.18f, -0.14f, -0.43f, -0.14f, -0.61f, 0f)
                lineTo(3.19f, 9.76f)
                curveToRelative(-0.12f, 0.09f, -0.19f, 0.24f, -0.19f, 0.39f)
                verticalLineToRelative(10.85f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-6.5f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(7f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                verticalLineToRelative(6.5f)
                horizontalLineToRelative(2f)
                lineTo(21f, 10.15f)
                close()
            }
        }.also { _WarehouseAlt = it}
