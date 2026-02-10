package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DoNotEnter: ImageVector? = null

val Icons.Br.DoNotEnter: ImageVector
    get() = _DoNotEnter ?: UXIcon(name = "DoNotEnter") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(12f, 0f)
            curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
            reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
            reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
            reflectiveCurveTo(18.62f, 0f, 12f, 0f)
            close()
            moveTo(12f, 21f)
            curveToRelative(-4.96f, 0f, -9f, -4.04f, -9f, -9f)
            reflectiveCurveTo(7.04f, 3f, 12f, 3f)
            reflectiveCurveToRelative(9f, 4.04f, 9f, 9f)
            reflectiveCurveToRelative(-4.04f, 9f, -9f, 9f)
            close()
            moveTo(18f, 11.4f)
            verticalLineToRelative(1.2f)
            curveToRelative(0f, 0.77f, -0.63f, 1.4f, -1.4f, 1.4f)
            lineTo(7.4f, 14f)
            curveToRelative(-0.77f, 0f, -1.4f, -0.63f, -1.4f, -1.4f)
            verticalLineToRelative(-1.2f)
            curveToRelative(0f, -0.77f, 0.63f, -1.4f, 1.4f, -1.4f)
            horizontalLineToRelative(9.2f)
            curveToRelative(0.77f, 0f, 1.4f, 0.63f, 1.4f, 1.4f)
            close()
        }
    }.also { _DoNotEnter = it }
