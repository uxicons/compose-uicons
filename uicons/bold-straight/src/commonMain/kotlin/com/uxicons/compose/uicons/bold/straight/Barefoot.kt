package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Barefoot: ImageVector? = null

val Icons.Bs.Barefoot: ImageVector
    get() = _Barefoot ?: UXIcon(name = "Barefoot") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 21.5f)
                curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                horizontalLineToRelative(-6.11f)
                curveToRelative(-1.6f, 0f, -3.13f, -0.7f, -4.18f, -1.93f)
                curveToRelative(-3.91f, -4.57f, -6.01f, -5.85f, -7.08f, -6.11f)
                curveTo(1.56f, 15.31f, 0.01f, 13.54f, 0.01f, 11.21f)
                curveTo(0.01f, 9.2f, 1.19f, 8.22f, 2.05f, 7.51f)
                curveToRelative(0.47f, -0.39f, 0.87f, -0.72f, 1.12f, -1.2f)
                lineTo(6.11f, 0f)
                horizontalLineToRelative(3.31f)
                lineToRelative(-3.57f, 7.63f)
                curveToRelative(-0.55f, 1.08f, -1.3f, 1.69f, -1.9f, 2.19f)
                curveToRelative(-0.78f, 0.65f, -0.95f, 0.84f, -0.95f, 1.38f)
                curveToRelative(0f, 0.34f, 0f, 1.38f, 1.85f, 1.84f)
                curveToRelative(2.23f, 0.56f, 4.97f, 2.81f, 8.63f, 7.07f)
                curveToRelative(0.48f, 0.56f, 1.17f, 0.88f, 1.9f, 0.88f)
                horizontalLineToRelative(1.56f)
                curveToRelative(-1.75f, -2.12f, -2.87f, -4.25f, -3.86f, -6.13f)
                curveToRelative(-0.89f, -1.7f, -1.66f, -3.17f, -2.72f, -4.37f)
                lineToRelative(-0.65f, -0.73f)
                lineTo(14.2f, 0f)
                horizontalLineToRelative(3.3f)
                lineToRelative(-4.25f, 9.27f)
                curveToRelative(0.98f, 1.28f, 1.72f, 2.71f, 2.5f, 4.2f)
                curveToRelative(0.95f, 1.81f, 1.93f, 3.68f, 3.44f, 5.53f)
                horizontalLineToRelative(2.3f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                close()
            }
        }.also { _Barefoot = it}
