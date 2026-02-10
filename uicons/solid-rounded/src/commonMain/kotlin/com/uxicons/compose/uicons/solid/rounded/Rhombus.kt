package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Rhombus: ImageVector? = null

val Icons.Sr.Rhombus: ImageVector
    get() = _Rhombus ?: UXIcon(name = "Rhombus") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.47f, 8.46f)
                lineToRelative(-6.93f, -6.93f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, -7.07f, 0f)
                lineTo(1.53f, 8.46f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 7.07f)
                lineToRelative(6.93f, 6.93f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.07f, 0f)
                lineToRelative(6.93f, -6.93f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -7.07f)
                close()
            }
        }.also { _Rhombus = it}
