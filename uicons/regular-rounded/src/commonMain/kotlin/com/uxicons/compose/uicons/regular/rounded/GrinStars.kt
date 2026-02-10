package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GrinStars: ImageVector? = null

val Icons.Rr.GrinStars: ImageVector
    get() = _GrinStars ?: UXIcon(name = "GrinStars") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0f)
                arcTo(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 12f)
                curveToRelative(0.6f, 15.9f, 23.4f, 15.89f, 24f, 0f)
                arcTo(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 0f)
                close()
                moveTo(12f, 22f)
                arcTo(10.01f, 10.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 12f)
                curveTo(2.5f, -1.25f, 21.5f, -1.25f, 22f, 12f)
                arcTo(10.01f, 10.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 22f)
                close()
                moveTo(17.84f, 15.54f)
                arcTo(6.83f, 6.83f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 19f)
                arcToRelative(6.84f, 6.84f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5.85f, -3.46f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.2f, 14.02f)
                arcTo(15.4f, 15.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 15f)
                arcToRelative(15.4f, 15.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.79f, -0.98f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17.84f, 15.54f)
                close()
                moveTo(5.74f, 12.75f)
                arcToRelative(0.71f, 0.71f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.27f, -0.82f)
                lineToRelative(0.52f, -1.61f)
                lineToRelative(-1.37f, -1f)
                arcTo(0.73f, 0.73f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.05f, 8f)
                lineTo(6.73f, 8f)
                lineToRelative(0.51f, -1.59f)
                arcToRelative(0.74f, 0.74f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.4f, 0f)
                lineTo(9.15f, 8f)
                horizontalLineToRelative(1.68f)
                arcToRelative(0.73f, 0.73f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.43f, 1.33f)
                lineToRelative(-1.37f, 1f)
                lineToRelative(0.52f, 1.61f)
                arcToRelative(0.73f, 0.73f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.13f, 0.82f)
                lineToRelative(-1.34f, -0.99f)
                lineTo(6.6f, 12.75f)
                arcTo(0.73f, 0.73f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.74f, 12.75f)
                close()
                moveTo(19.29f, 9.33f)
                lineToRelative(-1.37f, 1f)
                lineToRelative(0.52f, 1.61f)
                arcToRelative(0.73f, 0.73f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.13f, 0.82f)
                lineToRelative(-1.34f, -0.99f)
                lineToRelative(-1.34f, 0.99f)
                arcToRelative(0.73f, 0.73f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.86f, 0f)
                arcToRelative(0.71f, 0.71f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.27f, -0.82f)
                lineToRelative(0.52f, -1.61f)
                lineToRelative(-1.37f, -1f)
                arcTo(0.73f, 0.73f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13.07f, 8f)
                horizontalLineToRelative(1.68f)
                lineToRelative(0.51f, -1.59f)
                arcToRelative(0.74f, 0.74f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.4f, 0f)
                lineTo(17.17f, 8f)
                horizontalLineToRelative(1.68f)
                arcToRelative(0.73f, 0.73f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.43f, 1.33f)
                close()
            }
        }.also { _GrinStars = it}
