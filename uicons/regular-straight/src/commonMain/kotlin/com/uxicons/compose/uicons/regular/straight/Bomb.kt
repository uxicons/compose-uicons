package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Bomb: ImageVector? = null

val Icons.Rs.Bomb: ImageVector
    get() = _Bomb ?: UXIcon(name = "Bomb") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4f, 8f)
                lineToRelative(-1.33f, -2.67f)
                lineTo(0f, 4f)
                lineToRelative(2.67f, -1.33f)
                lineTo(4f, 0f)
                lineToRelative(1.33f, 2.67f)
                lineToRelative(2.67f, 1.33f)
                lineToRelative(-2.67f, 1.33f)
                lineToRelative(-1.33f, 2.67f)
                close()
                moveTo(21.82f, 9.41f)
                lineToRelative(-1.71f, 1.71f)
                curveToRelative(0.58f, 1.21f, 0.89f, 2.54f, 0.89f, 3.88f)
                curveToRelative(0f, 4.96f, -4.04f, 9f, -9f, 9f)
                reflectiveCurveTo(3f, 19.96f, 3f, 15f)
                reflectiveCurveTo(7.04f, 6f, 12f, 6f)
                curveToRelative(1.34f, 0f, 2.66f, 0.3f, 3.87f, 0.88f)
                lineToRelative(1.71f, -1.71f)
                lineToRelative(4.24f, 4.24f)
                close()
                moveTo(19f, 15f)
                curveToRelative(0f, -1.24f, -0.34f, -2.47f, -0.98f, -3.55f)
                lineToRelative(-0.4f, -0.67f)
                lineToRelative(1.37f, -1.37f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(-1.37f, 1.37f)
                lineToRelative(-0.67f, -0.39f)
                curveToRelative(-1.08f, -0.64f, -2.31f, -0.97f, -3.54f, -0.97f)
                curveToRelative(-3.86f, 0f, -7f, 3.14f, -7f, 7f)
                reflectiveCurveToRelative(3.14f, 7f, 7f, 7f)
                reflectiveCurveToRelative(7f, -3.14f, 7f, -7f)
                close()
                moveTo(22.03f, 1.62f)
                curveTo(20.98f, 0.56f, 19.53f, -0.01f, 18.04f, 0.03f)
                curveToRelative(-5.13f, 0.17f, -9.07f, 0.95f, -9.23f, 0.99f)
                lineToRelative(0.39f, 1.96f)
                curveToRelative(0.04f, -0.01f, 3.95f, -0.78f, 8.91f, -0.95f)
                curveToRelative(0.94f, -0.03f, 1.85f, 0.33f, 2.52f, 1.0f)
                curveToRelative(0.53f, 0.53f, 0.53f, 1.4f, 0f, 1.93f)
                lineToRelative(-0.33f, 0.33f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(0.33f, -0.33f)
                curveToRelative(1.31f, -1.31f, 1.31f, -3.45f, 0f, -4.76f)
                close()
            }
        }.also { _Bomb = it}
