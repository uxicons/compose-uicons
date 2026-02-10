package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowsH: ImageVector? = null

val Icons.Sr.ArrowsH: ImageVector
    get() = _ArrowsH ?: UXIcon(name = "ArrowsH") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.31f, 10.01f)
                curveToRelative(-0.29f, -0.33f, -0.57f, -0.64f, -0.77f, -0.83f)
                lineTo(19.71f, 6.3f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.43f, 1.4f)
                lineToRelative(2.83f, 2.88f)
                curveToRelative(0.11f, 0.11f, 0.24f, 0.26f, 0.39f, 0.41f)
                horizontalLineTo(2.56f)
                curveToRelative(0.15f, -0.16f, 0.28f, -0.31f, 0.4f, -0.42f)
                lineTo(5.78f, 7.7f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.35f, 6.3f)
                lineTo(1.53f, 9.17f)
                curveToRelative(-0.2f, 0.2f, -0.49f, 0.51f, -0.78f, 0.84f)
                arcTo(2.99f, 2.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 11.99f)
                verticalLineToRelative(0.01f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.75f, 1.98f)
                curveToRelative(0.29f, 0.33f, 0.57f, 0.64f, 0.77f, 0.83f)
                lineTo(4.35f, 17.7f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.43f, -1.4f)
                lineTo(2.94f, 13.41f)
                curveToRelative(-0.11f, -0.11f, -0.24f, -0.26f, -0.39f, -0.41f)
                horizontalLineTo(21.51f)
                curveToRelative(-0.14f, 0.16f, -0.28f, 0.31f, -0.4f, 0.42f)
                lineTo(18.29f, 16.3f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 1.43f, 1.4f)
                lineToRelative(2.82f, -2.87f)
                curveToRelative(0.2f, -0.2f, 0.49f, -0.51f, 0.78f, -0.84f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 23.31f, 10.01f)
                close()
            }
        }.also { _ArrowsH = it}
