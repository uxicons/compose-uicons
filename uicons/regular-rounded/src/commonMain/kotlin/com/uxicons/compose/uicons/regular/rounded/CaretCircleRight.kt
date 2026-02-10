package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CaretCircleRight: ImageVector? = null

val Icons.Rr.CaretCircleRight: ImageVector
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
                moveTo(11.6f, 17.73f)
                lineTo(16.75f, 12.64f)
                arcToRelative(0.9f, 0.9f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -1.29f)
                lineTo(11.6f, 6.27f)
                arcToRelative(0.92f, 0.92f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.57f, 0.64f)
                lineTo(10.03f, 17.09f)
                arcTo(0.92f, 0.92f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11.6f, 17.73f)
                close()
            }
        }.also { _CaretCircleRight = it}
