package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FireFlameSimple: ImageVector? = null

val Icons.Bs.FireFlameSimple: ImageVector
    get() = _FireFlameSimple ?: UXIcon(name = "FireFlameSimple") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19.06f, 6.91f)
                lineTo(12f, 0.01f)
                lineToRelative(-7.07f, 6.92f)
                curveToRelative(-3.9f, 3.9f, -3.9f, 10.24f, 0f, 14.14f)
                curveToRelative(1.89f, 1.89f, 4.4f, 2.93f, 7.07f, 2.93f)
                reflectiveCurveToRelative(5.18f, -1.04f, 7.07f, -2.93f)
                curveToRelative(3.9f, -3.9f, 3.9f, -10.24f, -0.01f, -14.15f)
                close()
                moveTo(16.95f, 18.94f)
                curveToRelative(-1.32f, 1.32f, -3.08f, 2.05f, -4.95f, 2.05f)
                reflectiveCurveToRelative(-3.63f, -0.73f, -4.95f, -2.05f)
                curveToRelative(-2.73f, -2.73f, -2.73f, -7.17f, -0.01f, -9.89f)
                lineToRelative(4.96f, -4.85f)
                lineToRelative(4.95f, 4.84f)
                curveToRelative(2.73f, 2.73f, 2.73f, 7.17f, 0f, 9.9f)
                close()
                moveTo(14.83f, 12.17f)
                curveToRelative(1.56f, 1.56f, 1.56f, 4.09f, 0f, 5.66f)
                curveToRelative(-0.78f, 0.78f, -1.8f, 1.17f, -2.83f, 1.17f)
                curveToRelative(-1.02f, 0f, -2.05f, -0.39f, -2.83f, -1.17f)
                curveToRelative(-1.56f, -1.56f, -1.56f, -4.09f, 0f, -5.66f)
                lineToRelative(2.83f, -2.77f)
                lineToRelative(2.83f, 2.77f)
                close()
            }
        }.also { _FireFlameSimple = it}
