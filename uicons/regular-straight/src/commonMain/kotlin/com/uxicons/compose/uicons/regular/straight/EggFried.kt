package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _EggFried: ImageVector? = null

val Icons.Rs.EggFried: ImageVector
    get() = _EggFried ?: UXIcon(name = "EggFried") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9.5f, 16f)
                arcTo(5.5f, 5.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 15f, 10.5f)
                arcTo(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9.5f, 16f)
                close()
                moveTo(9.5f, 7f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 13f, 10.5f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.5f, 7f)
                close()
                moveTo(13f, 24f)
                arcTo(13.02f, 13.02f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 11f)
                lineTo(0f, 10f)
                arcTo(9.99f, 9.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18.72f, 5.11f)
                arcToRelative(6.5f, 6.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.27f, 11.87f)
                arcTo(8.03f, 8.03f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13f, 24f)
                close()
                moveTo(10f, 2f)
                arcToRelative(8.01f, 8.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8f, 8f)
                verticalLineToRelative(1f)
                arcTo(11.01f, 11.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13f, 22f)
                curveToRelative(3.2f, 0f, 6f, -2.57f, 6f, -5.5f)
                lineToRelative(0f, -0.71f)
                lineToRelative(0.55f, -0.28f)
                arcToRelative(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.57f, -8.48f)
                lineToRelative(-0.55f, -0.06f)
                lineToRelative(-0.24f, -0.5f)
                arcTo(7.95f, 7.95f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10f, 2f)
                close()
                moveTo(12f, 18f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 1f, 1f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 18f)
                close()
                moveTo(19f, 10f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 1f, 1f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 10f)
                close()
                moveTo(15f, 16f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 1f, 1f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15f, 16f)
                close()
            }
        }.also { _EggFried = it}
