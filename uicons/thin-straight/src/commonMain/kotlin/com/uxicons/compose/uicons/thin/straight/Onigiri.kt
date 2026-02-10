package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Onigiri: ImageVector? = null

val Icons.Ts.Onigiri: ImageVector
    get() = _Onigiri ?: UXIcon(name = "Onigiri") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.19f, 15.64f)
                lineToRelative(-7.32f, -12.35f)
                curveToRelative(-0.87f, -1.48f, -2.27f, -2.29f, -3.92f, -2.29f)
                curveToRelative(-1.64f, 0f, -3.08f, 0.83f, -3.94f, 2.29f)
                lineToRelative(-7.32f, 12.35f)
                curveToRelative(-0.89f, 1.5f, -0.93f, 3.32f, -0.11f, 4.87f)
                curveToRelative(0.82f, 1.56f, 2.34f, 2.49f, 4.05f, 2.49f)
                horizontalLineToRelative(14.62f)
                curveToRelative(1.67f, 0f, 3.47f, -1.18f, 4.28f, -2.81f)
                curveToRelative(0.72f, -1.46f, 0.61f, -2.94f, -0.34f, -4.55f)
                close()
                moveTo(16.95f, 22f)
                horizontalLineToRelative(-10f)
                verticalLineToRelative(-7f)
                horizontalLineToRelative(10f)
                close()
                moveTo(22.64f, 19.74f)
                curveToRelative(-0.64f, 1.29f, -2.09f, 2.26f, -3.38f, 2.26f)
                horizontalLineToRelative(-1.31f)
                verticalLineToRelative(-8f)
                horizontalLineToRelative(-12f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(-1.32f)
                curveToRelative(-1.33f, 0f, -2.51f, -0.73f, -3.16f, -1.96f)
                curveToRelative(-0.66f, -1.24f, -0.62f, -2.69f, 0.09f, -3.9f)
                lineToRelative(7.32f, -12.35f)
                curveToRelative(0.68f, -1.14f, 1.8f, -1.8f, 3.08f, -1.8f)
                reflectiveCurveToRelative(2.37f, 0.64f, 3.06f, 1.8f)
                lineToRelative(7.32f, 12.35f)
                curveToRelative(0.79f, 1.33f, 0.88f, 2.44f, 0.31f, 3.6f)
                close()
            }
        }.also { _Onigiri = it}
