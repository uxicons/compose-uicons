package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HillRockslide: ImageVector? = null

val Icons.Bs.HillRockslide: ImageVector
    get() = _HillRockslide ?: UXIcon(name = "HillRockslide") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(0f, 20.5f)
                curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                horizontalLineToRelative(20.52f)
                lineToRelative(-24.02f, -24.02f)
                close()
                moveTo(3f, 7.22f)
                lineTo(16.78f, 21f)
                horizontalLineToRelative(-13.28f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.23f, -0.5f, -0.5f)
                close()
                moveTo(21.62f, 14f)
                lineTo(24.11f, 10.09f)
                lineTo(21.17f, 6f)
                horizontalLineToRelative(-3.47f)
                lineToRelative(-2.7f, 2.76f)
                verticalLineToRelative(2.78f)
                lineToRelative(2.39f, 2.45f)
                horizontalLineToRelative(4.23f)
                close()
                moveTo(18f, 9.99f)
                lineTo(18.96f, 9f)
                horizontalLineToRelative(0.67f)
                lineToRelative(0.86f, 1.19f)
                lineToRelative(-0.51f, 0.81f)
                horizontalLineToRelative(-1.32f)
                lineToRelative(-0.66f, -0.67f)
                close()
                moveTo(8.83f, 6f)
                lineTo(7f, 4.12f)
                verticalLineToRelative(-1.88f)
                lineToRelative(2.2f, -2.25f)
                horizontalLineToRelative(2.48f)
                lineToRelative(2.28f, 3.17f)
                lineToRelative(-1.8f, 2.83f)
                close()
                moveTo(18.22f, 4f)
                lineTo(17f, 2.75f)
                verticalLineToRelative(-1.25f)
                lineToRelative(1.46f, -1.5f)
                horizontalLineToRelative(1.66f)
                lineToRelative(1.52f, 2.11f)
                lineToRelative(-1.2f, 1.89f)
                close()
            }
        }.also { _HillRockslide = it}
