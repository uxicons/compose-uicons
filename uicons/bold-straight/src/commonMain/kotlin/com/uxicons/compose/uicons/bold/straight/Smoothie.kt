package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Smoothie: ImageVector? = null

val Icons.Bs.Smoothie: ImageVector
    get() = _Smoothie ?: UXIcon(name = "Smoothie") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 8f)
                horizontalLineToRelative(-1.15f)
                curveToRelative(-0.61f, -3.21f, -3.15f, -5.74f, -6.35f, -6.35f)
                verticalLineToRelative(-1.65f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(1.65f)
                curveToRelative(-3.21f, 0.61f, -5.74f, 3.15f, -6.35f, 6.35f)
                horizontalLineToRelative(-1.15f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(1.11f)
                lineToRelative(1.0f, 13f)
                horizontalLineToRelative(13.78f)
                lineToRelative(1f, -13f)
                horizontalLineToRelative(1.11f)
                close()
                moveTo(16.75f, 8f)
                horizontalLineToRelative(-3.25f)
                verticalLineToRelative(-3.25f)
                curveToRelative(1.54f, 0.49f, 2.75f, 1.7f, 3.25f, 3.25f)
                close()
                moveTo(10.5f, 4.75f)
                verticalLineToRelative(3.25f)
                horizontalLineToRelative(-3.25f)
                curveToRelative(0.49f, -1.54f, 1.7f, -2.75f, 3.25f, -3.25f)
                close()
                moveTo(10.5f, 11f)
                verticalLineToRelative(3f)
                curveToRelative(-0.24f, -0.02f, -0.47f, -0.04f, -0.74f, -0.04f)
                curveToRelative(-0.95f, 0f, -1.74f, 0.15f, -2.38f, 0.36f)
                lineToRelative(-0.26f, -3.32f)
                close()
                moveTo(7.89f, 21f)
                lineTo(7.62f, 17.45f)
                curveToRelative(0.36f, -0.2f, 1.06f, -0.49f, 2.14f, -0.49f)
                curveToRelative(0.88f, 0f, 1.43f, 0.19f, 2.12f, 0.44f)
                curveToRelative(0.81f, 0.28f, 1.73f, 0.6f, 3.12f, 0.6f)
                curveToRelative(0.48f, 0f, 0.93f, -0.05f, 1.35f, -0.11f)
                lineToRelative(-0.24f, 3.11f)
                close()
                moveTo(16.59f, 14.78f)
                curveToRelative(-0.45f, 0.12f, -0.99f, 0.22f, -1.59f, 0.22f)
                reflectiveCurveToRelative(-1.05f, -0.09f, -1.5f, -0.23f)
                verticalLineToRelative(-3.77f)
                horizontalLineToRelative(3.38f)
                close()
            }
        }.also { _Smoothie = it}
