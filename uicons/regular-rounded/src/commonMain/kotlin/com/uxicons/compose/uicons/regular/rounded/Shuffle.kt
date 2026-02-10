package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Shuffle: ImageVector? = null

val Icons.Rr.Shuffle: ImageVector
    get() = _Shuffle ?: UXIcon(name = "Shuffle") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.42f, 16.58f)
                lineTo(20.13f, 13.29f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, -1.41f, 1.41f)
                lineTo(21.01f, 17f)
                arcTo(9.33f, 9.33f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14.32f, 14.2f)
                arcToRelative(0.98f, 0.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.41f, 0.08f)
                lineTo(12.9f, 14.3f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.07f, 1.38f)
                arcTo(11.18f, 11.18f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21.01f, 19f)
                lineToRelative(-2.29f, 2.29f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 20.13f, 22.7f)
                lineToRelative(3.29f, -3.29f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 23.42f, 16.58f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.01f, 7f)
                lineToRelative(-2.29f, 2.29f)
                arcToRelative(0.89f, 0.89f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.05f, 0.08f)
                arcToRelative(0.99f, 0.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.47f, 1.33f)
                lineTo(21.84f, 9f)
                lineToRelative(1.59f, -1.58f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.46f, -2.1f)
                arcToRelative(1.97f, 1.97f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.46f, -0.73f)
                lineTo(20.13f, 1.3f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, -1.41f, 1.41f)
                lineTo(21.01f, 5.0f)
                curveToRelative(-4.93f, 0.01f, -7.64f, 2.67f, -10.09f, 5.47f)
                curveTo(8.67f, 7.94f, 6f, 5.4f, 1.49f, 5.05f)
                lineTo(1.01f, 5f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1f, 1f)
                arcToRelative(1.02f, 1.02f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, 1f)
                curveToRelative(0.07f, 0f, 0.29f, 0.03f, 0.29f, 0.03f)
                curveTo(5.19f, 7.33f, 7.42f, 9.52f, 9.6f, 12f)
                curveToRelative(-2.16f, 2.47f, -4.38f, 4.7f, -8.25f, 4.96f)
                lineToRelative(-0.4f, 0.02f)
                arcToRelative(0.99f, 0.99f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0.12f, 1.99f)
                curveToRelative(0.16f, -0.01f, 0.41f, -0.01f, 0.54f, -0.02f)
                curveToRelative(5.02f, -0.39f, 7.74f, -3.6f, 10.17f, -6.41f)
                curveTo(14.23f, 9.7f, 16.55f, 7.02f, 21.01f, 7f)
                close()
            }
        }.also { _Shuffle = it}
