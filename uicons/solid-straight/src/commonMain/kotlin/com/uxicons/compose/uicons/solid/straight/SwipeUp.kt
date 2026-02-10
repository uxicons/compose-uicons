package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SwipeUp: ImageVector? = null

val Icons.Ss.SwipeUp: ImageVector
    get() = _SwipeUp ?: UXIcon(name = "SwipeUp") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(3f, 11f)
                lineTo(3f, 3.11f)
                lineToRelative(-1.57f, 1.57f)
                lineTo(0.01f, 3.27f)
                lineTo(2.77f, 0.51f)
                curveToRelative(0.69f, -0.69f, 1.82f, -0.69f, 2.52f, 0f)
                lineToRelative(2.76f, 2.76f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(-1.64f, -1.64f)
                verticalLineToRelative(7.96f)
                horizontalLineToRelative(-2f)
                close()
                moveTo(13f, 10f)
                lineTo(13f, 2.11f)
                curveToRelative(0f, -1.0f, -0.68f, -1.92f, -1.66f, -2.08f)
                curveToRelative(-1.25f, -0.2f, -2.34f, 0.76f, -2.34f, 1.97f)
                verticalLineToRelative(14.9f)
                lineToRelative(-2.25f, -2.29f)
                curveToRelative(-0.1f, -0.1f, -0.27f, -0.22f, -0.49f, -0.37f)
                curveToRelative(-0.93f, -0.52f, -2.16f, -0.31f, -2.85f, 0.62f)
                curveToRelative(-0.67f, 0.89f, -0.48f, 2.17f, 0.3f, 2.96f)
                lineToRelative(6.04f, 6.18f)
                horizontalLineToRelative(14.25f)
                verticalLineToRelative(-10.81f)
                lineToRelative(-11f, -3.19f)
                close()
            }
        }.also { _SwipeUp = it}
