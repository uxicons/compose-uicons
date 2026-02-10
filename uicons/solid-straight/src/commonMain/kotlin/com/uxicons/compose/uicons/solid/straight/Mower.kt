package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Mower: ImageVector? = null

val Icons.Ss.Mower: ImageVector
    get() = _Mower ?: UXIcon(name = "Mower") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4f, 10.73f)
                curveToRelative(2.9f, -1.39f, 6.28f, 1.5f, 6.28f, 1.5f)
                lineToRelative(-1.77f, 1.77f)
                curveToRelative(-0.86f, -0.86f, -2.37f, -2.83f, -4.51f, -3.27f)
                close()
                moveTo(14f, 4.01f)
                curveToRelative(-3.21f, -0.26f, -5.33f, 3.65f, -5.33f, 3.65f)
                lineToRelative(2.28f, 1.02f)
                curveToRelative(0.49f, -1.11f, 1.2f, -3.49f, 3.05f, -4.66f)
                close()
                moveTo(7.08f, 22f)
                curveToRelative(-0.04f, -1.3f, -0.02f, -3.09f, 0.92f, -4.5f)
                curveToRelative(-2.0f, 0.7f, -2.83f, 2.85f, -3.17f, 4.25f)
                curveToRelative(-0.3f, -1.67f, -1.11f, -4.51f, -3.22f, -5.25f)
                curveToRelative(0.78f, 1.16f, 0.92f, 2.99f, 0.93f, 4.48f)
                curveToRelative(-0.5f, -1.03f, -1.29f, -2.04f, -2.54f, -2.48f)
                curveToRelative(0.72f, 1.08f, 0.9f, 2.37f, 0.92f, 3.5f)
                horizontalLineTo(0f)
                verticalLineToRelative(2f)
                horizontalLineTo(24f)
                verticalLineToRelative(-2f)
                horizontalLineTo(7.08f)
                close()
                moveTo(22.12f, 2f)
                lineToRelative(-2.4f, 12f)
                horizontalLineToRelative(1.56f)
                lineToRelative(0.77f, 3.06f)
                curveToRelative(1.12f, 0.25f, 1.95f, 1.24f, 1.95f, 2.44f)
                curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                curveToRelative(-1.21f, 0f, -2.22f, -0.86f, -2.45f, -2f)
                horizontalLineToRelative(-5.1f)
                curveToRelative(-0.23f, 1.14f, -1.24f, 2f, -2.45f, 2f)
                curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
                reflectiveCurveToRelative(1.12f, -2.5f, 2.5f, -2.5f)
                curveToRelative(0.06f, 0f, 0.12f, 0.01f, 0.18f, 0.02f)
                lineToRelative(0.38f, -1.01f)
                curveToRelative(0.4f, -1.19f, 1.54f, -2.01f, 2.83f, -2.01f)
                horizontalLineToRelative(2.78f)
                lineTo(20.48f, 0f)
                horizontalLineToRelative(3.52f)
                verticalLineTo(2f)
                horizontalLineToRelative(-1.88f)
                close()
            }
        }.also { _Mower = it}
