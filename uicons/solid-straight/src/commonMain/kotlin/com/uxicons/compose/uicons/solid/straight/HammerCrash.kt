package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HammerCrash: ImageVector? = null

val Icons.Ss.HammerCrash: ImageVector
    get() = _HammerCrash ?: UXIcon(name = "HammerCrash") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 5f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-3f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.21f, 13.75f)
                lineToRelative(1.57f, -1.23f)
                lineToRelative(1.85f, 2.36f)
                lineToRelative(-1.57f, 1.23f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.89f, 10.9f)
                lineToRelative(0.98f, -1.74f)
                lineToRelative(2.62f, 1.47f)
                lineToRelative(-0.98f, 1.74f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(5.99f, 9.39f)
                lineToRelative(-5.99f, 11.87f)
                lineToRelative(5.4f, 2.74f)
                lineToRelative(5.99f, -11.87f)
                lineToRelative(-5.4f, -2.74f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.7f, 10.84f)
                lineToRelative(1.58f, -3.12f)
                curveToRelative(0.5f, -0.98f, 0.1f, -2.19f, -0.88f, -2.69f)
                lineTo(9.86f, 0.7f)
                curveTo(6.67f, -0.92f, 2.75f, 0.36f, 1.13f, 3.56f)
                lineToRelative(-0.45f, 0.89f)
                lineToRelative(14.34f, 7.27f)
                curveToRelative(0.29f, 0.15f, 0.6f, 0.22f, 0.9f, 0.22f)
                curveToRelative(0.73f, 0f, 1.44f, -0.4f, 1.79f, -1.09f)
                close()
            }
        }.also { _HammerCrash = it}
