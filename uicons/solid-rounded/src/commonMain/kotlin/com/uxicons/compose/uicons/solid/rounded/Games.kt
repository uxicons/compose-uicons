package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Games: ImageVector? = null

val Icons.Sr.Games: ImageVector
    get() = _Games ?: UXIcon(name = "Games") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(11f, 4.5f)
                arcToRelative(6.45f, 6.45f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.99f, -3.44f)
                arcToRelative(9.7f, 9.7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.26f, 1.68f)
                arcToRelative(9.41f, 9.41f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.74f, 7.02f)
                arcToRelative(10.5f, 10.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.12f, 7.12f)
                arcToRelative(11.21f, 11.21f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.62f, 1.96f)
                lineToRelative(-9.47f, -9.46f)
                arcToRelative(6.48f, 6.48f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.21f, -4.87f)
                close()
                moveTo(9f, 4.5f)
                arcToRelative(4.5f, 4.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, -4.5f, 4.5f)
                arcToRelative(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.5f, -4.5f)
                close()
                moveTo(7.06f, 10.47f)
                arcToRelative(6.46f, 6.46f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.56f, 0.53f)
                curveToRelative(-0.16f, 0f, -0.31f, -0.01f, -0.47f, -0.02f)
                arcToRelative(9.44f, 9.44f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.5f, 2.55f)
                arcToRelative(9.84f, 9.84f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.55f, 1.48f)
                arcToRelative(0.48f, 0.48f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.08f, 0.58f)
                lineToRelative(-3.81f, 2.66f)
                verticalLineToRelative(0.01f)
                arcToRelative(3.24f, 3.24f, 0f, isMoreThanHalf = true, isPositiveArc = false, 4.63f, 4.46f)
                lineToRelative(0.01f, 0.01f)
                lineToRelative(2.57f, -3.72f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.6f, -0.12f)
                arcToRelative(10.08f, 10.08f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.51f, 1.11f)
                arcToRelative(9.33f, 9.33f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.73f, -0.34f)
                close()
            }
        }.also { _Games = it}
