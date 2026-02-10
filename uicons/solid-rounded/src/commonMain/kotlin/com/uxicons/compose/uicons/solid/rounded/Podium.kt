package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Podium: ImageVector? = null

val Icons.Sr.Podium: ImageVector
    get() = _Podium ?: UXIcon(name = "Podium") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23f, 10f)
                horizontalLineTo(4f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(0.18f)
                curveToRelative(0.41f, 1.16f, 1.51f, 2f, 2.82f, 2f)
                horizontalLineToRelative(3f)
                curveToRelative(3.96f, -0.1f, 3.95f, -5.9f, 0f, -6f)
                horizontalLineToRelative(-3f)
                curveToRelative(-1.3f, 0f, -2.4f, 0.84f, -2.82f, 2f)
                horizontalLineToRelative(-0.18f)
                curveToRelative(-2.76f, 0f, -5f, 2.24f, -5f, 5f)
                verticalLineToRelative(3f)
                horizontalLineTo(1f)
                curveToRelative(-1.31f, 0.01f, -1.31f, 1.99f, 0f, 2f)
                horizontalLineToRelative(1.15f)
                lineToRelative(1.3f, 7.82f)
                curveToRelative(0.4f, 2.42f, 2.48f, 4.18f, 4.93f, 4.18f)
                horizontalLineToRelative(7.22f)
                curveToRelative(2.46f, 0f, 4.53f, -1.76f, 4.93f, -4.18f)
                lineToRelative(1.3f, -7.82f)
                horizontalLineToRelative(1.15f)
                curveToRelative(1.31f, -0.01f, 1.31f, -1.99f, 0f, -2f)
                close()
            }
        }.also { _Podium = it}
