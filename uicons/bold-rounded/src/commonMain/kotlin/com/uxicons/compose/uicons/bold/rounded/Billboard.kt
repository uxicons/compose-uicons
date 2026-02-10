package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Billboard: ImageVector? = null

val Icons.Br.Billboard: ImageVector
    get() = _Billboard ?: UXIcon(name = "Billboard") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(20f, 5.21f)
            verticalLineToRelative(-2.31f)
            curveToRelative(0.58f, -0.21f, 1f, -0.76f, 1f, -1.41f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            horizontalLineToRelative(-1f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            curveToRelative(0f, 0.65f, 0.42f, 1.2f, 1f, 1.41f)
            verticalLineToRelative(2.09f)
            horizontalLineToRelative(-5f)
            verticalLineToRelative(-2.09f)
            curveToRelative(0.58f, -0.21f, 1f, -0.76f, 1f, -1.41f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            horizontalLineToRelative(-1f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            curveToRelative(0f, 0.65f, 0.42f, 1.2f, 1f, 1.41f)
            verticalLineToRelative(2.09f)
            horizontalLineToRelative(-5f)
            verticalLineToRelative(-2.09f)
            curveToRelative(0.58f, -0.21f, 1f, -0.76f, 1f, -1.41f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            horizontalLineToRelative(-1f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            curveToRelative(0f, 0.65f, 0.42f, 1.2f, 1f, 1.41f)
            verticalLineToRelative(2.31f)
            curveToRelative(-2.31f, 0.66f, -4f, 2.77f, -4f, 5.29f)
            verticalLineToRelative(5f)
            curveToRelative(0f, 3.03f, 2.47f, 5.5f, 5.5f, 5.5f)
            horizontalLineToRelative(5f)
            verticalLineToRelative(1.5f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            verticalLineToRelative(-1.5f)
            horizontalLineToRelative(5f)
            curveToRelative(3.03f, 0f, 5.5f, -2.47f, 5.5f, -5.5f)
            verticalLineToRelative(-5f)
            curveToRelative(0f, -2.51f, -1.7f, -4.63f, -4f, -5.29f)
            close()
            moveTo(21f, 15.5f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            horizontalLineToRelative(-13f)
            curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
            verticalLineToRelative(-5f)
            curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
            horizontalLineToRelative(13f)
            curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
            close()
        }
    }.also { _Billboard = it }
