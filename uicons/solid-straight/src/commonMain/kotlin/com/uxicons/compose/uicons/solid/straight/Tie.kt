package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Tie: ImageVector? = null

val Icons.Ss.Tie: ImageVector
    get() = _Tie ?: UXIcon(name = "Tie") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(10f, 4f)
                lineToRelative(-1f, -4f)
                horizontalLineToRelative(6f)
                lineToRelative(-1f, 4f)
                horizontalLineToRelative(-4f)
                close()
                moveTo(10f, 6f)
                lineToRelative(-3.5f, 13f)
                lineToRelative(5.5f, 5f)
                lineToRelative(5.5f, -5f)
                lineToRelative(-3.5f, -13f)
                horizontalLineToRelative(-4f)
                close()
            }
        }.also { _Tie = it}
