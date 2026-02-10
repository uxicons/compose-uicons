package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PlusSmall: ImageVector? = null

val Icons.Bs.PlusSmall: ImageVector
    get() = _PlusSmall ?: UXIcon(name = "PlusSmall") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 10.5f)
                lineToRelative(-4.5f, 0f)
                lineToRelative(0f, -4.5f)
                lineToRelative(-3f, 0f)
                lineToRelative(0f, 4.5f)
                lineToRelative(-4.5f, 0f)
                lineToRelative(0f, 3f)
                lineToRelative(4.5f, 0f)
                lineToRelative(0f, 4.5f)
                lineToRelative(3f, 0f)
                lineToRelative(0f, -4.5f)
                lineToRelative(4.5f, 0f)
                lineToRelative(0f, -3f)
                close()
            }
        }.also { _PlusSmall = it}
