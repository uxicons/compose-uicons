package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RectangleBarcode: ImageVector? = null

val Icons.Ss.RectangleBarcode: ImageVector
    get() = _RectangleBarcode ?: UXIcon(name = "RectangleBarcode") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 2f)
                lineTo(3f, 2f)
                curveTo(1.35f, 2f, 0f, 3.35f, 0f, 5f)
                lineTo(0f, 22f)
                lineTo(24f, 22f)
                lineTo(24f, 5f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(6f, 18f)
                horizontalLineToRelative(-2f)
                lineTo(4f, 6f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(12f)
                close()
                moveTo(10f, 18f)
                horizontalLineToRelative(-2f)
                lineTo(8f, 6f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(12f)
                close()
                moveTo(14f, 18f)
                horizontalLineToRelative(-3f)
                lineTo(11f, 6f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(12f)
                close()
                moveTo(20f, 18f)
                horizontalLineToRelative(-2f)
                lineTo(18f, 6f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(12f)
                close()
                moveTo(16f, 18f)
                horizontalLineToRelative(-1f)
                lineTo(15f, 6f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(12f)
                close()
            }
        }.also { _RectangleBarcode = it}
