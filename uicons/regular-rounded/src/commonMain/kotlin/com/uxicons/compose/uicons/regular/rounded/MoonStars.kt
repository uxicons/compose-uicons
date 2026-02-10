package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MoonStars: ImageVector? = null

val Icons.Rr.MoonStars: ImageVector
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
                moveTo(12.08f, 2f)
                arcToRelative(10.78f, 10.78f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.68f, 0.13f)
                arcToRelative(10.1f, 10.1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8.34f, 8.8f)
                arcTo(9.93f, 9.93f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.58f, 18.7f)
                arcToRelative(10.47f, 10.47f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11.09f, 2.73f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.14f, -0.86f)
                horizontalLineToRelative(0f)
                curveTo(9.88f, 16.1f, 9.42f, 8.09f, 14.87f, 3.12f)
                arcToRelative(0.46f, 0.46f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.13f, -0.47f)
                arcToRelative(0.49f, 0.49f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.36f, -0.36f)
                arcTo(10.68f, 10.68f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12.08f, 2f)
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
                moveTo(16f, 14f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 0f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 14f)
                close()
                moveTo(22f, 18f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 0f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22f, 18f)
                close()
            }
        }.also { _MoonStars = it}
