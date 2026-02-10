package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SquarePersonConfined: ImageVector? = null

val Icons.Ss.SquarePersonConfined: ImageVector
    get() = _SquarePersonConfined ?: UXIcon(name = "SquarePersonConfined") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.93f, 11.62f)
                curveToRelative(0.1f, 0.25f, 0.1f, 0.52f, 0.02f, 0.71f)
                lineToRelative(-2.53f, 5.06f)
                curveToRelative(-0.2f, 0.5f, -0.82f, 0.75f, -1.31f, 0.53f)
                curveToRelative(-0.47f, -0.17f, -0.74f, -0.82f, -0.56f, -1.25f)
                lineToRelative(2.53f, -5.06f)
                curveToRelative(0.2f, -0.5f, 0.82f, -0.75f, 1.31f, -0.53f)
                curveToRelative(0.25f, 0.1f, 0.44f, 0.3f, 0.54f, 0.55f)
                close()
                moveTo(24f, 3f)
                lineTo(24f, 24f)
                lineTo(0f, 24f)
                lineTo(0f, 3f)
                curveTo(0f, 1.35f, 1.35f, 0f, 3f, 0f)
                lineTo(21f, 0f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                close()
                moveTo(11f, 6.5f)
                curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.12f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.12f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.12f, -2.5f, 2.5f)
                close()
                moveTo(18.17f, 9.24f)
                curveToRelative(-1.43f, -0.66f, -3.33f, 0.1f, -3.91f, 1.53f)
                lineToRelative(-2.31f, 4.63f)
                lineToRelative(-2.73f, -3.41f)
                horizontalLineToRelative(-1.34f)
                lineTo(3.88f, 20f)
                horizontalLineToRelative(2.24f)
                lineToRelative(2.67f, -5.34f)
                lineToRelative(3.28f, 4.09f)
                lineToRelative(0.01f, -0.01f)
                curveToRelative(0.54f, 0.77f, 1.49f, 1.26f, 2.43f, 1.25f)
                curveToRelative(1.14f, 0.02f, 2.32f, -0.75f, 2.74f, -1.77f)
                lineToRelative(2.52f, -5.06f)
                curveToRelative(0.66f, -1.47f, -0.09f, -3.33f, -1.59f, -3.93f)
                close()
            }
        }.also { _SquarePersonConfined = it}
