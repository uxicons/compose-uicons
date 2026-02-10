package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BootHeeled: ImageVector? = null

val Icons.Sr.BootHeeled: ImageVector
    get() = _BootHeeled ?: UXIcon(name = "BootHeeled") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 21f)
                curveToRelative(0f, 1.66f, -1.34f, 3f, -3f, 3f)
                horizontalLineToRelative(-5.78f)
                curveToRelative(-1.33f, 0f, -2.6f, -0.53f, -3.54f, -1.47f)
                lineToRelative(-2.36f, -2.36f)
                curveToRelative(-0.75f, -0.75f, -1.77f, -1.17f, -2.83f, -1.17f)
                lineTo(0f, 19.0f)
                lineTo(0f, 6.2f)
                curveTo(0f, 3.8f, 1.7f, 1.75f, 4.05f, 1.29f)
                lineToRelative(1.95f, -0.38f)
                verticalLineToRelative(9.09f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                lineTo(8f, 0.52f)
                lineToRelative(2.36f, -0.46f)
                curveToRelative(0.87f, -0.19f, 1.84f, 0.03f, 2.56f, 0.61f)
                curveToRelative(0.7f, 0.56f, 1.08f, 1.39f, 1.08f, 2.33f)
                verticalLineToRelative(8.05f)
                curveToRelative(0f, 0.76f, 0.43f, 1.45f, 1.11f, 1.79f)
                lineToRelative(5.58f, 2.79f)
                curveToRelative(2.03f, 1.02f, 3.32f, 3.09f, 3.32f, 5.37f)
                close()
                moveTo(6.49f, 21f)
                lineTo(0f, 21f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(5f)
                curveToRelative(0.9f, 0f, 1.65f, -0.6f, 1.9f, -1.42f)
                lineToRelative(-1.0f, -1.0f)
                curveToRelative(-0.38f, -0.38f, -0.88f, -0.59f, -1.42f, -0.59f)
                close()
            }
        }.also { _BootHeeled = it}
