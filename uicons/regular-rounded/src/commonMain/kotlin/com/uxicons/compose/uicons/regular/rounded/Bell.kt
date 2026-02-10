package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Bell: ImageVector? = null

val Icons.Rr.Bell: ImageVector
    get() = _Bell ?: UXIcon(name = "Bell") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.55f, 13.66f)
                lineToRelative(-1.9f, -6.84f)
                arcTo(9.32f, 9.32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.58f, 7.3f)
                lineTo(1.1f, 13.91f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.99f, 20f)
                lineTo(7.1f, 20f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.8f, 0f)
                horizontalLineToRelative(0.84f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.82f, -6.34f)
                close()
                moveTo(12f, 22f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.82f, -2f)
                horizontalLineToRelative(5.63f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 22f)
                close()
                moveTo(20.13f, 16.82f)
                arcTo(2.98f, 2.98f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17.74f, 18f)
                lineTo(5.99f, 18f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.93f, -3.65f)
                lineToRelative(1.47f, -6.62f)
                arcToRelative(7.32f, 7.32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14.2f, -0.37f)
                lineToRelative(1.9f, 6.84f)
                arcTo(2.98f, 2.98f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20.13f, 16.82f)
                close()
            }
        }.also { _Bell = it}
