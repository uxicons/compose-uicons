package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Utensils: ImageVector? = null

val Icons.Bs.Utensils: ImageVector
    get() = _Utensils ?: UXIcon(name = "Utensils") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10f, 0f)
                horizontalLineToRelative(3f)
                lineTo(13f, 9.5f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9.5f, 13f)
                lineTo(8f, 13f)
                lineTo(8f, 24f)
                lineTo(5f, 24f)
                lineTo(5f, 13f)
                lineTo(3.5f, 13f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 9.5f)
                lineTo(0f, 0f)
                lineTo(3f, 0f)
                lineTo(3f, 9.5f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.5f, 0.5f)
                lineTo(5f, 10f)
                lineTo(5f, 0f)
                lineTo(8f, 0f)
                lineTo(8f, 10f)
                lineTo(9.5f, 10f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.5f, -0.5f)
                close()
                moveTo(24f, 9.77f)
                curveToRelative(0f, 4.86f, -3.67f, 9.2f, -5f, 10.61f)
                lineTo(19f, 24f)
                lineTo(16f, 24f)
                lineTo(16f, 2.5f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.51f, -1.49f)
                curveTo(22.1f, 3.15f, 24f, 6.4f, 24f, 9.77f)
                close()
                moveTo(19f, 15.52f)
                arcTo(9.37f, 9.37f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 4.1f)
                close()
            }
        }.also { _Utensils = it}
