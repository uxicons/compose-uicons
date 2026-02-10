package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Frame: ImageVector? = null

val Icons.Ts.Frame: ImageVector
    get() = _Frame ?: UXIcon(name = "Frame") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 4f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-3f)
                lineTo(21f, 0f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(3f)
                lineTo(4f, 3f)
                lineTo(4f, 0f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(3f)
                lineTo(0f, 3f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(16f)
                lineTo(0f, 20f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-3f)
                lineTo(21f, 4f)
                horizontalLineToRelative(3f)
                close()
                moveTo(20f, 20f)
                lineTo(4f, 20f)
                lineTo(4f, 4f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(16f)
                close()
            }
        }.also { _Frame = it}
