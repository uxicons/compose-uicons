package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Frame: ImageVector? = null

val Icons.Bs.Frame: ImageVector
    get() = _Frame ?: UXIcon(name = "Frame") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 6f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-3f)
                lineTo(21f, 0f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(3f)
                lineTo(6f, 3f)
                lineTo(6f, 0f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(3f)
                lineTo(0f, 3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(12f)
                lineTo(0f, 18f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-3f)
                lineTo(21f, 6f)
                horizontalLineToRelative(3f)
                close()
                moveTo(18f, 18f)
                lineTo(6f, 18f)
                lineTo(6f, 6f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(12f)
                close()
            }
        }.also { _Frame = it}
