package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AngleSmallLeft: ImageVector? = null

val Icons.Bs.AngleSmallLeft: ImageVector
    get() = _AngleSmallLeft ?: UXIcon(name = "AngleSmallLeft") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.42f, 19.06f)
                lineTo(8.13f, 13.77f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -3.54f)
                lineToRelative(5.29f, -5.29f)
                lineToRelative(2.12f, 2.12f)
                lineTo(10.6f, 12f)
                lineToRelative(4.94f, 4.94f)
                close()
            }
        }.also { _AngleSmallLeft = it}
