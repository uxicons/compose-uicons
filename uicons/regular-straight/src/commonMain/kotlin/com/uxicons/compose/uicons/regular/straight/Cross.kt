package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Cross: ImageVector? = null

val Icons.Rs.Cross: ImageVector
    get() = _Cross ?: UXIcon(name = "Cross") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 1.41f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(-10.59f, 10.59f)
                lineToRelative(-10.59f, -10.59f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(10.59f, 10.59f)
                lineToRelative(-10.59f, 10.59f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(10.59f, -10.59f)
                lineToRelative(10.59f, 10.59f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(-10.59f, -10.59f)
                lineToRelative(10.59f, -10.59f)
                close()
            }
        }.also { _Cross = it}
