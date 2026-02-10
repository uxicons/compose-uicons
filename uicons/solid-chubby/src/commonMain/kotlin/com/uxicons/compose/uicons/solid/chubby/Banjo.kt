package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Banjo: ImageVector? = null

val Icons.Sc.Banjo: ImageVector
    get() = _Banjo ?: UXIcon(name = "Banjo") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.95f, 3.68f)
                curveToRelative(-0.03f, -0.09f, -0.3f, -0.86f, -1.04f, -1.6f)
                reflectiveCurveToRelative(-1.51f, -1.01f, -1.6f, -1.04f)
                curveToRelative(-0.31f, -0.11f, -0.66f, -0.05f, -0.92f, 0.15f)
                curveToRelative(-0.08f, 0.06f, -1.72f, 1.34f, -2.24f, 3.52f)
                lineToRelative(-4.2f, 4.2f)
                curveToRelative(-1.14f, -0.61f, -2.62f, -0.91f, -4.47f, -0.91f)
                curveToRelative(-5.19f, 0f, -7.5f, 2.31f, -7.5f, 7.5f)
                reflectiveCurveToRelative(2.31f, 7.5f, 7.5f, 7.5f)
                reflectiveCurveToRelative(7.5f, -2.31f, 7.5f, -7.5f)
                curveToRelative(0f, -1.85f, -0.3f, -3.32f, -0.91f, -4.47f)
                lineToRelative(4.2f, -4.2f)
                curveToRelative(2.18f, -0.51f, 3.45f, -2.15f, 3.52f, -2.24f)
                curveToRelative(0.2f, -0.26f, 0.25f, -0.6f, 0.15f, -0.92f)
                close()
                moveTo(9.32f, 18.95f)
                curveToRelative(-0.51f, 0.17f, -1.09f, -0.1f, -1.26f, -0.63f)
                curveToRelative(0f, 0f, -0.26f, -0.73f, -0.95f, -1.42f)
                reflectiveCurveToRelative(-1.42f, -0.95f, -1.42f, -0.95f)
                curveToRelative(-0.52f, -0.18f, -0.8f, -0.75f, -0.62f, -1.27f)
                reflectiveCurveToRelative(0.74f, -0.8f, 1.26f, -0.63f)
                curveToRelative(0.12f, 0.04f, 1.18f, 0.41f, 2.2f, 1.43f)
                curveToRelative(1.02f, 1.02f, 1.4f, 2.08f, 1.43f, 2.2f)
                curveToRelative(0.17f, 0.52f, -0.11f, 1.09f, -0.63f, 1.26f)
                close()
            }
        }.also { _Banjo = it}
