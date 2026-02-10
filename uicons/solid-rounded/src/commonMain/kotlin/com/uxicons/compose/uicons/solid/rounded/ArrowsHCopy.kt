package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowsHCopy: ImageVector? = null

val Icons.Sr.ArrowsHCopy: ImageVector
    get() = _ArrowsHCopy ?: UXIcon(name = "ArrowsHCopy") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.33f, 18.25f)
                lineToRelative(-2.88f, 2.83f)
                curveToRelative(-0.11f, 0.11f, -0.26f, 0.24f, -0.41f, 0.39f)
                verticalLineTo(2.52f)
                curveToRelative(0.16f, 0.15f, 0.31f, 0.28f, 0.42f, 0.4f)
                lineToRelative(2.88f, 2.83f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 1.4f, -1.43f)
                lineTo(14.86f, 1.5f)
                curveToRelative(-0.2f, -0.2f, -0.51f, -0.49f, -0.84f, -0.78f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.98f, 0f)
                curveToRelative(-0.33f, 0.29f, -0.64f, 0.57f, -0.83f, 0.77f)
                lineTo(6.33f, 4.32f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.4f, 1.43f)
                lineToRelative(2.88f, -2.83f)
                curveToRelative(0.11f, -0.11f, 0.26f, -0.24f, 0.41f, -0.39f)
                verticalLineTo(21.48f)
                curveToRelative(-0.16f, -0.15f, -0.31f, -0.28f, -0.42f, -0.4f)
                lineTo(7.73f, 18.25f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.4f, 1.43f)
                lineTo(9.21f, 22.5f)
                curveToRelative(0.2f, 0.2f, 0.51f, 0.49f, 0.84f, 0.78f)
                arcToRelative(2.99f, 2.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.98f, 0.75f)
                horizontalLineToRelative(0.01f)
                arcToRelative(2.99f, 2.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.98f, -0.75f)
                curveToRelative(0.33f, -0.29f, 0.64f, -0.57f, 0.83f, -0.77f)
                lineToRelative(2.88f, -2.83f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.4f, -1.43f)
                close()
            }
        }.also { _ArrowsHCopy = it}
