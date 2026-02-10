package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Narwhal: ImageVector? = null

val Icons.Ss.Narwhal: ImageVector
    get() = _Narwhal ?: UXIcon(name = "Narwhal") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.39f, 10.09f)
                lineTo(24f, 0.53f)
                lineToRelative(-0.9f, -0.53f)
                lineToRelative(-4.89f, 8.31f)
                curveToRelative(-0.7f, -0.2f, -1.44f, -0.31f, -2.21f, -0.31f)
                curveToRelative(-0.99f, 0f, -1.68f, 0f, -1.69f, 0.0f)
                curveToRelative(0f, 0f, -0.0f, 0f, -0.0f, 0f)
                curveToRelative(-4.24f, 0.11f, -8.6f, 3.62f, -10.3f, 5.36f)
                verticalLineToRelative(-2.78f)
                curveToRelative(0.66f, -0.59f, 1.43f, -1.2f, 2.3f, -1.78f)
                curveToRelative(0.03f, -0.23f, 0.07f, -0.46f, 0.11f, -0.68f)
                lineToRelative(0.47f, -2.77f)
                curveToRelative(2.37f, -0.61f, 4.13f, -2.79f, 4.13f, -5.35f)
                curveToRelative(-4.17f, 0f, -5.5f, 2.78f, -5.5f, 2.78f)
                curveToRelative(0f, 0f, -1.38f, -2.78f, -5.5f, -2.78f)
                curveToRelative(0f, 2.28f, 1.39f, 4.25f, 3.36f, 5.09f)
                lineToRelative(-0.5f, 0.75f)
                curveTo(0.99f, 8.64f, 0f, 11.92f, 0f, 15.28f)
                verticalLineToRelative(2.72f)
                curveToRelative(0f, 3.31f, 2.69f, 6f, 6f, 6f)
                horizontalLineToRelative(10.0f)
                curveToRelative(4.42f, 0f, 8.0f, -3.58f, 8.0f, -8.0f)
                curveToRelative(0f, -2.34f, -1.01f, -4.45f, -2.61f, -5.91f)
                close()
                moveTo(17.5f, 18f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
            }
        }.also { _Narwhal = it}
