package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _EyeCrossed: ImageVector? = null

val Icons.Bs.EyeCrossed: ImageVector
    get() = _EyeCrossed ?: UXIcon(name = "EyeCrossed") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.8f, 11.48f)
                arcToRelative(15.44f, 15.44f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.76f, -5.4f)
                lineToRelative(3.02f, -3.02f)
                lineTo(20.94f, 0.94f)
                lineTo(17.57f, 4.31f)
                arcTo(11.59f, 11.59f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 2.94f)
                curveTo(3.5f, 2.94f, 0.33f, 11.13f, 0.2f, 11.48f)
                lineTo(0f, 12f)
                lineToRelative(0.2f, 0.52f)
                arcToRelative(15.44f, 15.44f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.76f, 5.4f)
                lineTo(0.94f, 20.94f)
                lineToRelative(2.12f, 2.12f)
                lineToRelative(3.37f, -3.38f)
                arcTo(11.59f, 11.59f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 21.06f)
                curveToRelative(8.5f, 0f, 11.67f, -8.19f, 11.8f, -8.54f)
                lineTo(24f, 12f)
                close()
                moveTo(3.21f, 12f)
                curveTo(3.96f, 10.45f, 6.62f, 5.92f, 12f, 5.92f)
                arcToRelative(8.74f, 8.74f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.32f, 0.64f)
                lineToRelative(-1.76f, 1.76f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5.25f, 5.25f)
                lineTo(6.07f, 15.81f)
                arcTo(12.29f, 12.29f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.21f, 12f)
                close()
                moveTo(12f, 18.08f)
                arcToRelative(8.74f, 8.74f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.32f, -0.64f)
                lineToRelative(1.76f, -1.76f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.25f, -5.25f)
                lineToRelative(2.25f, -2.25f)
                arcTo(12.28f, 12.28f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20.79f, 12f)
                curveTo(20.04f, 13.55f, 17.38f, 18.08f, 12f, 18.08f)
                close()
            }
        }.also { _EyeCrossed = it}
