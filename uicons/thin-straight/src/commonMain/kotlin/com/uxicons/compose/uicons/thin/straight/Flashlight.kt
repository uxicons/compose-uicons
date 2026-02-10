package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Flashlight: ImageVector? = null

val Icons.Ts.Flashlight: ImageVector
    get() = _Flashlight ?: UXIcon(name = "Flashlight") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(14.21f, 0.09f)
                lineToRelative(-3.21f, 3.21f)
                verticalLineToRelative(4.92f)
                lineTo(0.73f, 18.48f)
                curveToRelative(-0.97f, 0.97f, -0.97f, 2.56f, 0f, 3.54f)
                lineToRelative(1.25f, 1.25f)
                curveToRelative(0.47f, 0.47f, 1.1f, 0.73f, 1.77f, 0.73f)
                reflectiveCurveToRelative(1.3f, -0.26f, 1.77f, -0.73f)
                lineToRelative(10.27f, -10.27f)
                horizontalLineToRelative(4.92f)
                lineToRelative(3.21f, -3.21f)
                lineTo(14.21f, 0.09f)
                close()
                moveTo(4.81f, 22.56f)
                curveToRelative(-0.57f, 0.57f, -1.55f, 0.57f, -2.12f, 0f)
                lineToRelative(-1.25f, -1.25f)
                curveToRelative(-0.58f, -0.58f, -0.58f, -1.54f, 0f, -2.12f)
                lineToRelative(10.02f, -10.02f)
                lineToRelative(3.37f, 3.37f)
                lineToRelative(-10.02f, 10.02f)
                close()
                moveTo(20.29f, 12f)
                horizontalLineToRelative(-4.59f)
                lineToRelative(-3.71f, -3.71f)
                lineTo(12.0f, 3.71f)
                lineToRelative(2.21f, -2.21f)
                lineToRelative(8.29f, 8.29f)
                lineToRelative(-2.21f, 2.21f)
                close()
                moveTo(10.65f, 12.65f)
                lineToRelative(0.71f, 0.71f)
                lineToRelative(-2f, 2f)
                lineToRelative(-0.71f, -0.71f)
                lineToRelative(2f, -2f)
                close()
            }
        }.also { _Flashlight = it}
