package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Analyse: ImageVector? = null

val Icons.Ss.Analyse: ImageVector
    get() = _Analyse ?: UXIcon(name = "Analyse") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18.74f, 5.14f)
                curveToRelative(-0.34f, -0.6f, -0.74f, -1.17f, -1.19f, -1.69f)
                lineToRelative(2.69f, -3.11f)
                lineToRelative(1.51f, 1.31f)
                lineToRelative(-3.02f, 3.49f)
                close()
                moveTo(17.74f, 16.33f)
                curveToRelative(1.41f, -1.72f, 2.26f, -3.93f, 2.26f, -6.33f)
                curveToRelative(0f, -1.76f, -0.46f, -3.42f, -1.26f, -4.86f)
                lineToRelative(-7.19f, 8.32f)
                lineToRelative(-3.49f, -3.49f)
                lineToRelative(-4.25f, 5.09f)
                curveToRelative(-0.45f, -0.54f, -0.82f, -1.15f, -1.11f, -1.79f)
                lineToRelative(5.22f, -6.26f)
                lineToRelative(3.51f, 3.51f)
                lineToRelative(6.11f, -7.07f)
                curveToRelative(-1.83f, -2.11f, -4.53f, -3.45f, -7.55f, -3.45f)
                curveTo(4.48f, 0f, 0f, 4.48f, 0f, 10f)
                reflectiveCurveToRelative(4.48f, 10f, 10f, 10f)
                curveToRelative(2.4f, 0f, 4.6f, -0.85f, 6.33f, -2.26f)
                lineToRelative(6.22f, 6.22f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(-6.22f, -6.22f)
                close()
            }
        }.also { _Analyse = it}
