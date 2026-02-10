package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Flashlight: ImageVector? = null

val Icons.Bs.Flashlight: ImageVector
    get() = _Flashlight ?: UXIcon(name = "Flashlight") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.93f, 11.19f)
                lineTo(12.81f, 0.07f)
                lineToRelative(-3.81f, 3.81f)
                verticalLineToRelative(4.72f)
                lineTo(0.96f, 16.77f)
                curveToRelative(-1.36f, 1.36f, -1.36f, 3.58f, 0f, 4.95f)
                lineToRelative(1.25f, 1.25f)
                curveToRelative(0.68f, 0.68f, 1.58f, 1.02f, 2.47f, 1.02f)
                reflectiveCurveToRelative(1.8f, -0.34f, 2.49f, -1.03f)
                lineToRelative(7.84f, -7.97f)
                horizontalLineToRelative(5.12f)
                lineToRelative(3.81f, -3.81f)
                close()
                moveTo(12.32f, 13.45f)
                lineToRelative(-1.62f, 1.64f)
                lineToRelative(-1.96f, -1.96f)
                lineToRelative(1.62f, -1.64f)
                lineToRelative(1.96f, 1.96f)
                close()
                moveTo(5.04f, 20.85f)
                curveToRelative(-0.2f, 0.2f, -0.51f, 0.2f, -0.71f, 0f)
                lineToRelative(-1.25f, -1.25f)
                curveToRelative(-0.2f, -0.2f, -0.2f, -0.51f, 0.01f, -0.72f)
                lineToRelative(3.56f, -3.62f)
                lineToRelative(1.96f, 1.96f)
                lineToRelative(-3.57f, 3.63f)
                close()
                moveTo(18.88f, 12.0f)
                horizontalLineToRelative(-3.76f)
                lineToRelative(-3.12f, -3.12f)
                verticalLineToRelative(-3.76f)
                lineToRelative(0.81f, -0.81f)
                lineToRelative(6.88f, 6.88f)
                lineToRelative(-0.81f, 0.81f)
                close()
            }
        }.also { _Flashlight = it}
