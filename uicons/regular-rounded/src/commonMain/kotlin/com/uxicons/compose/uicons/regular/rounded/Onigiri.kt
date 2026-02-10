package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Onigiri: ImageVector? = null

val Icons.Rr.Onigiri: ImageVector
    get() = _Onigiri ?: UXIcon(name = "Onigiri") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.15f, 15.2f)
                reflectiveCurveToRelative(-7.0f, -11.76f, -7.0f, -11.76f)
                curveToRelative(-0.92f, -1.55f, -2.45f, -2.43f, -4.19f, -2.43f)
                curveToRelative(-1.76f, 0f, -3.29f, 0.89f, -4.21f, 2.43f)
                lineToRelative(-7f, 11.76f)
                curveToRelative(-0.95f, 1.59f, -0.99f, 3.52f, -0.12f, 5.16f)
                curveToRelative(0.88f, 1.66f, 2.5f, 2.65f, 4.33f, 2.65f)
                horizontalLineToRelative(13.99f)
                curveToRelative(1.78f, 0f, 3.7f, -1.25f, 4.55f, -2.97f)
                curveToRelative(0.77f, -1.56f, 0.66f, -3.14f, -0.35f, -4.83f)
                close()
                moveTo(15.95f, 21f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                horizontalLineToRelative(4f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                close()
                moveTo(21.7f, 19.14f)
                curveToRelative(-0.52f, 1.04f, -1.73f, 1.86f, -2.76f, 1.86f)
                horizontalLineToRelative(-0.99f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                horizontalLineToRelative(-4f)
                curveToRelative(-2.21f, 0f, -4f, 1.79f, -4f, 4f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(-1.08f, 0f, -2.04f, -0.59f, -2.56f, -1.59f)
                curveToRelative(-0.54f, -1.02f, -0.51f, -2.21f, 0.07f, -3.19f)
                lineToRelative(7f, -11.76f)
                curveToRelative(0.56f, -0.94f, 1.45f, -1.46f, 2.5f, -1.46f)
                reflectiveCurveToRelative(1.91f, 0.5f, 2.47f, 1.46f)
                lineToRelative(7.0f, 11.76f)
                curveToRelative(0.66f, 1.11f, 0.74f, 1.98f, 0.27f, 2.92f)
                close()
            }
        }.also { _Onigiri = it}
