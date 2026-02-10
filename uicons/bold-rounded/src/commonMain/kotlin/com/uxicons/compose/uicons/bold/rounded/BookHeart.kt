package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BookHeart: ImageVector? = null

val Icons.Br.BookHeart: ImageVector
    get() = _BookHeart ?: UXIcon(name = "BookHeart") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(7.5f, 7.5f)
            curveToRelative(0f, -1.38f, 1.01f, -2.5f, 2.25f, -2.5f)
            reflectiveCurveToRelative(2.25f, 1.12f, 2.25f, 2.5f)
            curveToRelative(0f, -1.38f, 1.01f, -2.5f, 2.25f, -2.5f)
            reflectiveCurveToRelative(2.25f, 1.12f, 2.25f, 2.5f)
            curveToRelative(0f, 1.84f, -2.23f, 4.08f, -3.55f, 5.17f)
            curveToRelative(-0.55f, 0.45f, -1.34f, 0.45f, -1.89f, 0f)
            curveToRelative(-1.32f, -1.08f, -3.55f, -3.32f, -3.55f, -5.17f)
            close()
            moveTo(23f, 5.5f)
            verticalLineToRelative(13f)
            curveToRelative(0f, 3.03f, -2.47f, 5.5f, -5.5f, 5.5f)
            lineTo(5.5f, 24f)
            curveToRelative(-2.38f, 0f, -4.31f, -1.86f, -4.47f, -4.2f)
            lineToRelative(-0.03f, -14.3f)
            curveTo(1f, 2.47f, 3.47f, 0f, 6.5f, 0f)
            horizontalLineToRelative(11f)
            curveToRelative(3.03f, 0f, 5.5f, 2.47f, 5.5f, 5.5f)
            close()
            moveTo(4f, 5.5f)
            verticalLineToRelative(9.78f)
            curveToRelative(0.47f, -0.17f, 0.97f, -0.28f, 1.5f, -0.28f)
            horizontalLineToRelative(14.5f)
            lineTo(20f, 5.5f)
            curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
            lineTo(6.5f, 3f)
            curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
            close()
            moveTo(20f, 18.5f)
            verticalLineToRelative(-0.5f)
            lineTo(5.5f, 18f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(12f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            close()
        }
    }.also { _BookHeart = it }
