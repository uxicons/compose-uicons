package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BarsFilter: ImageVector? = null

val Icons.Ss.BarsFilter: ImageVector
    get() = _BarsFilter ?: UXIcon(name = "BarsFilter") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 4f)
                lineTo(0f, 4f)
                lineTo(0f, 2f)
                lineTo(24f, 2f)
                verticalLineToRelative(2f)
                close()
                moveTo(16f, 20f)
                lineTo(8f, 20f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(-2f)
                close()
                moveTo(20f, 11f)
                lineTo(4f, 11f)
                verticalLineToRelative(2f)
                lineTo(20f, 13f)
                verticalLineToRelative(-2f)
                close()
            }
        }.also { _BarsFilter = it}
