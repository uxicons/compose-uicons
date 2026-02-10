package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SportDrink: ImageVector? = null

val Icons.Br.SportDrink: ImageVector
    get() = _SportDrink ?: UXIcon(name = "SportDrink") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(20f, 9.5f)
            curveToRelative(0f, -1.95f, -1.26f, -3.6f, -3f, -4.22f)
            verticalLineToRelative(-0.28f)
            curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
            horizontalLineToRelative(-1.5f)
            verticalLineToRelative(-1.5f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
            verticalLineToRelative(1.5f)
            horizontalLineToRelative(-1.5f)
            curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
            verticalLineToRelative(0.28f)
            curveToRelative(-1.74f, 0.62f, -3f, 2.27f, -3f, 4.22f)
            verticalLineToRelative(1f)
            curveToRelative(0f, 1.16f, 0.45f, 2.2f, 1.17f, 3f)
            curveToRelative(-0.72f, 0.8f, -1.17f, 1.84f, -1.17f, 3f)
            verticalLineToRelative(3f)
            curveToRelative(0f, 2.48f, 2.02f, 4.5f, 4.5f, 4.5f)
            horizontalLineToRelative(7f)
            curveToRelative(2.48f, 0f, 4.5f, -2.02f, 4.5f, -4.5f)
            verticalLineToRelative(-3f)
            curveToRelative(0f, -1.16f, -0.45f, -2.2f, -1.17f, -3f)
            curveToRelative(0.72f, -0.8f, 1.17f, -1.84f, 1.17f, -3f)
            close()
            moveTo(17f, 19.5f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-7f)
            curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
            verticalLineToRelative(-3f)
            curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
            horizontalLineToRelative(2f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            horizontalLineToRelative(-2f)
            curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
            verticalLineToRelative(-1f)
            curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
            horizontalLineToRelative(7f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            verticalLineToRelative(1f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
            close()
        }
    }.also { _SportDrink = it }
