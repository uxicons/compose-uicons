package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Forklift: ImageVector? = null

val Icons.Sr.Forklift: ImageVector
    get() = _Forklift ?: UXIcon(name = "Forklift") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(11f, 21f)
                horizontalLineToRelative(6f)
                curveToRelative(0f, 1.66f, -1.34f, 3f, -3f, 3f)
                reflectiveCurveToRelative(-3f, -1.34f, -3f, -3f)
                close()
                moveTo(3f, 24f)
                curveToRelative(1.66f, 0f, 3f, -1.34f, 3f, -3f)
                lineTo(0f, 21f)
                curveToRelative(0f, 1.66f, 1.34f, 3f, 3f, 3f)
                close()
                moveTo(21f, 16.5f)
                lineTo(21f, 4f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(0f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(10f)
                horizontalLineToRelative(-8.4f)
                curveToRelative(-1.39f, 0f, -2.62f, -0.93f, -3.0f, -2.27f)
                horizontalLineToRelative(0f)
                curveToRelative(-0.12f, -0.43f, -0.52f, -0.73f, -0.96f, -0.73f)
                lineTo(0f, 11f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(17f)
                verticalLineToRelative(-0.5f)
                lineToRelative(-0.5f, -2.5f)
                horizontalLineToRelative(2.5f)
                verticalLineToRelative(0.5f)
                curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(1.5f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                horizontalLineToRelative(0f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-1.5f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                close()
                moveTo(9.53f, 11.19f)
                horizontalLineToRelative(0f)
                curveToRelative(0.14f, 0.48f, 0.57f, 0.81f, 1.07f, 0.81f)
                horizontalLineToRelative(5.11f)
                lineToRelative(-1.46f, -7.91f)
                curveToRelative(-0.44f, -2.37f, -2.5f, -4.09f, -4.92f, -4.09f)
                horizontalLineToRelative(-4.34f)
                curveTo(2.24f, 0f, 0f, 2.24f, 0f, 5f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(6.64f)
                curveToRelative(1.34f, 0f, 2.52f, 0.89f, 2.89f, 2.19f)
                close()
            }
        }.also { _Forklift = it}
