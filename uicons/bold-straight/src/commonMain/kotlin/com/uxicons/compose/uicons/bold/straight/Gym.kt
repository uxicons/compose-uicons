package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Gym: ImageVector? = null

val Icons.Bs.Gym: ImageVector
    get() = _Gym ?: UXIcon(name = "Gym") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.98f, 7.27f)
                lineToRelative(-2.06f, -2.06f)
                lineToRelative(2.15f, -2.15f)
                lineToRelative(-2.12f, -2.12f)
                lineToRelative(-2.15f, 2.15f)
                lineToRelative(-2.06f, -2.06f)
                arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.95f, 0f)
                lineToRelative(-3.18f, 3.18f)
                lineToRelative(4.54f, 4.54f)
                lineToRelative(-4.41f, 4.41f)
                lineToRelative(-4.52f, -4.52f)
                lineToRelative(-3.18f, 3.18f)
                arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 4.95f)
                lineToRelative(2.05f, 2.05f)
                lineToRelative(-2.13f, 2.13f)
                lineToRelative(2.12f, 2.12f)
                lineToRelative(2.13f, -2.13f)
                lineToRelative(2.08f, 2.07f)
                arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.95f, 0f)
                lineToRelative(3.18f, -3.18f)
                lineToRelative(-4.55f, -4.55f)
                lineToRelative(4.41f, -4.41f)
                lineToRelative(4.54f, 4.54f)
                lineToRelative(3.18f, -3.18f)
                arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -4.95f)
                close()
                moveTo(10.1f, 20.88f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.71f, 0f)
                lineToRelative(-6.25f, -6.24f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -0.71f)
                lineToRelative(1.06f, -1.06f)
                lineToRelative(6.95f, 6.95f)
                close()
                moveTo(20.85f, 10.1f)
                lineTo(19.79f, 11.16f)
                lineTo(12.84f, 4.21f)
                lineTo(13.9f, 3.15f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.71f, 0f)
                lineToRelative(6.25f, 6.24f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 0.71f)
                close()
            }
        }.also { _Gym = it}
