package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PlusSmall: ImageVector? = null

val Icons.Rs.PlusSmall: ImageVector
    get() = _PlusSmall ?: UXIcon(name = "PlusSmall") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 11f)
                lineToRelative(0f, -5f)
                lineToRelative(-2f, 0f)
                lineToRelative(0f, 5f)
                lineToRelative(-5f, 0f)
                lineToRelative(0f, 2f)
                lineToRelative(5f, 0f)
                lineToRelative(0f, 5f)
                lineToRelative(2f, 0f)
                lineToRelative(0f, -5f)
                lineToRelative(5f, 0f)
                lineToRelative(0f, -2f)
                lineToRelative(-5f, 0f)
                close()
            }
        }.also { _PlusSmall = it}
