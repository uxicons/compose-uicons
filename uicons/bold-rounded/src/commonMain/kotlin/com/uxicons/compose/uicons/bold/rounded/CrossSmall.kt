package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CrossSmall: ImageVector? = null

val Icons.Br.CrossSmall: ImageVector
    get() = _CrossSmall ?: UXIcon(name = "CrossSmall") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(14.12f, 12f)
            lineTo(18f, 8.12f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15.88f, 6f)
            lineTo(12f, 9.88f)
            lineTo(8.11f, 5.99f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 5.99f, 8.11f)
            lineTo(9.88f, 12f)
            lineTo(6f, 15.88f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 8.12f, 18f)
            lineTo(12f, 14.12f)
            lineTo(15.88f, 18f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18f, 15.88f)
            close()
        }
    }.also { _CrossSmall = it }
