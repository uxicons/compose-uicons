package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _EggFried: ImageVector? = null

val Icons.Ss.EggFried: ImageVector
    get() = _EggFried ?: UXIcon(name = "EggFried") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.72f, 5.11f)
                arcTo(9.99f, 9.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 10f)
                verticalLineToRelative(1f)
                arcTo(13.02f, 13.02f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13f, 24f)
                arcToRelative(8.03f, 8.03f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.98f, -7.01f)
                arcTo(6.5f, 6.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18.72f, 5.11f)
                close()
                moveTo(12f, 20f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1f, -1f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 20f)
                close()
                moveTo(9.5f, 16f)
                arcTo(5.5f, 5.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 15f, 10.5f)
                arcTo(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9.5f, 16f)
                close()
                moveTo(15f, 18f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1f, -1f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15f, 18f)
                close()
                moveTo(19f, 12f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1f, -1f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 12f)
                close()
                moveTo(13f, 10.5f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 9.5f, 7f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13f, 10.5f)
                close()
            }
        }.also { _EggFried = it}
