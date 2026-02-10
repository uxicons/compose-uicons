package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BreadSlice: ImageVector? = null

val Icons.Ss.BreadSlice: ImageVector
    get() = _BreadSlice ?: UXIcon(name = "BreadSlice") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 1f)
                lineTo(5f, 1f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 9.98f)
                lineTo(2f, 23f)
                lineTo(22f, 23f)
                lineTo(22f, 9.98f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 1f)
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
