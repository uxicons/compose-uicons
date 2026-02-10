package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Camping: ImageVector? = null

val Icons.Sr.Camping: ImageVector
    get() = _Camping ?: UXIcon(name = "Camping") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.89f, 16.57f)
                lineTo(16.45f, 24f)
                lineTo(7.19f, 24f)
                lineToRelative(3.93f, -7.44f)
                arcToRelative(0.97f, 0.97f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.77f, 0.01f)
                close()
                moveTo(23.52f, 16.87f)
                lineTo(16.54f, 2.9f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -9.06f, -0.03f)
                lineTo(0.47f, 16.9f)
                arcTo(5.0f, 5.0f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.93f, 24f)
                lineToRelative(4.4f, -8.32f)
                arcToRelative(2.97f, 2.97f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.37f, 0.05f)
                lineTo(18.67f, 24f)
                lineTo(19f, 24f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.52f, -7.13f)
                close()
            }
        }.also { _Camping = it}
