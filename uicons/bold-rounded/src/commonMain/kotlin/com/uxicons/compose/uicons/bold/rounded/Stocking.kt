package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Stocking: ImageVector? = null

val Icons.Br.Stocking: ImageVector
    get() = _Stocking ?: UXIcon(name = "Stocking") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(22.5f, 0f)
            lineTo(7.5f, 0f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(0.5f)
            verticalLineToRelative(5.25f)
            curveToRelative(0f, 0.66f, -0.42f, 1.24f, -1.05f, 1.43f)
            lineToRelative(-1.84f, 0.58f)
            curveTo(1.61f, 11.35f, -0.57f, 14.92f, 0.14f, 18.38f)
            curveToRelative(0.66f, 3.26f, 3.55f, 5.62f, 6.86f, 5.62f)
            curveToRelative(0.71f, 0f, 1.41f, -0.11f, 2.09f, -0.32f)
            lineToRelative(6.25f, -1.95f)
            curveToRelative(3.99f, -1.25f, 6.67f, -4.89f, 6.67f, -9.07f)
            lineTo(22f, 3f)
            horizontalLineToRelative(0.5f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            close()
            moveTo(19f, 12.66f)
            curveToRelative(0f, 2.86f, -1.83f, 5.35f, -4.56f, 6.2f)
            lineToRelative(-6.25f, 1.95f)
            curveToRelative(-0.39f, 0.12f, -0.79f, 0.18f, -1.19f, 0.18f)
            curveToRelative(-1.89f, 0f, -3.54f, -1.35f, -3.92f, -3.22f)
            curveToRelative(-0.4f, -1.97f, 0.88f, -4.02f, 2.92f, -4.66f)
            lineToRelative(1.84f, -0.58f)
            curveToRelative(1.89f, -0.59f, 3.16f, -2.31f, 3.16f, -4.29f)
            lineTo(11f, 3f)
            horizontalLineToRelative(8f)
            verticalLineToRelative(9.66f)
            close()
        }
    }.also { _Stocking = it }
