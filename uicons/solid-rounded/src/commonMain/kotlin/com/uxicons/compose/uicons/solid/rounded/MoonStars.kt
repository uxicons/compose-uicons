package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MoonStars: ImageVector? = null

val Icons.Sr.MoonStars: ImageVector
    get() = _MoonStars ?: UXIcon(name = "MoonStars") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.01f, 24f)
                arcTo(12.07f, 12.07f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.07f, 10.72f)
                arcTo(12.12f, 12.12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10.1f, 0.15f)
                arcToRelative(13f, 13f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.03f, 0.21f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.8f, 1.8f)
                arcToRelative(2.47f, 2.47f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.7f, 2.42f)
                curveToRelative(-4.56f, 4.17f, -4.17f, 10.64f, 0.81f, 14.41f)
                horizontalLineToRelative(0f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.7f, 4.32f)
                arcTo(13.88f, 13.88f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12.01f, 24f)
                close()
                moveTo(20.5f, 12f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.97f, -0.76f)
                lineToRelative(-0.36f, -1.43f)
                lineTo(17.74f, 9.43f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.04f, -1.94f)
                lineToRelative(1.4f, -0.33f)
                lineToRelative(0.35f, -1.41f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.94f, 0f)
                lineToRelative(0.35f, 1.42f)
                lineToRelative(1.42f, 0.35f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 1.94f)
                lineToRelative(-1.42f, 0.35f)
                lineToRelative(-0.35f, 1.42f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20.5f, 12f)
                close()
                moveTo(23f, 17.02f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 2f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 23f, 17.02f)
                close()
                moveTo(17f, 13.02f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 2f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17f, 13.02f)
                close()
            }
        }.also { _MoonStars = it}
