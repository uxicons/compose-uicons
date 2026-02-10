package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowDown: ImageVector? = null

val Icons.Rs.ArrowDown: ImageVector
    get() = _ArrowDown ?: UXIcon(name = "ArrowDown") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.66f, 17.79f)
                lineTo(13.03f, 21.42f)
                lineTo(13f, 0f)
                lineTo(11f, 0f)
                lineToRelative(0.03f, 21.41f)
                lineToRelative(-3.62f, -3.62f)
                lineTo(5.99f, 19.2f)
                lineToRelative(3.92f, 3.92f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.24f, 0f)
                lineTo(18.07f, 19.2f)
                close()
            }
        }.also { _ArrowDown = it}
