package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HouseUnlock: ImageVector? = null

val Icons.Br.HouseUnlock: ImageVector
    get() = _HouseUnlock ?: UXIcon(name = "HouseUnlock") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(3f, 9.89f)
            verticalLineToRelative(8.61f)
            curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
            horizontalLineToRelative(4f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-4f)
            curveToRelative(-3.03f, 0f, -5.5f, -2.47f, -5.5f, -5.5f)
            verticalLineToRelative(-8.61f)
            curveToRelative(0f, -1.83f, 0.91f, -3.54f, 2.42f, -4.56f)
            lineToRelative(6.5f, -4.38f)
            curveToRelative(1.87f, -1.26f, 4.28f, -1.26f, 6.15f, 0f)
            lineToRelative(5.26f, 3.55f)
            curveToRelative(0.69f, 0.46f, 0.87f, 1.4f, 0.4f, 2.08f)
            curveToRelative(-0.46f, 0.69f, -1.4f, 0.87f, -2.08f, 0.4f)
            lineToRelative(-5.26f, -3.55f)
            curveToRelative(-0.85f, -0.57f, -1.95f, -0.57f, -2.8f, 0f)
            lineToRelative(-6.5f, 4.39f)
            curveToRelative(-0.69f, 0.47f, -1.1f, 1.24f, -1.1f, 2.07f)
            close()
            moveTo(24f, 18f)
            verticalLineToRelative(3f)
            curveToRelative(0f, 1.66f, -1.34f, 3f, -3f, 3f)
            horizontalLineToRelative(-5f)
            curveToRelative(-1.66f, 0f, -3f, -1.34f, -3f, -3f)
            verticalLineToRelative(-3f)
            curveToRelative(0f, -0.89f, 0.39f, -1.67f, 1f, -2.22f)
            verticalLineToRelative(-2.28f)
            curveToRelative(0f, -2.48f, 2.02f, -4.5f, 4.5f, -4.5f)
            curveToRelative(1.28f, 0f, 2.5f, 0.55f, 3.35f, 1.5f)
            curveToRelative(0.55f, 0.62f, 0.5f, 1.56f, -0.12f, 2.12f)
            curveToRelative(-0.62f, 0.55f, -1.57f, 0.5f, -2.12f, -0.12f)
            curveToRelative(-0.29f, -0.32f, -0.69f, -0.5f, -1.12f, -0.5f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            verticalLineToRelative(1.5f)
            horizontalLineToRelative(4f)
            curveToRelative(1.66f, 0f, 3f, 1.34f, 3f, 3f)
            close()
            moveTo(20f, 19.5f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            close()
        }
    }.also { _HouseUnlock = it }
