package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AngleSmallUp: ImageVector? = null

val Icons.Tr.AngleSmallUp: ImageVector
    get() = _AngleSmallUp ?: UXIcon(name = "AngleSmallUp") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18.5f, 15f)
                curveToRelative(-0.12f, 0f, -0.24f, -0.04f, -0.34f, -0.14f)
                lineToRelative(-4.43f, -4.14f)
                curveToRelative(-0.94f, -0.94f, -2.53f, -0.93f, -3.44f, -0.01f)
                lineToRelative(-4.44f, 4.15f)
                curveToRelative(-0.2f, 0.19f, -0.52f, 0.18f, -0.71f, -0.02f)
                curveToRelative(-0.19f, -0.2f, -0.18f, -0.52f, 0.02f, -0.71f)
                lineToRelative(4.43f, -4.14f)
                curveToRelative(1.27f, -1.27f, 3.54f, -1.28f, 4.84f, 0.01f)
                lineToRelative(4.42f, 4.13f)
                curveToRelative(0.2f, 0.19f, 0.21f, 0.51f, 0.02f, 0.71f)
                curveToRelative(-0.1f, 0.1f, -0.23f, 0.16f, -0.36f, 0.16f)
                close()
            }
        }.also { _AngleSmallUp = it}
