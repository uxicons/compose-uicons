package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FeeReceipt: ImageVector? = null

val Icons.Bs.FeeReceipt: ImageVector
    get() = _FeeReceipt ?: UXIcon(name = "FeeReceipt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18f, 15f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(8.95f)
                lineToRelative(-3.94f, -2.4f)
                lineToRelative(-2.56f, 1.78f)
                lineToRelative(-2.5f, -1.74f)
                lineToRelative(-2.5f, 1.74f)
                lineToRelative(-2.56f, -1.78f)
                lineToRelative(-3.94f, 2.4f)
                lineTo(3.0f, 3f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(12f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                lineTo(6f, 3f)
                verticalLineToRelative(15.61f)
                lineToRelative(1.06f, -0.64f)
                lineToRelative(2.44f, 1.7f)
                lineToRelative(2.5f, -1.74f)
                lineToRelative(2.5f, 1.74f)
                lineToRelative(2.44f, -1.7f)
                lineToRelative(1.05f, 0.64f)
                verticalLineToRelative(-3.61f)
                close()
                moveTo(12f, 6.6f)
                verticalLineToRelative(-1.6f)
                horizontalLineToRelative(-3.5f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(1.6f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(1.9f)
                verticalLineToRelative(-1.6f)
                horizontalLineToRelative(-1.9f)
                verticalLineToRelative(-1.8f)
                horizontalLineToRelative(1.9f)
                close()
                moveTo(16.5f, 6.6f)
                verticalLineToRelative(-1.6f)
                horizontalLineToRelative(-3.5f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(-1.6f)
                horizontalLineToRelative(-1.9f)
                verticalLineToRelative(-1.4f)
                horizontalLineToRelative(1.9f)
                verticalLineToRelative(-1.6f)
                horizontalLineToRelative(-1.9f)
                verticalLineToRelative(-1.8f)
                horizontalLineToRelative(1.9f)
                close()
                moveTo(17.5f, 13f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(-1.6f)
                horizontalLineToRelative(-1.9f)
                verticalLineToRelative(-1.4f)
                horizontalLineToRelative(1.9f)
                verticalLineToRelative(-1.6f)
                horizontalLineToRelative(-1.9f)
                verticalLineToRelative(-1.8f)
                horizontalLineToRelative(1.9f)
                verticalLineToRelative(-1.6f)
                horizontalLineToRelative(-3.5f)
                verticalLineToRelative(8f)
                close()
            }
        }.also { _FeeReceipt = it}
