package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CaretCircleUp: ImageVector? = null

val Icons.Sr.CaretCircleUp: ImageVector
    get() = _CaretCircleUp ?: UXIcon(name = "CaretCircleUp") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 24f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, 12f)
                arcTo(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 24f)
                close()
                moveTo(6.27f, 12.4f)
                lineTo(11.36f, 7.25f)
                arcToRelative(0.9f, 0.9f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.29f, 0f)
                lineTo(17.73f, 12.4f)
                arcToRelative(0.92f, 0.92f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.64f, 1.57f)
                horizontalLineTo(6.91f)
                arcTo(0.92f, 0.92f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.27f, 12.4f)
                close()
            }
        }.also { _CaretCircleUp = it}
