package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BigDrop: ImageVector? = null

val Icons.Ss.BigDrop: ImageVector
    get() = _BigDrop ?: UXIcon(name = "BigDrop") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16f, 22f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(2f)
                lineTo(5f, 24f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(3f)
                lineTo(8f, 12f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(10f)
                close()
                moveTo(24f, 8f)
                verticalLineToRelative(2f)
                lineTo(0f, 10f)
                verticalLineToRelative(-2f)
                lineTo(2f, 8f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(4f)
                lineTo(12f, 0f)
                lineToRelative(3f, 3f)
                horizontalLineToRelative(4.0f)
                curveToRelative(1.65f, 0f, 3.0f, 1.34f, 3f, 2.99f)
                lineToRelative(0.01f, 2.01f)
                horizontalLineToRelative(1.99f)
                close()
                moveTo(7f, 6f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                close()
                moveTo(11f, 6f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                close()
                moveTo(15f, 6f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                close()
                moveTo(19f, 6f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                close()
            }
        }.also { _BigDrop = it}
