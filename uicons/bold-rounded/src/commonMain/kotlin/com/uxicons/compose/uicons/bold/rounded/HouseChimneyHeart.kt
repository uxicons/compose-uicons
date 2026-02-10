package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HouseChimneyHeart: ImageVector? = null

val Icons.Br.HouseChimneyHeart: ImageVector
    get() = _HouseChimneyHeart ?: UXIcon(name = "HouseChimneyHeart") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(16.54f, 12.49f)
            curveToRelative(0f, 1.88f, -2.37f, 4.16f, -3.67f, 5.22f)
            curveToRelative(-0.49f, 0.4f, -1.18f, 0.4f, -1.67f, 0f)
            curveToRelative(-1.3f, -1.06f, -3.67f, -3.35f, -3.67f, -5.22f)
            curveToRelative(0f, -1.37f, 1.01f, -2.48f, 2.25f, -2.48f)
            reflectiveCurveToRelative(2.25f, 1.11f, 2.25f, 2.48f)
            curveToRelative(0f, -1.37f, 1.01f, -2.48f, 2.25f, -2.48f)
            reflectiveCurveToRelative(2.25f, 1.11f, 2.25f, 2.48f)
            close()
            moveTo(24.06f, 9.9f)
            verticalLineToRelative(8.61f)
            curveToRelative(0f, 3.03f, -2.47f, 5.5f, -5.5f, 5.5f)
            lineTo(5.56f, 24.02f)
            curveTo(2.52f, 24.02f, 0.06f, 21.55f, 0.06f, 18.52f)
            verticalLineToRelative(-8.61f)
            curveToRelative(0f, -1.83f, 0.91f, -3.54f, 2.42f, -4.56f)
            lineTo(8.98f, 0.96f)
            curveToRelative(1.87f, -1.26f, 4.28f, -1.26f, 6.15f, 0f)
            lineToRelative(3.92f, 2.65f)
            verticalLineToRelative(-1.09f)
            curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
            reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
            verticalLineToRelative(3.14f)
            curveToRelative(1.26f, 1.04f, 2f, 2.59f, 2f, 4.24f)
            close()
            moveTo(21.06f, 9.9f)
            curveToRelative(0f, -0.83f, -0.41f, -1.61f, -1.1f, -2.07f)
            lineToRelative(-6.5f, -4.39f)
            curveToRelative(-0.42f, -0.29f, -0.91f, -0.43f, -1.4f, -0.43f)
            reflectiveCurveToRelative(-0.97f, 0.14f, -1.4f, 0.43f)
            lineToRelative(-6.5f, 4.39f)
            curveToRelative(-0.69f, 0.47f, -1.1f, 1.24f, -1.1f, 2.07f)
            verticalLineToRelative(8.61f)
            curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
            horizontalLineToRelative(13f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            verticalLineToRelative(-8.61f)
            close()
        }
    }.also { _HouseChimneyHeart = it }
