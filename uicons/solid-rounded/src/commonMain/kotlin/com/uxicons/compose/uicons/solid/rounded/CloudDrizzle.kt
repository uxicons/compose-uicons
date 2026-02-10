package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CloudDrizzle: ImageVector? = null

val Icons.Sr.CloudDrizzle: ImageVector
    get() = _CloudDrizzle ?: UXIcon(name = "CloudDrizzle") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 24f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, -1f)
                lineTo(11f, 22f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 0f)
                verticalLineToRelative(1f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 24f)
                close()
                moveTo(7f, 23f)
                lineTo(7f, 22f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, 0f)
                verticalLineToRelative(1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 0f)
                close()
                moveTo(23.99f, 12.37f)
                arcTo(7.18f, 7.18f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16.72f, 19f)
                lineTo(6.06f, 19f)
                curveToRelative(-5.44f, 0.24f, -7.83f, -4.84f, -4.62f, -8.18f)
                arcTo(2.1f, 2.1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.1f, 9.01f)
                curveTo(0.99f, 0.26f, 12.76f, -3.47f, 17.02f, 4.17f)
                arcToRelative(1.98f, 1.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.36f, 0.98f)
                arcTo(6.99f, 6.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, 23.99f, 12.37f)
                close()
                moveTo(10f, 15f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, 0f)
                verticalLineToRelative(1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 0f)
                close()
                moveTo(16f, 15f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, 0f)
                verticalLineToRelative(1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 0f)
                close()
                moveTo(19f, 23f)
                lineTo(19f, 22f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, 0f)
                verticalLineToRelative(1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 0f)
                close()
            }
        }.also { _CloudDrizzle = it}
