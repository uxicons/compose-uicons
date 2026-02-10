package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CupcakeAlt: ImageVector? = null

val Icons.Sr.CupcakeAlt: ImageVector
    get() = _CupcakeAlt ?: UXIcon(name = "CupcakeAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(2.81f, 16f)
                horizontalLineToRelative(18.38f)
                lineToRelative(-0.61f, 3.79f)
                curveToRelative(-0.39f, 2.42f, -2.48f, 4.21f, -4.94f, 4.21f)
                horizontalLineToRelative(-7.29f)
                curveToRelative(-2.46f, 0f, -4.55f, -1.78f, -4.94f, -4.21f)
                lineToRelative(-0.61f, -3.79f)
                close()
                moveTo(21.5f, 9f)
                horizontalLineToRelative(-3.5f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(1f)
                curveToRelative(1.0f, 0f, 1.92f, -0.68f, 2.08f, -1.66f)
                curveToRelative(0.2f, -1.25f, -0.76f, -2.34f, -1.97f, -2.34f)
                horizontalLineToRelative(-3.08f)
                curveToRelative(-0.52f, -1.5f, -1.22f, -2.11f, -2.37f, -2.84f)
                curveToRelative(-0.58f, -0.37f, -1.38f, -0.04f, -1.49f, 0.64f)
                curveToRelative(-0.23f, 1.51f, -1.17f, 2.2f, -1.17f, 2.2f)
                horizontalLineToRelative(-5.89f)
                curveToRelative(-1.0f, 0f, -1.92f, 0.68f, -2.08f, 1.66f)
                curveToRelative(-0.2f, 1.25f, 0.76f, 2.34f, 1.97f, 2.34f)
                horizontalLineToRelative(7.15f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                lineTo(2.64f, 9f)
                curveTo(1.33f, 9f, 0.14f, 9.94f, 0.01f, 11.24f)
                curveToRelative(-0.15f, 1.5f, 1.02f, 2.76f, 2.49f, 2.76f)
                horizontalLineToRelative(18.86f)
                curveToRelative(1.31f, 0f, 2.5f, -0.94f, 2.63f, -2.24f)
                curveToRelative(0.15f, -1.5f, -1.02f, -2.76f, -2.49f, -2.76f)
                close()
            }
        }.also { _CupcakeAlt = it}
