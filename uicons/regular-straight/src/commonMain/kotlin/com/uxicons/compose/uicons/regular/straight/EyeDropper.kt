package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _EyeDropper: ImageVector? = null

val Icons.Rs.EyeDropper: ImageVector
    get() = _EyeDropper ?: UXIcon(name = "EyeDropper") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.11f, 0.89f)
                arcToRelative(3.09f, 3.09f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.28f, 0f)
                lineToRelative(-3.41f, 3.41f)
                arcToRelative(3.46f, 3.46f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.84f, 0.07f)
                lineToRelative(-1.4f, 1.44f)
                lineToRelative(2.02f, 2.02f)
                lineToRelative(-9.2f, 9.2f)
                arcToRelative(3.46f, 3.46f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.59f, 4.13f)
                lineToRelative(-1.43f, 1.43f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(1.43f, -1.43f)
                arcToRelative(3.46f, 3.46f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.13f, -0.59f)
                lineToRelative(9.2f, -9.2f)
                lineToRelative(2.02f, 2.02f)
                lineToRelative(1.43f, -1.39f)
                arcToRelative(3.46f, 3.46f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.07f, -4.84f)
                lineToRelative(3.41f, -3.41f)
                arcToRelative(3.02f, 3.02f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -4.28f)
                close()
                moveTo(5.56f, 20.56f)
                arcToRelative(1.54f, 1.54f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.12f, 0f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -2.12f)
                lineToRelative(9.2f, -9.2f)
                lineToRelative(2.12f, 2.12f)
                close()
                moveTo(21.7f, 3.75f)
                lineTo(18.29f, 7.15f)
                arcToRelative(5.46f, 5.46f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.59f, 3.32f)
                lineToRelative(-3.18f, -3.18f)
                arcToRelative(5.46f, 5.46f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.32f, -1.59f)
                lineToRelative(3.41f, -3.41f)
                arcToRelative(1.04f, 1.04f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.45f, 0f)
                arcToRelative(1.02f, 1.02f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 1.45f)
                close()
            }
        }.also { _EyeDropper = it}
