package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _5GLock: ImageVector? = null

val Icons.Bs.FiveGLock: ImageVector
    get() = _5GLock ?: UXIcon(name = "5GLock") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(19f, 8f)
            verticalLineToRelative(-1f)
            curveToRelative(0f, -3.86f, -3.14f, -7f, -7f, -7f)
            reflectiveCurveToRelative(-7f, 3.14f, -7f, 7f)
            verticalLineToRelative(1f)
            horizontalLineToRelative(-3f)
            verticalLineToRelative(12.5f)
            curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
            horizontalLineToRelative(13f)
            curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
            verticalLineToRelative(-12.5f)
            close()
            moveTo(8f, 7f)
            curveToRelative(0f, -2.21f, 1.79f, -4f, 4f, -4f)
            reflectiveCurveToRelative(4f, 1.79f, 4f, 4f)
            verticalLineToRelative(1f)
            horizontalLineToRelative(-8f)
            close()
            moveTo(19f, 20.5f)
            curveToRelative(0f, 0.28f, -0.23f, 0.5f, -0.5f, 0.5f)
            horizontalLineToRelative(-13f)
            curveToRelative(-0.28f, 0f, -0.5f, -0.23f, -0.5f, -0.5f)
            verticalLineToRelative(-9.5f)
            horizontalLineToRelative(14f)
            close()
            moveTo(12f, 17.5f)
            verticalLineToRelative(-3f)
            curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
            reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
            horizontalLineToRelative(-1.6f)
            curveToRelative(0f, -0.5f, -0.4f, -0.9f, -0.9f, -0.9f)
            reflectiveCurveToRelative(-0.9f, 0.4f, -0.9f, 0.9f)
            verticalLineToRelative(3f)
            curveToRelative(0f, 0.5f, 0.4f, 0.9f, 0.9f, 0.9f)
            reflectiveCurveToRelative(0.9f, -0.4f, 0.9f, -0.9f)
            verticalLineToRelative(-0.4f)
            horizontalLineToRelative(-0.9f)
            verticalLineToRelative(-1.6f)
            horizontalLineToRelative(2.5f)
            verticalLineToRelative(2f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
            close()
            moveTo(9f, 20f)
            horizontalLineToRelative(-2f)
            verticalLineToRelative(-1.6f)
            horizontalLineToRelative(2f)
            curveToRelative(0.5f, 0f, 0.9f, -0.4f, 0.9f, -0.9f)
            reflectiveCurveToRelative(-0.4f, -0.9f, -0.9f, -0.9f)
            horizontalLineToRelative(-2f)
            verticalLineToRelative(-4.6f)
            horizontalLineToRelative(4f)
            verticalLineToRelative(1.6f)
            horizontalLineToRelative(-2.4f)
            verticalLineToRelative(1.4f)
            horizontalLineToRelative(0.4f)
            curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
            reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
            close()
        }
    }.also { _5GLock = it }
