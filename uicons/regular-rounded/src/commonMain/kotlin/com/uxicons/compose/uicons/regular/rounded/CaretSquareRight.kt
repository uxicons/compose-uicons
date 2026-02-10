package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CaretSquareRight: ImageVector? = null

val Icons.Rr.CaretSquareRight: ImageVector
    get() = _CaretSquareRight ?: UXIcon(name = "CaretSquareRight") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 5f)
                lineTo(24f, 19f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5f, 5f)
                lineTo(5f, 24f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5f, -5f)
                lineTo(0f, 5f)
                arcTo(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 0f)
                lineTo(19f, 0f)
                arcTo(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 5f)
                close()
                moveTo(2f, 19f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 3f)
                lineTo(19f, 22f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, -3f)
                lineTo(22f, 5f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, -3f)
                lineTo(5f, 2f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 5f)
                close()
                moveTo(10.6f, 17.73f)
                lineTo(15.75f, 12.64f)
                arcToRelative(0.9f, 0.9f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -1.29f)
                lineTo(10.6f, 6.27f)
                arcToRelative(0.92f, 0.92f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.57f, 0.64f)
                lineTo(9.03f, 17.09f)
                arcTo(0.92f, 0.92f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10.6f, 17.73f)
                close()
            }
        }.also { _CaretSquareRight = it}
