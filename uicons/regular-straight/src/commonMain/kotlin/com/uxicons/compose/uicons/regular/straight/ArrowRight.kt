package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowRight: ImageVector? = null

val Icons.Rs.ArrowRight: ImageVector
    get() = _ArrowRight ?: UXIcon(name = "ArrowRight") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.12f, 9.88f)
                lineTo(18.54f, 5.29f)
                lineTo(17.12f, 6.71f)
                lineToRelative(4.26f, 4.26f)
                lineTo(0f, 11f)
                lineToRelative(0f, 2f)
                lineToRelative(21.45f, -0.03f)
                lineToRelative(-4.32f, 4.32f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(4.59f, -4.59f)
                arcTo(3.01f, 3.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 23.12f, 9.88f)
                close()
            }
        }.also { _ArrowRight = it}
