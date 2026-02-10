package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Flushed: ImageVector? = null

val Icons.Ss.Flushed: ImageVector
    get() = _Flushed ?: UXIcon(name = "Flushed") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 10f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, 0f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17f, 10f)
                close()
                moveTo(9f, 10f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, 0f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 10f)
                close()
                moveTo(24f, 12f)
                arcTo(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 24f)
                curveTo(-3.9f, 23.4f, -3.89f, 0.6f, 12f, 0f)
                arcTo(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 12f)
                close()
                moveTo(8f, 13f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 7f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 13f)
                close()
                moveTo(16f, 16f)
                lineTo(8f, 16f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(8f)
                close()
                moveTo(19f, 10f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -6f, 0f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 10f)
                close()
            }
        }.also { _Flushed = it}
