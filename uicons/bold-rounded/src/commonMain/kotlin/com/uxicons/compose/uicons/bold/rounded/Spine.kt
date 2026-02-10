package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Spine: ImageVector? = null

val Icons.Br.Spine: ImageVector
    get() = _Spine ?: UXIcon(name = "Spine") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(18f, 13.5f)
            horizontalLineToRelative(1.5f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            horizontalLineToRelative(-1.5f)
            verticalLineToRelative(-4f)
            horizontalLineToRelative(1.5f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            horizontalLineToRelative(-1.75f)
            curveToRelative(-0.64f, -2.02f, -2.51f, -3.5f, -4.75f, -3.5f)
            horizontalLineToRelative(-2f)
            curveToRelative(-2.23f, 0f, -4.1f, 1.48f, -4.75f, 3.5f)
            horizontalLineToRelative(-1.75f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(1.5f)
            verticalLineToRelative(4f)
            horizontalLineToRelative(-1.5f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(1.5f)
            verticalLineToRelative(4f)
            horizontalLineToRelative(-1.5f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(1.75f)
            curveToRelative(0.64f, 2.02f, 2.51f, 3.5f, 4.75f, 3.5f)
            horizontalLineToRelative(2f)
            curveToRelative(2.23f, 0f, 4.1f, -1.48f, 4.75f, -3.5f)
            horizontalLineToRelative(1.75f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            horizontalLineToRelative(-1.5f)
            close()
            moveTo(9f, 10f)
            horizontalLineToRelative(6f)
            verticalLineToRelative(4f)
            horizontalLineToRelative(-6f)
            close()
            moveTo(11f, 3f)
            horizontalLineToRelative(2f)
            curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
            verticalLineToRelative(2f)
            horizontalLineToRelative(-6f)
            verticalLineToRelative(-2f)
            curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
            close()
            moveTo(13f, 21f)
            horizontalLineToRelative(-2f)
            curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
            verticalLineToRelative(-2f)
            horizontalLineToRelative(6f)
            verticalLineToRelative(2f)
            curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
            close()
        }
    }.also { _Spine = it }
