package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Kazoo: ImageVector? = null

val Icons.Ss.Kazoo: ImageVector
    get() = _Kazoo ?: UXIcon(name = "Kazoo") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(3.73f, 14.61f)
                lineToRelative(-3.73f, 3.73f)
                lineToRelative(5.66f, 5.66f)
                lineToRelative(3.73f, -3.73f)
                curveToRelative(-2.75f, -0.74f, -4.92f, -2.9f, -5.66f, -5.66f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.5f, 1.66f)
                lineToRelative(-1.16f, -1.16f)
                curveToRelative(-0.54f, -0.54f, -1.38f, -0.62f, -2.02f, -0.2f)
                lineToRelative(-6.15f, 4.74f)
                curveToRelative(2.22f, 0.81f, 3.99f, 2.57f, 4.79f, 4.79f)
                lineToRelative(4.73f, -6.15f)
                curveToRelative(0.42f, -0.64f, 0.34f, -1.48f, -0.2f, -2.02f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(11.45f, 18.55f)
                curveToRelative(3.31f, 0f, 6f, -2.69f, 6f, -6f)
                reflectiveCurveToRelative(-2.69f, -6f, -6f, -6f)
                reflectiveCurveToRelative(-6f, 2.69f, -6f, 6f)
                reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
                close()
                moveTo(10.45f, 15.55f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                reflectiveCurveToRelative(0f, -2f, 0f, -2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                reflectiveCurveToRelative(2f, 0f, 2f, 0f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                reflectiveCurveToRelative(0f, 2f, 0f, 2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                reflectiveCurveToRelative(-2f, 0f, -2f, 0f)
                close()
            }
        }.also { _Kazoo = it}
