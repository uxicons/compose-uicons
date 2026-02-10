package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _JugAlt: ImageVector? = null

val Icons.Ss.JugAlt: ImageVector
    get() = _JugAlt ?: UXIcon(name = "JugAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(1f, 19f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(4f)
                lineTo(1f, 19f)
                close()
                moveTo(23f, 8f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 1.86f, -1.28f, 3.43f, -3.0f, 3.87f)
                curveToRelative(0f, 0.04f, 0.0f, 0.07f, 0.0f, 0.11f)
                verticalLineToRelative(10.02f)
                lineTo(1f, 24.0f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(-8f)
                lineTo(1.1f, 13.0f)
                curveToRelative(0.17f, -0.83f, 0.55f, -1.62f, 1.11f, -2.27f)
                lineToRelative(4.07f, -4.75f)
                curveToRelative(0.47f, -0.54f, 0.72f, -1.24f, 0.72f, -1.95f)
                verticalLineToRelative(-2.02f)
                horizontalLineToRelative(-1f)
                lineTo(6.0f, 0f)
                horizontalLineToRelative(9f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(2.02f)
                curveToRelative(0f, 0.71f, 0.26f, 1.41f, 0.72f, 1.95f)
                lineToRelative(0.5f, 0.58f)
                curveToRelative(0.18f, -0.5f, 0.46f, -0.95f, 0.83f, -1.34f)
                curveToRelative(0.74f, -0.77f, 1.82f, -1.21f, 2.95f, -1.21f)
                curveToRelative(2.21f, 0f, 4f, 1.79f, 4f, 4f)
                close()
                moveTo(21f, 8f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                curveToRelative(-0.59f, 0f, -1.14f, 0.22f, -1.51f, 0.6f)
                curveToRelative(-0.34f, 0.35f, -0.51f, 0.82f, -0.49f, 1.36f)
                verticalLineToRelative(0.67f)
                reflectiveCurveToRelative(1.8f, 2.1f, 1.8f, 2.1f)
                curveToRelative(0.31f, 0.36f, 0.57f, 0.77f, 0.76f, 1.2f)
                curveToRelative(0.83f, -0.24f, 1.44f, -1.01f, 1.44f, -1.92f)
                verticalLineToRelative(-2f)
                close()
            }
        }.also { _JugAlt = it}
