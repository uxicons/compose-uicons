package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AngleSmallDown: ImageVector? = null

val Icons.Tr.AngleSmallDown: ImageVector
    get() = _AngleSmallDown ?: UXIcon(name = "AngleSmallDown") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 15f)
                curveToRelative(-0.92f, 0f, -1.78f, -0.36f, -2.42f, -1.0f)
                lineToRelative(-4.42f, -4.13f)
                curveToRelative(-0.2f, -0.19f, -0.21f, -0.51f, -0.02f, -0.71f)
                curveToRelative(0.19f, -0.2f, 0.51f, -0.21f, 0.71f, -0.02f)
                lineToRelative(4.43f, 4.14f)
                curveToRelative(0.94f, 0.94f, 2.53f, 0.93f, 3.44f, 0.01f)
                lineToRelative(4.44f, -4.15f)
                curveToRelative(0.2f, -0.19f, 0.52f, -0.18f, 0.71f, 0.02f)
                curveToRelative(0.19f, 0.2f, 0.18f, 0.52f, -0.02f, 0.71f)
                lineToRelative(-4.43f, 4.14f)
                curveToRelative(-0.64f, 0.64f, -1.5f, 0.99f, -2.41f, 0.99f)
                close()
            }
        }.also { _AngleSmallDown = it}
