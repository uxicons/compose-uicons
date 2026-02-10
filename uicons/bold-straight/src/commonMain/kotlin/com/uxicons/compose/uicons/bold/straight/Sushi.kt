package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Sushi: ImageVector? = null

val Icons.Bs.Sushi: ImageVector
    get() = _Sushi ?: UXIcon(name = "Sushi") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8.5f, 12f)
                arcTo(5.73f, 5.73f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 11f)
                arcToRelative(5.73f, 5.73f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.5f, -1f)
                arcTo(5.73f, 5.73f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 11f)
                arcTo(5.73f, 5.73f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.5f, 12f)
                close()
                moveTo(24f, 13f)
                curveToRelative(0f, 3.03f, -3.03f, 5.46f, -7.1f, 5.92f)
                curveTo(16.29f, 21.83f, 12.82f, 24f, 8.5f, 24f)
                curveTo(3.73f, 24f, 0f, 21.36f, 0f, 18f)
                lineTo(0f, 11f)
                curveTo(0f, 7.97f, 3.03f, 5.54f, 7.11f, 5.08f)
                curveTo(7.71f, 2.17f, 11.18f, 0f, 15.5f, 0f)
                curveTo(20.27f, 0f, 24f, 2.64f, 24f, 6f)
                close()
                moveTo(10.29f, 5.13f)
                arcToRelative(10.93f, 10.93f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.2f, 0.55f)
                arcTo(6.3f, 6.3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15.5f, 5f)
                arcTo(5.73f, 5.73f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 6f)
                arcToRelative(5.73f, 5.73f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.5f, 1f)
                curveToRelative(-0.23f, 0f, -0.45f, -0.01f, -0.66f, -0.03f)
                arcTo(5.91f, 5.91f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16.49f, 8.94f)
                curveTo(19.19f, 8.66f, 21f, 7.27f, 21f, 6f)
                curveToRelative(0f, -1.42f, -2.26f, -3f, -5.5f, -3f)
                curveTo(12.92f, 3f, 10.98f, 4.0f, 10.29f, 5.13f)
                close()
                moveTo(3f, 11f)
                curveToRelative(0f, 1.42f, 2.26f, 3f, 5.5f, 3f)
                reflectiveCurveTo(14f, 12.42f, 14f, 11f)
                reflectiveCurveTo(11.74f, 8f, 8.5f, 8f)
                reflectiveCurveTo(3f, 9.58f, 3f, 11f)
                close()
                moveTo(14f, 18f)
                lineTo(14f, 15.61f)
                arcTo(10.85f, 10.85f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.5f, 17f)
                arcTo(10.85f, 10.85f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 15.61f)
                lineTo(3f, 18f)
                curveToRelative(0f, 1.42f, 2.26f, 3f, 5.5f, 3f)
                reflectiveCurveTo(14f, 19.42f, 14f, 18f)
                close()
                moveTo(21f, 13f)
                lineTo(21f, 10.61f)
                arcToRelative(10.31f, 10.31f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4f, 1.3f)
                verticalLineToRelative(3.96f)
                curveTo(19.41f, 15.47f, 21f, 14.19f, 21f, 13f)
                close()
            }
        }.also { _Sushi = it}
