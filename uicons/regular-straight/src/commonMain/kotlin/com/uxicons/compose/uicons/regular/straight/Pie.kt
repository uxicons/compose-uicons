package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Pie: ImageVector? = null

val Icons.Rs.Pie: ImageVector
    get() = _Pie ?: UXIcon(name = "Pie") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8.36f, 10.88f)
                arcTo(8.21f, 8.21f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11f, 10f)
                arcToRelative(8.22f, 8.22f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.88f, 2.64f)
                arcToRelative(1.24f, 1.24f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1.76f, -1.76f)
                close()
                moveTo(13f, 10f)
                arcToRelative(8.22f, 8.22f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.88f, 2.64f)
                arcToRelative(1.24f, 1.24f, 0f, isMoreThanHalf = true, isPositiveArc = false, 1.76f, -1.76f)
                arcTo(8.21f, 8.21f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13f, 10f)
                close()
                moveTo(21.86f, 16.89f)
                lineTo(21.03f, 21.52f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18.08f, 24f)
                lineTo(5.92f, 24f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.95f, -2.48f)
                lineToRelative(-0.83f, -4.64f)
                arcTo(2.95f, 2.95f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 14f)
                curveToRelative(0f, -3.62f, 5.35f, -8f, 12f, -8f)
                reflectiveCurveToRelative(12f, 4.38f, 12f, 8f)
                arcTo(2.95f, 2.95f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21.86f, 16.89f)
                close()
                moveTo(19.06f, 21.18f)
                lineTo(19.5f, 18.7f)
                arcTo(3.94f, 3.94f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15f, 17.62f)
                arcToRelative(3.95f, 3.95f, 0f, isMoreThanHalf = false, isPositiveArc = true, -6f, 0f)
                arcTo(3.94f, 3.94f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.5f, 18.7f)
                lineToRelative(0.44f, 2.47f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.92f, 22f)
                lineTo(18.08f, 22f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19.06f, 21.18f)
                close()
                moveTo(22f, 13.99f)
                curveTo(22f, 11.63f, 17.52f, 8f, 12f, 8f)
                reflectiveCurveTo(2f, 11.63f, 2f, 14f)
                arcToRelative(0.92f, 0.92f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, 1f)
                lineTo(4f, 15f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 0f)
                horizontalLineToRelative(2f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 0f)
                horizontalLineToRelative(2f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 0f)
                horizontalLineToRelative(1f)
                arcTo(0.92f, 0.92f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22f, 13.99f)
                close()
                moveTo(13f, 0f)
                lineTo(11f, 0f)
                lineTo(11f, 4f)
                horizontalLineToRelative(2f)
                close()
                moveTo(17f, 0f)
                lineTo(15f, 0f)
                lineTo(15f, 4f)
                horizontalLineToRelative(2f)
                close()
                moveTo(9f, 0f)
                lineTo(7f, 0f)
                lineTo(7f, 4f)
                lineTo(9f, 4f)
                close()
            }
        }.also { _Pie = it}
