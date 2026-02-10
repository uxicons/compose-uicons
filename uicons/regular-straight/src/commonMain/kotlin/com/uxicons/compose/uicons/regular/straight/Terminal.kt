package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Terminal: ImageVector? = null

val Icons.Rs.Terminal: ImageVector
    get() = _Terminal ?: UXIcon(name = "Terminal") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11.11f, 12f)
                lineTo(1.4f, 21.71f)
                lineTo(-0.01f, 20.29f)
                lineTo(8.28f, 12f)
                lineTo(-0.01f, 3.71f)
                lineToRelative(1.41f, -1.41f)
                lineTo(11.11f, 12f)
                close()
                moveTo(11f, 20f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(13f)
                verticalLineToRelative(-2f)
                lineTo(11f, 20f)
                close()
            }
        }.also { _Terminal = it}
