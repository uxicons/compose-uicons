package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CrossSmall: ImageVector? = null

val Icons.Rs.CrossSmall: ImageVector
    get() = _CrossSmall ?: UXIcon(name = "CrossSmall") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.71f, 6.71f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(-5.29f, 5.29f)
                lineToRelative(-5.29f, -5.29f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(5.29f, 5.29f)
                lineToRelative(-5.29f, 5.29f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(5.29f, -5.29f)
                lineToRelative(5.29f, 5.29f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(-5.29f, -5.29f)
                lineToRelative(5.29f, -5.29f)
                close()
            }
        }.also { _CrossSmall = it}
