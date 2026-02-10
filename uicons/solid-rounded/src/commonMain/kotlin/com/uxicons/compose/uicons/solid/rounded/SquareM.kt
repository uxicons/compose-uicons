package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SquareM: ImageVector? = null

val Icons.Sr.SquareM: ImageVector
    get() = _SquareM ?: UXIcon(name = "SquareM") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19f, 0f)
                lineTo(5f, 0f)
                curveTo(2.24f, 0f, 0f, 2.24f, 0f, 5f)
                verticalLineToRelative(14f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(14f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                lineTo(24f, 5f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                close()
                moveTo(19f, 6.81f)
                verticalLineToRelative(11.19f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                lineTo(17f, 7.58f)
                lineToRelative(-4.14f, 6.93f)
                curveToRelative(-0.36f, 0.6f, -1.35f, 0.6f, -1.72f, 0f)
                lineToRelative(-4.14f, -6.93f)
                verticalLineToRelative(10.41f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                lineTo(5.0f, 6.81f)
                curveToRelative(0f, -0.82f, 0.48f, -1.5f, 1.22f, -1.73f)
                curveToRelative(0.75f, -0.24f, 1.57f, 0.05f, 2.03f, 0.71f)
                lineToRelative(3.75f, 6.26f)
                lineToRelative(3.71f, -6.2f)
                curveToRelative(0.5f, -0.72f, 1.32f, -1.01f, 2.07f, -0.77f)
                curveToRelative(0.74f, 0.23f, 1.22f, 0.91f, 1.22f, 1.73f)
                close()
            }
        }.also { _SquareM = it}
