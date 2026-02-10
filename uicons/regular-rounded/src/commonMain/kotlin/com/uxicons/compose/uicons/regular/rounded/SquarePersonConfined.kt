package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SquarePersonConfined: ImageVector? = null

val Icons.Rr.SquarePersonConfined: ImageVector
    get() = _SquarePersonConfined ?: UXIcon(name = "SquarePersonConfined") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 0f)
                lineTo(5f, 0f)
                curveTo(2.24f, 0f, 0f, 2.24f, 0f, 5f)
                verticalLineToRelative(14f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(14f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                lineTo(24f, 5f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                close()
                moveTo(22f, 19f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                lineTo(5f, 22f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                lineTo(2f, 5f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(14f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                verticalLineToRelative(14f)
                close()
                moveTo(18.17f, 9.24f)
                curveToRelative(-1.43f, -0.66f, -3.33f, 0.1f, -3.91f, 1.53f)
                lineToRelative(-2.27f, 4.53f)
                lineToRelative(-1.98f, -2.66f)
                curveToRelative(-0.38f, -0.45f, -0.97f, -0.69f, -1.55f, -0.64f)
                curveToRelative(-0.59f, 0.05f, -1.12f, 0.39f, -1.44f, 0.94f)
                lineToRelative(-2.91f, 5.59f)
                curveToRelative(-0.26f, 0.49f, -0.07f, 1.09f, 0.42f, 1.35f)
                curveToRelative(0.48f, 0.25f, 1.09f, 0.07f, 1.35f, -0.42f)
                lineToRelative(2.76f, -5.3f)
                lineToRelative(3.33f, 4.47f)
                curveToRelative(0.33f, 0.5f, 0.8f, 0.89f, 1.35f, 1.13f)
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
