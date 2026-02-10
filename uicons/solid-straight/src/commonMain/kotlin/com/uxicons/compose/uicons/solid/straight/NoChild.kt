package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _NoChild: ImageVector? = null

val Icons.Ss.NoChild: ImageVector
    get() = _NoChild ?: UXIcon(name = "NoChild") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 0f)
                curveToRelative(-6.62f, 0f, -12f, 5.38f, -12f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveToRelative(-5.38f, -12f, -12f, -12f)
                close()
                moveTo(2f, 12f)
                curveToRelative(0f, -2.4f, 0.85f, -4.6f, 2.26f, -6.32f)
                lineToRelative(14.06f, 14.06f)
                curveToRelative(-1.73f, 1.41f, -3.93f, 2.26f, -6.32f, 2.26f)
                curveToRelative(-5.51f, 0f, -10f, -4.49f, -10f, -10f)
                close()
                moveTo(14.72f, 13.31f)
                lineTo(12.69f, 11.28f)
                curveToRelative(0.26f, -0.46f, 0.74f, -0.78f, 1.31f, -0.78f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                curveToRelative(0f, 0.56f, -0.32f, 1.05f, -0.78f, 1.31f)
                close()
                moveTo(19.74f, 18.32f)
                lineTo(16.89f, 15.47f)
                curveToRelative(0.33f, -0.46f, 0.59f, -0.96f, 0.78f, -1.51f)
                curveToRelative(0.11f, 0.02f, 0.22f, 0.03f, 0.34f, 0.03f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                reflectiveCurveToRelative(-0.9f, -2f, -2f, -2f)
                curveToRelative(-0.12f, 0f, -0.23f, 0.01f, -0.34f, 0.03f)
                curveToRelative(-0.82f, -2.33f, -3.05f, -4.01f, -5.66f, -4.03f)
                curveToRelative(0.08f, 0.85f, 0.49f, 1.15f, 1.17f, 1.75f)
                lineToRelative(-1.33f, 1.49f)
                curveToRelative(-0.93f, -0.83f, -1.6f, -1.48f, -1.79f, -2.92f)
                curveToRelative(-0.53f, 0.15f, -1.04f, 0.44f, -1.51f, 0.79f)
                lineToRelative(-2.86f, -2.86f)
                curveToRelative(1.73f, -1.41f, 3.93f, -2.26f, 6.33f, -2.26f)
                curveToRelative(5.51f, 0f, 10f, 4.49f, 10f, 10f)
                curveToRelative(0f, 2.4f, -0.85f, 4.6f, -2.26f, 6.32f)
                close()
                moveTo(13.55f, 17.79f)
                curveToRelative(-0.49f, 0.13f, -1.01f, 0.21f, -1.55f, 0.21f)
                curveToRelative(-2.62f, 0f, -4.85f, -1.69f, -5.66f, -4.03f)
                curveToRelative(-0.11f, 0.02f, -0.22f, 0.03f, -0.34f, 0.03f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                curveToRelative(0f, -1.03f, 0.78f, -1.87f, 1.78f, -1.98f)
                close()
            }
        }.also { _NoChild = it}
