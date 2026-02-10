package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MinusSmall: ImageVector? = null

val Icons.Br.MinusSmall: ImageVector
    get() = _MinusSmall ?: UXIcon(name = "MinusSmall") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(16.5f, 13.5f)
            horizontalLineToRelative(-9f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -3f)
            horizontalLineToRelative(9f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 3f)
            close()
        }
    }.also { _MinusSmall = it }
