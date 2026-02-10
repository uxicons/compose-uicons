package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Analyse: ImageVector? = null

val Icons.Rs.Analyse: ImageVector
    get() = _Analyse ?: UXIcon(name = "Analyse") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.55f, 23.96f)
                lineToRelative(-6.22f, -6.22f)
                curveToRelative(-1.78f, 1.46f, -4.0f, 2.26f, -6.33f, 2.26f)
                curveTo(4.49f, 20f, 0f, 15.51f, 0f, 10f)
                reflectiveCurveTo(4.49f, 0f, 10f, 0f)
                curveToRelative(2.29f, 0f, 4.4f, 0.78f, 6.09f, 2.08f)
                lineToRelative(-1.31f, 1.51f)
                curveToRelative(-1.33f, -1f, -2.99f, -1.6f, -4.78f, -1.6f)
                curveTo(5.59f, 2f, 2f, 5.59f, 2f, 10f)
                curveToRelative(0f, 1.17f, 0.26f, 2.27f, 0.71f, 3.27f)
                lineToRelative(5.22f, -6.26f)
                lineToRelative(3.51f, 3.51f)
                lineTo(20.24f, 0.34f)
                lineToRelative(1.51f, 1.31f)
                lineToRelative(-10.2f, 11.81f)
                lineToRelative(-3.49f, -3.49f)
                lineToRelative(-4.25f, 5.09f)
                curveToRelative(1.47f, 1.79f, 3.69f, 2.93f, 6.18f, 2.93f)
                curveToRelative(2.14f, 0f, 4.15f, -0.83f, 5.66f, -2.34f)
                reflectiveCurveToRelative(2.34f, -3.52f, 2.34f, -5.66f)
                curveToRelative(0f, -0.3f, -0.02f, -0.6f, -0.05f, -0.89f)
                lineToRelative(1.65f, -1.91f)
                curveToRelative(0.26f, 0.89f, 0.41f, 1.82f, 0.41f, 2.8f)
                curveToRelative(0f, 2.33f, -0.8f, 4.55f, -2.26f, 6.33f)
                lineToRelative(6.22f, 6.22f)
                lineToRelative(-1.41f, 1.41f)
                close()
            }
        }.also { _Analyse = it}
