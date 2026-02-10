package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Gift: ImageVector? = null

val Icons.Rs.Gift: ImageVector
    get() = _Gift ?: UXIcon(name = "Gift") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 7f)
                lineTo(17.87f, 7f)
                arcTo(6.55f, 6.55f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 2f)
                lineTo(18f, 2f)
                curveToRelative(0f, 2.88f, -1.97f, 4.31f, -4.15f, 4.8f)
                arcTo(9.24f, 9.24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15f, 3f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 3f)
                arcToRelative(9.24f, 9.24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.15f, 3.8f)
                curveTo(7.97f, 6.31f, 6f, 4.88f, 6f, 2f)
                lineTo(4f, 2f)
                arcTo(6.55f, 6.55f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.13f, 7f)
                lineTo(3f, 7f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, 3f)
                verticalLineToRelative(4f)
                lineTo(2f, 14f)
                lineTo(2f, 24f)
                lineTo(22f, 24f)
                lineTo(22f, 14f)
                horizontalLineToRelative(2f)
                lineTo(24f, 10f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 7f)
                close()
                moveTo(12f, 2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 1f)
                arcToRelative(7.71f, 7.71f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, 3.01f)
                arcTo(7.71f, 7.71f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11f, 3f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 2f)
                close()
                moveTo(2f, 10f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 9f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(3f)
                lineTo(2f, 12f)
                close()
                moveTo(4f, 14f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(8f)
                lineTo(4f, 22f)
                close()
                moveTo(20f, 22f)
                lineTo(13f, 22f)
                lineTo(13f, 14f)
                horizontalLineToRelative(7f)
                close()
                moveTo(22f, 12f)
                lineTo(13f, 12f)
                lineTo(13f, 9f)
                horizontalLineToRelative(8f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 1f)
                close()
            }
        }.also { _Gift = it}
