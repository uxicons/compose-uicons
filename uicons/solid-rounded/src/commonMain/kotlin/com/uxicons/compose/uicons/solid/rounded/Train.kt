package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Train: ImageVector? = null

val Icons.Sr.Train: ImageVector
    get() = _Train ?: UXIcon(name = "Train") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 14f)
                curveToRelative(4.28f, 0f, 7.63f, -6.29f, 8.66f, -10.05f)
                arcTo(4.97f, 4.97f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17.52f, 0.96f)
                arcTo(18.33f, 18.33f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 0f)
                arcTo(18.37f, 18.37f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.47f, 0.96f)
                arcToRelative(4.97f, 4.97f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.14f, 2.99f)
                curveTo(4.37f, 7.71f, 7.72f, 14f, 12f, 14f)
                close()
                moveTo(10f, 3f)
                horizontalLineToRelative(4f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 2f)
                horizontalLineTo(10f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -2f)
                close()
                moveTo(21f, 8.59f)
                curveTo(19.11f, 12.32f, 15.97f, 16f, 12f, 16f)
                reflectiveCurveTo(4.89f, 12.32f, 3f, 8.59f)
                verticalLineToRelative(7.59f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.32f, 3.39f)
                lineTo(3.08f, 22.62f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 1.85f, 0.76f)
                lineTo(6f, 20.75f)
                arcTo(13.58f, 13.58f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 22f)
                arcToRelative(13.57f, 13.57f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, -1.25f)
                lineToRelative(1.08f, 2.63f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 1.85f, -0.76f)
                lineToRelative(-1.25f, -3.05f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 16.18f)
                close()
                moveTo(12f, 20f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1f, -1f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 20f)
                close()
            }
        }.also { _Train = it}
