package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CaretCircleRight: ImageVector? = null

val Icons.Rs.CaretCircleRight: ImageVector
    get() = _CaretCircleRight ?: UXIcon(name = "CaretCircleRight") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 12f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, 12f, 0f)
                arcTo(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 12f)
                close()
                moveTo(2f, 12f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = true, isPositiveArc = false, 12f, 2f)
                arcTo(10.01f, 10.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 12f)
                close()
                moveTo(10f, 6f)
                lineTo(10f, 18f)
                lineToRelative(5.65f, -5.17f)
                arcToRelative(1.11f, 1.11f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -1.66f)
                close()
            }
        }.also { _CaretCircleRight = it}
