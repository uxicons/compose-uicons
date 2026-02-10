package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Pause: ImageVector? = null

val Icons.Ss.Pause: ImageVector
    get() = _Pause ?: UXIcon(name = "Pause") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 0f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(24f)
                horizontalLineToRelative(-7f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(14f, 0f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(24f)
                horizontalLineToRelative(-7f)
                close()
            }
        }.also { _Pause = it}
