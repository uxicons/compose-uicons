package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Bowling: ImageVector? = null

val Icons.Ss.Bowling: ImageVector
    get() = _Bowling ?: UXIcon(name = "Bowling") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16f, 8f)
                arcToRelative(7.96f, 7.96f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.55f, 1.43f)
                curveToRelative(0.18f, 0.39f, 0.38f, 0.78f, 0.58f, 1.18f)
                arcToRelative(13.58f, 13.58f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.96f, 6.38f)
                arcToRelative(12.79f, 12.79f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.51f, 6.2f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = false, 3.51f, -15.2f)
                close()
                moveTo(17f, 16f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1f, -1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, 1f)
                close()
                moveTo(19f, 13f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1f, -1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, 1f)
                close()
                moveTo(21f, 16f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1f, -1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, 1f)
                close()
                moveTo(10.26f, 11.54f)
                arcToRelative(11.78f, 11.78f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.74f, 5.46f)
                arcToRelative(9.73f, 9.73f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.29f, 6.71f)
                lineToRelative(-0.29f, 0.29f)
                horizontalLineToRelative(-6.83f)
                lineToRelative(-0.29f, -0.29f)
                arcToRelative(9.73f, 9.73f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.29f, -6.71f)
                arcToRelative(11.78f, 11.78f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.74f, -5.46f)
                curveToRelative(0.27f, -0.53f, 0.54f, -1.04f, 0.75f, -1.54f)
                horizontalLineToRelative(7.02f)
                curveToRelative(0.22f, 0.5f, 0.48f, 1.01f, 0.75f, 1.54f)
                close()
                moveTo(2.45f, 5.83f)
                arcToRelative(7.17f, 7.17f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.45f, -1.82f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 0f)
                arcToRelative(7.17f, 7.17f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.45f, 1.82f)
                arcToRelative(11.62f, 11.62f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.55f, 2.17f)
                horizontalLineToRelative(-6f)
                arcToRelative(11.62f, 11.62f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.55f, -2.17f)
                close()
            }
        }.also { _Bowling = it}
