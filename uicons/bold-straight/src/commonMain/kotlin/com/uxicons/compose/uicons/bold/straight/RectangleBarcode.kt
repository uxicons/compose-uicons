package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RectangleBarcode: ImageVector? = null

val Icons.Bs.RectangleBarcode: ImageVector
    get() = _RectangleBarcode ?: UXIcon(name = "RectangleBarcode") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 22f)
                lineTo(0f, 22f)
                lineTo(0f, 5.5f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                lineTo(20.5f, 2f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                lineTo(24f, 22f)
                close()
                moveTo(3f, 19f)
                lineTo(21f, 19f)
                lineTo(21f, 5.5f)
                curveToRelative(0f, -0.28f, -0.23f, -0.5f, -0.5f, -0.5f)
                lineTo(3.5f, 5f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(13.5f)
                close()
                moveTo(9f, 7f)
                lineTo(5f, 7f)
                verticalLineToRelative(10f)
                horizontalLineToRelative(4f)
                lineTo(9f, 7f)
                close()
                moveTo(16f, 7f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(10f)
                horizontalLineToRelative(3f)
                lineTo(16f, 7f)
                close()
                moveTo(19f, 7f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(10f)
                horizontalLineToRelative(2f)
                lineTo(19f, 7f)
                close()
                moveTo(12f, 7f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(10f)
                horizontalLineToRelative(2f)
                lineTo(12f, 7f)
                close()
            }
        }.also { _RectangleBarcode = it}
