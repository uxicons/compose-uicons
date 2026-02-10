package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BabyCarriage: ImageVector? = null

val Icons.Sr.BabyCarriage: ImageVector
    get() = _BabyCarriage ?: UXIcon(name = "BabyCarriage") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.86f, 8f)
                horizontalLineTo(13f)
                verticalLineTo(2f)
                arcToRelative(1.96f, 1.96f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, -2f)
                curveTo(15.08f, 0f, 22.75f, 0.1f, 23.86f, 8f)
                close()
                moveTo(6.5f, 10f)
                lineTo(4.24f, 7.46f)
                curveTo(3.46f, 6.45f, 0.28f, 4.95f, 0f, 7f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, 8f)
                arcToRelative(2.34f, 2.34f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.75f, 0.79f)
                lineTo(4f, 10.19f)
                verticalLineTo(11f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 5f)
                horizontalLineToRelative(2.87f)
                lineTo(9.26f, 19.13f)
                curveTo(5.58f, 18.11f, 4.68f, 23.82f, 8.5f, 24f)
                arcToRelative(2.51f, 2.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.26f, -3.55f)
                lineTo(14f, 16.56f)
                lineToRelative(3.24f, 3.89f)
                arcTo(2.51f, 2.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19.5f, 24f)
                curveToRelative(3.82f, -0.18f, 2.92f, -5.89f, -0.76f, -4.87f)
                lineTo(16.14f, 16f)
                horizontalLineTo(19f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, -5f)
                verticalLineTo(10f)
                close()
            }
        }.also { _BabyCarriage = it}
