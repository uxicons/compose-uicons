package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Tired: ImageVector? = null

val Icons.Bs.Tired: ImageVector
    get() = _Tired ?: UXIcon(name = "Tired") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 18f)
                arcToRelative(16.35f, 16.35f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5f, -1f)
                arcToRelative(16.35f, 16.35f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5f, 1f)
                arcToRelative(5.42f, 5.42f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.01f, -4f)
                arcTo(5.41f, 5.41f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17f, 18f)
                close()
                moveTo(24f, 12f)
                arcTo(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 24f)
                curveTo(-3.9f, 23.4f, -3.89f, 0.6f, 12f, 0f)
                arcTo(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 12f)
                close()
                moveTo(21f, 12f)
                arcToRelative(9.01f, 9.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, -9f, -9f)
                curveTo(0.08f, 3.45f, 0.08f, 20.55f, 12f, 21f)
                arcTo(9.01f, 9.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 12f)
                close()
                moveTo(13f, 10f)
                curveToRelative(0f, 2.27f, 3.37f, 3f, 5f, 3f)
                curveToRelative(-2.61f, -2.76f, -2.59f, -3.25f, 0f, -6f)
                curveTo(16.37f, 7f, 13f, 7.73f, 13f, 10f)
                close()
                moveTo(11f, 10f)
                curveToRelative(0f, -2.27f, -3.37f, -3f, -5f, -3f)
                curveToRelative(2.61f, 2.76f, 2.59f, 3.25f, 0f, 6f)
                curveTo(7.63f, 13f, 11f, 12.27f, 11f, 10f)
                close()
            }
        }.also { _Tired = it}
