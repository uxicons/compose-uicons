package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UfoBeam: ImageVector? = null

val Icons.Sc.UfoBeam: ImageVector
    get() = _UfoBeam ?: UXIcon(name = "UfoBeam") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 7f)
                curveToRelative(-3.4f, 0f, -5.11f, -1.06f, -5.84f, -1.73f)
                curveToRelative(0.5f, -2.89f, 2.38f, -4.27f, 5.84f, -4.27f)
                reflectiveCurveToRelative(5.34f, 1.38f, 5.84f, 4.27f)
                curveToRelative(-0.74f, 0.67f, -2.44f, 1.73f, -5.84f, 1.73f)
                close()
                moveTo(23f, 9.37f)
                curveToRelative(0f, -2.21f, -1.59f, -3.22f, -2.9f, -3.7f)
                curveToRelative(-1.2f, 1.75f, -3.69f, 3.33f, -8.1f, 3.33f)
                reflectiveCurveToRelative(-6.9f, -1.58f, -8.1f, -3.33f)
                curveToRelative(-1.31f, 0.49f, -2.9f, 1.5f, -2.9f, 3.7f)
                curveToRelative(0f, 3.84f, 4.4f, 4.63f, 11f, 4.63f)
                reflectiveCurveToRelative(11f, -0.79f, 11f, -4.63f)
                close()
                moveTo(20.82f, 15.79f)
                curveToRelative(-0.39f, -0.73f, -1.3f, -1.01f, -2.03f, -0.62f)
                curveToRelative(-0.73f, 0.39f, -1.01f, 1.3f, -0.62f, 2.03f)
                curveToRelative(1.23f, 2.31f, 1.87f, 4.66f, 1.88f, 4.68f)
                curveToRelative(0.21f, 0.81f, 1.06f, 1.28f, 1.84f, 1.06f)
                curveToRelative(0.8f, -0.21f, 1.27f, -1.03f, 1.06f, -1.83f)
                curveToRelative(-0.03f, -0.11f, -0.73f, -2.7f, -2.12f, -5.32f)
                close()
                moveTo(5.21f, 15.18f)
                curveToRelative(-0.73f, -0.39f, -1.64f, -0.11f, -2.03f, 0.62f)
                curveToRelative(-1.4f, 2.62f, -2.1f, 5.21f, -2.12f, 5.32f)
                curveToRelative(-0.21f, 0.8f, 0.26f, 1.62f, 1.06f, 1.83f)
                curveToRelative(0.78f, 0.22f, 1.62f, -0.26f, 1.84f, -1.06f)
                curveToRelative(0.01f, -0.02f, 0.64f, -2.38f, 1.88f, -4.68f)
                curveToRelative(0.39f, -0.73f, 0.11f, -1.64f, -0.62f, -2.03f)
                close()
            }
        }.also { _UfoBeam = it}
