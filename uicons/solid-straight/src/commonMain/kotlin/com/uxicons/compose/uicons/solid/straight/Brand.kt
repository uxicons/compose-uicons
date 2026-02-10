package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Brand: ImageVector? = null

val Icons.Ss.Brand: ImageVector
    get() = _Brand ?: UXIcon(name = "Brand") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16.46f, 13.79f)
                lineToRelative(1.09f, 1.09f)
                lineToRelative(-2.59f, 2.59f)
                lineToRelative(-1.09f, -1.09f)
                lineToRelative(2.59f, -2.59f)
                close()
                moveTo(23.27f, 16.82f)
                lineToRelative(-6.22f, 6.36f)
                curveToRelative(-0.55f, 0.55f, -1.26f, 0.82f, -1.97f, 0.82f)
                curveToRelative(-0.7f, 0f, -1.41f, -0.27f, -1.94f, -0.8f)
                lineTo(2.45f, 12.62f)
                lineToRelative(0.91f, -7.84f)
                lineToRelative(3.71f, 3.71f)
                curveToRelative(-0.04f, 0.16f, -0.07f, 0.33f, -0.07f, 0.51f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                reflectiveCurveToRelative(-0.9f, -2f, -2f, -2f)
                curveToRelative(-0.18f, 0f, -0.35f, 0.03f, -0.51f, 0.07f)
                lineToRelative(-3.75f, -3.75f)
                lineToRelative(7.67f, -0.88f)
                lineToRelative(10.83f, 10.75f)
                curveToRelative(1.0f, 0.99f, 1.01f, 2.62f, 0.02f, 3.62f)
                close()
                moveTo(20.38f, 14.88f)
                lineToRelative(-3.91f, -3.91f)
                lineToRelative(-5.41f, 5.41f)
                lineToRelative(3.91f, 3.91f)
                lineToRelative(5.41f, -5.41f)
                close()
                moveTo(4.74f, 3.33f)
                lineTo(1.45f, 0.04f)
                lineTo(0.04f, 1.45f)
                lineToRelative(3.32f, 3.32f)
                lineToRelative(1.38f, -1.45f)
                close()
            }
        }.also { _Brand = it}
