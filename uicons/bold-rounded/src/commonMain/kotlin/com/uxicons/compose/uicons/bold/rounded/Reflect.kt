package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Reflect: ImageVector? = null

val Icons.Br.Reflect: ImageVector
    get() = _Reflect ?: UXIcon(name = "Reflect") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(22.5f, 13.5f)
            horizontalLineToRelative(-21f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -3f)
            horizontalLineToRelative(21f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 3f)
            close()
            moveTo(18.87f, 6.9f)
            arcToRelative(2.72f, 2.72f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.42f, -3.06f)
            quadToRelative(-0.06f, -0.03f, -0.13f, -0.06f)
            lineToRelative(-8.46f, -3.38f)
            arcToRelative(3.48f, 3.48f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.34f, 0.06f)
            arcToRelative(3.08f, 3.08f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.52f, 2.68f)
            verticalLineToRelative(2.65f)
            arcToRelative(3.22f, 3.22f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.21f, 3.21f)
            horizontalLineToRelative(8.79f)
            arcToRelative(2.8f, 2.8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.87f, -2.1f)
            close()
            moveTo(14.78f, 6f)
            horizontalLineToRelative(-7.56f)
            arcToRelative(0.21f, 0.21f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.21f, -0.21f)
            verticalLineToRelative(-2.65f)
            curveToRelative(0f, -0.07f, 0.01f, -0.08f, 0.04f, -0.1f)
            arcToRelative(0.39f, 0.39f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.19f, -0.04f)
            curveToRelative(0.08f, 0f, 7.54f, 3f, 7.54f, 3f)
            close()
            moveTo(8.86f, 23.6f)
            lineTo(17.32f, 20.21f)
            quadToRelative(0.06f, -0.03f, 0.13f, -0.06f)
            arcToRelative(2.72f, 2.72f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.42f, -3.06f)
            arcToRelative(2.8f, 2.8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.87f, -2.09f)
            horizontalLineToRelative(-8.79f)
            arcToRelative(3.22f, 3.22f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.21f, 3.21f)
            verticalLineToRelative(2.65f)
            arcToRelative(3.08f, 3.08f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.52f, 2.68f)
            arcToRelative(3.38f, 3.38f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.71f, 0.46f)
            arcToRelative(3.55f, 3.55f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.63f, -0.4f)
            close()
            moveTo(14.78f, 18f)
            reflectiveCurveToRelative(-7.22f, 2.9f, -7.28f, 2.93f)
            arcToRelative(0.49f, 0.49f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.46f, 0.03f)
            curveToRelative(-0.03f, -0.02f, -0.04f, -0.03f, -0.04f, -0.1f)
            verticalLineToRelative(-2.64f)
            arcToRelative(0.21f, 0.21f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.22f, -0.21f)
            close()
        }
    }.also { _Reflect = it }
