package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PlaneSlash: ImageVector? = null

val Icons.Bs.PlaneSlash: ImageVector
    get() = _PlaneSlash ?: UXIcon(name = "PlaneSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.0f, 16f)
                curveToRelative(1.18f, 0f, 2.29f, -0.51f, 3.05f, -1.41f)
                reflectiveCurveToRelative(1.09f, -2.08f, 0.9f, -3.25f)
                curveToRelative(-0.31f, -1.9f, -2.06f, -3.34f, -4.08f, -3.34f)
                horizontalLineToRelative(-2.0f)
                lineToRelative(-3.46f, -6.22f)
                curveToRelative(-0.6f, -1.1f, -1.75f, -1.78f, -2.99f, -1.78f)
                horizontalLineToRelative(-4.96f)
                lineToRelative(1.98f, 6.31f)
                lineTo(2.16f, 0.04f)
                lineTo(0.04f, 2.16f)
                lineToRelative(21.8f, 21.8f)
                lineToRelative(2.12f, -2.12f)
                lineToRelative(-5.84f, -5.84f)
                horizontalLineToRelative(1.89f)
                close()
                moveTo(10.54f, 3f)
                horizontalLineToRelative(0.88f)
                curveToRelative(0.15f, 0f, 0.29f, 0.08f, 0.36f, 0.23f)
                lineToRelative(4.33f, 7.78f)
                horizontalLineToRelative(3.76f)
                curveToRelative(0.55f, 0f, 1.04f, 0.36f, 1.12f, 0.82f)
                curveToRelative(0.07f, 0.41f, -0.11f, 0.69f, -0.22f, 0.82f)
                curveToRelative(-0.19f, 0.23f, -0.47f, 0.35f, -0.76f, 0.35f)
                horizontalLineToRelative(-3.89f)
                lineToRelative(-0.35f, 0.64f)
                lineToRelative(-2.75f, -2.75f)
                lineToRelative(-2.47f, -7.88f)
                close()
                moveTo(13.23f, 18.18f)
                lineToRelative(2.21f, 2.21f)
                lineToRelative(-1.03f, 1.85f)
                curveToRelative(-0.59f, 1.08f, -1.74f, 1.77f, -2.99f, 1.77f)
                horizontalLineToRelative(-4.96f)
                lineToRelative(2.5f, -8f)
                horizontalLineToRelative(-4.02f)
                lineToRelative(-0.61f, 0.93f)
                curveToRelative(-0.45f, 0.67f, -1.2f, 1.07f, -2.0f, 1.07f)
                lineTo(0.01f, 18f)
                lineToRelative(2.2f, -6f)
                lineTo(-0.01f, 6f)
                horizontalLineToRelative(1.06f)
                lineToRelative(4.94f, 4.94f)
                verticalLineToRelative(2.06f)
                horizontalLineToRelative(2.06f)
                lineToRelative(3.8f, 3.8f)
                lineToRelative(-1.31f, 4.2f)
                horizontalLineToRelative(0.88f)
                curveToRelative(0.15f, 0f, 0.29f, -0.08f, 0.36f, -0.21f)
                lineToRelative(1.45f, -2.61f)
                close()
            }
        }.also { _PlaneSlash = it}
