package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Check: ImageVector? = null

val Icons.Ss.Check: ImageVector
    get() = _Check ?: UXIcon(name = "Check") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7.77f, 20.59f)
                arcToRelative(3.01f, 3.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.14f, -0.88f)
                lineTo(0f, 14.07f)
                lineToRelative(1.42f, -1.43f)
                lineToRelative(5.63f, 5.63f)
                arcToRelative(1.01f, 1.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.43f, 0f)
                lineTo(22.58f, 4.19f)
                lineTo(24f, 5.61f)
                lineTo(9.91f, 19.71f)
                arcTo(3.01f, 3.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.77f, 20.59f)
                close()
            }
        }.also { _Check = it}
