package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MobileLock: ImageVector? = null

val Icons.Br.MobileLock: ImageVector
    get() = _MobileLock ?: UXIcon(name = "MobileLock") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(16.5f, 18f)
            horizontalLineToRelative(-11.5f)
            verticalLineToRelative(-12.5f)
            curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
            horizontalLineToRelative(4f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            horizontalLineToRelative(-4f)
            curveToRelative(-3.03f, 0f, -5.5f, 2.47f, -5.5f, 5.5f)
            verticalLineToRelative(13.5f)
            curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
            horizontalLineToRelative(6f)
            curveToRelative(2.37f, 0f, 4.66f, -1.78f, 5f, -4.5f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            close()
            moveTo(11f, 22f)
            horizontalLineToRelative(-2f)
            curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
            reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
            horizontalLineToRelative(2f)
            curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
            reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
            close()
            moveTo(23f, 7.78f)
            verticalLineToRelative(-2.28f)
            curveToRelative(0f, -2.48f, -2.02f, -4.5f, -4.5f, -4.5f)
            reflectiveCurveToRelative(-4.5f, 2.02f, -4.5f, 4.5f)
            verticalLineToRelative(2.28f)
            curveToRelative(-0.61f, 0.55f, -1f, 1.34f, -1f, 2.22f)
            verticalLineToRelative(3f)
            curveToRelative(0f, 1.66f, 1.34f, 3f, 3f, 3f)
            horizontalLineToRelative(5f)
            curveToRelative(1.66f, 0f, 3f, -1.34f, 3f, -3f)
            verticalLineToRelative(-3f)
            curveToRelative(0f, -0.89f, -0.39f, -1.67f, -1f, -2.22f)
            close()
            moveTo(18.5f, 4f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            verticalLineToRelative(1.5f)
            horizontalLineToRelative(-3f)
            verticalLineToRelative(-1.5f)
            curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
            close()
            moveTo(18.5f, 13f)
            curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
            reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
            reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
            reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
            close()
        }
    }.also { _MobileLock = it }
