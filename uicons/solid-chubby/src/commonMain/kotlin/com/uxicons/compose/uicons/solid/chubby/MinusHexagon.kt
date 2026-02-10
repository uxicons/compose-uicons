package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MinusHexagon: ImageVector? = null

val Icons.Sc.MinusHexagon: ImageVector
    get() = _MinusHexagon ?: UXIcon(name = "MinusHexagon") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.95f, 11.69f)
                curveToRelative(-1.2f, -3.63f, -2.9f, -6.69f, -5.21f, -9.34f)
                curveToRelative(-0.15f, -0.17f, -0.34f, -0.28f, -0.56f, -0.33f)
                curveToRelative(-0.1f, -0.02f, -2.62f, -0.52f, -5.18f, -0.52f)
                reflectiveCurveToRelative(-5.08f, 0.5f, -5.18f, 0.52f)
                curveToRelative(-0.22f, 0.04f, -0.41f, 0.16f, -0.56f, 0.33f)
                curveToRelative(-2.3f, 2.65f, -4.0f, 5.71f, -5.2f, 9.34f)
                curveToRelative(-0.07f, 0.2f, -0.07f, 0.42f, 0f, 0.63f)
                curveToRelative(1.2f, 3.63f, 2.9f, 6.69f, 5.21f, 9.34f)
                curveToRelative(0.15f, 0.17f, 0.34f, 0.28f, 0.56f, 0.33f)
                curveToRelative(0.1f, 0.02f, 2.62f, 0.52f, 5.18f, 0.52f)
                reflectiveCurveToRelative(5.08f, -0.5f, 5.18f, -0.52f)
                curveToRelative(0.22f, -0.04f, 0.41f, -0.16f, 0.56f, -0.33f)
                curveToRelative(2.3f, -2.65f, 4.0f, -5.71f, 5.21f, -9.34f)
                curveToRelative(0.07f, -0.2f, 0.07f, -0.42f, 0f, -0.63f)
                close()
                moveTo(16f, 13f)
                horizontalLineToRelative(-8f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(8f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                close()
            }
        }.also { _MinusHexagon = it}
