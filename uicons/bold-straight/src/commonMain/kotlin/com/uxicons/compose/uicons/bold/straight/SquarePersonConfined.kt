package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SquarePersonConfined: ImageVector? = null

val Icons.Bs.SquarePersonConfined: ImageVector
    get() = _SquarePersonConfined ?: UXIcon(name = "SquarePersonConfined") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.5f, 0f)
                lineTo(3.5f, 0f)
                curveTo(1.57f, 0f, 0f, 1.57f, 0f, 3.5f)
                lineTo(0f, 24f)
                lineTo(24f, 24f)
                lineTo(24f, 3.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(21f, 21f)
                lineTo(3f, 21f)
                lineTo(3f, 3.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                lineTo(20.5f, 3f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                lineTo(21f, 21f)
                close()
                moveTo(10f, 6.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                close()
                moveTo(18.86f, 12.31f)
                lineToRelative(-1.43f, 4.64f)
                curveToRelative(-0.41f, 1.24f, -1.56f, 2.05f, -2.82f, 2.05f)
                curveToRelative(-1.15f, 0f, -1.66f, -0.55f, -1.66f, -0.55f)
                curveToRelative(-0.07f, -0.05f, -3.7f, -3.04f, -3.7f, -3.04f)
                lineToRelative(-1.64f, 3.59f)
                horizontalLineToRelative(-3.3f)
                lineToRelative(3.23f, -7f)
                horizontalLineToRelative(2.08f)
                lineToRelative(3.2f, 2.55f)
                lineToRelative(1.32f, -3.86f)
                curveToRelative(0.45f, -1.3f, 1.87f, -2.0f, 3.18f, -1.55f)
                curveToRelative(1.3f, 0.45f, 2.0f, 1.87f, 1.55f, 3.18f)
                close()
            }
        }.also { _SquarePersonConfined = it}
