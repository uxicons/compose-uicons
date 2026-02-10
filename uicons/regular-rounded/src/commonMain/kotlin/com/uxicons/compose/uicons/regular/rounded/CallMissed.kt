package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CallMissed: ImageVector? = null

val Icons.Rr.CallMissed: ImageVector
    get() = _CallMissed ?: UXIcon(name = "CallMissed") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 7f)
                lineTo(3f, 3f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 1f)
                lineTo(9f, 1f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9f, 3f)
                lineTo(6.44f, 3f)
                lineToRelative(5.91f, 5.93f)
                arcToRelative(0.22f, 0.22f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.16f, 0.07f)
                horizontalLineToRelative(0f)
                arcToRelative(0.22f, 0.22f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.16f, -0.06f)
                lineToRelative(6.88f, -6.88f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.41f, 1.41f)
                lineToRelative(-6.88f, 6.88f)
                arcToRelative(2.2f, 2.2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.57f, 0.65f)
                horizontalLineToRelative(0f)
                arcToRelative(2.21f, 2.21f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.57f, -0.65f)
                lineTo(5f, 4.39f)
                lineTo(5f, 7f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 7f)
                close()
                moveTo(24f, 20.11f)
                lineToRelative(-0.09f, 1.26f)
                arcTo(2.71f, 2.71f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21.2f, 24.02f)
                curveToRelative(-0.04f, 0f, -2.52f, -0.32f, -2.52f, -0.32f)
                arcToRelative(2.73f, 2.73f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.65f, -2.65f)
                lineToRelative(-0.15f, -1.29f)
                arcTo(11.11f, 11.11f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 19f)
                arcToRelative(10.68f, 10.68f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.86f, 0.74f)
                lineToRelative(-0.16f, 1.3f)
                arcTo(2.73f, 2.73f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.33f, 23.7f)
                reflectiveCurveToRelative(-2.48f, 0.32f, -2.52f, 0.32f)
                arcTo(2.72f, 2.72f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.08f, 21.3f)
                lineTo(0f, 20.18f)
                arcTo(5.25f, 5.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.56f, 16.4f)
                curveToRelative(4.49f, -4.49f, 16.4f, -4.49f, 20.89f, 0f)
                arcTo(5.22f, 5.22f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 20.11f)
                close()
                moveTo(22f, 20.04f)
                arcToRelative(3.2f, 3.2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.97f, -2.22f)
                curveToRelative(-3.98f, -3.98f, -14.63f, -3.43f, -18.06f, 0f)
                arcTo(3.23f, 3.23f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 20.11f)
                lineToRelative(0.08f, 1.13f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.67f, 0.79f)
                reflectiveCurveToRelative(2.46f, -0.32f, 2.5f, -0.32f)
                arcToRelative(0.72f, 0.72f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.72f, -0.72f)
                curveToRelative(0f, -0.04f, 0.24f, -2.05f, 0.24f, -2.05f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.58f, -0.79f)
                arcTo(12.53f, 12.53f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.94f, 17f)
                horizontalLineToRelative(0.06f)
                arcToRelative(13.35f, 13.35f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.18f, 1.13f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.6f, 0.8f)
                reflectiveCurveToRelative(0.24f, 2.01f, 0.24f, 2.05f)
                arcToRelative(0.72f, 0.72f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.72f, 0.72f)
                curveToRelative(0.04f, 0f, 2.5f, 0.32f, 2.5f, 0.32f)
                arcToRelative(0.72f, 0.72f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.67f, -0.72f)
                close()
            }
        }.also { _CallMissed = it}
