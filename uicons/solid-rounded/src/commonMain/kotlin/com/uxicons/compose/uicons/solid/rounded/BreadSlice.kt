package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BreadSlice: ImageVector? = null

val Icons.Sr.BreadSlice: ImageVector
    get() = _BreadSlice ?: UXIcon(name = "BreadSlice") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.93f, 5.18f)
                horizontalLineToRelative(0f)
                arcTo(5.12f, 5.12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18.85f, 1f)
                lineTo(6.24f, 1f)
                curveTo(2.85f, 1f, 0.48f, 2.6f, 0.07f, 5.18f)
                arcTo(4.99f, 4.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.61f, 9.65f)
                arcTo(1.12f, 1.12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 10.45f)
                lineTo(2f, 18f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 5f)
                lineTo(17f, 23f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, -5f)
                lineTo(22f, 10.45f)
                arcToRelative(1.11f, 1.11f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.39f, -0.79f)
                arcTo(4.99f, 4.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 23.93f, 5.18f)
                close()
                moveTo(8f, 18f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -2f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 18f)
                close()
                moveTo(8f, 14f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -2f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 14f)
                close()
                moveTo(12f, 18f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -2f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 18f)
                close()
            }
        }.also { _BreadSlice = it}
