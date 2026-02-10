package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Barefoot: ImageVector? = null

val Icons.Rs.Barefoot: ImageVector
    get() = _Barefoot ?: UXIcon(name = "Barefoot") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 22f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                horizontalLineToRelative(-6.61f)
                curveToRelative(-1.46f, 0f, -2.84f, -0.64f, -3.8f, -1.76f)
                curveToRelative(-3.23f, -3.77f, -6.24f, -6.37f, -7.85f, -6.77f)
                curveToRelative(-2.34f, -0.58f, -3.74f, -2.18f, -3.74f, -4.26f)
                curveToRelative(0f, -1.77f, 1.03f, -2.63f, 1.85f, -3.31f)
                curveToRelative(0.49f, -0.4f, 0.95f, -0.79f, 1.24f, -1.35f)
                lineTo(6.15f, 0f)
                horizontalLineToRelative(2.21f)
                lineToRelative(-3.47f, 7.42f)
                curveToRelative(-0.5f, 0.97f, -1.2f, 1.55f, -1.76f, 2.02f)
                curveToRelative(-0.78f, 0.65f, -1.13f, 0.97f, -1.13f, 1.77f)
                curveToRelative(0f, 1.46f, 1.21f, 2.07f, 2.23f, 2.32f)
                curveToRelative(2.81f, 0.7f, 6.77f, 4.95f, 8.88f, 7.41f)
                curveToRelative(0.57f, 0.67f, 1.41f, 1.06f, 2.28f, 1.06f)
                horizontalLineToRelative(3.15f)
                lineToRelative(-0.3f, -0.34f)
                curveToRelative(-1.97f, -2.25f, -3.16f, -4.68f, -4.22f, -6.83f)
                curveToRelative(-0.87f, -1.76f, -1.68f, -3.43f, -2.78f, -4.67f)
                lineToRelative(-0.43f, -0.49f)
                lineTo(15.25f, 0f)
                horizontalLineToRelative(2.2f)
                lineToRelative(-4.28f, 9.35f)
                curveToRelative(1.05f, 1.34f, 1.83f, 2.93f, 2.65f, 4.6f)
                curveToRelative(0.99f, 2.02f, 2.01f, 4.1f, 3.64f, 6.05f)
                horizontalLineToRelative(2.54f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                close()
            }
        }.also { _Barefoot = it}
