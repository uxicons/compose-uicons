package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Utensils: ImageVector? = null

val Icons.Rs.Utensils: ImageVector
    get() = _Utensils ?: UXIcon(name = "Utensils") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10f, 0f)
                horizontalLineToRelative(2f)
                lineTo(12f, 9f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3f, 3f)
                lineTo(8f, 12f)
                lineTo(8f, 24f)
                lineTo(6f, 24f)
                lineTo(6f, 12f)
                lineTo(5f, 12f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 9f)
                lineTo(2f, 0f)
                lineTo(4f, 0f)
                lineTo(4f, 9f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, 1f)
                lineTo(6f, 10f)
                lineTo(6f, 0f)
                lineTo(8f, 0f)
                lineTo(8f, 10f)
                lineTo(9f, 10f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, -1f)
                close()
                moveTo(22f, 9.27f)
                curveToRelative(0f, 4.68f, -3.88f, 9.19f, -5f, 10.4f)
                lineTo(17f, 24f)
                lineTo(15f, 24f)
                lineTo(15f, 2f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18.61f, 0.81f)
                curveTo(20.16f, 2.89f, 22f, 6.04f, 22f, 9.27f)
                close()
                moveTo(17f, 16.53f)
                curveToRelative(3.9f, -5.03f, 3.92f, -9.48f, 0f, -14.52f)
                close()
            }
        }.also { _Utensils = it}
