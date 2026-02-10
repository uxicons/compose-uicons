package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Surfing: ImageVector? = null

val Icons.Ss.Surfing: ImageVector
    get() = _Surfing ?: UXIcon(name = "Surfing") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.12f, 0.88f)
                arcToRelative(2.96f, 2.96f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.4f, -0.86f)
                curveToRelative(-2.27f, 0.22f, -8.01f, 1.2f, -12.26f, 5.45f)
                arcToRelative(34.76f, 34.76f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8.22f, 13.08f)
                lineToRelative(-0.24f, 0.61f)
                lineToRelative(1.72f, 1.72f)
                lineToRelative(13.87f, -13.87f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(-13.87f, 13.87f)
                lineToRelative(1.72f, 1.72f)
                lineToRelative(0.61f, -0.24f)
                arcToRelative(34.75f, 34.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13.08f, -8.22f)
                curveToRelative(4.25f, -4.25f, 5.22f, -9.99f, 5.45f, -12.26f)
                arcToRelative(2.97f, 2.97f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.86f, -2.4f)
                close()
            }
        }.also { _Surfing = it}
