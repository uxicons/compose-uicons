package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Acorn: ImageVector? = null

val Icons.Br.Acorn: ImageVector
    get() = _Acorn ?: UXIcon(name = "Acorn") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(23f, 8.5f)
            curveToRelative(0f, -3.58f, -2.92f, -6.5f, -6.5f, -6.5f)
            horizontalLineToRelative(-3f)
            verticalLineToRelative(-0.5f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
            verticalLineToRelative(0.5f)
            horizontalLineToRelative(-3f)
            curveTo(3.92f, 2f, 1f, 4.92f, 1f, 8.5f)
            curveToRelative(0f, 1.21f, 0.86f, 2.22f, 2f, 2.45f)
            verticalLineToRelative(3.49f)
            curveToRelative(0f, 4.7f, 4.07f, 7.6f, 6.49f, 8.92f)
            curveToRelative(0.79f, 0.43f, 1.65f, 0.64f, 2.51f, 0.64f)
            reflectiveCurveToRelative(1.73f, -0.21f, 2.51f, -0.64f)
            curveToRelative(2.42f, -1.31f, 6.49f, -4.22f, 6.49f, -8.92f)
            verticalLineToRelative(-3.49f)
            curveToRelative(1.14f, -0.23f, 2f, -1.24f, 2f, -2.45f)
            close()
            moveTo(7.5f, 5f)
            horizontalLineToRelative(9f)
            curveToRelative(1.76f, 0f, 3.22f, 1.31f, 3.46f, 3f)
            lineTo(4.04f, 8f)
            curveToRelative(0.24f, -1.69f, 1.7f, -3f, 3.46f, -3f)
            close()
            moveTo(13.08f, 20.72f)
            curveToRelative(-0.68f, 0.37f, -1.49f, 0.37f, -2.16f, 0f)
            curveToRelative(-1.84f, -1f, -4.92f, -3.13f, -4.92f, -6.28f)
            verticalLineToRelative(-3.44f)
            horizontalLineToRelative(12f)
            verticalLineToRelative(3.44f)
            curveToRelative(0f, 3.15f, -3.08f, 5.28f, -4.92f, 6.28f)
            close()
        }
    }.also { _Acorn = it }
