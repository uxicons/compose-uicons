package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BowArrow: ImageVector? = null

val Icons.Ss.BowArrow: ImageVector
    get() = _BowArrow ?: UXIcon(name = "BowArrow") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.7f, 1.72f)
                lineToRelative(0.01f, -0.01f)
                lineToRelative(-0.03f, -0.03f)
                arcTo(2.99f, 2.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22.32f, 0.32f)
                lineTo(22.29f, 0.29f)
                lineTo(22.29f, 0.3f)
                arcTo(2.95f, 2.95f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 0f)
                horizontalLineTo(18f)
                verticalLineTo(2f)
                horizontalLineToRelative(2.59f)
                lineTo(17.6f, 4.99f)
                arcTo(12.51f, 12.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.67f, 5.66f)
                lineToRelative(-0.71f, 0.71f)
                lineToRelative(8.13f, 8.13f)
                lineTo(4.59f, 18f)
                horizontalLineTo(0f)
                verticalLineToRelative(2f)
                horizontalLineTo(2.59f)
                lineTo(0.29f, 22.29f)
                lineToRelative(1.41f, 1.41f)
                lineTo(4f, 21.41f)
                verticalLineTo(24f)
                horizontalLineTo(6f)
                verticalLineTo(19.41f)
                lineToRelative(3.5f, -3.5f)
                lineToRelative(8.13f, 8.13f)
                lineToRelative(0.71f, -0.71f)
                arcTo(12.51f, 12.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19.01f, 6.4f)
                lineTo(22f, 3.41f)
                verticalLineTo(6f)
                horizontalLineToRelative(2f)
                verticalLineTo(3f)
                arcTo(2.95f, 2.95f, 0f, isMoreThanHalf = false, isPositiveArc = false, 23.7f, 1.72f)
                close()
                moveTo(2.82f, 6.4f)
                arcToRelative(10.52f, 10.52f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13.36f, 0f)
                lineTo(9.5f, 13.08f)
                close()
                moveTo(17.6f, 21.18f)
                lineTo(10.92f, 14.5f)
                lineTo(17.6f, 7.82f)
                arcTo(10.52f, 10.52f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17.6f, 21.18f)
                close()
            }
        }.also { _BowArrow = it}
