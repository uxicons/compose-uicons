package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Beard: ImageVector? = null

val Icons.Rs.Beard: ImageVector
    get() = _Beard ?: UXIcon(name = "Beard") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.84f, 2f)
                curveToRelative(-0.81f, 2.38f, -3.2f, 4.71f, -4.42f, 5.62f)
                curveToRelative(-0.99f, -1.0f, -2.45f, -1.62f, -3.92f, -1.62f)
                horizontalLineToRelative(-3f)
                curveToRelative(-1.47f, 0f, -2.93f, 0.62f, -3.92f, 1.62f)
                curveToRelative(-1.22f, -0.91f, -3.61f, -3.25f, -4.42f, -5.62f)
                lineTo(0f, 2f)
                verticalLineToRelative(7.83f)
                curveToRelative(0f, 4.71f, 4.56f, 9.65f, 11.62f, 12.59f)
                lineToRelative(0.38f, 0.16f)
                lineToRelative(0.38f, -0.16f)
                curveToRelative(7.06f, -2.94f, 11.62f, -7.88f, 11.62f, -12.59f)
                lineTo(24f, 2f)
                horizontalLineToRelative(-2.16f)
                close()
                moveTo(22f, 9.83f)
                curveToRelative(0f, 3.76f, -4.0f, 7.98f, -10f, 10.58f)
                curveTo(6.0f, 17.81f, 2f, 13.59f, 2f, 9.83f)
                lineTo(2f, 5.81f)
                curveToRelative(1.79f, 2.4f, 4.08f, 3.94f, 4.21f, 4.03f)
                lineToRelative(0.87f, 0.58f)
                lineToRelative(0.54f, -0.9f)
                curveToRelative(0.53f, -0.88f, 1.74f, -1.52f, 2.88f, -1.52f)
                horizontalLineToRelative(3f)
                curveToRelative(1.14f, 0f, 2.35f, 0.64f, 2.88f, 1.52f)
                lineToRelative(0.54f, 0.9f)
                lineToRelative(0.87f, -0.58f)
                curveToRelative(0.13f, -0.08f, 2.42f, -1.63f, 4.21f, -4.03f)
                verticalLineToRelative(4.02f)
                close()
                moveTo(15.24f, 12.3f)
                curveToRelative(0f, 0.01f, -0.01f, 0.03f, -0.02f, 0.03f)
                curveToRelative(-1.01f, 0.42f, -2.26f, 0.66f, -3.22f, 0.66f)
                curveToRelative(-0.96f, 0f, -2.29f, -0.24f, -3.29f, -0.66f)
                verticalLineToRelative(-0.08f)
                curveToRelative(0.01f, -1.25f, 1.04f, -2.27f, 2.29f, -2.27f)
                horizontalLineToRelative(1.96f)
                curveToRelative(1.27f, 0f, 2.29f, 1.03f, 2.28f, 2.31f)
                close()
            }
        }.also { _Beard = it}
