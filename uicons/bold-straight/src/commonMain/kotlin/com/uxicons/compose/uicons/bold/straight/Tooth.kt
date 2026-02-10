package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Tooth: ImageVector? = null

val Icons.Bs.Tooth: ImageVector
    get() = _Tooth ?: UXIcon(name = "Tooth") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.73f, 0f)
                arcToRelative(12.21f, 12.21f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.91f, 0.64f)
                arcTo(5.93f, 5.93f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 1f)
                arcTo(5.95f, 5.95f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10.18f, 0.64f)
                arcTo(12.2f, 12.2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.27f, 0f)
                arcTo(6.1f, 6.1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 6.27f)
                curveToRelative(0f, 6.29f, 3.17f, 12.39f, 5.94f, 17f)
                lineTo(6.38f, 24f)
                horizontalLineTo(11f)
                verticalLineTo(15f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 0f)
                verticalLineToRelative(9f)
                horizontalLineToRelative(4.62f)
                lineToRelative(0.44f, -0.73f)
                curveTo(20.82f, 18.66f, 24f, 12.56f, 24f, 6.27f)
                arcTo(6.1f, 6.1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17.73f, 0f)
                close()
                moveTo(16f, 20.86f)
                verticalLineTo(15f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8f, 0f)
                verticalLineToRelative(5.86f)
                curveToRelative(-2.43f, -4.16f, -5f, -9.4f, -5f, -14.59f)
                arcTo(3.12f, 3.12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.27f, 3f)
                arcToRelative(9.24f, 9.24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.04f, 0.51f)
                arcTo(8.69f, 8.69f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 4f)
                arcToRelative(8.68f, 8.68f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.69f, -0.49f)
                arcTo(9.24f, 9.24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17.73f, 3f)
                arcTo(3.12f, 3.12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 6.27f)
                curveTo(21f, 11.46f, 18.43f, 16.71f, 16f, 20.86f)
                close()
            }
        }.also { _Tooth = it}
