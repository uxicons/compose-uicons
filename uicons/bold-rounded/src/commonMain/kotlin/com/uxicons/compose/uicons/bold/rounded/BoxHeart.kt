package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BoxHeart: ImageVector? = null

val Icons.Br.BoxHeart: ImageVector
    get() = _BoxHeart ?: UXIcon(name = "BoxHeart") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(24f, 5.5f)
            curveToRelative(0f, -3.03f, -2.47f, -5.5f, -5.5f, -5.5f)
            lineTo(5.5f, 0f)
            curveTo(2.47f, 0f, 0f, 2.47f, 0f, 5.5f)
            verticalLineToRelative(1f)
            curveToRelative(0f, 0.95f, 0.38f, 1.81f, 1f, 2.45f)
            verticalLineToRelative(9.55f)
            curveToRelative(0f, 3.03f, 2.47f, 5.5f, 5.5f, 5.5f)
            horizontalLineToRelative(11f)
            curveToRelative(3.03f, 0f, 5.5f, -2.47f, 5.5f, -5.5f)
            verticalLineToRelative(-9.55f)
            curveToRelative(0.62f, -0.63f, 1f, -1.5f, 1f, -2.45f)
            verticalLineToRelative(-1f)
            close()
            moveTo(3f, 5.5f)
            curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
            horizontalLineToRelative(13f)
            curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
            verticalLineToRelative(1f)
            curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
            lineTo(3.5f, 7f)
            curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
            verticalLineToRelative(-1f)
            close()
            moveTo(17.5f, 21f)
            lineTo(6.5f, 21f)
            curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
            verticalLineToRelative(-8.5f)
            horizontalLineToRelative(16f)
            verticalLineToRelative(8.5f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            close()
            moveTo(16f, 14.2f)
            curveToRelative(0f, 1.64f, -2.03f, 3.55f, -3.2f, 4.51f)
            curveToRelative(-0.47f, 0.38f, -1.13f, 0.38f, -1.6f, 0f)
            curveToRelative(-1.17f, -0.96f, -3.2f, -2.87f, -3.2f, -4.51f)
            curveToRelative(0f, -1.22f, 0.9f, -2.2f, 2f, -2.2f)
            reflectiveCurveToRelative(2f, 0.98f, 2f, 2.2f)
            curveToRelative(0f, -1.22f, 0.9f, -2.2f, 2f, -2.2f)
            reflectiveCurveToRelative(2f, 0.98f, 2f, 2.2f)
            close()
        }
    }.also { _BoxHeart = it }
