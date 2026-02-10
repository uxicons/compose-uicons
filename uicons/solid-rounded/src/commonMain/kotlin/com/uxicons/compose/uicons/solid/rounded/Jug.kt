package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Jug: ImageVector? = null

val Icons.Sr.Jug: ImageVector
    get() = _Jug ?: UXIcon(name = "Jug") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.88f, 10.06f)
                curveToRelative(0.69f, -0.65f, 1.12f, -1.56f, 1.12f, -2.56f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                curveToRelative(-0.53f, 0f, -1.04f, 0.13f, -1.5f, 0.35f)
                lineTo(15f, 2f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-6f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                lineTo(9f, 6.93f)
                curveToRelative(0f, 0.33f, -0.17f, 0.65f, -0.45f, 0.83f)
                lineToRelative(-3.33f, 2.22f)
                curveToRelative(-1.07f, 0.71f, -1.8f, 1.8f, -2.09f, 3.02f)
                horizontalLineToRelative(12.86f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                lineTo(3f, 15f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(8f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                verticalLineToRelative(-4.86f)
                curveToRelative(0f, -1.63f, -0.79f, -3.15f, -2.12f, -4.08f)
                close()
                moveTo(17.09f, 8.86f)
                lineToRelative(-1.64f, -1.1f)
                curveToRelative(-0.21f, -0.14f, -0.35f, -0.34f, -0.41f, -0.58f)
                curveToRelative(0.15f, -0.69f, 0.76f, -1.19f, 1.47f, -1.19f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                curveToRelative(0f, 0.6f, -0.38f, 1.12f, -0.91f, 1.36f)
                close()
            }
        }.also { _Jug = it}
