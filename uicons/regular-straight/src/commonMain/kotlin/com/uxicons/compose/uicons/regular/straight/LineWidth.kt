package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LineWidth: ImageVector? = null

val Icons.Rs.LineWidth: ImageVector
    get() = _LineWidth ?: UXIcon(name = "LineWidth") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 24f)
                horizontalLineToRelative(-24f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(24f)
                close()
                moveTo(24f, 12f)
                horizontalLineToRelative(-24f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(24f)
                close()
                moveTo(24f, 6f)
                horizontalLineToRelative(-24f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(24f)
                close()
                moveTo(24f, 1f)
                horizontalLineToRelative(-24f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(24f)
                close()
            }
        }.also { _LineWidth = it}
