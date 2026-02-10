package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SkiBootSki: ImageVector? = null

val Icons.Rs.SkiBootSki: ImageVector
    get() = _SkiBootSki ?: UXIcon(name = "SkiBootSki") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 19f)
                curveToRelative(0f, 2.76f, -2.24f, 5f, -5f, 5f)
                lineTo(0f, 24f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(19f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                horizontalLineToRelative(2f)
                close()
                moveTo(19f, 20f)
                lineTo(0f, 20f)
                lineToRelative(0.02f, -2.89f)
                lineTo(3.56f, -0.0f)
                reflectiveCurveToRelative(9.6f, 0.03f, 10.27f, 0.03f)
                reflectiveCurveToRelative(0.89f, 0.32f, 0.89f, 0.32f)
                curveToRelative(0.26f, 0.26f, 0.37f, 0.64f, 0.29f, 1.0f)
                lineToRelative(-1.73f, 8.24f)
                lineToRelative(0.68f, 0.22f)
                curveToRelative(2.92f, 0.61f, 5.04f, 3.21f, 5.04f, 6.21f)
                verticalLineToRelative(3.99f)
                close()
                moveTo(17f, 16.01f)
                curveToRelative(0f, -2.06f, -1.47f, -3.85f, -3.49f, -4.26f)
                lineToRelative(-2.35f, -0.75f)
                horizontalLineToRelative(-3.15f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(3.36f)
                lineToRelative(0.42f, -2f)
                horizontalLineToRelative(-3.78f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(4.2f)
                lineToRelative(0.63f, -2.98f)
                lineToRelative(-7.64f, -0.02f)
                lineToRelative(-3.19f, 15.41f)
                verticalLineToRelative(0.58f)
                horizontalLineToRelative(15f)
                verticalLineToRelative(-1.99f)
                close()
                moveTo(5.5f, 13f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                close()
            }
        }.also { _SkiBootSki = it}
