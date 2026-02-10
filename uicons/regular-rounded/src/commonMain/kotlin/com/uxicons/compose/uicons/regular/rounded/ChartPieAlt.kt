package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChartPieAlt: ImageVector? = null

val Icons.Rr.ChartPieAlt: ImageVector
    get() = _ChartPieAlt ?: UXIcon(name = "ChartPieAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.71f, 12f)
                lineTo(14f, 12f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, -2f)
                lineTo(12f, 5.27f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.17f, -2.38f)
                arcToRelative(2.87f, 2.87f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.48f, -0.53f)
                arcToRelative(10.97f, 10.97f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.55f, 21.41f)
                arcTo(11f, 11f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21.64f, 15.66f)
                arcToRelative(2.88f, 2.88f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.53f, -2.48f)
                arcTo(3.06f, 3.06f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18.71f, 12f)
                close()
                moveTo(19.7f, 15.17f)
                arcTo(8.97f, 8.97f, 0f, isMoreThanHalf = true, isPositiveArc = true, 8.84f, 4.3f)
                arcToRelative(0.87f, 0.87f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.76f, 0.17f)
                arcToRelative(1.02f, 1.02f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.4f, 0.81f)
                lineTo(10.01f, 10f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 4f)
                horizontalLineToRelative(4.71f)
                arcToRelative(1.04f, 1.04f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.82f, 0.4f)
                arcTo(0.88f, 0.88f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19.7f, 15.17f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.65f, 7.45f)
                arcTo(10.07f, 10.07f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16.58f, 0.37f)
                arcTo(2.1f, 2.1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16.04f, 0.3f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.02f, 2f)
                verticalLineTo(7f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 3f)
                horizontalLineToRelative(4.72f)
                arcTo(2.01f, 2.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 23.65f, 7.45f)
                close()
                moveTo(21.15f, 8f)
                horizontalLineTo(17.02f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, -1f)
                lineToRelative(-0.01f, -4.69f)
                arcToRelative(0.05f, 0.05f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.03f, -0.01f)
                lineToRelative(0.03f, 0f)
                arcTo(8.07f, 8.07f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21.73f, 8f)
                close()
            }
        }.also { _ChartPieAlt = it}
