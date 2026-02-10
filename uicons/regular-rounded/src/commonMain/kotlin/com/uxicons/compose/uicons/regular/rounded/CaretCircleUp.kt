package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CaretCircleUp: ImageVector? = null

val Icons.Rr.CaretCircleUp: ImageVector
    get() = _CaretCircleUp ?: UXIcon(name = "CaretCircleUp") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, 0f, 12f)
                arcTo(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 0f)
                close()
                moveTo(12f, 22f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = true, isPositiveArc = false, 2f, 12f)
                arcTo(10.01f, 10.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 22f)
                close()
                moveTo(17.73f, 12.4f)
                lineTo(12.64f, 7.25f)
                arcToRelative(0.9f, 0.9f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.29f, 0f)
                lineTo(6.27f, 12.4f)
                arcToRelative(0.92f, 0.92f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.64f, 1.57f)
                lineTo(17.09f, 13.97f)
                arcTo(0.92f, 0.92f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17.73f, 12.4f)
                close()
            }
        }.also { _CaretCircleUp = it}
