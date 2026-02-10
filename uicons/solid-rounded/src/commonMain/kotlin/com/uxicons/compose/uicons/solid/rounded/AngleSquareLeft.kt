package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AngleSquareLeft: ImageVector? = null

val Icons.Sr.AngleSquareLeft: ImageVector
    get() = _AngleSquareLeft ?: UXIcon(name = "AngleSquareLeft") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 19f)
                verticalLineTo(5f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5f, -5f)
                horizontalLineTo(5f)
                arcTo(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 5f)
                verticalLineTo(19f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 5f)
                horizontalLineTo(19f)
                arcTo(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 19f)
                close()
                moveTo(8f, 12f)
                arcToRelative(2.99f, 2.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.75f, -1.99f)
                curveToRelative(0.29f, -0.33f, 0.57f, -0.64f, 0.78f, -0.84f)
                lineTo(12.35f, 6.3f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.43f, 1.4f)
                lineTo(10.95f, 10.58f)
                curveToRelative(-0.19f, 0.19f, -0.44f, 0.47f, -0.7f, 0.76f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 1.32f)
                curveToRelative(0.26f, 0.29f, 0.51f, 0.57f, 0.69f, 0.75f)
                lineTo(13.78f, 16.3f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.43f, 1.4f)
                lineTo(9.52f, 14.82f)
                curveToRelative(-0.2f, -0.2f, -0.48f, -0.51f, -0.77f, -0.83f)
                arcTo(2.99f, 2.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 12f)
                close()
            }
        }.also { _AngleSquareLeft = it}
