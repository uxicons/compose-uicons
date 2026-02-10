package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BabyCradle: ImageVector? = null

val Icons.Br.BabyCradle: ImageVector
    get() = _BabyCradle ?: UXIcon(name = "BabyCradle") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(22.5f, 6f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            verticalLineToRelative(2.5f)
            horizontalLineToRelative(-18f)
            verticalLineToRelative(-4.25f)
            curveToRelative(0f, -2.19f, 1.37f, -3.74f, 2.89f, -3.74f)
            curveToRelative(1.42f, 0f, 2.6f, 1.03f, 2.97f, 2.35f)
            curveToRelative(-0.52f, 0.36f, -0.86f, 0.96f, -0.86f, 1.64f)
            curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
            reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
            curveToRelative(0f, -0.78f, -0.45f, -1.45f, -1.1f, -1.78f)
            curveToRelative(-0.48f, -2.44f, -2.62f, -4.21f, -5.22f, -4.21f)
            curveToRelative(-3.18f, 0f, -5.68f, 2.66f, -5.68f, 5.74f)
            verticalLineToRelative(16.75f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            verticalLineToRelative(-0.5f)
            horizontalLineToRelative(18f)
            verticalLineToRelative(0.5f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            verticalLineToRelative(-15f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            close()
            moveTo(13.5f, 13f)
            horizontalLineToRelative(2.5f)
            verticalLineToRelative(6f)
            horizontalLineToRelative(-2.5f)
            close()
            moveTo(10.5f, 19f)
            horizontalLineToRelative(-2.5f)
            verticalLineToRelative(-6f)
            horizontalLineToRelative(2.5f)
            close()
            moveTo(3f, 13f)
            horizontalLineToRelative(2f)
            verticalLineToRelative(6f)
            horizontalLineToRelative(-2f)
            close()
            moveTo(19f, 19f)
            verticalLineToRelative(-6f)
            horizontalLineToRelative(2f)
            verticalLineToRelative(6f)
            close()
        }
    }.also { _BabyCradle = it }
