package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Terminal: ImageVector? = null

val Icons.Bs.Terminal: ImageVector
    get() = _Terminal ?: UXIcon(name = "Terminal") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.04f, 12f)
                lineTo(2.1f, 21.95f)
                lineTo(-0.02f, 19.82f)
                lineToRelative(7.82f, -7.82f)
                lineTo(-0.02f, 4.18f)
                lineTo(2.1f, 2.05f)
                lineTo(12.04f, 12f)
                close()
                moveTo(11f, 19f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(13f)
                verticalLineToRelative(-3f)
                lineTo(11f, 19f)
                close()
            }
        }.also { _Terminal = it}
