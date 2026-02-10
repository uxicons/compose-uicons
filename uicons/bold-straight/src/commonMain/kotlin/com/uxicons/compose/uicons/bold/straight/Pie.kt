package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Pie: ImageVector? = null

val Icons.Bs.Pie: ImageVector
    get() = _Pie ?: UXIcon(name = "Pie") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8.36f, 12.64f)
                arcToRelative(1.24f, 1.24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -1.76f)
                arcTo(8.2f, 8.2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11f, 10f)
                arcToRelative(8.2f, 8.2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.88f, 2.64f)
                arcTo(1.24f, 1.24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.36f, 12.64f)
                close()
                moveTo(15.64f, 12.64f)
                arcToRelative(1.24f, 1.24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -1.76f)
                arcTo(8.2f, 8.2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13f, 10f)
                arcToRelative(8.2f, 8.2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.88f, 2.64f)
                arcTo(1.24f, 1.24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15.64f, 12.64f)
                close()
                moveTo(22.32f, 17.53f)
                lineTo(21.55f, 21.21f)
                arcTo(3.51f, 3.51f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18.13f, 24f)
                lineTo(5.87f, 24f)
                arcToRelative(3.51f, 3.51f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.43f, -2.79f)
                lineToRelative(-0.76f, -3.68f)
                arcTo(3.56f, 3.56f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 14.5f)
                curveTo(0f, 10.57f, 5.24f, 6f, 12f, 6f)
                reflectiveCurveToRelative(12f, 4.57f, 12f, 8.5f)
                arcTo(3.56f, 3.56f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22.32f, 17.53f)
                close()
                moveTo(3f, 14.5f)
                curveToRelative(0.02f, 0.5f, 0.28f, 0.5f, 0.5f, 0.5f)
                lineTo(6f, 15f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 0f)
                horizontalLineToRelative(3f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 0f)
                horizontalLineToRelative(3f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 0f)
                horizontalLineToRelative(2.5f)
                curveToRelative(0.22f, 0f, 0.48f, 0f, 0.5f, -0.53f)
                curveTo(21f, 12.61f, 17.5f, 9f, 12f, 9f)
                reflectiveCurveTo(3f, 12.61f, 3f, 14.5f)
                close()
                moveTo(18.62f, 20.6f)
                lineTo(19.07f, 18.4f)
                arcTo(3.91f, 3.91f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14.5f, 18.1f)
                arcToRelative(3.91f, 3.91f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5f, 0f)
                arcToRelative(3.91f, 3.91f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.57f, 0.31f)
                lineToRelative(0.46f, 2.2f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.49f, 0.4f)
                lineTo(18.13f, 21.01f)
                arcTo(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18.62f, 20.6f)
                close()
                moveTo(13.5f, 0f)
                horizontalLineToRelative(-3f)
                lineTo(10.5f, 4f)
                horizontalLineToRelative(3f)
                close()
                moveTo(19f, 0f)
                lineTo(16f, 0f)
                lineTo(16f, 4f)
                horizontalLineToRelative(3f)
                close()
                moveTo(8f, 0f)
                lineTo(5f, 0f)
                lineTo(5f, 4f)
                lineTo(8f, 4f)
                close()
            }
        }.also { _Pie = it}
