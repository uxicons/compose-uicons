package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Shield: ImageVector? = null

val Icons.Tr.Shield: ImageVector
    get() = _Shield ?: UXIcon(name = "Shield") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 24f)
                curveToRelative(-0.08f, 0f, -0.15f, -0.02f, -0.22f, -0.05f)
                lineToRelative(-0.42f, -0.21f)
                curveToRelative(-2.19f, -1.1f, -9.35f, -5.19f, -9.35f, -11.8f)
                lineToRelative(0.0f, -5.35f)
                curveToRelative(0f, -1.94f, 1.24f, -3.66f, 3.08f, -4.27f)
                lineTo(11.84f, 0.08f)
                curveToRelative(0.1f, -0.03f, 0.21f, -0.03f, 0.31f, 0f)
                lineToRelative(6.76f, 2.24f)
                curveToRelative(1.84f, 0.61f, 3.08f, 2.33f, 3.08f, 4.27f)
                lineToRelative(-0.0f, 5.35f)
                curveToRelative(0f, 7.5f, -7.17f, 10.97f, -9.37f, 11.85f)
                lineToRelative(-0.44f, 0.18f)
                curveToRelative(-0.06f, 0.02f, -0.12f, 0.04f, -0.19f, 0.04f)
                close()
                moveTo(12f, 1.08f)
                lineTo(5.4f, 3.27f)
                curveToRelative(-1.44f, 0.48f, -2.4f, 1.81f, -2.4f, 3.32f)
                lineToRelative(-0.0f, 5.35f)
                curveToRelative(0f, 6.04f, 6.74f, 9.87f, 8.8f, 10.91f)
                lineToRelative(0.22f, 0.11f)
                lineToRelative(0.23f, -0.09f)
                curveToRelative(2.05f, -0.82f, 8.74f, -4.05f, 8.74f, -10.92f)
                lineToRelative(0.0f, -5.35f)
                curveToRelative(0f, -1.51f, -0.96f, -2.85f, -2.4f, -3.32f)
                lineTo(12f, 1.08f)
                close()
            }
        }.also { _Shield = it}
