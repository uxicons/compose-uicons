package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _EyeDropper: ImageVector? = null

val Icons.Rr.EyeDropper: ImageVector
    get() = _EyeDropper ?: UXIcon(name = "EyeDropper") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.11f, 5.17f)
                arcToRelative(3.02f, 3.02f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -4.28f)
                arcToRelative(3.09f, 3.09f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.28f, 0f)
                lineToRelative(-2.44f, 2.44f)
                curveToRelative(-1.01f, 1.01f, -3.12f, 0.79f, -4.58f, -0.01f)
                arcToRelative(2.6f, 2.6f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.06f, 4.14f)
                lineToRelative(1.42f, 1.42f)
                lineToRelative(-8.15f, 8.15f)
                arcToRelative(3.46f, 3.46f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.59f, 4.13f)
                lineToRelative(-1.14f, 1.14f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 1.41f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.41f, 0f)
                lineToRelative(1.14f, -1.14f)
                arcToRelative(3.46f, 3.46f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.13f, -0.59f)
                lineToRelative(8.15f, -8.15f)
                lineToRelative(1.42f, 1.42f)
                arcToRelative(2.6f, 2.6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.14f, -3.06f)
                curveToRelative(-0.8f, -1.46f, -1.02f, -3.57f, -0.01f, -4.58f)
                close()
                moveTo(5.56f, 20.56f)
                arcToRelative(1.54f, 1.54f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.12f, 0f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -2.12f)
                lineToRelative(8.15f, -8.15f)
                lineToRelative(2.12f, 2.12f)
                close()
                moveTo(19.26f, 6.18f)
                curveToRelative(-1.76f, 1.76f, -1.5f, 4.83f, -0.33f, 6.96f)
                arcToRelative(0.58f, 0.58f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.12f, 0.68f)
                arcToRelative(0.62f, 0.62f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.86f, 0f)
                lineToRelative(-7.78f, -7.78f)
                arcToRelative(0.61f, 0.61f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.43f, -1.04f)
                arcToRelative(0.52f, 0.52f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.25f, 0.06f)
                curveToRelative(2.13f, 1.17f, 5.2f, 1.43f, 6.96f, -0.33f)
                lineToRelative(2.44f, -2.44f)
                arcToRelative(1.04f, 1.04f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.45f, 0f)
                arcToRelative(1.02f, 1.02f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 1.45f)
                close()
            }
        }.also { _EyeDropper = it}
