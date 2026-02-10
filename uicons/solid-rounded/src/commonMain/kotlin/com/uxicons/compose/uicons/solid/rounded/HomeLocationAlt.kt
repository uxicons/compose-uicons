package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HomeLocationAlt: ImageVector? = null

val Icons.Sr.HomeLocationAlt: ImageVector
    get() = _HomeLocationAlt ?: UXIcon(name = "HomeLocationAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.24f, 10.76f)
                arcToRelative(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8.49f, 8.48f)
                lineToRelative(3.51f, 3.43f)
                arcToRelative(1.05f, 1.05f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.47f, 0f)
                lineToRelative(3.51f, -3.43f)
                arcTo(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16.24f, 10.76f)
                close()
                moveTo(12f, 16.99f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = true, 2f, -2f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 16.99f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.8f, 5.58f)
                lineTo(14.8f, 0.85f)
                arcTo(4.98f, 4.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.2f, 0.85f)
                lineToRelative(-7f, 4.72f)
                arcTo(4.99f, 4.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 9.72f)
                verticalLineTo(19f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 5f)
                horizontalLineTo(9.75f)
                lineTo(6.36f, 20.68f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, 17.66f, 9.35f)
                horizontalLineToRelative(0f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 11.31f)
                lineTo(14.24f, 24f)
                horizontalLineTo(19f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, -5f)
                verticalLineTo(9.72f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21.8f, 5.58f)
                close()
            }
        }.also { _HomeLocationAlt = it}
