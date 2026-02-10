package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CallOutgoing: ImageVector? = null

val Icons.Br.CallOutgoing: ImageVector
    get() = _CallOutgoing ?: UXIcon(name = "CallOutgoing") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(20.7f, 14.03f)
            arcToRelative(3.58f, 3.58f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.95f, 0f)
            lineToRelative(-0.41f, 0.4f)
            arcTo(11.6f, 11.6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9.59f, 8.65f)
            lineToRelative(0.39f, -0.39f)
            arcToRelative(3.52f, 3.52f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.04f, -4.91f)
            lineTo(7.86f, 1.02f)
            arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.95f, 0.98f)
            reflectiveCurveToRelative(-1.07f, 0.93f, -1.09f, 0.95f)
            curveToRelative(-7.9f, 8.27f, 11.92f, 28.1f, 20.2f, 20.2f)
            curveToRelative(0.02f, -0.03f, 0.95f, -1.09f, 0.95f, -1.09f)
            arcToRelative(3.52f, 3.52f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.08f, -4.95f)
            close()
            moveTo(20.86f, 18.97f)
            curveToRelative(-0.03f, 0.02f, -0.95f, 1.08f, -0.95f, 1.08f)
            curveTo(14.65f, 24.77f, -0.91f, 10.13f, 3.95f, 4.1f)
            curveToRelative(0f, 0f, 1.06f, -0.92f, 1.08f, -0.95f)
            arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.67f, -0.04f)
            lineTo(7.85f, 5.42f)
            arcToRelative(0.48f, 0.48f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.01f, 0.72f)
            lineTo(6.74f, 7.27f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.32f, 1.61f)
            arcTo(14.86f, 14.86f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15.15f, 17.6f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.59f, -0.33f)
            lineToRelative(1.13f, -1.12f)
            curveToRelative(0.29f, -0.21f, 0.44f, -0.21f, 0.75f, 0.04f)
            lineToRelative(2.24f, 2.07f)
            arcTo(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20.85f, 18.97f)
            close()
            moveTo(24f, 1f)
            lineTo(24f, 5.47f)
            arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.71f, 0.71f)
            lineTo(21.13f, 5.01f)
            lineTo(17.56f, 8.56f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.12f, -2.13f)
            lineToRelative(3.56f, -3.54f)
            lineTo(17.82f, 1.71f)
            arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18.53f, 0f)
            lineTo(23f, 0f)
            arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 1f)
            close()
        }
    }.also { _CallOutgoing = it }
