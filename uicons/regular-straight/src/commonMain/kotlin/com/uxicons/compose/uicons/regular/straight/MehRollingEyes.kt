package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MehRollingEyes: ImageVector? = null

val Icons.Rs.MehRollingEyes: ImageVector
    get() = _MehRollingEyes ?: UXIcon(name = "MehRollingEyes") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.5f, 6f)
                arcTo(3.78f, 3.78f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13f, 10f)
                arcToRelative(3.78f, 3.78f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.5f, 4f)
                arcTo(3.78f, 3.78f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 10f)
                arcTo(3.78f, 3.78f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16.5f, 6f)
                close()
                moveTo(16.5f, 12f)
                curveToRelative(-0.81f, 0f, -1.5f, -0.92f, -1.5f, -2f)
                arcToRelative(2.48f, 2.48f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.15f, -0.85f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.7f, 0f)
                arcTo(2.48f, 2.48f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 10f)
                curveTo(18f, 11.08f, 17.31f, 12f, 16.5f, 12f)
                close()
                moveTo(11f, 10f)
                arcTo(3.78f, 3.78f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.5f, 6f)
                arcTo(3.78f, 3.78f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 10f)
                arcToRelative(3.78f, 3.78f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.5f, 4f)
                arcTo(3.78f, 3.78f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11f, 10f)
                close()
                moveTo(7.5f, 12f)
                curveTo(6.69f, 12f, 6f, 11.08f, 6f, 10f)
                arcToRelative(2.48f, 2.48f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.15f, -0.85f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.7f, 0f)
                arcTo(2.48f, 2.48f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9f, 10f)
                curveTo(9f, 11.08f, 8.31f, 12f, 7.5f, 12f)
                close()
                moveTo(8f, 16f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(2f)
                lineTo(8f, 18f)
                close()
                moveTo(12f, 0f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = false, 24f, 12f)
                arcTo(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 0f)
                close()
                moveTo(12f, 22f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = true, isPositiveArc = true, 22f, 12f)
                arcTo(10.01f, 10.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 22f)
                close()
            }
        }.also { _MehRollingEyes = it}
