package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PhonePause: ImageVector? = null

val Icons.Br.PhonePause: ImageVector
    get() = _PhonePause ?: UXIcon(name = "PhonePause") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(21.5f, 8f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 6.5f)
            verticalLineToRelative(-5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 0f)
            verticalLineToRelative(5f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21.5f, 8f)
            close()
            moveTo(18f, 6.5f)
            verticalLineToRelative(-5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, 0f)
            verticalLineToRelative(5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 0f)
            close()
            moveTo(22.06f, 22.14f)
            curveToRelative(0.02f, -0.03f, 0.95f, -1.09f, 0.95f, -1.09f)
            arcToRelative(3.51f, 3.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.08f, -4.95f)
            lineTo(20.7f, 14.03f)
            arcToRelative(3.58f, 3.58f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.95f, 0f)
            lineToRelative(-0.41f, 0.4f)
            arcTo(11.6f, 11.6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9.59f, 8.65f)
            lineToRelative(0.39f, -0.39f)
            arcToRelative(3.52f, 3.52f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.04f, -4.91f)
            lineTo(7.86f, 1.02f)
            arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.95f, 0.98f)
            reflectiveCurveToRelative(-1.07f, 0.93f, -1.09f, 0.95f)
            curveTo(-5.07f, 9.79f, 9.34f, 24.22f, 17.5f, 24f)
            arcTo(6.4f, 6.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22.06f, 22.14f)
            close()
            moveTo(5.03f, 3.15f)
            arcToRelative(0.49f, 0.49f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.67f, -0.04f)
            lineTo(7.85f, 5.42f)
            arcToRelative(0.48f, 0.48f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.01f, 0.71f)
            lineTo(6.74f, 7.27f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.32f, 1.61f)
            arcTo(14.85f, 14.85f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15.15f, 17.6f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.59f, -0.33f)
            lineToRelative(1.14f, -1.12f)
            curveToRelative(0.28f, -0.21f, 0.45f, -0.21f, 0.75f, 0.04f)
            lineToRelative(2.24f, 2.07f)
            arcToRelative(0.48f, 0.48f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 0.71f)
            curveToRelative(-0.03f, 0.03f, -0.95f, 1.08f, -0.95f, 1.08f)
            curveTo(14.65f, 24.77f, -0.91f, 10.13f, 3.95f, 4.1f)
            curveTo(3.95f, 4.1f, 5.01f, 3.17f, 5.03f, 3.15f)
            close()
        }
    }.also { _PhonePause = it }
