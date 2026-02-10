package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Cloud: ImageVector? = null

val Icons.Rr.Cloud: ImageVector
    get() = _Cloud ?: UXIcon(name = "Cloud") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.79f, 7.21f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 9f)
                arcToRelative(7.92f, 7.92f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.9f, 3.67f)
                arcTo(5.49f, 5.49f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.5f, 23f)
                horizontalLineTo(16f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17.79f, 7.21f)
                close()
                moveTo(16f, 21f)
                horizontalLineTo(5.5f)
                arcToRelative(3.49f, 3.49f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.87f, -6.87f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.55f, -1.56f)
                arcTo(5.94f, 5.94f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 9f)
                arcToRelative(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.94f, -0.8f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.86f, 0.86f)
                arcTo(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 21f)
                close()
            }
        }.also { _Cloud = it}
