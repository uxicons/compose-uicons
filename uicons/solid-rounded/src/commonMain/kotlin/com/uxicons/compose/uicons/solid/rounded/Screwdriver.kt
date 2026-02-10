package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Screwdriver: ImageVector? = null

val Icons.Sr.Screwdriver: ImageVector
    get() = _Screwdriver ?: UXIcon(name = "Screwdriver") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.48f, 1.84f)
                lineToRelative(-1.32f, -1.32f)
                curveToRelative(-0.57f, -0.57f, -1.45f, -0.68f, -2.14f, -0.28f)
                lineToRelative(-3.83f, 2.21f)
                curveToRelative(-0.73f, 0.42f, -1.19f, 1.21f, -1.19f, 2.05f)
                verticalLineToRelative(3.09f)
                lineToRelative(-4.73f, 4.73f)
                curveToRelative(-1.11f, -0.53f, -2.48f, -0.34f, -3.4f, 0.58f)
                lineTo(0.98f, 18.76f)
                curveToRelative(-1.11f, 1.11f, -1.32f, 2.92f, -0.33f, 4.13f)
                curveToRelative(1.15f, 1.4f, 3.21f, 1.47f, 4.46f, 0.23f)
                lineToRelative(6.01f, -5.99f)
                curveToRelative(0.93f, -0.92f, 1.11f, -2.29f, 0.57f, -3.41f)
                lineToRelative(4.72f, -4.72f)
                horizontalLineToRelative(3.09f)
                curveToRelative(0.85f, 0f, 1.63f, -0.45f, 2.05f, -1.19f)
                lineToRelative(2.21f, -3.83f)
                curveToRelative(0.4f, -0.7f, 0.28f, -1.57f, -0.28f, -2.14f)
                close()
            }
        }.also { _Screwdriver = it}
