package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Caravan: ImageVector? = null

val Icons.Sr.Caravan: ImageVector
    get() = _Caravan ?: UXIcon(name = "Caravan") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8f, 8.5f)
                verticalLineToRelative(2f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.5f, 0.5f)
                horizontalLineToRelative(-3f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.5f, -0.5f)
                verticalLineToRelative(-2f)
                arcTo(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.5f, 8f)
                horizontalLineToRelative(3f)
                arcTo(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 8.5f)
                close()
                moveTo(16.5f, 8f)
                horizontalLineToRelative(-2f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.5f, 0.5f)
                lineTo(14f, 21f)
                horizontalLineToRelative(3f)
                lineTo(17f, 8.5f)
                arcTo(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16.5f, 8f)
                close()
                moveTo(7.5f, 24f)
                arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -7f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.5f, 24f)
                close()
                moveTo(24f, 20f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, 1f)
                lineTo(19f, 21f)
                lineTo(19f, 8.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16.5f, 6f)
                horizontalLineToRelative(-2f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 8.5f)
                verticalLineToRelative(8.84f)
                arcToRelative(5.52f, 5.52f, 0f, isMoreThanHalf = false, isPositiveArc = false, -9.98f, 2.68f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 16f)
                lineTo(0f, 5f)
                arcTo(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 0f)
                lineTo(17f, 0f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 5f)
                lineTo(22f, 19f)
                horizontalLineToRelative(1f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 20f)
                close()
                moveTo(10f, 8.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.5f, 6f)
                horizontalLineToRelative(-3f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 8.5f)
                verticalLineToRelative(2f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.5f, 13f)
                horizontalLineToRelative(3f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10f, 10.5f)
                close()
            }
        }.also { _Caravan = it}
