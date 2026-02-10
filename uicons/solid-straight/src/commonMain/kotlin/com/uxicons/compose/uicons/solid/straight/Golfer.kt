package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Golfer: ImageVector? = null

val Icons.Ss.Golfer: ImageVector
    get() = _Golfer ?: UXIcon(name = "Golfer") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8.5f, 3.5f)
                moveToRelative(-2.5f, 0f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 5f, 0f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, -5f, 0f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17.33f, 0.86f)
                curveToRelative(-0.32f, -0.72f, -1.17f, -1.05f, -1.89f, -0.74f)
                lineToRelative(-2.32f, 0.99f)
                lineToRelative(0.78f, 1.84f)
                lineToRelative(1.83f, -0.78f)
                lineToRelative(2.98f, 6.83f)
                horizontalLineToRelative(-3.52f)
                lineToRelative(-5.43f, -1.88f)
                curveToRelative(-0.73f, -0.26f, -1.54f, -0.09f, -2.11f, 0.44f)
                curveToRelative(-0.57f, 0.53f, -0.8f, 1.32f, -0.59f, 2.1f)
                lineToRelative(1.75f, 5.88f)
                lineToRelative(-4.71f, 8.46f)
                horizontalLineToRelative(2.35f)
                lineToRelative(3.88f, -7f)
                horizontalLineToRelative(1.68f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-8f)
                lineToRelative(-1.81f, -5.92f)
                lineToRelative(2.64f, 0.92f)
                horizontalLineToRelative(6.17f)
                verticalLineToRelative(-1.71f)
                close()
            }
        }.also { _Golfer = it}
