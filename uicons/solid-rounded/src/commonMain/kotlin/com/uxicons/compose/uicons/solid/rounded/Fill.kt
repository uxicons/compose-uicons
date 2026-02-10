package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Fill: ImageVector? = null

val Icons.Sr.Fill: ImageVector
    get() = _Fill ?: UXIcon(name = "Fill") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.45f, 13.86f)
                lineToRelative(-8.67f, 8.67f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, -7.07f, 0f)
                lineToRelative(-4.24f, -4.24f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -7.07f)
                lineToRelative(5.9f, -5.9f)
                lineToRelative(-2.85f, -2.89f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1.42f, -1.4f)
                lineToRelative(8.97f, 9.08f)
                lineToRelative(0.01f, 0.01f)
                arcToRelative(0.99f, 0.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.38f, -1.44f)
                lineToRelative(-7.21f, -7.3f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.63f, -1.09f)
                lineToRelative(13f, 13f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1.41f, 1.41f)
                close()
                moveTo(20.69f, 18.43f)
                curveToRelative(-0.73f, 1.06f, -1.69f, 2.29f, -1.69f, 3.07f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 0f)
                curveToRelative(0f, -0.85f, -0.94f, -2.04f, -1.67f, -3.08f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.64f, 0.01f)
                close()
            }
        }.also { _Fill = it}
