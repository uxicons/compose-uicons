package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AngleSquareRight: ImageVector? = null

val Icons.Sr.AngleSquareRight: ImageVector
    get() = _AngleSquareRight ?: UXIcon(name = "AngleSquareRight") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(0f, 5f)
                lineTo(0f, 19f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 5f)
                lineTo(19f, 24f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, -5f)
                lineTo(24f, 5f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5f, -5f)
                lineTo(5f, 0f)
                arcTo(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 5f)
                close()
                moveTo(16f, 12f)
                arcToRelative(2.99f, 2.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.75f, 1.99f)
                curveToRelative(-0.29f, 0.33f, -0.57f, 0.64f, -0.78f, 0.84f)
                lineTo(11.65f, 17.7f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1.43f, -1.4f)
                lineTo(13.05f, 13.42f)
                curveToRelative(0.19f, -0.19f, 0.44f, -0.47f, 0.7f, -0.76f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -1.32f)
                curveToRelative(-0.26f, -0.29f, -0.51f, -0.57f, -0.69f, -0.75f)
                lineTo(10.22f, 7.7f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1.43f, -1.4f)
                lineToRelative(2.83f, 2.88f)
                curveToRelative(0.2f, 0.2f, 0.48f, 0.51f, 0.77f, 0.83f)
                arcTo(2.99f, 2.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 12f)
                close()
            }
        }.also { _AngleSquareRight = it}
