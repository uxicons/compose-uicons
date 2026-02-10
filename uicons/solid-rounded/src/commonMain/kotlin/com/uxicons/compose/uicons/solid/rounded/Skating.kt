package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Skating: ImageVector? = null

val Icons.Sr.Skating: ImageVector
    get() = _Skating ?: UXIcon(name = "Skating") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.5f, 0f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 21f, 2.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18.5f, 0f)
                close()
                moveTo(8.71f, 18.47f)
                lineTo(5.68f, 21.5f)
                lineToRelative(0.2f, 0.2f)
                arcToRelative(0.99f, 0.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.7f, 0.3f)
                arcToRelative(0.94f, 0.94f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.71f, -0.29f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.4f, 1.43f)
                arcTo(2.98f, 2.98f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.6f, 24f)
                horizontalLineTo(6.57f)
                arcToRelative(2.98f, 2.98f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.11f, -0.9f)
                lineToRelative(-2.8f, -2.86f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1.43f, -1.4f)
                lineToRelative(1.2f, 1.22f)
                lineTo(7.29f, 17.06f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.41f, 1.41f)
                close()
                moveTo(18f, 20f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1f, 1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, 1f)
                verticalLineTo(18.84f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.31f, -0.72f)
                lineToRelative(-3.4f, -3.23f)
                lineToRelative(4.83f, -4.83f)
                horizontalLineToRelative(0f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.1f, -4.34f)
                lineToRelative(-0.67f, -0.56f)
                arcTo(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13.14f, 4f)
                horizontalLineTo(5f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 6f)
                horizontalLineToRelative(7.78f)
                lineTo(9f, 9.78f)
                arcToRelative(3.35f, 3.35f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.06f, 4.8f)
                lineTo(14f, 19.27f)
                verticalLineTo(22f)
                horizontalLineTo(12f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 2f)
                horizontalLineToRelative(4f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, -3f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18f, 20f)
                close()
            }
        }.also { _Skating = it}
