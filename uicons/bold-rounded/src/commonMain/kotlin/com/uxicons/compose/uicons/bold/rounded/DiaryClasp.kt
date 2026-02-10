package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DiaryClasp: ImageVector? = null

val Icons.Br.DiaryClasp: ImageVector
    get() = _DiaryClasp ?: UXIcon(name = "DiaryClasp") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(17.5f, 0f)
            lineTo(6.5f, 0f)
            curveTo(3.47f, 0f, 1f, 2.47f, 1f, 5.5f)
            verticalLineToRelative(14f)
            curveToRelative(0f, 2.48f, 2.02f, 4.5f, 4.5f, 4.5f)
            horizontalLineToRelative(12f)
            curveToRelative(3.03f, 0f, 5.5f, -2.47f, 5.5f, -5.5f)
            lineTo(23f, 5.5f)
            curveToRelative(0f, -3.03f, -2.47f, -5.5f, -5.5f, -5.5f)
            close()
            moveTo(20f, 5.5f)
            verticalLineToRelative(0.5f)
            horizontalLineToRelative(-2.5f)
            curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
            reflectiveCurveToRelative(1.57f, 3.5f, 3.5f, 3.5f)
            horizontalLineToRelative(2.5f)
            verticalLineToRelative(2f)
            horizontalLineToRelative(-10f)
            lineTo(10f, 3f)
            horizontalLineToRelative(7.5f)
            curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
            close()
            moveTo(19f, 9.5f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
            reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
            close()
            moveTo(6.5f, 3f)
            horizontalLineToRelative(0.5f)
            verticalLineToRelative(12f)
            horizontalLineToRelative(-1.5f)
            curveToRelative(-0.53f, 0f, -1.03f, 0.09f, -1.5f, 0.26f)
            lineTo(4f, 5.5f)
            curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
            close()
            moveTo(17.5f, 21f)
            lineTo(5.5f, 21f)
            curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
            reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
            horizontalLineToRelative(14.5f)
            verticalLineToRelative(0.5f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            close()
        }
    }.also { _DiaryClasp = it }
