package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HouseFlag: ImageVector? = null

val Icons.Ss.HouseFlag: ImageVector
    get() = _HouseFlag ?: UXIcon(name = "HouseFlag") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 10.07f)
                verticalLineToRelative(13.93f)
                horizontalLineToRelative(-7f)
                verticalLineToRelative(-6.95f)
                lineToRelative(6.92f, -3.49f)
                lineToRelative(-6.02f, -4.35f)
                curveToRelative(-0.63f, -0.31f, -1.35f, -0.28f, -1.95f, 0.09f)
                curveToRelative(-0.59f, 0.37f, -0.95f, 1.0f, -0.95f, 1.7f)
                verticalLineToRelative(13.0f)
                lineTo(0f, 24f)
                verticalLineToRelative(-13.93f)
                curveToRelative(0f, -0.96f, 0.43f, -1.85f, 1.19f, -2.44f)
                lineTo(10.09f, 0.66f)
                curveToRelative(1.12f, -0.88f, 2.69f, -0.88f, 3.82f, 0f)
                lineToRelative(8.9f, 6.98f)
                curveToRelative(0.75f, 0.59f, 1.19f, 1.48f, 1.19f, 2.44f)
                close()
                moveTo(17.0f, 11.04f)
                verticalLineToRelative(3.77f)
                reflectiveCurveToRelative(3.08f, -1.55f, 3.08f, -1.55f)
                lineToRelative(-3.08f, -2.22f)
            }
        }.also { _HouseFlag = it}
