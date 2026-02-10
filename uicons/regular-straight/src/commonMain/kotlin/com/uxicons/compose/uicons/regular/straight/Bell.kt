package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Bell: ImageVector? = null

val Icons.Rs.Bell: ImageVector
    get() = _Bell ?: UXIcon(name = "Bell") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.26f, 16.2f)
                lineToRelative(-2.6f, -9.37f)
                arcTo(9.32f, 9.32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.58f, 7.3f)
                lineTo(0.56f, 16.35f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.49f, 20f)
                lineTo(7.1f, 20f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.8f, 0f)
                horizontalLineToRelative(3.47f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.89f, -3.8f)
                close()
                moveTo(12f, 22f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.82f, -2f)
                horizontalLineToRelative(5.63f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 22f)
                close()
                moveTo(21.16f, 17.61f)
                arcToRelative(0.99f, 0.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.8f, 0.4f)
                lineTo(3.49f, 18f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.98f, -1.22f)
                lineToRelative(2.01f, -9.05f)
                arcToRelative(7.32f, 7.32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14.2f, -0.37f)
                lineToRelative(2.6f, 9.37f)
                arcTo(0.99f, 0.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21.16f, 17.61f)
                close()
            }
        }.also { _Bell = it}
