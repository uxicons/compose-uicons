package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Cross: ImageVector? = null

val Icons.Bs.Cross: ImageVector
    get() = _Cross ?: UXIcon(name = "Cross") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24.06f, 2.06f)
                lineToRelative(-2.12f, -2.12f)
                lineToRelative(-9.94f, 9.94f)
                lineToRelative(-9.94f, -9.94f)
                lineToRelative(-2.12f, 2.12f)
                lineToRelative(9.94f, 9.94f)
                lineToRelative(-9.94f, 9.94f)
                lineToRelative(2.12f, 2.12f)
                lineToRelative(9.94f, -9.94f)
                lineToRelative(9.94f, 9.94f)
                lineToRelative(2.12f, -2.12f)
                lineToRelative(-9.94f, -9.94f)
                lineToRelative(9.94f, -9.94f)
                close()
            }
        }.also { _Cross = it}
