package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GripLinesVertical: ImageVector? = null

val Icons.Sc.GripLinesVertical: ImageVector
    get() = _GripLinesVertical ?: UXIcon(name = "GripLinesVertical") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(9.5f, 23f)
                curveToRelative(-0.66f, 0f, -1.27f, -0.45f, -1.45f, -1.12f)
                curveToRelative(-0.04f, -0.16f, -1.05f, -4.05f, -1.05f, -9.88f)
                reflectiveCurveToRelative(1.01f, -9.72f, 1.05f, -9.88f)
                curveToRelative(0.21f, -0.8f, 1.03f, -1.28f, 1.83f, -1.07f)
                curveToRelative(0.8f, 0.21f, 1.28f, 1.03f, 1.07f, 1.83f)
                curveToRelative(-0.01f, 0.04f, -0.95f, 3.71f, -0.95f, 9.12f)
                reflectiveCurveToRelative(0.94f, 9.08f, 0.95f, 9.12f)
                curveToRelative(0.26f, 0.93f, -0.49f, 1.89f, -1.45f, 1.88f)
                close()
                moveTo(15.88f, 22.95f)
                curveToRelative(0.8f, -0.21f, 1.28f, -1.03f, 1.07f, -1.83f)
                curveToRelative(-0.01f, -0.04f, -0.95f, -3.71f, -0.95f, -9.12f)
                reflectiveCurveToRelative(0.94f, -9.08f, 0.95f, -9.12f)
                curveToRelative(0.21f, -0.8f, -0.27f, -1.62f, -1.07f, -1.83f)
                curveToRelative(-0.8f, -0.21f, -1.62f, 0.27f, -1.83f, 1.07f)
                curveToRelative(-0.04f, 0.16f, -1.05f, 4.05f, -1.05f, 9.88f)
                reflectiveCurveToRelative(1.01f, 9.72f, 1.05f, 9.88f)
                curveToRelative(0.21f, 0.81f, 1.05f, 1.28f, 1.83f, 1.07f)
                close()
            }
        }.also { _GripLinesVertical = it}
