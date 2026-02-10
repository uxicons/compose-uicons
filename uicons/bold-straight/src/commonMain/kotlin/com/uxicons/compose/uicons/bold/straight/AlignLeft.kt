package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AlignLeft: ImageVector? = null

val Icons.Bs.AlignLeft: ImageVector
    get() = _AlignLeft ?: UXIcon(name = "AlignLeft") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(0f, 3f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-24f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(0f, 8f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-16f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(0f, 18f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-16f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(0f, 13f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-24f)
                close()
            }
        }.also { _AlignLeft = it}
