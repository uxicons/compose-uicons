package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Fish: ImageVector? = null

val Icons.Bs.Fish: ImageVector
    get() = _Fish ?: UXIcon(name = "Fish") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.14f, 3.86f)
                arcTo(3.88f, 3.88f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16.29f, 0f)
                curveTo(15.52f, 0f, 15f, 0.38f, 15f, 1.16f)
                lineTo(15f, 7.02f)
                lineToRelative(-0.97f, 0.01f)
                curveToRelative(-1.09f, 0.03f, -2.09f, 0.11f, -3.03f, 0.22f)
                verticalLineToRelative(-2.4f)
                arcToRelative(15.13f, 15.13f, 0f, isMoreThanHalf = false, isPositiveArc = false, -6.92f, 1.7f)
                arcTo(2.01f, 2.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 8.32f)
                verticalLineToRelative(2.3f)
                curveTo(0.83f, 13.03f, 0f, 16.82f, 0f, 22.5f)
                lineTo(0f, 24f)
                lineTo(1.5f, 24f)
                curveToRelative(8.35f, 0f, 12.6f, -1.81f, 14.4f, -7f)
                horizontalLineToRelative(1.11f)
                arcToRelative(1.98f, 1.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.95f, -1.66f)
                lineTo(19.34f, 13f)
                lineTo(16.75f, 13f)
                curveToRelative(0.11f, -0.94f, 0.19f, -1.94f, 0.22f, -3.03f)
                lineTo(16.98f, 9f)
                horizontalLineToRelative(5.87f)
                curveTo(23.62f, 9f, 24f, 8.48f, 24f, 7.71f)
                arcTo(3.88f, 3.88f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20.14f, 3.86f)
                close()
                moveTo(4.5f, 21f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -3f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.5f, 21f)
                close()
                moveTo(9.68f, 19.83f)
                arcTo(9.16f, 9.16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.16f, 14.36f)
                curveToRelative(1.4f, -3.11f, 4.29f, -4.19f, 9.82f, -4.34f)
                curveTo(13.83f, 15.53f, 12.76f, 18.42f, 9.68f, 19.83f)
                close()
            }
        }.also { _Fish = it}
