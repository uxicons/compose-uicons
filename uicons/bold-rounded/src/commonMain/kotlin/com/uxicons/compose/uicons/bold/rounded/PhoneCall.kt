package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PhoneCall: ImageVector? = null

val Icons.Br.PhoneCall: ImageVector
    get() = _PhoneCall ?: UXIcon(name = "PhoneCall") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(17.5f, 24f)
            curveTo(9.35f, 24.23f, -5.08f, 9.79f, 1.86f, 1.94f)
            curveTo(1.89f, 1.91f, 2.95f, 0.98f, 2.95f, 0.98f)
            arcToRelative(3.58f, 3.58f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.91f, 0.04f)
            lineToRelative(2.15f, 2.32f)
            arcToRelative(3.52f, 3.52f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.04f, 4.91f)
            lineToRelative(-0.39f, 0.39f)
            arcToRelative(11.6f, 11.6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.75f, 5.78f)
            lineToRelative(0.41f, -0.4f)
            arcToRelative(3.58f, 3.58f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.95f, 0f)
            lineTo(22.93f, 16.1f)
            arcToRelative(3.52f, 3.52f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.08f, 4.95f)
            reflectiveCurveToRelative(-0.93f, 1.07f, -0.95f, 1.09f)
            arcTo(6.39f, 6.39f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17.5f, 24f)
            close()
            moveTo(3.95f, 4.1f)
            curveTo(-0.91f, 10.12f, 14.64f, 24.77f, 19.91f, 20.05f)
            curveToRelative(0f, 0f, 0.92f, -1.06f, 0.95f, -1.08f)
            arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -0.71f)
            lineToRelative(-2.24f, -2.07f)
            curveToRelative(-0.3f, -0.25f, -0.47f, -0.25f, -0.75f, -0.04f)
            lineToRelative(-1.14f, 1.12f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.59f, 0.33f)
            arcTo(14.85f, 14.85f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.41f, 8.88f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.32f, -1.61f)
            lineTo(7.84f, 6.14f)
            arcToRelative(0.48f, 0.48f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.01f, -0.72f)
            lineTo(5.7f, 3.11f)
            arcToRelative(0.49f, 0.49f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.67f, 0.04f)
            curveTo(5.01f, 3.17f, 3.95f, 4.1f, 3.95f, 4.1f)
            close()
            moveTo(16.81f, 15.09f)
            horizontalLineToRelative(0f)
            close()
            moveTo(24f, 9.5f)
            arcTo(9.51f, 9.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14.5f, 0f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3f)
            arcTo(6.51f, 6.51f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 9.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 0f)
            close()
            moveTo(19f, 9.5f)
            arcTo(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14.5f, 5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 9.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 0f)
            close()
        }
    }.also { _PhoneCall = it }
