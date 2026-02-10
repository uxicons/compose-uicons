package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CaretCircleUp: ImageVector? = null

val Icons.Bs.CaretCircleUp: ImageVector
    get() = _CaretCircleUp ?: UXIcon(name = "CaretCircleUp") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, 0f, 12f)
                arcTo(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 0f)
                close()
                moveTo(12f, 21f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = true, isPositiveArc = false, -9f, -9f)
                arcTo(9.01f, 9.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 21f)
                close()
                moveTo(6f, 14f)
                lineTo(18f, 14f)
                lineTo(12.83f, 8.35f)
                arcToRelative(1.11f, 1.11f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.66f, 0f)
                close()
            }
        }.also { _CaretCircleUp = it}
