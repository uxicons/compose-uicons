package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Skewer: ImageVector? = null

val Icons.Sr.Skewer: ImageVector
    get() = _Skewer ?: UXIcon(name = "Skewer") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.7f, 0.29f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.41f, 0f)
                lineTo(19.5f, 3.09f)
                lineTo(17.7f, 1.29f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.41f, 1.41f)
                lineTo(18.08f, 4.5f)
                lineTo(16.5f, 6.09f)
                lineTo(14.71f, 4.29f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.41f, 1.41f)
                lineTo(15.09f, 7.5f)
                lineTo(13.87f, 8.71f)
                curveToRelative(-3.54f, -4.38f, -6.31f, 0.58f, -4.07f, 4.07f)
                lineTo(8.51f, 14.07f)
                lineTo(6.72f, 12.27f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 5.3f, 13.68f)
                lineToRelative(1.8f, 1.81f)
                curveToRelative(-1.02f, 0.98f, -1.24f, 1.56f, -3.24f, 1.54f)
                arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 2.12f, 5.95f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.56f, 21.56f)
                arcToRelative(1.51f, 1.51f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.38f, -1.79f)
                curveToRelative(0.11f, -0.18f, 0.44f, -0.75f, 1.67f, -0.75f)
                curveToRelative(2.5f, 0.02f, 3.33f, -0.75f, 4.65f, -2.12f)
                lineToRelative(1.78f, 1.8f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 11.71f, 17.3f)
                lineToRelative(-1.79f, -1.8f)
                lineToRelative(1.29f, -1.29f)
                curveToRelative(3.52f, 2.24f, 8.45f, -0.54f, 4.08f, -4.08f)
                lineTo(16.5f, 8.91f)
                lineToRelative(1.79f, 1.79f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19.7f, 9.29f)
                lineTo(17.91f, 7.5f)
                lineTo(19.5f, 5.91f)
                lineTo(21.29f, 7.71f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22.7f, 6.29f)
                lineTo(20.91f, 4.5f)
                lineTo(23.7f, 1.71f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 23.7f, 0.29f)
                close()
            }
        }.also { _Skewer = it}
