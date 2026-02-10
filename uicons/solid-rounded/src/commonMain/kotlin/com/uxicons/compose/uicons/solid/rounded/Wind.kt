package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Wind: ImageVector? = null

val Icons.Sr.Wind: ImageVector
    get() = _Wind ?: UXIcon(name = "Wind") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(0f, 12f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, -1f)
                lineTo(7f, 11f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 2f)
                lineTo(1f, 13f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 12f)
                close()
                moveTo(20.91f, 11.11f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 12f, 8f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 0f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = true, isPositiveArc = true, 3f, 3f)
                lineTo(11f, 11f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 2f)
                horizontalLineToRelative(9f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 2f)
                curveToRelative(-0.01f, 2.34f, -3.28f, 2.65f, -4.06f, 0.67f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.89f, 0.67f)
                curveTo(17.61f, 20.41f, 23.95f, 19.58f, 24f, 15f)
                arcTo(4.01f, 4.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20.91f, 11.11f)
                close()
                moveTo(11f, 16f)
                lineTo(1f, 16f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 2f)
                lineTo(11f, 18f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 2f)
                curveToRelative(-0.01f, 2.34f, -3.28f, 2.65f, -4.06f, 0.67f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, -1.89f, 0.67f)
                curveTo(8.62f, 25.41f, 14.95f, 24.58f, 15f, 20f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11f, 16f)
                close()
                moveTo(1f, 8f)
                lineTo(7f, 8f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, -4f)
                curveTo(10.95f, -0.58f, 4.61f, -1.41f, 3.06f, 2.67f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.89f, 0.67f)
                curveTo(5.72f, 1.35f, 8.99f, 1.66f, 9f, 4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, 6f)
                lineTo(1f, 6f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, 8f)
                close()
            }
        }.also { _Wind = it}
