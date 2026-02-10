package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Gift: ImageVector? = null

val Icons.Rr.Gift: ImageVector
    get() = _Gift ?: UXIcon(name = "Gift") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 7f)
                lineTo(18.26f, 7f)
                arcTo(5.14f, 5.14f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 3f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, 0f)
                curveToRelative(0f, 2.62f, -2.37f, 3.53f, -4.17f, 3.84f)
                arcTo(9.33f, 9.33f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15f, 3f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 3f)
                arcToRelative(9.33f, 9.33f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.17f, 3.84f)
                curveTo(8.37f, 6.53f, 6f, 5.62f, 6f, 3f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 3f)
                arcTo(5.14f, 5.14f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.74f, 7f)
                lineTo(4f, 7f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4f, 4f)
                verticalLineToRelative(1f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 2f)
                verticalLineToRelative(5f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 5f)
                lineTo(17f, 24f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, -5f)
                lineTo(22f, 14f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, -2f)
                lineTo(24f, 11f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 7f)
                close()
                moveTo(12f, 2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 1f)
                arcToRelative(7.71f, 7.71f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, 3.01f)
                arcTo(7.71f, 7.71f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11f, 3f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 2f)
                close()
                moveTo(2f, 11f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 9f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(3f)
                lineTo(2f, 12f)
                close()
                moveTo(4f, 19f)
                lineTo(4f, 14f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(8f)
                lineTo(7f, 22f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 19f)
                close()
                moveTo(20f, 19f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3f, 3f)
                lineTo(13f, 22f)
                lineTo(13f, 14f)
                horizontalLineToRelative(7f)
                close()
                moveTo(13f, 12f)
                lineTo(13f, 9f)
                horizontalLineToRelative(7f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 2f)
                verticalLineToRelative(1f)
                close()
            }
        }.also { _Gift = it}
