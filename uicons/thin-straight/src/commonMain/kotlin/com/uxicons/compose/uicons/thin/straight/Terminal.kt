package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Terminal: ImageVector? = null

val Icons.Ts.Terminal: ImageVector
    get() = _Terminal ?: UXIcon(name = "Terminal") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(0.85f, 1.92f)
                lineTo(10.94f, 12f)
                lineTo(0.85f, 22.08f)
                lineToRelative(-0.71f, -0.71f)
                lineTo(9.52f, 12f)
                lineTo(0.15f, 2.62f)
                lineToRelative(0.71f, -0.71f)
                close()
                moveTo(11f, 21f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(13f)
                verticalLineToRelative(-1f)
                horizontalLineTo(11f)
                close()
            }
        }.also { _Terminal = it}
