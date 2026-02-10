package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Turkey: ImageVector? = null

val Icons.Rr.Turkey: ImageVector
    get() = _Turkey ?: UXIcon(name = "Turkey") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.85f, 10.76f)
                arcToRelative(5.04f, 5.04f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.17f, -3.03f)
                curveToRelative(0.04f, -0.01f, 1.48f, -1.48f, 1.51f, -1.5f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0.65f, -2.06f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, -2.06f, 0.65f)
                curveToRelative(-0.01f, 0.02f, -1.5f, 1.48f, -1.5f, 1.51f)
                curveToRelative(-1.42f, -0.76f, -4.38f, 0f, -6.13f, 0.96f)
                curveTo(6.19f, 5.8f, 0.03f, 9.47f, 0f, 16f)
                verticalLineToRelative(2.57f)
                arcToRelative(5.03f, 5.03f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.3f, 4.95f)
                curveTo(10.45f, 24.5f, 23.75f, 24.34f, 24f, 18f)
                curveTo(24f, 15.55f, 22.45f, 12.87f, 19.85f, 10.76f)
                close()
                moveTo(14.64f, 8.39f)
                curveToRelative(1.44f, -0.48f, 2.63f, -0.52f, 3.06f, -0.09f)
                curveToRelative(0.96f, 0.96f, -0.56f, 5.14f, -2.18f, 6.76f)
                curveTo(12.46f, 18f, 8f, 13.54f, 10.95f, 10.48f)
                arcTo(10.57f, 10.57f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14.64f, 8.39f)
                close()
                moveTo(9f, 22f)
                arcToRelative(36.98f, 36.98f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.42f, -0.46f)
                arcTo(3.02f, 3.02f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 18.57f)
                lineTo(2f, 16f)
                arcTo(6.96f, 6.96f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9.57f, 9.03f)
                curveToRelative(-5.79f, 6.95f, 5.91f, 14.08f, 9.63f, 3.8f)
                curveTo(26.5f, 20.17f, 18.3f, 21.92f, 9f, 22f)
                close()
                moveTo(7f, 3f)
                lineTo(7f, 1f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9f, 1f)
                lineTo(9f, 3f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, 3f)
                close()
                moveTo(11f, 3f)
                lineTo(11f, 1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 0f)
                lineTo(13f, 3f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11f, 3f)
                close()
                moveTo(3f, 3f)
                lineTo(3f, 1f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 1f)
                lineTo(5f, 3f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 3f)
                close()
            }
        }.also { _Turkey = it}
