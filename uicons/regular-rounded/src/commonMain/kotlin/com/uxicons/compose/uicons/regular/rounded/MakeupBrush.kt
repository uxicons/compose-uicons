package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MakeupBrush: ImageVector? = null

val Icons.Rr.MakeupBrush: ImageVector
    get() = _MakeupBrush ?: UXIcon(name = "MakeupBrush") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.23f, 0.77f)
                arcToRelative(2.64f, 2.64f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.59f, -0.12f)
                lineToRelative(-14.17f, 12.48f)
                curveToRelative(-2.33f, 0.44f, -5.47f, 1.74f, -5.47f, 4.47f)
                arcToRelative(6.41f, 6.41f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.4f, 6.4f)
                curveToRelative(2.73f, 0f, 4.03f, -3.14f, 4.47f, -5.47f)
                lineToRelative(12.48f, -14.17f)
                arcToRelative(2.63f, 2.63f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.12f, -3.59f)
                close()
                moveTo(10.14f, 16.33f)
                lineTo(7.67f, 13.86f)
                lineTo(9.68f, 12.09f)
                lineTo(11.91f, 14.32f)
                close()
                moveTo(6.4f, 22f)
                arcToRelative(4.41f, 4.41f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.4f, -4.4f)
                curveToRelative(0f, -1.51f, 2.64f, -2.29f, 4.05f, -2.54f)
                lineToRelative(2.89f, 2.89f)
                curveToRelative(-0.25f, 1.41f, -1.03f, 4.05f, -2.54f, 4.05f)
                close()
                moveTo(21.85f, 3.04f)
                lineTo(13.23f, 12.82f)
                lineTo(11.18f, 10.77f)
                lineTo(20.96f, 2.15f)
                arcToRelative(0.63f, 0.63f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.89f, 0.89f)
                close()
            }
        }.also { _MakeupBrush = it}
