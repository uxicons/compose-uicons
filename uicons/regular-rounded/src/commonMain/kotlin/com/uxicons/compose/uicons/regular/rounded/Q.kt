package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Q: ImageVector? = null

val Icons.Rr.Q: ImageVector
    get() = _Q ?: UXIcon(name = "Q") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.71f, 22.29f)
                lineToRelative(-2.54f, -2.54f)
                curveToRelative(1.15f, -1.63f, 1.83f, -3.61f, 1.83f, -5.75f)
                verticalLineToRelative(-4f)
                curveTo(21.5f, -3.25f, 2.5f, -3.24f, 2f, 10f)
                verticalLineToRelative(4f)
                curveToRelative(-0.07f, 8.71f, 10.66f, 13.26f, 16.85f, 7.26f)
                lineToRelative(2.44f, 2.44f)
                curveToRelative(0.93f, 0.92f, 2.33f, -0.49f, 1.41f, -1.41f)
                close()
                moveTo(12f, 22f)
                curveToRelative(-4.41f, 0f, -8f, -3.59f, -8f, -8f)
                verticalLineToRelative(-4f)
                curveToRelative(0.38f, -10.59f, 15.63f, -10.58f, 16f, 0f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 1.59f, -0.47f, 3.07f, -1.27f, 4.31f)
                lineToRelative(-2.02f, -2.02f)
                curveToRelative(-0.93f, -0.92f, -2.33f, 0.49f, -1.41f, 1.41f)
                lineToRelative(2.14f, 2.14f)
                curveToRelative(-1.43f, 1.33f, -3.34f, 2.15f, -5.44f, 2.15f)
                close()
            }
        }.also { _Q = it}
