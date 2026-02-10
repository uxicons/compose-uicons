package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Camping: ImageVector? = null

val Icons.Ss.Camping: ImageVector
    get() = _Camping ?: UXIcon(name = "Camping") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 16.92f)
                lineTo(16.18f, 24f)
                horizontalLineTo(7.82f)
                close()
                moveTo(23.59f, 19.6f)
                lineTo(12f, -0.01f)
                lineTo(0.41f, 19.6f)
                arcTo(2.91f, 2.91f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.92f, 24f)
                horizontalLineTo(5.49f)
                lineTo(12f, 12.99f)
                lineTo(18.51f, 24f)
                horizontalLineToRelative(2.58f)
                arcToRelative(2.91f, 2.91f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.51f, -4.4f)
                close()
            }
        }.also { _Camping = it}
