package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Brand: ImageVector? = null

val Icons.Rs.Brand: ImageVector
    get() = _Brand ?: UXIcon(name = "Brand") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.25f, 13.2f)
                lineTo(12.41f, 2.45f)
                lineToRelative(-7.67f, 0.88f)
                lineTo(1.45f, 0.04f)
                lineTo(0.04f, 1.45f)
                lineToRelative(3.33f, 3.33f)
                lineToRelative(-0.91f, 7.84f)
                lineToRelative(10.69f, 10.58f)
                curveToRelative(0.54f, 0.53f, 1.24f, 0.8f, 1.94f, 0.8f)
                curveToRelative(0.71f, 0f, 1.43f, -0.27f, 1.97f, -0.82f)
                lineToRelative(6.22f, -6.36f)
                curveToRelative(0.98f, -1.0f, 0.97f, -2.63f, -0.03f, -3.62f)
                close()
                moveTo(21.84f, 15.42f)
                lineToRelative(-6.21f, 6.35f)
                curveToRelative(-0.29f, 0.3f, -0.79f, 0.3f, -1.08f, 0.01f)
                lineTo(4.55f, 11.88f)
                lineToRelative(0.61f, -5.3f)
                lineToRelative(1.91f, 1.91f)
                curveToRelative(-0.04f, 0.16f, -0.07f, 0.33f, -0.07f, 0.51f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                reflectiveCurveToRelative(-0.9f, -2f, -2f, -2f)
                curveToRelative(-0.18f, 0f, -0.35f, 0.03f, -0.51f, 0.07f)
                lineToRelative(-1.94f, -1.94f)
                lineToRelative(5.14f, -0.59f)
                lineToRelative(10.15f, 10.07f)
                curveToRelative(0.22f, 0.22f, 0.22f, 0.58f, 0.01f, 0.8f)
                close()
                moveTo(11.09f, 15.5f)
                lineToRelative(3.91f, 3.91f)
                lineToRelative(4.41f, -4.41f)
                lineToRelative(-3.91f, -3.91f)
                lineToRelative(-4.41f, 4.41f)
                close()
                moveTo(15.0f, 16.59f)
                lineToRelative(-1.09f, -1.09f)
                lineToRelative(1.59f, -1.59f)
                lineToRelative(1.09f, 1.09f)
                lineToRelative(-1.59f, 1.59f)
                close()
            }
        }.also { _Brand = it}
