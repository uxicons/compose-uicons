package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RectangleBarcode: ImageVector? = null

val Icons.Ts.RectangleBarcode: ImageVector
    get() = _RectangleBarcode ?: UXIcon(name = "RectangleBarcode") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 22f)
                lineTo(0f, 22f)
                lineTo(0f, 4.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                lineTo(21.5f, 2f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                lineTo(24f, 22f)
                close()
                moveTo(1f, 21f)
                lineTo(23f, 21f)
                lineTo(23f, 4.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                lineTo(2.5f, 3f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                lineTo(1f, 21f)
                close()
                moveTo(5f, 6f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(12f)
                horizontalLineToRelative(1f)
                lineTo(5f, 6f)
                close()
                moveTo(15f, 6f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(12f)
                horizontalLineToRelative(1f)
                lineTo(15f, 6f)
                close()
                moveTo(9f, 6f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(12f)
                horizontalLineToRelative(2f)
                lineTo(9f, 6f)
                close()
                moveTo(12f, 6f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(12f)
                horizontalLineToRelative(2f)
                lineTo(12f, 6f)
                close()
                moveTo(20f, 6f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(12f)
                horizontalLineToRelative(2f)
                lineTo(20f, 6f)
                close()
                moveTo(17f, 6f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(12f)
                horizontalLineToRelative(1f)
                lineTo(17f, 6f)
                close()
            }
        }.also { _RectangleBarcode = it}
