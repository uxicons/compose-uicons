package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Scalpel: ImageVector? = null

val Icons.Sr.Scalpel: ImageVector
    get() = _Scalpel ?: UXIcon(name = "Scalpel") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 3.8f)
                curveToRelative(0f, 0.75f, -0.29f, 1.45f, -0.82f, 1.98f)
                lineToRelative(-9.05f, 9.03f)
                lineToRelative(-4.03f, -3.96f)
                lineTo(19.23f, 1.81f)
                curveToRelative(1.05f, -1.05f, 2.9f, -1.05f, 3.95f, 0.0f)
                curveToRelative(0.53f, 0.53f, 0.82f, 1.23f, 0.82f, 1.98f)
                close()
                moveTo(8.68f, 12.26f)
                lineTo(0.3f, 20.56f)
                curveToRelative(-0.15f, 0.15f, -0.25f, 0.35f, -0.28f, 0.56f)
                curveToRelative(-0.06f, 0.35f, 0.01f, 0.89f, 0.37f, 1.3f)
                curveToRelative(0.23f, 0.27f, 0.67f, 0.6f, 1.45f, 0.6f)
                curveToRelative(0.42f, 0f, 0.79f, 0.01f, 1.01f, 0f)
                curveToRelative(1.63f, -0.07f, 3.22f, -0.43f, 4.71f, -1.1f)
                curveToRelative(2.38f, -1.05f, 4.38f, -3.25f, 5.11f, -5.75f)
                horizontalLineToRelative(0f)
                lineToRelative(-3.98f, -3.91f)
                close()
            }
        }.also { _Scalpel = it}
