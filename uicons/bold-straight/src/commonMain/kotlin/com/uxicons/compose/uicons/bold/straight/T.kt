package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _T: ImageVector? = null

val Icons.Bs.T: ImageVector
    get() = _T ?: UXIcon(name = "T") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 0f)
                lineToRelative(-20f, 0f)
                lineToRelative(0f, 3f)
                lineToRelative(8.5f, 0f)
                lineToRelative(0f, 21f)
                lineToRelative(3f, 0f)
                lineToRelative(0f, -21f)
                lineToRelative(8.5f, 0f)
                lineToRelative(0f, -3f)
                close()
            }
        }.also { _T = it}
