package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GrinStars: ImageVector? = null

val Icons.Ss.GrinStars: ImageVector
    get() = _GrinStars ?: UXIcon(name = "GrinStars") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0f)
                arcTo(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 12f)
                curveToRelative(0.6f, 15.9f, 23.4f, 15.89f, 24f, 0f)
                arcTo(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 0f)
                close()
                moveTo(12f, 19f)
                curveToRelative(-3.34f, 0f, -5.39f, -2.72f, -6.01f, -5f)
                arcToRelative(21.84f, 21.84f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 1f)
                arcTo(21.92f, 21.92f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18f, 14f)
                curveTo(17.39f, 16.28f, 15.34f, 19f, 12f, 19f)
                close()
                moveTo(16.39f, 6f)
                lineToRelative(0.65f, 2.0f)
                horizontalLineToRelative(2.11f)
                lineToRelative(0.3f, 0.92f)
                lineToRelative(-1.71f, 1.24f)
                lineToRelative(0.65f, 2.01f)
                lineToRelative(-0.78f, 0.57f)
                lineTo(15.9f, 11.5f)
                lineTo(14.2f, 12.74f)
                lineToRelative(-0.78f, -0.57f)
                lineToRelative(0.65f, -2.01f)
                lineToRelative(-1.71f, -1.24f)
                lineToRelative(0.3f, -0.92f)
                horizontalLineToRelative(2.11f)
                lineToRelative(0.65f, -2f)
                close()
                moveTo(8.58f, 6f)
                lineToRelative(0.65f, 2.0f)
                lineTo(11.34f, 8.01f)
                lineToRelative(0.3f, 0.92f)
                lineToRelative(-1.71f, 1.24f)
                lineToRelative(0.65f, 2.01f)
                lineToRelative(-0.78f, 0.57f)
                lineTo(8.1f, 11.5f)
                lineTo(6.39f, 12.74f)
                lineToRelative(-0.78f, -0.57f)
                lineToRelative(0.65f, -2.01f)
                lineTo(4.55f, 8.92f)
                lineToRelative(0.3f, -0.92f)
                lineTo(6.96f, 8.01f)
                lineToRelative(0.65f, -2f)
                close()
            }
        }.also { _GrinStars = it}
