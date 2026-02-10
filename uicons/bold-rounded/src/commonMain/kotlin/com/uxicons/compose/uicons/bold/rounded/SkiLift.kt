package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SkiLift: ImageVector? = null

val Icons.Br.SkiLift: ImageVector
    get() = _SkiLift ?: UXIcon(name = "SkiLift") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(0.11f, 11.02f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 2.92f, 9.98f)
            lineTo(4.63f, 14.57f)
            arcToRelative(2.92f, 2.92f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.64f, 0.8f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1.98f, 2.25f)
            arcToRelative(5.95f, 5.95f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.35f, -1.73f)
            close()
            moveTo(23.61f, 9.89f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, -2.74f, 1.22f)
            arcToRelative(1.51f, 1.51f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.73f, 1.97f)
            lineTo(17f, 14.39f)
            lineToRelative(-1.14f, -2.43f)
            arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.23f, -1.23f)
            lineToRelative(-0.79f, 0.32f)
            lineToRelative(-1.12f, -3.2f)
            arcToRelative(2.98f, 2.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5.51f, -0.01f)
            arcToRelative(2.89f, 2.89f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.03f, 2.2f)
            reflectiveCurveToRelative(1.04f, 3.01f, 1.07f, 3.08f)
            arcToRelative(3.48f, 3.48f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.49f, 1.6f)
            lineToRelative(2.59f, -1.04f)
            lineToRelative(0.88f, 1.87f)
            lineTo(0.92f, 21.12f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 1.16f, 2.77f)
            lineToRelative(19.25f, -8.05f)
            arcTo(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 23.61f, 9.89f)
            close()
            moveTo(14.5f, 9f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 7.5f)
            verticalLineToRelative(-6f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, 0f)
            verticalLineToRelative(6f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14.5f, 9f)
            close()
            moveTo(6.5f, 5f)
            arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -5f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.5f, 5f)
            close()
        }
    }.also { _SkiLift = it }
