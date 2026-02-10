package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AngleSmallLeft: ImageVector? = null

val Icons.Rs.AngleSmallLeft: ImageVector
    get() = _AngleSmallLeft ?: UXIcon(name = "AngleSmallLeft") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.78f, 18.71f)
                lineTo(8.48f, 13.41f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -2.83f)
                lineToRelative(5.29f, -5.29f)
                lineToRelative(1.41f, 1.41f)
                lineTo(9.9f, 12f)
                lineToRelative(5.29f, 5.29f)
                close()
            }
        }.also { _AngleSmallLeft = it}
