package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MinusHexagon: ImageVector? = null

val Icons.Rc.MinusHexagon: ImageVector
    get() = _MinusHexagon ?: UXIcon(name = "MinusHexagon") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16f, 11f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-8f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                close()
                moveTo(22.95f, 12.31f)
                curveToRelative(-1.2f, 3.63f, -2.9f, 6.69f, -5.21f, 9.34f)
                curveToRelative(-0.15f, 0.17f, -0.34f, 0.28f, -0.56f, 0.33f)
                curveToRelative(-0.1f, 0.02f, -2.62f, 0.52f, -5.18f, 0.52f)
                reflectiveCurveToRelative(-5.08f, -0.5f, -5.18f, -0.52f)
                curveToRelative(-0.22f, -0.04f, -0.41f, -0.16f, -0.56f, -0.33f)
                curveToRelative(-2.3f, -2.65f, -4.0f, -5.71f, -5.21f, -9.34f)
                curveToRelative(-0.07f, -0.2f, -0.07f, -0.42f, 0f, -0.63f)
                curveToRelative(1.2f, -3.63f, 2.9f, -6.69f, 5.21f, -9.34f)
                curveToRelative(0.15f, -0.17f, 0.34f, -0.28f, 0.56f, -0.33f)
                curveToRelative(0.1f, -0.02f, 2.62f, -0.52f, 5.18f, -0.52f)
                reflectiveCurveToRelative(5.08f, 0.5f, 5.18f, 0.52f)
                curveToRelative(0.22f, 0.04f, 0.41f, 0.16f, 0.56f, 0.33f)
                curveToRelative(2.3f, 2.65f, 4.0f, 5.71f, 5.21f, 9.34f)
                curveToRelative(0.07f, 0.2f, 0.07f, 0.42f, 0f, 0.63f)
                close()
                moveTo(20.94f, 12f)
                curveToRelative(-1.07f, -3.12f, -2.54f, -5.77f, -4.49f, -8.08f)
                curveToRelative(-0.74f, -0.13f, -2.62f, -0.42f, -4.46f, -0.42f)
                reflectiveCurveToRelative(-3.72f, 0.29f, -4.46f, 0.42f)
                curveToRelative(-1.95f, 2.31f, -3.42f, 4.96f, -4.49f, 8.08f)
                curveToRelative(1.07f, 3.12f, 2.54f, 5.77f, 4.49f, 8.08f)
                curveToRelative(0.74f, 0.13f, 2.62f, 0.42f, 4.46f, 0.42f)
                reflectiveCurveToRelative(3.72f, -0.29f, 4.46f, -0.42f)
                curveToRelative(1.95f, -2.31f, 3.42f, -4.96f, 4.49f, -8.08f)
                close()
            }
        }.also { _MinusHexagon = it}
