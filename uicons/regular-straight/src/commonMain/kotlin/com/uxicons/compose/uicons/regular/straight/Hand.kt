package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Hand: ImageVector? = null

val Icons.Rs.Hand: ImageVector
    get() = _Hand ?: UXIcon(name = "Hand") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 14.21f)
                lineTo(22f, 3f)
                lineTo(3f, 3f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 6f)
                verticalLineToRelative(9f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 3f)
                lineTo(7.71f, 18f)
                lineToRelative(1.91f, 3.88f)
                arcToRelative(3.04f, 3.04f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.72f, -1.84f)
                lineTo(15.01f, 18f)
                lineTo(24f, 18f)
                close()
                moveTo(2f, 15f)
                lineTo(2f, 6f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 5f)
                lineTo(7f, 5f)
                lineTo(7f, 16f)
                lineTo(3f, 16f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 15f)
                close()
                moveTo(22f, 16f)
                lineTo(12.65f, 16f)
                lineToRelative(0.72f, 4.37f)
                arcToRelative(1.02f, 1.02f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.23f, 0.84f)
                arcToRelative(1.07f, 1.07f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.72f, -0.21f)
                lineTo(9f, 16.09f)
                lineTo(9f, 5f)
                lineTo(20.33f, 5f)
                lineTo(22f, 14.3f)
                close()
            }
        }.also { _Hand = it}
