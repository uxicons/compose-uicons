package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _WindowMinimize: ImageVector? = null

val Icons.Bs.WindowMinimize: ImageVector
    get() = _WindowMinimize ?: UXIcon(name = "WindowMinimize") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(0f, 20f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-24f)
                close()
            }
        }.also { _WindowMinimize = it}
