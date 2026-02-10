package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CrossCircle: ImageVector? = null

val Icons.Rr.CrossCircle: ImageVector
    get() = _CrossCircle ?: UXIcon(name = "CrossCircle") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16f, 8f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.41f, 0f)
                lineTo(12f, 10.59f)
                lineTo(9.41f, 8f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 9.41f)
                lineTo(10.59f, 12f)
                lineTo(8f, 14.59f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.41f, 16f)
                lineTo(12f, 13.41f)
                lineTo(14.59f, 16f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 14.59f)
                lineTo(13.41f, 12f)
                lineTo(16f, 9.41f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 8f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = false, 24f, 12f)
                arcTo(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 0f)
                close()
                moveTo(12f, 22f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = true, isPositiveArc = true, 22f, 12f)
                arcTo(10.01f, 10.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 22f)
                close()
            }
        }.also { _CrossCircle = it}
