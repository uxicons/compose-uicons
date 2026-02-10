package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _WrenchAlt: ImageVector? = null

val Icons.Sr.WrenchAlt: ImageVector
    get() = _WrenchAlt ?: UXIcon(name = "WrenchAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.74f, 5.48f)
                curveToRelative(-0.13f, -0.46f, -1.13f, -1.18f, -1.95f, -0.36f)
                curveToRelative(-0.82f, 0.82f, -3.32f, 3.32f, -3.32f, 3.32f)
                curveToRelative(-0.79f, 0.79f, -2.07f, 0.76f, -2.85f, -0.04f)
                curveToRelative(-0.8f, -0.78f, -0.82f, -2.07f, -0.04f, -2.85f)
                curveToRelative(0f, 0f, 2.5f, -2.5f, 3.32f, -3.32f)
                curveToRelative(0.82f, -0.82f, 0.1f, -1.81f, -0.36f, -1.95f)
                curveToRelative(-0.75f, -0.21f, -1.52f, -0.31f, -2.32f, -0.28f)
                curveToRelative(-3.77f, 0.13f, -6.95f, 3.2f, -7.21f, 6.96f)
                curveToRelative(-0.04f, 0.67f, -0.01f, 1.32f, 0.12f, 1.95f)
                curveToRelative(0.18f, 0.94f, -0.16f, 1.91f, -0.84f, 2.58f)
                lineTo(0.87f, 18.91f)
                curveToRelative(-1.16f, 1.16f, -1.16f, 3.06f, -0.01f, 4.23f)
                curveToRelative(1.17f, 1.15f, 3.07f, 1.16f, 4.23f, -0.01f)
                lineToRelative(7.42f, -7.4f)
                curveToRelative(0.68f, -0.68f, 1.64f, -1.02f, 2.58f, -0.84f)
                curveToRelative(0.63f, 0.12f, 1.28f, 0.16f, 1.95f, 0.12f)
                curveToRelative(3.77f, -0.25f, 6.83f, -3.43f, 6.96f, -7.21f)
                curveToRelative(0.03f, -0.79f, -0.07f, -1.57f, -0.28f, -2.32f)
                close()
            }
        }.also { _WrenchAlt = it}
