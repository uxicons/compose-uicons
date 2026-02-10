package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Golfer: ImageVector? = null

val Icons.Rr.Golfer: ImageVector
    get() = _Golfer ?: UXIcon(name = "Golfer") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(6f, 3.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                close()
                moveTo(20.83f, 10.56f)
                curveToRelative(-0.19f, 0.28f, -0.5f, 0.44f, -0.83f, 0.44f)
                horizontalLineToRelative(-4.42f)
                curveToRelative(-0.48f, 0f, -0.95f, -0.07f, -1.41f, -0.2f)
                lineToRelative(-2.05f, -0.6f)
                lineToRelative(1.37f, 4.1f)
                curveToRelative(0.34f, 1.02f, 0.51f, 2.09f, 0.51f, 3.16f)
                verticalLineToRelative(5.54f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-5.54f)
                curveToRelative(0f, -0.15f, -0.03f, -0.31f, -0.04f, -0.46f)
                horizontalLineToRelative(-2.38f)
                lineToRelative(-3.71f, 6.5f)
                curveToRelative(-0.28f, 0.48f, -0.89f, 0.64f, -1.36f, 0.37f)
                curveToRelative(-0.48f, -0.27f, -0.65f, -0.89f, -0.37f, -1.36f)
                lineToRelative(3.79f, -6.63f)
                lineToRelative(-1.88f, -6.21f)
                curveToRelative(-0.21f, -0.78f, 0.02f, -1.57f, 0.59f, -2.1f)
                curveToRelative(0.57f, -0.53f, 1.38f, -0.7f, 2.11f, -0.44f)
                lineToRelative(5.99f, 1.76f)
                curveToRelative(0.28f, 0.08f, 0.56f, 0.12f, 0.85f, 0.12f)
                horizontalLineToRelative(2.93f)
                lineToRelative(-2.8f, -6.83f)
                lineToRelative(-1.31f, 0.56f)
                curveToRelative(-0.51f, 0.21f, -1.09f, -0.02f, -1.31f, -0.53f)
                curveToRelative(-0.22f, -0.51f, 0.02f, -1.1f, 0.53f, -1.31f)
                lineToRelative(1.82f, -0.78f)
                curveToRelative(0.72f, -0.3f, 1.57f, 0.03f, 1.89f, 0.74f)
                lineToRelative(3.6f, 8.76f)
                curveToRelative(0.13f, 0.31f, 0.09f, 0.66f, -0.1f, 0.94f)
                close()
                moveTo(9.78f, 9.51f)
                curveToRelative(-0.06f, -0.01f, -1.77f, -0.55f, -1.79f, -0.48f)
                lineToRelative(1.76f, 5.97f)
                horizontalLineToRelative(1.86f)
                curveToRelative(-0.01f, -0.02f, -1.82f, -5.49f, -1.82f, -5.49f)
                close()
            }
        }.also { _Golfer = it}
