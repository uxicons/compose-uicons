package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Exchange: ImageVector? = null

val Icons.Ss.Exchange: ImageVector
    get() = _Exchange ?: UXIcon(name = "Exchange") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 18f)
                lineTo(3f, 18f)
                lineToRelative(2.6f, 2.6f)
                lineTo(4.18f, 22.01f)
                lineToRelative(-3.6f, -3.6f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -2.83f)
                lineToRelative(3.57f, -3.57f)
                lineToRelative(1.41f, 1.41f)
                lineTo(3f, 16f)
                lineTo(24f, 16f)
                close()
                moveTo(18.43f, 10.57f)
                lineTo(19.84f, 11.99f)
                lineTo(23.41f, 8.41f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -2.83f)
                lineTo(19.82f, 1.99f)
                lineTo(18.41f, 3.41f)
                lineTo(21f, 6f)
                lineTo(0f, 6f)
                lineTo(0f, 8f)
                lineTo(21f, 8f)
                close()
            }
        }.also { _Exchange = it}
