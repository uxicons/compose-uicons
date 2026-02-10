package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HourglassEnd: ImageVector? = null

val Icons.Rr.HourglassEnd: ImageVector
    get() = _HourglassEnd ?: UXIcon(name = "HourglassEnd") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 24f)
                lineTo(7.0f, 24f)
                arcToRelative(4.01f, 4.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.04f, -1.4f)
                arcToRelative(3.94f, 3.94f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.92f, -3.16f)
                arcTo(12.52f, 12.52f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.45f, 12f)
                arcToRelative(12.52f, 12.52f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.4f, -7.44f)
                arcTo(3.94f, 3.94f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.96f, 1.4f)
                arcTo(4.01f, 4.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.0f, 0f)
                lineTo(17f, 0f)
                arcToRelative(4.02f, 4.02f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.04f, 1.4f)
                arcToRelative(3.94f, 3.94f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.92f, 3.15f)
                arcTo(12.56f, 12.56f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16.55f, 12f)
                arcToRelative(12.56f, 12.56f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.41f, 7.45f)
                arcToRelative(3.94f, 3.94f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.92f, 3.16f)
                arcTo(4.02f, 4.02f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17f, 24f)
                close()
                moveTo(17f, 2f)
                lineTo(7.0f, 2f)
                arcToRelative(2.02f, 2.02f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.53f, 0.7f)
                arcToRelative(1.92f, 1.92f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.46f, 1.56f)
                curveToRelative(0.38f, 2.5f, 1.92f, 4.84f, 4.6f, 6.96f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 1.57f)
                curveTo(6.95f, 14.9f, 5.4f, 17.24f, 5.02f, 19.74f)
                arcTo(1.92f, 1.92f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.48f, 21.3f)
                arcToRelative(2.02f, 2.02f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.53f, 0.7f)
                lineTo(17f, 22f)
                arcToRelative(2.01f, 2.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.53f, -0.7f)
                arcToRelative(1.92f, 1.92f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.46f, -1.55f)
                curveToRelative(-0.37f, -2.49f, -1.92f, -4.83f, -4.6f, -6.96f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -1.56f)
                curveToRelative(2.68f, -2.13f, 4.23f, -4.47f, 4.6f, -6.96f)
                arcTo(1.92f, 1.92f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18.52f, 2.7f)
                arcTo(2.01f, 2.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17f, 2f)
                close()
                moveTo(15.68f, 20f)
                lineTo(8.32f, 20f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.93f, -1.37f)
                arcToRelative(11.19f, 11.19f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.47f, -4.27f)
                lineToRelative(0.52f, -0.41f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.25f, 0f)
                lineToRelative(0.51f, 0.41f)
                arcToRelative(11.3f, 11.3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.47f, 4.28f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15.68f, 20f)
                close()
                moveTo(10.03f, 18f)
                horizontalLineToRelative(3.93f)
                arcTo(11.57f, 11.57f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 16f)
                arcTo(11.3f, 11.3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10.03f, 18f)
                close()
            }
        }.also { _HourglassEnd = it}
