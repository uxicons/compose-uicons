package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _W: ImageVector? = null

val Icons.Rs.W: ImageVector
    get() = _W ?: UXIcon(name = "W") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.96f, 0f)
                lineToRelative(-4.16f, 21.59f)
                curveToRelative(-0.06f, 0.31f, -0.31f, 0.38f, -0.41f, 0.4f)
                curveToRelative(-0.1f, 0.02f, -0.36f, 0.03f, -0.48f, -0.17f)
                lineToRelative(-4.91f, -11.21f)
                lineToRelative(-4.87f, 11.13f)
                curveToRelative(-0.15f, 0.28f, -0.41f, 0.27f, -0.52f, 0.25f)
                curveToRelative(-0.1f, -0.02f, -0.35f, -0.09f, -0.41f, -0.4f)
                lineTo(2.04f, 0f)
                horizontalLineTo(0f)
                lineTo(4.24f, 21.97f)
                curveToRelative(0.2f, 1.05f, 1.01f, 1.83f, 2.07f, 2.0f)
                curveToRelative(1.05f, 0.17f, 2.07f, -0.33f, 2.62f, -1.35f)
                lineToRelative(3.08f, -7.03f)
                lineToRelative(3.12f, 7.11f)
                curveToRelative(0.45f, 0.82f, 1.27f, 1.3f, 2.18f, 1.3f)
                curveToRelative(0.13f, 0f, 0.27f, -0.01f, 0.4f, -0.03f)
                curveToRelative(1.06f, -0.17f, 1.87f, -0.95f, 2.07f, -2.0f)
                lineTo(24f, 0f)
                horizontalLineToRelative(-2.04f)
                close()
            }
        }.also { _W = it}
