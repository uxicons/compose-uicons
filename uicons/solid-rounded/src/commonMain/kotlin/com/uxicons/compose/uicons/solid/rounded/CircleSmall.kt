package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleSmall: ImageVector? = null

val Icons.Sr.CircleSmall: ImageVector
    get() = _CircleSmall ?: UXIcon(name = "CircleSmall") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 4.5f)
                arcTo(7.5f, 7.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 19.5f, 12f)
                arcTo(7.51f, 7.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 4.5f)
                close()
                moveTo(12f, 16.5f)
                arcTo(4.5f, 4.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 16.5f, 12f)
                arcTo(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 16.5f)
                close()
            }
        }.also { _CircleSmall = it}
