package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Symbol: ImageVector? = null

val Icons.Ss.Symbol: ImageVector
    get() = _Symbol ?: UXIcon(name = "Symbol") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(0f, 4f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-24f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(8f, 9f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-16f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(8f, 19f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-16f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(0f, 14f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-24f)
                close()
            }
        }.also { _Symbol = it}
