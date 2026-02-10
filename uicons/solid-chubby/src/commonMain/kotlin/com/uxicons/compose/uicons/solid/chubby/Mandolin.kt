package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Mandolin: ImageVector? = null

val Icons.Sc.Mandolin: ImageVector
    get() = _Mandolin ?: UXIcon(name = "Mandolin") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(10f, 15f)
                curveToRelative(0f, 0.88f, -0.12f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.12f, -1f, -1f)
                reflectiveCurveToRelative(0.12f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.12f, 1f, 1f)
                close()
                moveTo(22.8f, 4.6f)
                curveToRelative(-0.06f, 0.08f, -1.34f, 1.72f, -3.52f, 2.24f)
                lineToRelative(-2.54f, 2.54f)
                curveToRelative(0.39f, 2.67f, 0.8f, 8.49f, -2.22f, 11.51f)
                curveToRelative(-1.3f, 1.3f, -3.31f, 2.07f, -5.51f, 2.11f)
                curveToRelative(-0.01f, 0f, -0.01f, 0f, -0.02f, 0f)
                curveToRelative(-2.84f, 0f, -4.77f, -0.61f, -6.08f, -1.92f)
                reflectiveCurveToRelative(-1.92f, -3.24f, -1.92f, -6.08f)
                curveToRelative(0f, -0.04f, 0.0f, -0.07f, 0.01f, -0.11f)
                curveToRelative(0.07f, -2.09f, 0.83f, -4.05f, 2.1f, -5.39f)
                curveToRelative(3f, -2.9f, 9.01f, -2.54f, 11.51f, -2.24f)
                lineToRelative(2.55f, -2.55f)
                curveToRelative(0.51f, -2.18f, 2.15f, -3.45f, 2.24f, -3.52f)
                curveToRelative(0.26f, -0.2f, 0.6f, -0.25f, 0.92f, -0.15f)
                curveToRelative(0.09f, 0.03f, 0.86f, 0.3f, 1.6f, 1.04f)
                curveToRelative(0.73f, 0.73f, 1.01f, 1.51f, 1.04f, 1.6f)
                curveToRelative(0.1f, 0.31f, 0.05f, 0.65f, -0.15f, 0.92f)
                close()
                moveTo(12f, 15f)
                curveToRelative(0f, -1.99f, -1.01f, -3f, -3f, -3f)
                reflectiveCurveToRelative(-3f, 1.01f, -3f, 3f)
                reflectiveCurveToRelative(1.01f, 3f, 3f, 3f)
                reflectiveCurveToRelative(3f, -1.01f, 3f, -3f)
                close()
            }
        }.also { _Mandolin = it}
