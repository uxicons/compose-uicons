package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Hastag: ImageVector? = null

val Icons.Rr.Hastag: ImageVector
    get() = _Hastag ?: UXIcon(name = "Hastag") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23f, 7f)
                lineTo(18.19f, 7f)
                lineToRelative(0.8f, -5.87f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, -1.98f, -0.27f)
                lineTo(16.17f, 7f)
                lineTo(9.19f, 7f)
                lineToRelative(0.8f, -5.87f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 8.01f, 0.86f)
                lineTo(7.17f, 7f)
                lineTo(2f, 7f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 9f)
                lineTo(6.9f, 9f)
                lineToRelative(-0.82f, 6f)
                lineTo(1f, 15f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 2f)
                lineTo(5.81f, 17f)
                lineToRelative(-0.8f, 5.87f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.98f, 0.27f)
                lineTo(7.83f, 17f)
                horizontalLineToRelative(6.98f)
                lineToRelative(-0.8f, 5.87f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.98f, 0.27f)
                lineTo(16.83f, 17f)
                lineTo(22f, 17f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -2f)
                lineTo(17.1f, 15f)
                lineToRelative(0.82f, -6f)
                lineTo(23f, 9f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 23f, 7f)
                close()
                moveTo(15.08f, 15f)
                lineTo(8.1f, 15f)
                lineToRelative(0.82f, -6f)
                lineTo(15.9f, 9f)
                close()
            }
        }.also { _Hastag = it}
