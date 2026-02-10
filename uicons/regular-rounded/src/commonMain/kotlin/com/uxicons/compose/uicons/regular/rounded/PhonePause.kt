package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PhonePause: ImageVector? = null

val Icons.Rr.PhonePause: ImageVector
    get() = _PhonePause ?: UXIcon(name = "PhonePause") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.98f, 7.02f)
                verticalLineToRelative(-6f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 0f)
                verticalLineToRelative(6f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19.98f, 7.02f)
                close()
                moveTo(16.98f, 8.02f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, -1f)
                verticalLineToRelative(-6f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, 0f)
                verticalLineToRelative(6f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16.98f, 8.02f)
                close()
                moveTo(23.08f, 21.14f)
                lineTo(22.16f, 22.19f)
                curveToRelative(-8.19f, 7.84f, -28.12f, -12.08f, -20.4f, -20.3f)
                lineToRelative(1.15f, -1f)
                arcTo(3.08f, 3.08f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.24f, 0.93f)
                curveToRelative(0.03f, 0.03f, 1.88f, 2.44f, 1.88f, 2.44f)
                arcToRelative(3.1f, 3.1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.01f, 4.28f)
                lineTo(7.96f, 9.1f)
                arcToRelative(12.78f, 12.78f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.93f, 6.95f)
                lineToRelative(1.46f, -1.17f)
                arcToRelative(3.1f, 3.1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.28f, -0.01f)
                reflectiveCurveToRelative(2.41f, 1.85f, 2.44f, 1.88f)
                arcTo(3.1f, 3.1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 23.08f, 21.14f)
                close()
                moveTo(21.7f, 18.22f)
                reflectiveCurveToRelative(-2.4f, -1.84f, -2.42f, -1.87f)
                arcToRelative(1.12f, 1.12f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.55f, 0f)
                curveToRelative(-0.03f, 0.03f, -2.04f, 1.64f, -2.04f, 1.64f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.98f, 0.15f)
                arcTo(15f, 15f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.88f, 9.32f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.15f, -0.99f)
                reflectiveCurveTo(7.63f, 6.31f, 7.66f, 6.28f)
                arcToRelative(1.1f, 1.1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -1.55f)
                curveTo(7.63f, 4.7f, 5.79f, 2.31f, 5.79f, 2.31f)
                arcToRelative(1.1f, 1.1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.51f, 0.04f)
                lineTo(3.13f, 3.35f)
                curveTo(-2.51f, 10.13f, 14.76f, 26.44f, 20.7f, 20.83f)
                lineToRelative(0.91f, -1.05f)
                arcTo(1.12f, 1.12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21.7f, 18.22f)
                close()
            }
        }.also { _PhonePause = it}
