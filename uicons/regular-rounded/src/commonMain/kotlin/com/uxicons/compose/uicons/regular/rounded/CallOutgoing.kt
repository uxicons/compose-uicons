package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CallOutgoing: ImageVector? = null

val Icons.Rr.CallOutgoing: ImageVector
    get() = _CallOutgoing ?: UXIcon(name = "CallOutgoing") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.98f, 2.02f)
                verticalLineToRelative(4f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, 0f)
                lineTo(21.98f, 3.46f)
                lineToRelative(-5.3f, 5.27f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.41f, -1.42f)
                lineTo(20.59f, 2.02f)
                lineTo(17.98f, 2.02f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -2f)
                horizontalLineToRelative(4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 23.98f, 2.02f)
                close()
                moveTo(23.07f, 16.76f)
                arcToRelative(3.1f, 3.1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 4.38f)
                lineToRelative(-0.91f, 1.05f)
                curveToRelative(-8.19f, 7.84f, -28.12f, -12.09f, -20.4f, -20.3f)
                lineToRelative(1.15f, -1f)
                arcTo(3.08f, 3.08f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.24f, 0.93f)
                curveToRelative(0.03f, 0.03f, 1.88f, 2.44f, 1.88f, 2.44f)
                arcToRelative(3.1f, 3.1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.01f, 4.28f)
                lineTo(7.96f, 9.11f)
                arcTo(12.78f, 12.78f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14.89f, 16.05f)
                lineToRelative(1.47f, -1.17f)
                arcToRelative(3.1f, 3.1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.28f, -0.01f)
                reflectiveCurveTo(23.04f, 16.73f, 23.07f, 16.76f)
                close()
                moveTo(21.7f, 18.22f)
                reflectiveCurveToRelative(-2.39f, -1.84f, -2.42f, -1.87f)
                arcToRelative(1.1f, 1.1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.55f, 0f)
                curveToRelative(-0.03f, 0.03f, -2.04f, 1.63f, -2.04f, 1.63f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.98f, 0.15f)
                arcTo(15f, 15f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.88f, 9.32f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.14f, -0.99f)
                reflectiveCurveTo(7.63f, 6.31f, 7.66f, 6.28f)
                arcToRelative(1.1f, 1.1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -1.55f)
                curveTo(7.63f, 4.7f, 5.79f, 2.31f, 5.79f, 2.31f)
                arcToRelative(1.1f, 1.1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.51f, 0.04f)
                lineToRelative(-1.15f, 1f)
                curveTo(-2.52f, 10.13f, 14.76f, 26.44f, 20.7f, 20.83f)
                lineToRelative(0.91f, -1.05f)
                arcTo(1.12f, 1.12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21.7f, 18.22f)
                close()
            }
        }.also { _CallOutgoing = it}
