package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BarsSort: ImageVector? = null

val Icons.Ss.BarsSort: ImageVector
    get() = _BarsSort ?: UXIcon(name = "BarsSort") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 4f)
                lineTo(0f, 4f)
                lineTo(0f, 2f)
                lineTo(24f, 2f)
                verticalLineToRelative(2f)
                close()
                moveTo(8f, 20f)
                lineTo(0f, 20f)
                verticalLineToRelative(2f)
                lineTo(8f, 22f)
                verticalLineToRelative(-2f)
                close()
                moveTo(16f, 11f)
                lineTo(0f, 11f)
                verticalLineToRelative(2f)
                lineTo(16f, 13f)
                verticalLineToRelative(-2f)
                close()
            }
        }.also { _BarsSort = it}
