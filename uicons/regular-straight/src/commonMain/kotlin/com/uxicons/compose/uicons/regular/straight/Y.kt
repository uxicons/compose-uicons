package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Y: ImageVector? = null

val Icons.Rs.Y: ImageVector
    get() = _Y ?: UXIcon(name = "Y") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.04f, 0f)
                lineToRelative(-2.48f, 0f)
                lineToRelative(-7.56f, 10.31f)
                lineToRelative(-7.56f, -10.31f)
                lineToRelative(-2.48f, 0f)
                lineToRelative(9.04f, 12.33f)
                lineToRelative(0f, 11.67f)
                lineToRelative(2f, 0f)
                lineToRelative(0f, -11.67f)
                lineToRelative(9.04f, -12.33f)
                close()
            }
        }.also { _Y = it}
