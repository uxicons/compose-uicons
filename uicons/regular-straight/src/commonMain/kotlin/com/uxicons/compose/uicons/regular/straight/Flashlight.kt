package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Flashlight: ImageVector? = null

val Icons.Rs.Flashlight: ImageVector
    get() = _Flashlight ?: UXIcon(name = "Flashlight") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.91f, 10.5f)
                lineTo(13.5f, 0.09f)
                lineToRelative(-3.5f, 3.5f)
                verticalLineToRelative(4.92f)
                lineTo(0.88f, 17.63f)
                curveToRelative(-1.17f, 1.17f, -1.17f, 3.07f, 0f, 4.24f)
                lineToRelative(1.25f, 1.25f)
                curveToRelative(0.57f, 0.57f, 1.32f, 0.88f, 2.12f, 0.88f)
                reflectiveCurveToRelative(1.55f, -0.31f, 2.12f, -0.88f)
                lineToRelative(9.12f, -9.12f)
                horizontalLineToRelative(4.92f)
                lineToRelative(3.5f, -3.5f)
                close()
                moveTo(4.96f, 21.71f)
                curveToRelative(-0.38f, 0.38f, -1.04f, 0.38f, -1.41f, 0f)
                lineToRelative(-1.25f, -1.25f)
                curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0f, -1.41f)
                lineToRelative(8.67f, -8.67f)
                lineToRelative(2.67f, 2.67f)
                lineToRelative(-8.67f, 8.67f)
                close()
                moveTo(15.41f, 12f)
                lineToRelative(-3.41f, -3.41f)
                verticalLineToRelative(-4.17f)
                lineToRelative(1.5f, -1.5f)
                lineToRelative(7.59f, 7.59f)
                lineToRelative(-1.5f, 1.5f)
                horizontalLineToRelative(-4.17f)
                close()
                moveTo(11.71f, 13.71f)
                lineToRelative(-2f, 2f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(2f, -2f)
                lineToRelative(1.41f, 1.41f)
                close()
            }
        }.also { _Flashlight = it}
