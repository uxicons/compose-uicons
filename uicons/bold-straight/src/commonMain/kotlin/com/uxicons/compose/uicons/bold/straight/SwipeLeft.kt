package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SwipeLeft: ImageVector? = null

val Icons.Bs.SwipeLeft: ImageVector
    get() = _SwipeLeft ?: UXIcon(name = "SwipeLeft") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(9f, 3.58f)
                curveToRelative(0f, -0.75f, -0.54f, -1.44f, -1.27f, -1.56f)
                curveToRelative(-0.94f, -0.15f, -1.74f, 0.57f, -1.74f, 1.48f)
                verticalLineToRelative(15.2f)
                lineToRelative(-2.64f, -2.22f)
                curveToRelative(-0.87f, -0.72f, -2.15f, -0.6f, -2.87f, 0.26f)
                curveToRelative(-0.72f, 0.87f, -0.6f, 2.15f, 0.26f, 2.87f)
                lineToRelative(5.27f, 4.39f)
                lineToRelative(15f, -0.01f)
                verticalLineToRelative(-11.15f)
                lineToRelative(-12f, -3.13f)
                lineTo(9.0f, 3.58f)
                close()
                moveTo(18f, 15.16f)
                verticalLineToRelative(5.84f)
                lineToRelative(-9f, 0.01f)
                verticalLineToRelative(-8.2f)
                lineToRelative(9f, 2.35f)
                close()
                moveTo(24f, 3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(2.5f)
                lineToRelative(-3.74f, -3.37f)
                curveToRelative(-0.35f, -0.35f, -0.35f, -0.91f, 0f, -1.26f)
                lineToRelative(3.74f, -3.37f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(6f)
                close()
            }
        }.also { _SwipeLeft = it}
