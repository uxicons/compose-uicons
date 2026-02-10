package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Equals: ImageVector? = null

val Icons.Sc.Equals: ImageVector
    get() = _Equals ?: UXIcon(name = "Equals") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(1.05f, 9.88f)
                curveToRelative(-0.21f, -0.8f, 0.27f, -1.62f, 1.07f, -1.83f)
                curveToRelative(0.16f, -0.04f, 4.05f, -1.05f, 9.88f, -1.05f)
                reflectiveCurveToRelative(9.72f, 1.01f, 9.88f, 1.05f)
                curveToRelative(0.8f, 0.21f, 1.28f, 1.03f, 1.07f, 1.83f)
                curveToRelative(-0.21f, 0.81f, -1.05f, 1.28f, -1.83f, 1.07f)
                curveToRelative(-0.04f, -0.01f, -3.71f, -0.95f, -9.12f, -0.95f)
                reflectiveCurveToRelative(-9.08f, 0.94f, -9.12f, 0.95f)
                curveToRelative(-0.8f, 0.21f, -1.62f, -0.27f, -1.83f, -1.07f)
                close()
                moveTo(21.88f, 14.05f)
                curveToRelative(-0.16f, -0.04f, -4.05f, -1.05f, -9.88f, -1.05f)
                reflectiveCurveToRelative(-9.72f, 1.01f, -9.88f, 1.05f)
                curveToRelative(-0.8f, 0.21f, -1.28f, 1.03f, -1.07f, 1.83f)
                curveToRelative(0.21f, 0.8f, 1.03f, 1.28f, 1.83f, 1.07f)
                curveToRelative(0.04f, -0.01f, 3.71f, -0.95f, 9.12f, -0.95f)
                reflectiveCurveToRelative(9.08f, 0.94f, 9.12f, 0.95f)
                curveToRelative(0.78f, 0.21f, 1.62f, -0.26f, 1.83f, -1.07f)
                curveToRelative(0.21f, -0.8f, -0.27f, -1.62f, -1.07f, -1.83f)
                close()
            }
        }.also { _Equals = it}
