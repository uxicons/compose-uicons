package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SquarePersonConfined: ImageVector? = null

val Icons.Rs.SquarePersonConfined: ImageVector
    get() = _SquarePersonConfined ?: UXIcon(name = "SquarePersonConfined") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 0f)
                lineTo(3f, 0f)
                curveTo(1.35f, 0f, 0f, 1.35f, 0f, 3f)
                lineTo(0f, 24f)
                lineTo(24f, 24f)
                lineTo(24f, 3f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(22f, 22f)
                lineTo(2f, 22f)
                lineTo(2f, 3f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                lineTo(21f, 2f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                lineTo(22f, 22f)
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
                curveToRelative(0.32f, 0.44f, 0.74f, 0.8f, 1.26f, 1.01f)
                curveToRelative(1.43f, 0.66f, 3.33f, -0.1f, 3.91f, -1.53f)
                lineToRelative(2.52f, -5.06f)
                curveToRelative(0.66f, -1.47f, -0.09f, -3.33f, -1.59f, -3.93f)
                close()
                moveTo(17.95f, 12.33f)
                lineToRelative(-2.53f, 5.06f)
                curveToRelative(-0.2f, 0.5f, -0.82f, 0.75f, -1.31f, 0.53f)
                curveToRelative(-0.47f, -0.17f, -0.74f, -0.82f, -0.56f, -1.25f)
                lineToRelative(2.53f, -5.06f)
                curveToRelative(0.2f, -0.5f, 0.82f, -0.75f, 1.31f, -0.53f)
                curveToRelative(0.47f, 0.17f, 0.74f, 0.82f, 0.56f, 1.25f)
                close()
                moveTo(11f, 6.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                close()
            }
        }.also { _SquarePersonConfined = it}
