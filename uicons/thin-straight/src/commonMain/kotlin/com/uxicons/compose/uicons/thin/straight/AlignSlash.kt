package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AlignSlash: ImageVector? = null

val Icons.Ts.AlignSlash: ImageVector
    get() = _AlignSlash ?: UXIcon(name = "AlignSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24.0f, 23.3f)
                lineToRelative(-0.71f, 0.71f)
                lineTo(-0.0f, 0.7f)
                lineTo(0.7f, -0.0f)
                lineToRelative(4.0f, 4.0f)
                horizontalLineToRelative(19.29f)
                verticalLineToRelative(1f)
                lineTo(5.71f, 5f)
                lineToRelative(4f, 4f)
                horizontalLineToRelative(14.29f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-13.29f)
                lineToRelative(4f, 4f)
                horizontalLineToRelative(9.29f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-8.29f)
                lineToRelative(4f, 4f)
                horizontalLineToRelative(4.29f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-3.29f)
                lineToRelative(3.3f, 3.3f)
                close()
                moveTo(0f, 19f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(16.5f)
                lineToRelative(-1f, -1f)
                lineTo(0f, 19f)
                close()
                moveTo(0f, 15f)
                horizontalLineToRelative(11.5f)
                lineToRelative(-1f, -1f)
                lineTo(0f, 14f)
                verticalLineToRelative(1f)
                close()
                moveTo(0f, 10f)
                horizontalLineToRelative(6.5f)
                lineToRelative(-1f, -1f)
                lineTo(0f, 9f)
                verticalLineToRelative(1f)
                close()
                moveTo(0f, 4f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(1.5f)
                lineToRelative(-1f, -1f)
                horizontalLineToRelative(-0.5f)
                close()
            }
        }.also { _AlignSlash = it}
