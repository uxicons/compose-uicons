package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowLeft: ImageVector? = null

val Icons.Ss.ArrowLeft: ImageVector
    get() = _ArrowLeft ?: UXIcon(name = "ArrowLeft") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 13f)
                lineToRelative(0f, -2f)
                lineToRelative(-21.45f, 0.03f)
                lineTo(6.88f, 6.71f)
                lineTo(5.46f, 5.29f)
                lineTo(0.88f, 9.88f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 4.24f)
                lineToRelative(4.59f, 4.59f)
                lineToRelative(1.41f, -1.41f)
                lineTo(2.62f, 13.03f)
                close()
            }
        }.also { _ArrowLeft = it}
