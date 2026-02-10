package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FeeReceipt: ImageVector? = null

val Icons.Ss.FeeReceipt: ImageVector
    get() = _FeeReceipt ?: UXIcon(name = "FeeReceipt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18f, 0f)
                lineTo(6f, 0f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(20.93f)
                lineToRelative(3.63f, -2.2f)
                lineToRelative(2.7f, 1.88f)
                lineToRelative(2.67f, -1.85f)
                lineToRelative(2.67f, 1.85f)
                lineToRelative(2.7f, -1.88f)
                lineToRelative(3.63f, 2.21f)
                lineTo(21.0f, 3f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(9.5f, 6.6f)
                horizontalLineToRelative(-1.9f)
                verticalLineToRelative(1.8f)
                horizontalLineToRelative(1.9f)
                verticalLineToRelative(1.6f)
                horizontalLineToRelative(-1.9f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-1.6f)
                lineTo(6f, 5f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(1.6f)
                close()
                moveTo(14f, 6.6f)
                horizontalLineToRelative(-1.9f)
                verticalLineToRelative(1.8f)
                horizontalLineToRelative(1.9f)
                verticalLineToRelative(1.6f)
                horizontalLineToRelative(-1.9f)
                verticalLineToRelative(1.4f)
                horizontalLineToRelative(1.9f)
                verticalLineToRelative(1.6f)
                horizontalLineToRelative(-3.5f)
                lineTo(10.5f, 5f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(1.6f)
                close()
                moveTo(18.5f, 6.6f)
                horizontalLineToRelative(-1.9f)
                verticalLineToRelative(1.8f)
                horizontalLineToRelative(1.9f)
                verticalLineToRelative(1.6f)
                horizontalLineToRelative(-1.9f)
                verticalLineToRelative(1.4f)
                horizontalLineToRelative(1.9f)
                verticalLineToRelative(1.6f)
                horizontalLineToRelative(-3.5f)
                lineTo(15f, 5f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(1.6f)
                close()
            }
        }.also { _FeeReceipt = it}
