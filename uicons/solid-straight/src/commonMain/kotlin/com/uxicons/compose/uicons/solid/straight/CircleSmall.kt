package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleSmall: ImageVector? = null

val Icons.Ss.CircleSmall: ImageVector
    get() = _CircleSmall ?: UXIcon(name = "CircleSmall") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 19f)
                arcToRelative(7f, 7f, 0f, isMoreThanHalf = true, isPositiveArc = true, 7f, -7f)
                arcTo(7.01f, 7.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 19f)
                close()
            }
        }.also { _CircleSmall = it}
