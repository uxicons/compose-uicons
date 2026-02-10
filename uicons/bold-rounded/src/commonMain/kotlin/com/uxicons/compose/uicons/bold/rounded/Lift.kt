package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Lift: ImageVector? = null

val Icons.Br.Lift: ImageVector
    get() = _Lift ?: UXIcon(name = "Lift") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(23.73f, 14.54f)
            lineToRelative(-2.09f, 2.09f)
            curveToRelative(-0.35f, 0.35f, -0.93f, 0.35f, -1.28f, 0f)
            lineToRelative(-2.09f, -2.09f)
            curveToRelative(-0.57f, -0.57f, -0.17f, -1.54f, 0.64f, -1.54f)
            horizontalLineToRelative(4.19f)
            curveToRelative(0.81f, 0f, 1.21f, 0.97f, 0.64f, 1.54f)
            close()
            moveTo(18.91f, 11f)
            horizontalLineToRelative(4.19f)
            curveToRelative(0.81f, 0f, 1.21f, -0.97f, 0.64f, -1.54f)
            lineToRelative(-2.09f, -2.09f)
            curveToRelative(-0.35f, -0.35f, -0.93f, -0.35f, -1.28f, 0f)
            lineToRelative(-2.09f, 2.09f)
            curveToRelative(-0.57f, 0.57f, -0.17f, 1.54f, 0.64f, 1.54f)
            close()
            moveTo(19f, 18.5f)
            curveToRelative(0f, 3.03f, -2.47f, 5.5f, -5.5f, 5.5f)
            horizontalLineToRelative(-8f)
            curveToRelative(-3.03f, 0f, -5.5f, -2.47f, -5.5f, -5.5f)
            verticalLineToRelative(-13f)
            curveToRelative(0f, -3.03f, 2.47f, -5.5f, 5.5f, -5.5f)
            horizontalLineToRelative(8f)
            curveToRelative(3.03f, 0f, 5.5f, 2.47f, 5.5f, 5.5f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
            horizontalLineToRelative(-2.5f)
            verticalLineToRelative(18f)
            horizontalLineToRelative(2.5f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
            reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
            close()
            moveTo(5.5f, 21f)
            horizontalLineToRelative(2.5f)
            verticalLineToRelative(-18f)
            horizontalLineToRelative(-2.5f)
            curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
            verticalLineToRelative(13f)
            curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
            close()
        }
    }.also { _Lift = it }
