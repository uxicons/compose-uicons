package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GrinStars: ImageVector? = null

val Icons.Br.GrinStars: ImageVector
    get() = _GrinStars ?: UXIcon(name = "GrinStars") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12f, 24f)
            arcTo(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 12f)
            curveTo(0.6f, -3.9f, 23.4f, -3.89f, 24f, 12f)
            arcTo(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 24f)
            close()
            moveTo(12f, 3f)
            arcToRelative(9.01f, 9.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, -9f, 9f)
            curveToRelative(0.45f, 11.92f, 17.55f, 11.92f, 18f, 0f)
            arcTo(9.01f, 9.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 3f)
            close()
            moveTo(16.79f, 14.02f)
            arcTo(15.4f, 15.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 15f)
            arcTo(15.4f, 15.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.2f, 14.02f)
            arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.05f, 1.52f)
            arcTo(6.84f, 6.84f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 19f)
            arcToRelative(6.83f, 6.83f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.84f, -3.46f)
            arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16.79f, 14.02f)
            close()
            moveTo(7.94f, 11.76f)
            lineToRelative(1.34f, 0.99f)
            arcToRelative(0.73f, 0.73f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.13f, -0.82f)
            lineTo(9.9f, 10.33f)
            lineToRelative(1.37f, -1f)
            arcTo(0.73f, 0.73f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10.84f, 8f)
            lineTo(9.15f, 8f)
            lineTo(8.64f, 6.41f)
            arcToRelative(0.74f, 0.74f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.4f, 0f)
            lineTo(6.73f, 8f)
            lineTo(5.05f, 8f)
            arcToRelative(0.73f, 0.73f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.43f, 1.33f)
            lineToRelative(1.37f, 1f)
            lineToRelative(-0.52f, 1.61f)
            arcToRelative(0.71f, 0.71f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.27f, 0.82f)
            arcToRelative(0.73f, 0.73f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.86f, 0f)
            close()
            moveTo(15.96f, 11.76f)
            lineTo(17.31f, 12.75f)
            arcToRelative(0.73f, 0.73f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.13f, -0.82f)
            lineToRelative(-0.52f, -1.61f)
            lineToRelative(1.37f, -1f)
            arcTo(0.73f, 0.73f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18.85f, 8f)
            lineTo(17.17f, 8f)
            lineToRelative(-0.51f, -1.59f)
            arcToRelative(0.74f, 0.74f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.4f, 0f)
            lineTo(14.75f, 8f)
            lineTo(13.07f, 8f)
            arcToRelative(0.73f, 0.73f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.43f, 1.33f)
            lineToRelative(1.37f, 1f)
            lineToRelative(-0.52f, 1.61f)
            arcToRelative(0.71f, 0.71f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.27f, 0.82f)
            arcToRelative(0.73f, 0.73f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.86f, 0f)
            close()
        }
    }.also { _GrinStars = it }
