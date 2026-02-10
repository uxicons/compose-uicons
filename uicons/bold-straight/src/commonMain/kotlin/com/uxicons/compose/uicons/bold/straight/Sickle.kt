package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Sickle: ImageVector? = null

val Icons.Bs.Sickle: ImageVector
    get() = _Sickle ?: UXIcon(name = "Sickle") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12.5f, 0f)
                curveTo(6.71f, 0f, 2f, 4.71f, 2f, 10.5f)
                curveToRelative(0f, 2.76f, 1.12f, 5.4f, 3.03f, 7.35f)
                lineToRelative(-4.03f, 4.03f)
                lineToRelative(2.12f, 2.12f)
                lineToRelative(7.0f, -7.0f)
                reflectiveCurveToRelative(-1.12f, -1.5f, -1.12f, -3.5f)
                curveToRelative(0f, -3.03f, 2.47f, -5.5f, 5.5f, -5.5f)
                curveToRelative(2.43f, 0f, 4.54f, 1.58f, 5.25f, 3.93f)
                lineToRelative(0.32f, 1.07f)
                horizontalLineToRelative(2.73f)
                reflectiveCurveToRelative(0.21f, -1.5f, 0.21f, -2.5f)
                curveToRelative(0f, -5.79f, -4.71f, -10.5f, -10.5f, -10.5f)
                close()
                moveTo(14.5f, 5f)
                curveToRelative(-4.69f, 0f, -8.5f, 3.81f, -8.5f, 8.5f)
                curveToRelative(0f, 0.27f, 0.01f, 0.53f, 0.04f, 0.79f)
                curveToRelative(-0.67f, -1.14f, -1.04f, -2.44f, -1.04f, -3.79f)
                curveToRelative(0f, -4.14f, 3.36f, -7.5f, 7.5f, -7.5f)
                curveToRelative(2.44f, 0f, 4.62f, 1.18f, 5.99f, 2.99f)
                curveToRelative(-1.2f, -0.64f, -2.56f, -0.99f, -3.99f, -0.99f)
                close()
            }
        }.also { _Sickle = it}
