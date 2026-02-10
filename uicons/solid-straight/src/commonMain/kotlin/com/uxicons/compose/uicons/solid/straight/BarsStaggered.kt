package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BarsStaggered: ImageVector? = null

val Icons.Ss.BarsStaggered: ImageVector
    get() = _BarsStaggered ?: UXIcon(name = "BarsStaggered") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 5f)
                lineTo(0f, 5f)
                lineTo(0f, 3f)
                lineTo(19f, 3f)
                verticalLineToRelative(2f)
                close()
                moveTo(19f, 19f)
                lineTo(0f, 19f)
                verticalLineToRelative(2f)
                lineTo(19f, 21f)
                verticalLineToRelative(-2f)
                close()
                moveTo(24f, 11f)
                lineTo(5f, 11f)
                verticalLineToRelative(2f)
                lineTo(24f, 13f)
                verticalLineToRelative(-2f)
                close()
            }
        }.also { _BarsStaggered = it}
