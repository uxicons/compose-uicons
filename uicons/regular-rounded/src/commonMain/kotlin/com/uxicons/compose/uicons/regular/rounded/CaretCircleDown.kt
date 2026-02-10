package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CaretCircleDown: ImageVector? = null

val Icons.Rr.CaretCircleDown: ImageVector
    get() = _CaretCircleDown ?: UXIcon(name = "CaretCircleDown") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 24f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, 24f, 12f)
                arcTo(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 24f)
                close()
                moveTo(12f, 2f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = true, isPositiveArc = false, 22f, 12f)
                arcTo(10.01f, 10.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 2f)
                close()
                moveTo(6.27f, 11.6f)
                lineToRelative(5.09f, 5.15f)
                arcToRelative(0.9f, 0.9f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.29f, 0f)
                lineTo(17.73f, 11.6f)
                arcToRelative(0.92f, 0.92f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.64f, -1.57f)
                horizontalLineTo(6.91f)
                arcTo(0.92f, 0.92f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.27f, 11.6f)
                close()
            }
        }.also { _CaretCircleDown = it}
