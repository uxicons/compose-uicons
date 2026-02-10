package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RectangleBarcode: ImageVector? = null

val Icons.Rs.RectangleBarcode: ImageVector
    get() = _RectangleBarcode ?: UXIcon(name = "RectangleBarcode") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 22f)
                lineTo(0f, 22f)
                lineTo(0f, 5f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                lineTo(21f, 2f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                lineTo(24f, 22f)
                close()
                moveTo(2f, 20f)
                lineTo(22f, 20f)
                lineTo(22f, 5f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                lineTo(3f, 4f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(15f)
                close()
                moveTo(6f, 6f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(12f)
                horizontalLineToRelative(2f)
                lineTo(6f, 6f)
                close()
                moveTo(10f, 6f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(12f)
                horizontalLineToRelative(2f)
                lineTo(10f, 6f)
                close()
                moveTo(20f, 6f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(12f)
                horizontalLineToRelative(2f)
                lineTo(20f, 6f)
                close()
                moveTo(14f, 6f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(12f)
                horizontalLineToRelative(3f)
                lineTo(14f, 6f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(16f, 6f)
                lineToRelative(-1f, 0f)
                lineToRelative(0f, 12f)
                lineToRelative(1f, 0f)
                lineToRelative(0f, -12f)
                lineToRelative(0f, 0f)
                close()
            }
        }.also { _RectangleBarcode = it}
