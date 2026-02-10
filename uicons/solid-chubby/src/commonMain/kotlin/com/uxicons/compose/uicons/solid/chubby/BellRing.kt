package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BellRing: ImageVector? = null

val Icons.Sc.BellRing: ImageVector
    get() = _BellRing ?: UXIcon(name = "BellRing") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5.53f, 13.22f)
                curveToRelative(-2.25f, 2.39f, -0.37f, 4.41f, 0.22f, 5.0f)
                curveToRelative(1.66f, 1.66f, 3.35f, 1.73f, 5.01f, 0.22f)
                curveToRelative(-0.92f, -0.58f, -1.88f, -1.35f, -2.88f, -2.34f)
                curveToRelative(0f, 0f, -1.77f, -1.82f, -2.36f, -2.87f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(6.98f, 6.24f)
                curveToRelative(-1.87f, 1.96f, -1.01f, 5.12f, 2.31f, 8.44f)
                curveToRelative(3.31f, 3.31f, 6.48f, 4.17f, 8.46f, 2.3f)
                curveToRelative(0.44f, -0.41f, 0.73f, -1.03f, 1.08f, -1.73f)
                curveToRelative(0.4f, -0.82f, 0.84f, -1.74f, 1.57f, -2.47f)
                curveToRelative(3.8f, -3.8f, 2.75f, -6.56f, 1.31f, -8.37f)
                lineToRelative(0.75f, -0.75f)
                curveToRelative(0.59f, -0.58f, 0.59f, -1.53f, 0.0f, -2.12f)
                curveToRelative(-0.58f, -0.59f, -1.53f, -0.59f, -2.12f, -0.0f)
                lineToRelative(-0.78f, 0.77f)
                curveTo(16.83f, 0.24f, 14.14f, 0.68f, 11.2f, 3.6f)
                curveToRelative(-0.72f, 0.71f, -1.65f, 1.16f, -2.47f, 1.55f)
                curveToRelative(-0.71f, 0.34f, -1.33f, 0.64f, -1.75f, 1.08f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.13f, 15.45f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                curveToRelative(0f, 1.67f, -1.36f, 3.02f, -3.04f, 3.02f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                curveToRelative(3.33f, 0f, 6.04f, -2.7f, 6.04f, -6.02f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(7.03f, 4.36f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                curveTo(3.69f, 1.36f, 0.98f, 4.07f, 0.98f, 7.39f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                curveToRelative(0f, -1.67f, 1.36f, -3.02f, 3.04f, -3.02f)
                close()
            }
        }.also { _BellRing = it}
