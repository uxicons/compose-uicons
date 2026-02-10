package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Wifi1: ImageVector? = null

val Icons.Sc.Wifi1: ImageVector
    get() = _Wifi1 ?: UXIcon(name = "Wifi1") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9.07f, 12f)
                arcToRelative(2.92f, 2.91f, 0f, isMoreThanHalf = true, isPositiveArc = false, 5.85f, 0f)
                arcToRelative(2.92f, 2.91f, 0f, isMoreThanHalf = true, isPositiveArc = false, -5.85f, 0f)
                close()
            }
        }.also { _Wifi1 = it}
