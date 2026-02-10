package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SquarePhoneFlip: ImageVector? = null

val Icons.Br.SquarePhoneFlip: ImageVector
    get() = _SquarePhoneFlip ?: UXIcon(name = "SquarePhoneFlip") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(18.5f, 0f)
            horizontalLineToRelative(-13f)
            curveToRelative(-3.03f, 0f, -5.5f, 2.47f, -5.5f, 5.5f)
            verticalLineToRelative(13f)
            curveToRelative(0f, 3.03f, 2.47f, 5.5f, 5.5f, 5.5f)
            horizontalLineToRelative(13f)
            curveToRelative(3.03f, 0f, 5.5f, -2.47f, 5.5f, -5.5f)
            verticalLineToRelative(-13f)
            curveToRelative(0f, -3.03f, -2.47f, -5.5f, -5.5f, -5.5f)
            close()
            moveTo(21f, 18.5f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            horizontalLineToRelative(-13f)
            curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
            verticalLineToRelative(-13f)
            curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
            horizontalLineToRelative(13f)
            curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
            close()
            moveTo(17.63f, 6.63f)
            curveToRelative(0.59f, 0.59f, 0.87f, 1.36f, 0.87f, 2.13f)
            curveToRelative(0f, 4.26f, -5.78f, 9.74f, -9.74f, 9.74f)
            lineToRelative(-0.0f, 0.0f)
            curveToRelative(-0.77f, 0f, -1.54f, -0.28f, -2.13f, -0.87f)
            lineToRelative(-0.77f, -0.86f)
            curveToRelative(-0.47f, -0.47f, -0.47f, -1.25f, 0f, -1.72f)
            lineToRelative(1.51f, -1.19f)
            curveToRelative(0.47f, -0.47f, 1.25f, -0.47f, 1.72f, 0f)
            lineToRelative(1.36f, 1.12f)
            curveToRelative(2.21f, -0.84f, 3.58f, -2.15f, 4.54f, -4.54f)
            lineToRelative(-1.12f, -1.36f)
            curveToRelative(-0.47f, -0.47f, -0.47f, -1.25f, 0f, -1.72f)
            lineToRelative(1.2f, -1.52f)
            curveToRelative(0.47f, -0.47f, 1.25f, -0.47f, 1.72f, 0f)
            lineToRelative(0.86f, 0.77f)
            close()
        }
    }.also { _SquarePhoneFlip = it }
