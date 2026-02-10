package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Narwhal: ImageVector? = null

val Icons.Bs.Narwhal: ImageVector
    get() = _Narwhal ?: UXIcon(name = "Narwhal") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16f, 16.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                close()
                moveTo(21.39f, 10.09f)
                lineTo(24f, 0.53f)
                lineToRelative(-0.9f, -0.53f)
                lineToRelative(-4.89f, 8.31f)
                curveToRelative(-0.7f, -0.2f, -1.43f, -0.31f, -2.19f, -0.31f)
                lineToRelative(-1.51f, -0.0f)
                verticalLineToRelative(0.0f)
                lineToRelative(-0.0f, -0.0f)
                curveToRelative(-3.38f, 0f, -7.18f, 2.85f, -9.5f, 4.93f)
                verticalLineToRelative(3.99f)
                lineToRelative(0.1f, 0.09f)
                curveToRelative(1.55f, -1.67f, 6.25f, -6.02f, 9.4f, -6.02f)
                lineToRelative(1.51f, 0.0f)
                curveToRelative(2.75f, 0.0f, 4.99f, 2.25f, 4.99f, 5.0f)
                reflectiveCurveToRelative(-2.24f, 5.0f, -5.0f, 5.0f)
                lineTo(6.5f, 21f)
                curveToRelative(-1.93f, 0f, -3.5f, -1.57f, -3.5f, -3.5f)
                verticalLineToRelative(-3.97f)
                curveToRelative(0f, -1.68f, 0.49f, -3.31f, 1.43f, -4.71f)
                lineToRelative(2.28f, -3.42f)
                curveToRelative(2.46f, -0.56f, 4.29f, -2.77f, 4.29f, -5.39f)
                curveToRelative(-4.17f, 0f, -5.5f, 2.78f, -5.5f, 2.78f)
                curveToRelative(0f, 0f, -1.38f, -2.78f, -5.5f, -2.78f)
                curveToRelative(0f, 2.26f, 1.36f, 4.22f, 3.32f, 5.07f)
                lineToRelative(-1.39f, 2.08f)
                curveToRelative(-1.26f, 1.9f, -1.93f, 4.1f, -1.93f, 6.38f)
                verticalLineToRelative(3.97f)
                curveToRelative(0f, 3.58f, 2.92f, 6.5f, 6.5f, 6.5f)
                horizontalLineToRelative(9.5f)
                curveToRelative(4.41f, 0f, 8.0f, -3.59f, 8.0f, -8.0f)
                curveToRelative(0f, -2.34f, -1.01f, -4.45f, -2.62f, -5.91f)
                close()
            }
        }.also { _Narwhal = it}
