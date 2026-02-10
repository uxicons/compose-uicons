package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Bomb: ImageVector? = null

val Icons.Ts.Bomb: ImageVector
    get() = _Bomb ?: UXIcon(name = "Bomb") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.92f, 5.36f)
                lineToRelative(-1.71f, 1.71f)
                curveToRelative(-1.3f, -0.69f, -2.75f, -1.06f, -4.22f, -1.06f)
                curveTo(7.04f, 6.01f, 3f, 10.05f, 3f, 15.01f)
                reflectiveCurveToRelative(4.04f, 8.99f, 8.99f, 8.99f)
                reflectiveCurveToRelative(9.01f, -4.04f, 9.01f, -8.99f)
                curveToRelative(0f, -1.46f, -0.37f, -2.91f, -1.08f, -4.23f)
                lineToRelative(1.71f, -1.71f)
                lineToRelative(-3.71f, -3.71f)
                close()
                moveTo(18.87f, 10.95f)
                curveToRelative(0.74f, 1.25f, 1.13f, 2.65f, 1.13f, 4.06f)
                curveToRelative(0f, 4.41f, -3.59f, 7.99f, -8.01f, 7.99f)
                reflectiveCurveToRelative(-7.99f, -3.59f, -7.99f, -7.99f)
                reflectiveCurveToRelative(3.59f, -7.99f, 7.99f, -7.99f)
                curveToRelative(1.42f, 0f, 2.82f, 0.38f, 4.05f, 1.11f)
                lineToRelative(0.33f, 0.2f)
                lineToRelative(1.54f, -1.54f)
                lineToRelative(2.3f, 2.3f)
                lineToRelative(-1.54f, 1.54f)
                lineToRelative(0.2f, 0.33f)
                close()
                moveTo(22.15f, 5.98f)
                lineToRelative(-0.34f, 0.36f)
                lineToRelative(-0.73f, -0.68f)
                lineToRelative(0.34f, -0.36f)
                curveToRelative(0.78f, -0.83f, 0.78f, -2.19f, 0f, -3.02f)
                curveToRelative(-0.8f, -0.85f, -1.89f, -1.31f, -2.99f, -1.27f)
                curveToRelative(-5.18f, 0.19f, -9.28f, 1.05f, -9.32f, 1.06f)
                lineToRelative(-0.21f, -0.98f)
                curveToRelative(0.04f, -0.01f, 4.22f, -0.89f, 9.49f, -1.08f)
                curveToRelative(1.39f, -0.07f, 2.77f, 0.53f, 3.76f, 1.59f)
                curveToRelative(1.13f, 1.21f, 1.13f, 3.18f, 0f, 4.39f)
                close()
                moveTo(5.72f, 5.74f)
                lineToRelative(2.87f, -1.44f)
                lineToRelative(-2.87f, -1.44f)
                lineTo(4.28f, 0f)
                lineToRelative(-1.44f, 2.87f)
                lineTo(-0.02f, 4.3f)
                lineToRelative(2.87f, 1.44f)
                lineToRelative(1.44f, 2.87f)
                lineToRelative(1.44f, -2.87f)
                close()
                moveTo(2.22f, 4.3f)
                lineToRelative(1.38f, -0.69f)
                lineToRelative(0.69f, -1.38f)
                lineToRelative(0.69f, 1.38f)
                lineToRelative(1.38f, 0.69f)
                lineToRelative(-1.38f, 0.69f)
                lineToRelative(-0.69f, 1.38f)
                lineToRelative(-0.69f, -1.38f)
                lineToRelative(-1.38f, -0.69f)
                close()
            }
        }.also { _Bomb = it}
