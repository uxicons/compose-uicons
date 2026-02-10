package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Skating: ImageVector? = null

val Icons.Rs.Skating: ImageVector
    get() = _Skating ?: UXIcon(name = "Skating") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 2.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 18.5f, 0f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 2.5f)
                close()
                moveTo(8.22f, 15.29f)
                lineTo(3.4f, 20.11f)
                lineTo(2.2f, 18.89f)
                lineToRelative(-1.43f, 1.4f)
                lineToRelative(2.8f, 2.86f)
                arcToRelative(2.98f, 2.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.11f, 0.9f)
                horizontalLineToRelative(0.03f)
                arcToRelative(2.98f, 2.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.1f, -0.86f)
                lineToRelative(-1.4f, -1.43f)
                arcToRelative(1.01f, 1.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.71f, 0.29f)
                arcToRelative(0.99f, 0.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.7f, -0.3f)
                lineToRelative(-0.2f, -0.2f)
                lineToRelative(4.83f, -4.83f)
                close()
                moveTo(17f, 21f)
                horizontalLineToRelative(2f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3f, 3f)
                horizontalLineTo(12f)
                verticalLineTo(22f)
                horizontalLineToRelative(2f)
                verticalLineTo(18.27f)
                lineTo(8.8f, 13.33f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.06f, -4.3f)
                lineTo(11.78f, 6f)
                horizontalLineTo(4f)
                verticalLineTo(4f)
                horizontalLineToRelative(9.96f)
                lineToRelative(2.06f, 1.72f)
                arcTo(3.01f, 3.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17f, 7.9f)
                arcToRelative(2.98f, 2.98f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.88f, 2.16f)
                horizontalLineToRelative(0f)
                lineTo(12.29f, 13.89f)
                lineTo(16f, 17.42f)
                verticalLineTo(22f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17f, 21f)
                close()
                moveTo(9.87f, 11.17f)
                arcToRelative(0.98f, 0.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.31f, 0.71f)
                lineToRelative(0.66f, 0.63f)
                lineToRelative(3.87f, -3.87f)
                arcTo(1.82f, 1.82f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15f, 7.93f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.31f, -0.71f)
                lineToRelative(-0.71f, -0.59f)
                lineToRelative(-3.83f, 3.83f)
                arcTo(0.99f, 0.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.87f, 11.17f)
                close()
            }
        }.also { _Skating = it}
