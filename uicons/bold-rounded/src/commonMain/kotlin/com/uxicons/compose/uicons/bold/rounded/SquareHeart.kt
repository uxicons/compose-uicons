package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SquareHeart: ImageVector? = null

val Icons.Br.SquareHeart: ImageVector
    get() = _SquareHeart ?: UXIcon(name = "SquareHeart") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(18.5f, 24f)
            lineTo(5.5f, 24f)
            curveToRelative(-3.03f, 0f, -5.5f, -2.47f, -5.5f, -5.5f)
            lineTo(0f, 5.5f)
            curveTo(0f, 2.47f, 2.47f, 0f, 5.5f, 0f)
            horizontalLineToRelative(13f)
            curveToRelative(3.03f, 0f, 5.5f, 2.47f, 5.5f, 5.5f)
            verticalLineToRelative(13f)
            curveToRelative(0f, 3.03f, -2.47f, 5.5f, -5.5f, 5.5f)
            close()
            moveTo(5.5f, 3f)
            curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
            verticalLineToRelative(13f)
            curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
            horizontalLineToRelative(13f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            lineTo(21f, 5.5f)
            curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
            lineTo(5.5f, 3f)
            close()
            moveTo(14.5f, 8f)
            curveToRelative(-1.38f, 0f, -2.5f, 1.23f, -2.5f, 2.75f)
            curveToRelative(0f, -1.52f, -1.12f, -2.75f, -2.5f, -2.75f)
            reflectiveCurveToRelative(-2.5f, 1.23f, -2.5f, 2.75f)
            curveToRelative(0f, 2.16f, 2.82f, 4.7f, 4.22f, 5.82f)
            curveToRelative(0.45f, 0.36f, 1.1f, 0.36f, 1.55f, 0f)
            curveToRelative(1.4f, -1.13f, 4.22f, -3.66f, 4.22f, -5.82f)
            curveToRelative(0f, -1.52f, -1.12f, -2.75f, -2.5f, -2.75f)
            close()
        }
    }.also { _SquareHeart = it }
