package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _W: ImageVector? = null

val Icons.Ts.W: ImageVector
    get() = _W ?: UXIcon(name = "W") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8.5f, 22.84f)
                lineToRelative(3.5f, -7.99f)
                lineToRelative(3.59f, 8.19f)
                curveToRelative(0.37f, 0.67f, 1.2f, 1.06f, 2.02f, 0.94f)
                curveToRelative(0.85f, -0.13f, 1.5f, -0.76f, 1.66f, -1.59f)
                lineTo(24.0f, 0f)
                horizontalLineToRelative(-1.02f)
                lineToRelative(-4.69f, 22.19f)
                curveToRelative(-0.08f, 0.43f, -0.4f, 0.73f, -0.83f, 0.8f)
                curveToRelative(-0.41f, 0.06f, -0.82f, -0.12f, -0.97f, -0.39f)
                lineToRelative(-4.49f, -10.24f)
                lineToRelative(-4.39f, 10.05f)
                curveToRelative(-0.24f, 0.45f, -0.62f, 0.66f, -1.07f, 0.58f)
                curveToRelative(-0.42f, -0.07f, -0.75f, -0.38f, -0.83f, -0.81f)
                lineTo(1.04f, 0f)
                horizontalLineTo(0.02f)
                lineTo(4.72f, 22.37f)
                curveToRelative(0.16f, 0.84f, 0.81f, 1.47f, 1.65f, 1.6f)
                curveToRelative(0.11f, 0.02f, 0.21f, 0.03f, 0.32f, 0.03f)
                curveToRelative(0.73f, 0f, 1.4f, -0.41f, 1.8f, -1.16f)
                close()
            }
        }.also { _W = it}
