package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SwipeUp: ImageVector? = null

val Icons.Bs.SwipeUp: ImageVector
    get() = _SwipeUp ?: UXIcon(name = "SwipeUp") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 9.71f)
                lineTo(12f, 3.58f)
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
                close()
                moveTo(21f, 21.0f)
                lineToRelative(-9f, 0.01f)
                verticalLineToRelative(-8.2f)
                lineToRelative(9f, 2.35f)
                verticalLineToRelative(5.84f)
                close()
                moveTo(2.5f, 10f)
                verticalLineToRelative(-6f)
                lineTo(0f, 4f)
                lineTo(3.37f, 0.26f)
                curveToRelative(0.35f, -0.35f, 0.91f, -0.35f, 1.26f, 0f)
                lineToRelative(3.37f, 3.74f)
                horizontalLineToRelative(-2.5f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(-3f)
                close()
            }
        }.also { _SwipeUp = it}
