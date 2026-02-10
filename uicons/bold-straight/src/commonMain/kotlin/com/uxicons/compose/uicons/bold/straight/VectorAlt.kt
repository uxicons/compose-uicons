package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _VectorAlt: ImageVector? = null

val Icons.Bs.VectorAlt: ImageVector
    get() = _VectorAlt ?: UXIcon(name = "VectorAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.5f, 15f)
                lineTo(21.5f, 12f)
                arcToRelative(9.5f, 9.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5.09f, -8.41f)
                arcToRelative(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8.82f, 0f)
                arcTo(9.5f, 9.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.5f, 12f)
                verticalLineToRelative(3f)
                lineTo(0f, 15f)
                verticalLineToRelative(6.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.5f, 24f)
                lineTo(9f, 24f)
                lineTo(9f, 15f)
                lineTo(5.5f, 15f)
                lineTo(5.5f, 12f)
                arcTo(6.49f, 6.49f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.14f, 6.78f)
                arcToRelative(4.46f, 4.46f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.71f, 0f)
                arcTo(6.49f, 6.49f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18.5f, 12f)
                verticalLineToRelative(3f)
                lineTo(15f, 15f)
                verticalLineToRelative(9f)
                horizontalLineToRelative(6.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 21.5f)
                lineTo(24f, 15f)
                close()
                moveTo(6f, 18f)
                verticalLineToRelative(3f)
                lineTo(3f, 21f)
                lineTo(3f, 18f)
                close()
                moveTo(12f, 6f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1.5f, -1.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 6f)
                close()
                moveTo(21f, 21f)
                lineTo(18f, 21f)
                lineTo(18f, 18f)
                horizontalLineToRelative(3f)
                close()
            }
        }.also { _VectorAlt = it}
