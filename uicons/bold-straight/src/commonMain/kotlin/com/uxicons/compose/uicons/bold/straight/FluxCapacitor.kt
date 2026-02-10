package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FluxCapacitor: ImageVector? = null

val Icons.Bs.FluxCapacitor: ImageVector
    get() = _FluxCapacitor ?: UXIcon(name = "FluxCapacitor") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15.5f, 15.5f)
                curveToRelative(0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                reflectiveCurveToRelative(-3.5f, -1.57f, -3.5f, -3.5f)
                curveToRelative(0f, -1.39f, 0.82f, -2.59f, 2f, -3.15f)
                verticalLineToRelative(3.65f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-3.65f)
                curveToRelative(1.18f, 0.56f, 2f, 1.76f, 2f, 3.15f)
                close()
                moveTo(6.7f, 9.41f)
                lineToRelative(1.8f, -2.4f)
                lineToRelative(2.93f, 2.19f)
                curveToRelative(0.05f, -0.23f, 0.07f, -0.46f, 0.07f, -0.7f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                reflectiveCurveToRelative(-3.5f, 1.57f, -3.5f, 3.5f)
                reflectiveCurveToRelative(1.57f, 3.5f, 3.5f, 3.5f)
                curveToRelative(0.59f, 0f, 1.13f, -0.16f, 1.62f, -0.41f)
                lineToRelative(-2.92f, -2.18f)
                close()
                moveTo(16f, 5f)
                curveToRelative(-1.93f, 0f, -3.49f, 1.57f, -3.5f, 3.5f)
                curveToRelative(0f, 0.24f, 0.02f, 0.47f, 0.07f, 0.7f)
                lineToRelative(2.81f, -2.17f)
                lineToRelative(1.8f, 2.4f)
                lineToRelative(-2.83f, 2.17f)
                curveToRelative(0.49f, 0.26f, 1.05f, 0.41f, 1.65f, 0.39f)
                curveToRelative(1.93f, -0.06f, 3.5f, -1.57f, 3.5f, -3.5f)
                reflectiveCurveToRelative(-1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(24f, 3.5f)
                verticalLineToRelative(20.5f)
                lineTo(0f, 24f)
                lineTo(0f, 3.5f)
                curveTo(0f, 1.57f, 1.57f, 0f, 3.5f, 0f)
                horizontalLineToRelative(17f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                close()
                moveTo(21f, 3.5f)
                curveToRelative(0f, -0.28f, -0.23f, -0.5f, -0.5f, -0.5f)
                lineTo(3.5f, 3f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(17.5f)
                horizontalLineToRelative(18f)
                lineTo(21f, 3.5f)
                close()
            }
        }.also { _FluxCapacitor = it}
