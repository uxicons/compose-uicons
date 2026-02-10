package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Pie: ImageVector? = null

val Icons.Sr.Pie: ImageVector
    get() = _Pie ?: UXIcon(name = "Pie") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.3f, 20f)
                arcToRelative(4.53f, 4.53f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.48f, 4f)
                lineTo(7.18f, 24f)
                arcTo(4.53f, 4.53f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.7f, 20f)
                arcToRelative(6.02f, 6.02f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.3f, 0.2f)
                arcToRelative(6.16f, 6.16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 0f)
                arcTo(6.02f, 6.02f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21.3f, 20f)
                close()
                moveTo(13f, 3f)
                lineTo(13f, 1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, 0f)
                lineTo(11f, 3f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13f, 3f)
                close()
                moveTo(17f, 3f)
                lineTo(17f, 1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, 0f)
                lineTo(15f, 3f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17f, 3f)
                close()
                moveTo(9f, 3f)
                lineTo(9f, 1f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7f, 1f)
                lineTo(7f, 3f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 3f)
                close()
                moveTo(24f, 14f)
                arcToRelative(2.92f, 2.92f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.51f, 2.95f)
                arcToRelative(4.03f, 4.03f, 0f, isMoreThanHalf = false, isPositiveArc = true, -6.49f, 0.7f)
                arcToRelative(4.04f, 4.04f, 0f, isMoreThanHalf = false, isPositiveArc = true, -6f, 0f)
                arcToRelative(4.03f, 4.03f, 0f, isMoreThanHalf = false, isPositiveArc = true, -6.49f, -0.7f)
                arcTo(2.92f, 2.92f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 14f)
                curveToRelative(0f, -3.62f, 5.35f, -8f, 12f, -8f)
                reflectiveCurveTo(24f, 10.38f, 24f, 14f)
                close()
                moveTo(10.98f, 9.65f)
                arcToRelative(0.53f, 0.53f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.64f, -0.64f)
                arcToRelative(5.4f, 5.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.97f, 0.75f)
                arcToRelative(1.31f, 1.31f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.85f, 1.85f)
                arcTo(5.4f, 5.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10.98f, 9.65f)
                close()
                moveTo(15.62f, 9.77f)
                arcToRelative(5.4f, 5.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.97f, -0.75f)
                arcToRelative(0.53f, 0.53f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.64f, 0.64f)
                arcToRelative(5.4f, 5.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.75f, 1.97f)
                arcTo(1.31f, 1.31f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15.62f, 9.77f)
                close()
            }
        }.also { _Pie = it}
