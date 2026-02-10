package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BahtSign: ImageVector? = null

val Icons.Br.BahtSign: ImageVector
    get() = _BahtSign ?: UXIcon(name = "BahtSign") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(17.92f, 10.76f)
            curveToRelative(0.68f, -0.91f, 1.08f, -2.04f, 1.08f, -3.26f)
            curveToRelative(0f, -3.03f, -2.47f, -5.5f, -5.5f, -5.5f)
            horizontalLineToRelative(-1.5f)
            verticalLineToRelative(-0.5f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
            verticalLineToRelative(0.5f)
            horizontalLineToRelative(-1.5f)
            curveToRelative(-2.48f, 0f, -4.5f, 2.02f, -4.5f, 4.5f)
            verticalLineToRelative(11f)
            curveToRelative(0f, 2.48f, 2.02f, 4.5f, 4.5f, 4.5f)
            horizontalLineToRelative(1.5f)
            verticalLineToRelative(0.5f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            verticalLineToRelative(-0.5f)
            horizontalLineToRelative(3f)
            curveToRelative(3.31f, 0f, 6f, -2.69f, 6f, -6f)
            curveToRelative(0f, -2.25f, -1.24f, -4.21f, -3.08f, -5.24f)
            close()
            moveTo(13.5f, 5f)
            curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
            reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
            horizontalLineToRelative(-1.5f)
            lineTo(12f, 5f)
            horizontalLineToRelative(1.5f)
            close()
            moveTo(6f, 6.5f)
            curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
            horizontalLineToRelative(1.5f)
            verticalLineToRelative(5f)
            horizontalLineToRelative(-3f)
            verticalLineToRelative(-3.5f)
            close()
            moveTo(7.5f, 19f)
            curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
            verticalLineToRelative(-4.5f)
            horizontalLineToRelative(3f)
            verticalLineToRelative(6f)
            horizontalLineToRelative(-1.5f)
            close()
            moveTo(15f, 19f)
            horizontalLineToRelative(-3f)
            verticalLineToRelative(-6f)
            horizontalLineToRelative(3f)
            curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
            reflectiveCurveToRelative(-1.35f, 3f, -3f, 3f)
            close()
        }
    }.also { _BahtSign = it }
