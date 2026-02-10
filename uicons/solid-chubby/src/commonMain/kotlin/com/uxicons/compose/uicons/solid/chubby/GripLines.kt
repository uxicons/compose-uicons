package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GripLines: ImageVector? = null

val Icons.Sc.GripLines: ImageVector
    get() = _GripLines ?: UXIcon(name = "GripLines") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.5f, 11f)
                curveToRelative(-0.66f, -0.03f, -3.6f, -0.99f, -9.5f, -1f)
                curveToRelative(-5.41f, 0f, -9.08f, 0.94f, -9.12f, 0.95f)
                curveToRelative(-0.8f, 0.21f, -1.62f, -0.27f, -1.83f, -1.07f)
                reflectiveCurveToRelative(0.27f, -1.62f, 1.07f, -1.83f)
                curveToRelative(0.16f, -0.04f, 4.05f, -1.05f, 9.88f, -1.05f)
                reflectiveCurveToRelative(9.72f, 1.01f, 9.88f, 1.05f)
                curveToRelative(0.8f, 0.21f, 1.28f, 1.03f, 1.07f, 1.83f)
                curveToRelative(-0.18f, 0.67f, -0.79f, 1.12f, -1.45f, 1.12f)
                close()
                moveTo(22.95f, 15.88f)
                curveToRelative(0.21f, -0.8f, -0.27f, -1.62f, -1.07f, -1.83f)
                curveToRelative(-0.16f, -0.04f, -4.05f, -1.05f, -9.88f, -1.05f)
                reflectiveCurveToRelative(-9.72f, 1.01f, -9.88f, 1.05f)
                curveToRelative(-0.8f, 0.21f, -1.28f, 1.03f, -1.07f, 1.83f)
                curveToRelative(0.21f, 0.8f, 1.03f, 1.28f, 1.83f, 1.07f)
                curveToRelative(0.04f, -0.01f, 3.71f, -0.95f, 9.12f, -0.95f)
                reflectiveCurveToRelative(9.08f, 0.94f, 9.12f, 0.95f)
                curveToRelative(0.78f, 0.21f, 1.62f, -0.26f, 1.83f, -1.07f)
                close()
            }
        }.also { _GripLines = it}
