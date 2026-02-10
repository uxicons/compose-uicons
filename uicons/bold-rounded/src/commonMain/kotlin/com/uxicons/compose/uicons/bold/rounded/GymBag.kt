package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GymBag: ImageVector? = null

val Icons.Br.GymBag: ImageVector
    get() = _GymBag ?: UXIcon(name = "GymBag") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(19f, 9.03f)
            verticalLineToRelative(-1.02f)
            curveToRelative(0f, -3.86f, -3.14f, -7f, -7f, -7f)
            reflectiveCurveToRelative(-7f, 3.14f, -7f, 7f)
            verticalLineToRelative(1.02f)
            curveToRelative(-2.8f, 0.25f, -5f, 2.61f, -5f, 5.47f)
            verticalLineToRelative(3f)
            curveToRelative(0f, 3.03f, 2.47f, 5.5f, 5.5f, 5.5f)
            horizontalLineToRelative(13f)
            curveToRelative(3.03f, 0f, 5.5f, -2.47f, 5.5f, -5.5f)
            verticalLineToRelative(-3f)
            curveToRelative(0f, -2.86f, -2.2f, -5.22f, -5f, -5.47f)
            close()
            moveTo(8f, 12f)
            horizontalLineToRelative(8f)
            verticalLineToRelative(8f)
            horizontalLineToRelative(-8f)
            close()
            moveTo(12f, 4f)
            curveToRelative(2.21f, 0f, 4f, 1.79f, 4f, 4f)
            verticalLineToRelative(1f)
            horizontalLineToRelative(-8f)
            verticalLineToRelative(-1f)
            curveToRelative(0f, -2.21f, 1.79f, -4f, 4f, -4f)
            close()
            moveTo(3f, 17.5f)
            verticalLineToRelative(-3f)
            curveToRelative(0f, -1.21f, 0.86f, -2.22f, 2f, -2.45f)
            verticalLineToRelative(7.9f)
            curveToRelative(-1.14f, -0.23f, -2f, -1.24f, -2f, -2.45f)
            close()
            moveTo(21f, 17.5f)
            curveToRelative(0f, 1.21f, -0.86f, 2.22f, -2f, 2.45f)
            verticalLineToRelative(-7.9f)
            curveToRelative(1.14f, 0.23f, 2f, 1.24f, 2f, 2.45f)
            verticalLineToRelative(3f)
            close()
            moveTo(14f, 15.5f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-1f)
            curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
            reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
            horizontalLineToRelative(1f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            close()
        }
    }.also { _GymBag = it }
