package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DriverWoman: ImageVector? = null

val Icons.Bs.DriverWoman: ImageVector
    get() = _DriverWoman ?: UXIcon(name = "DriverWoman") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18f, 24f)
                horizontalLineToRelative(-3f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                reflectiveCurveToRelative(-3f, 1.35f, -3f, 3f)
                horizontalLineToRelative(-3f)
                curveToRelative(0f, -3.31f, 2.69f, -6f, 6f, -6f)
                reflectiveCurveToRelative(6f, 2.69f, 6f, 6f)
                close()
                moveTo(20.77f, 17.99f)
                curveToRelative(-0.67f, -2.35f, -2.85f, -3.99f, -5.29f, -3.99f)
                horizontalLineToRelative(-6.97f)
                curveToRelative(-2.44f, 0f, -4.62f, 1.64f, -5.29f, 3.99f)
                lineToRelative(-1.72f, 6.01f)
                horizontalLineToRelative(3.12f)
                lineToRelative(1.48f, -5.19f)
                curveToRelative(0.3f, -1.07f, 1.29f, -1.81f, 2.4f, -1.81f)
                horizontalLineToRelative(6.97f)
                curveToRelative(1.11f, 0f, 2.1f, 0.75f, 2.4f, 1.81f)
                lineToRelative(1.48f, 5.19f)
                horizontalLineToRelative(3.12f)
                lineToRelative(-1.72f, -6.01f)
                close()
                moveTo(12f, 12f)
                curveToRelative(0.84f, 0f, 1.63f, -0.18f, 2.35f, -0.49f)
                lineToRelative(-0.53f, -3.08f)
                curveToRelative(-0.5f, 0.4f, -1.26f, 0.58f, -1.83f, 0.58f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                curveToRelative(1.15f, 0f, 3.62f, -1.28f, 4.85f, -2.42f)
                curveToRelative(0.86f, 0.58f, 1.51f, 1.53f, 1.67f, 2.63f)
                lineToRelative(0.98f, 5.79f)
                curveToRelative(1.23f, 0.18f, 2.38f, 0.66f, 3.36f, 1.39f)
                curveToRelative(-0.0f, -0.01f, -1.39f, -7.65f, -1.39f, -7.65f)
                curveToRelative(-0.5f, -3.27f, -3.27f, -5.73f, -6.48f, -5.73f)
                reflectiveCurveToRelative(-5.98f, 2.46f, -6.48f, 5.73f)
                curveToRelative(0f, 0f, -1.38f, 7.62f, -1.38f, 7.65f)
                curveToRelative(0.98f, -0.72f, 2.13f, -1.2f, 3.36f, -1.38f)
                horizontalLineToRelative(4.5f)
                close()
            }
        }.also { _DriverWoman = it}
