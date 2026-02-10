package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HatChef: ImageVector? = null

val Icons.Bs.HatChef: ImageVector
    get() = _HatChef ?: UXIcon(name = "HatChef") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.5f, 1f)
                arcToRelative(5.44f, 5.44f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.45f, 0.58f)
                arcToRelative(5.98f, 5.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8.1f, 0f)
                arcTo(5.44f, 5.44f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.5f, 1f)
                arcTo(5.5f, 5.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 11.79f)
                lineTo(4f, 24f)
                lineTo(20f, 24f)
                lineTo(20f, 11.79f)
                arcTo(5.5f, 5.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18.5f, 1f)
                close()
                moveTo(18.5f, 9f)
                lineTo(17f, 9f)
                verticalLineToRelative(9f)
                lineTo(7f, 18f)
                lineTo(7f, 9f)
                lineTo(5.5f, 9f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 7.2f, 4.68f)
                lineTo(8.51f, 5.9f)
                lineToRelative(0.97f, -1.51f)
                arcToRelative(2.98f, 2.98f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.04f, 0f)
                lineTo(15.49f, 5.9f)
                lineToRelative(1.31f, -1.22f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 18.5f, 9f)
                close()
            }
        }.also { _HatChef = it}
