package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _WagonCovered: ImageVector? = null

val Icons.Sr.WagonCovered: ImageVector
    get() = _WagonCovered ?: UXIcon(name = "WagonCovered") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(1.77f, 12f)
                lineTo(22.23f, 12f)
                lineToRelative(1.7f, -8.03f)
                arcToRelative(2.72f, 2.72f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.69f, -2.5f)
                arcTo(2.69f, 2.69f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20.81f, 0.68f)
                reflectiveCurveTo(19.25f, 1f, 19f, 1f)
                arcTo(6.31f, 6.31f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17.15f, 0.25f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14.88f, 0.19f)
                arcTo(12.36f, 12.36f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 1f)
                arcTo(12.35f, 12.35f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9.12f, 0.19f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.27f, 0.06f)
                arcTo(6.32f, 6.32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 1f)
                curveTo(4.75f, 1f, 3.19f, 0.68f, 3.19f, 0.68f)
                arcToRelative(2.68f, 2.68f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.43f, 0.78f)
                arcTo(2.71f, 2.71f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.07f, 3.95f)
                close()
                moveTo(15f, 4f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 0f)
                lineTo(17f, 9f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, 0f)
                close()
                moveTo(7f, 4f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9f, 4f)
                lineTo(9f, 9f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, 9f)
                close()
                moveTo(8f, 21f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -6f, 0f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 21f)
                close()
                moveTo(22f, 21f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -6f, 0f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 21f)
                close()
                moveTo(22f, 14f)
                verticalLineToRelative(3f)
                arcToRelative(5.03f, 5.03f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8f, 4f)
                lineTo(10f, 21f)
                arcToRelative(5.03f, 5.03f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8f, -4f)
                lineTo(2f, 14f)
                close()
            }
        }.also { _WagonCovered = it}
