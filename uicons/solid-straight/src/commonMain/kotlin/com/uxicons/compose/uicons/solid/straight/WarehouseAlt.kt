package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _WarehouseAlt: ImageVector? = null

val Icons.Ss.WarehouseAlt: ImageVector
    get() = _WarehouseAlt ?: UXIcon(name = "WarehouseAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 24f)
                horizontalLineToRelative(-5f)
                lineTo(19f, 13f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                lineTo(7f, 11f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(11f)
                lineTo(0f, 24f)
                lineTo(0f, 10.04f)
                curveToRelative(0f, -0.92f, 0.42f, -1.79f, 1.15f, -2.36f)
                lineTo(10.15f, 0.64f)
                curveToRelative(1.09f, -0.85f, 2.61f, -0.85f, 3.7f, 0f)
                lineToRelative(9f, 7.04f)
                curveToRelative(0.73f, 0.57f, 1.15f, 1.44f, 1.15f, 2.36f)
                verticalLineToRelative(13.96f)
                close()
                moveTo(11f, 20f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-4f)
                close()
                moveTo(11f, 14f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-4f)
                close()
                moveTo(16f, 20f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-4f)
                close()
            }
        }.also { _WarehouseAlt = it}
