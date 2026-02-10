package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CarOil: ImageVector? = null

val Icons.Br.CarOil: ImageVector
    get() = _CarOil ?: UXIcon(name = "CarOil") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(14.12f, 12.88f)
            curveToRelative(1.17f, 1.17f, 1.17f, 3.07f, 0f, 4.24f)
            curveToRelative(-0.59f, 0.59f, -1.35f, 0.88f, -2.12f, 0.88f)
            curveToRelative(-0.77f, 0f, -1.54f, -0.29f, -2.12f, -0.88f)
            curveToRelative(-1.17f, -1.17f, -1.17f, -3.07f, 0f, -4.24f)
            lineToRelative(1.45f, -1.6f)
            curveToRelative(0.37f, -0.37f, 0.97f, -0.37f, 1.35f, 0f)
            close()
            moveTo(20.85f, 6.27f)
            curveToRelative(0.74f, 1.08f, 1.15f, 2.35f, 1.15f, 3.69f)
            verticalLineToRelative(8.54f)
            curveToRelative(0f, 3.03f, -2.47f, 5.5f, -5.5f, 5.5f)
            horizontalLineToRelative(-9f)
            curveToRelative(-3.03f, 0f, -5.5f, -2.47f, -5.5f, -5.5f)
            verticalLineToRelative(-13f)
            curveToRelative(0f, -3.03f, 2.47f, -5.5f, 5.5f, -5.5f)
            horizontalLineToRelative(4.54f)
            curveToRelative(1.58f, 0f, 3.07f, 0.56f, 4.25f, 1.59f)
            lineToRelative(0.65f, -0.65f)
            curveToRelative(0.59f, -0.59f, 1.53f, -0.59f, 2.12f, 0f)
            lineToRelative(2.5f, 2.5f)
            curveToRelative(0.59f, 0.58f, 0.59f, 1.54f, 0f, 2.12f)
            close()
            moveTo(5.05f, 5f)
            horizontalLineToRelative(4.45f)
            curveToRelative(1.21f, 0f, 2.22f, -0.86f, 2.45f, -2f)
            horizontalLineToRelative(-4.45f)
            curveToRelative(-1.21f, 0f, -2.22f, 0.86f, -2.45f, 2f)
            close()
            moveTo(19f, 9.96f)
            curveToRelative(0f, -0.94f, -0.36f, -1.81f, -1.02f, -2.48f)
            lineToRelative(-3.26f, -3.26f)
            curveToRelative(-0.73f, 2.19f, -2.79f, 3.77f, -5.22f, 3.77f)
            horizontalLineToRelative(-4.5f)
            verticalLineToRelative(10.5f)
            curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
            horizontalLineToRelative(9f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            close()
        }
    }.also { _CarOil = it }
