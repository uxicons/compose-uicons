package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Surfing: ImageVector? = null

val Icons.Rs.Surfing: ImageVector
    get() = _Surfing ?: UXIcon(name = "Surfing") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.12f, 0.88f)
                arcToRelative(2.96f, 2.96f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.4f, -0.86f)
                curveToRelative(-2.27f, 0.22f, -8.01f, 1.2f, -12.26f, 5.45f)
                arcToRelative(34.9f, 34.9f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8.22f, 13.05f)
                lineToRelative(-0.24f, 0.61f)
                lineToRelative(4.86f, 4.86f)
                lineToRelative(0.61f, -0.24f)
                arcToRelative(34.98f, 34.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13.07f, -8.2f)
                curveToRelative(4.25f, -4.25f, 5.22f, -9.99f, 5.45f, -12.26f)
                arcToRelative(2.97f, 2.97f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.86f, -2.4f)
                close()
                moveTo(17.12f, 14.12f)
                arcToRelative(32.13f, 32.13f, 0f, isMoreThanHalf = false, isPositiveArc = true, -11.78f, 7.51f)
                lineToRelative(-0.79f, -0.79f)
                lineToRelative(12.14f, -12.14f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(-12.14f, 12.14f)
                lineToRelative(-0.8f, -0.8f)
                arcToRelative(32.54f, 32.54f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.53f, -11.76f)
                curveToRelative(3.79f, -3.79f, 8.99f, -4.67f, 11.04f, -4.87f)
                arcToRelative(0.99f, 0.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.79f, 0.28f)
                arcToRelative(0.98f, 0.98f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.29f, 0.79f)
                curveToRelative(-0.21f, 2.06f, -1.08f, 7.25f, -4.88f, 11.04f)
                close()
            }
        }.also { _Surfing = it}
