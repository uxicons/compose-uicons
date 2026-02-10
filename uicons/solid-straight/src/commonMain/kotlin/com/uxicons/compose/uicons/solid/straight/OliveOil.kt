package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _OliveOil: ImageVector? = null

val Icons.Ss.OliveOil: ImageVector
    get() = _OliveOil ?: UXIcon(name = "OliveOil") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 9f)
                arcToRelative(3.98f, 3.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, -6f, -3.45f)
                lineTo(15f, 2f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, -2f)
                lineTo(8f, 0f)
                lineTo(8f, 2f)
                lineTo(9f, 2f)
                lineTo(9f, 8f)
                curveToRelative(0f, 0.66f, -1.21f, 1.68f, -2.28f, 2.58f)
                arcTo(18.06f, 18.06f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.19f, 13f)
                lineTo(17f, 13f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 9f)
                close()
                moveTo(15.11f, 8.33f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = true, 2.53f, 2.55f)
                curveToRelative(-0.12f, -0.1f, -0.24f, -0.21f, -0.36f, -0.31f)
                arcTo(8.82f, 8.82f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15.11f, 8.33f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(3.14f, 15f)
                arcTo(3.92f, 3.92f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 16f)
                curveToRelative(0f, 2.6f, 1.45f, 3.94f, 2.99f, 5.36f)
                lineToRelative(0.5f, 0.47f)
                arcTo(1.62f, 1.62f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, 23f)
                verticalLineToRelative(1f)
                horizontalLineTo(17f)
                verticalLineTo(23f)
                arcToRelative(1.62f, 1.62f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.5f, -1.18f)
                lineToRelative(0.5f, -0.47f)
                curveTo(19.55f, 19.94f, 21f, 18.6f, 21f, 16f)
                arcToRelative(3.92f, 3.92f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.14f, -1f)
                close()
            }
        }.also { _OliveOil = it}
