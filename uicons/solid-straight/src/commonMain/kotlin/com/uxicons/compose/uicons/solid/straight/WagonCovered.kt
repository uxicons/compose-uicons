package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _WagonCovered: ImageVector? = null

val Icons.Ss.WagonCovered: ImageVector
    get() = _WagonCovered ?: UXIcon(name = "WagonCovered") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 21f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -6f, 0f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 21f)
                close()
                moveTo(22.02f, 12f)
                lineTo(1.98f, 12f)
                lineTo(0.07f, 3.95f)
                arcToRelative(2.71f, 2.71f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.7f, -2.48f)
                arcTo(2.68f, 2.68f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.19f, 0.68f)
                lineToRelative(0.41f, 0.08f)
                arcTo(12.04f, 12.04f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 1f)
                arcToRelative(4.39f, 4.39f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, -1f)
                arcToRelative(10.32f, 10.32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 1f)
                arcToRelative(10.33f, 10.33f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, -1f)
                arcToRelative(10.09f, 10.09f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 1f)
                arcTo(12.04f, 12.04f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20.4f, 0.77f)
                lineToRelative(0.41f, -0.08f)
                arcToRelative(2.71f, 2.71f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.12f, 3.28f)
                close()
                moveTo(9f, 3f)
                lineTo(7f, 3f)
                verticalLineToRelative(7f)
                lineTo(9f, 10f)
                close()
                moveTo(17f, 3f)
                lineTo(15f, 3f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(2f)
                close()
                moveTo(5f, 18f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 6f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 18f)
                close()
                moveTo(2f, 14f)
                verticalLineToRelative(3.02f)
                arcTo(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, 21f)
                horizontalLineToRelative(4f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, -3.98f)
                lineTo(22f, 14f)
                close()
            }
        }.also { _WagonCovered = it}
