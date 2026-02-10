package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Ribbon: ImageVector? = null

val Icons.Bs.Ribbon: ImageVector
    get() = _Ribbon ?: UXIcon(name = "Ribbon") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.77f, 18.15f)
                lineToRelative(-4.83f, -4.79f)
                curveToRelative(2.83f, -3.14f, 2.74f, -7.99f, -0.28f, -11.02f)
                curveToRelative(-1.51f, -1.51f, -3.52f, -2.34f, -5.66f, -2.34f)
                reflectiveCurveToRelative(-4.15f, 0.83f, -5.66f, 2.34f)
                curveToRelative(-3.02f, 3.02f, -3.12f, 7.88f, -0.28f, 11.02f)
                lineToRelative(-4.83f, 4.79f)
                lineToRelative(6.05f, 5.89f)
                lineToRelative(4.72f, -4.72f)
                lineToRelative(4.72f, 4.72f)
                lineToRelative(6.05f, -5.89f)
                close()
                moveTo(16.75f, 19.82f)
                lineToRelative(-8.28f, -8.28f)
                curveToRelative(-1.4f, -1.4f, -1.79f, -3.43f, -1.18f, -5.18f)
                curveToRelative(0.76f, 1.94f, 2.89f, 3.71f, 3.74f, 4.36f)
                lineToRelative(7.47f, 7.41f)
                lineToRelative(-1.74f, 1.69f)
                close()
                moveTo(14.22f, 9.67f)
                curveToRelative(0.92f, -0.86f, 2.0f, -2.05f, 2.5f, -3.32f)
                curveToRelative(0.57f, 1.64f, 0.26f, 3.51f, -0.91f, 4.89f)
                lineToRelative(-1.59f, -1.57f)
                close()
                moveTo(14f, 5f)
                curveToRelative(0f, 0.48f, -0.89f, 1.61f, -2f, 2.63f)
                curveToRelative(-1.11f, -1.01f, -2f, -2.15f, -2f, -2.63f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                close()
                moveTo(7.25f, 19.82f)
                lineToRelative(-1.74f, -1.69f)
                lineToRelative(2.66f, -2.64f)
                lineToRelative(1.71f, 1.71f)
                lineToRelative(-2.63f, 2.63f)
                close()
            }
        }.also { _Ribbon = it}
