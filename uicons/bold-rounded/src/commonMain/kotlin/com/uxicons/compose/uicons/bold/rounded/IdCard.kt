package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _IdCard: ImageVector? = null

val Icons.Br.IdCard: ImageVector
    get() = _IdCard ?: UXIcon(name = "IdCard") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(5.79f, 16f)
            curveToRelative(-0.54f, 0f, -0.93f, -0.51f, -0.75f, -1.0f)
            curveToRelative(0.43f, -1.17f, 1.59f, -2.0f, 2.96f, -2.0f)
            curveToRelative(1.36f, 0f, 2.53f, 0.83f, 2.96f, 2.0f)
            curveToRelative(0.18f, 0.49f, -0.21f, 1.0f, -0.75f, 1.0f)
            close()
            moveTo(8f, 12f)
            curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
            reflectiveCurveToRelative(-0.9f, -2f, -2f, -2f)
            reflectiveCurveToRelative(-2f, 0.9f, -2f, 2f)
            reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
            close()
            moveTo(24f, 16.5f)
            verticalLineToRelative(-9f)
            curveToRelative(0f, -3.03f, -2.47f, -5.5f, -5.5f, -5.5f)
            horizontalLineToRelative(-13f)
            curveToRelative(-3.03f, 0f, -5.5f, 2.47f, -5.5f, 5.5f)
            verticalLineToRelative(9f)
            curveToRelative(0f, 3.03f, 2.47f, 5.5f, 5.5f, 5.5f)
            horizontalLineToRelative(13f)
            curveToRelative(3.03f, 0f, 5.5f, -2.47f, 5.5f, -5.5f)
            close()
            moveTo(18.5f, 5f)
            curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
            verticalLineToRelative(9f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            horizontalLineToRelative(-13f)
            curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
            verticalLineToRelative(-9f)
            curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
            close()
            moveTo(19f, 9.5f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            horizontalLineToRelative(-3f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(3f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            close()
            moveTo(18f, 14.5f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            horizontalLineToRelative(-2f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(2f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            close()
        }
    }.also { _IdCard = it }
