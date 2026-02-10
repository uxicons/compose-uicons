package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Fence: ImageVector? = null

val Icons.Ss.Fence: ImageVector
    get() = _Fence ?: UXIcon(name = "Fence") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 7f)
                verticalLineToRelative(2f)
                lineTo(0f, 9f)
                verticalLineToRelative(-2f)
                lineTo(1f, 7f)
                lineTo(1f, 3.09f)
                lineTo(4f, 0.09f)
                lineToRelative(3f, 3f)
                verticalLineToRelative(3.91f)
                horizontalLineToRelative(2f)
                lineTo(9f, 3.09f)
                lineTo(12f, 0.09f)
                lineToRelative(3f, 3f)
                verticalLineToRelative(3.91f)
                horizontalLineToRelative(2f)
                lineTo(17f, 3.09f)
                lineTo(20f, 0.09f)
                lineToRelative(3f, 3f)
                verticalLineToRelative(3.91f)
                horizontalLineToRelative(1f)
                close()
                moveTo(9f, 24f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(4f)
                close()
                moveTo(1f, 24f)
                lineTo(7f, 24f)
                verticalLineToRelative(-4f)
                lineTo(1f, 20f)
                verticalLineToRelative(4f)
                close()
                moveTo(17f, 24f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(4f)
                close()
                moveTo(23f, 11f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-5f)
                lineTo(1f, 11f)
                verticalLineToRelative(5f)
                lineTo(0f, 16f)
                verticalLineToRelative(2f)
                lineTo(24f, 18f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-5f)
                close()
            }
        }.also { _Fence = it}
