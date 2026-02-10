package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Hand: ImageVector? = null

val Icons.Bs.Hand: ImageVector
    get() = _Hand ?: UXIcon(name = "Hand") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 13.93f)
                lineTo(22f, 3f)
                lineTo(3f, 3f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 6f)
                verticalLineToRelative(9f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 3f)
                lineTo(7.58f, 18f)
                lineToRelative(1.67f, 3.26f)
                arcToRelative(3.45f, 3.45f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.47f, -2.14f)
                lineTo(15.53f, 18f)
                lineTo(24f, 18f)
                close()
                moveTo(3f, 6f)
                lineTo(7f, 6f)
                verticalLineToRelative(9f)
                lineTo(3f, 15f)
                close()
                moveTo(21f, 15f)
                lineTo(11.97f, 15f)
                lineToRelative(0.79f, 4.62f)
                arcToRelative(0.43f, 0.43f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.1f, 0.36f)
                arcToRelative(0.45f, 0.45f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.74f, -0.08f)
                lineTo(10f, 16.14f)
                lineTo(10f, 6f)
                horizontalLineToRelative(9.5f)
                lineTo(21f, 14.07f)
                close()
            }
        }.also { _Hand = it}
