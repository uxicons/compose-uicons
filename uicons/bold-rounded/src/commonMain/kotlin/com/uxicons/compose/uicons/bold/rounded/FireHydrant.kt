package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FireHydrant: ImageVector? = null

val Icons.Br.FireHydrant: ImageVector
    get() = _FireHydrant ?: UXIcon(name = "FireHydrant") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(18.5f, 21f)
            horizontalLineToRelative(-0.5f)
            verticalLineToRelative(-6f)
            horizontalLineToRelative(0.5f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            horizontalLineToRelative(-0.5f)
            verticalLineToRelative(-4f)
            curveToRelative(0f, -2.79f, -1.92f, -5.14f, -4.5f, -5.81f)
            verticalLineToRelative(-0.69f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
            verticalLineToRelative(0.69f)
            curveToRelative(-2.58f, 0.67f, -4.5f, 3.02f, -4.5f, 5.81f)
            verticalLineToRelative(4f)
            horizontalLineToRelative(-0.5f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(0.5f)
            verticalLineToRelative(6f)
            horizontalLineToRelative(-0.5f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(13f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            close()
            moveTo(12f, 5f)
            curveToRelative(1.3f, 0f, 2.42f, 0.84f, 2.83f, 2f)
            horizontalLineToRelative(-5.66f)
            curveToRelative(0.41f, -1.16f, 1.52f, -2f, 2.83f, -2f)
            close()
            moveTo(9f, 10f)
            horizontalLineToRelative(6f)
            verticalLineToRelative(11f)
            horizontalLineToRelative(-6f)
            verticalLineToRelative(-11f)
            close()
            moveTo(13.5f, 13.5f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
            reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
            close()
        }
    }.also { _FireHydrant = it }
