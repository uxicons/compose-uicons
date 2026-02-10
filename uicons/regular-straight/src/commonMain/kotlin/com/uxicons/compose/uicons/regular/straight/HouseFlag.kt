package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HouseFlag: ImageVector? = null

val Icons.Rs.HouseFlag: ImageVector
    get() = _HouseFlag ?: UXIcon(name = "HouseFlag") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 10.07f)
                verticalLineToRelative(1.08f)
                lineTo(12.67f, 2.23f)
                curveToRelative(-0.4f, -0.31f, -0.95f, -0.31f, -1.35f, 0f)
                lineTo(2.42f, 9.21f)
                curveToRelative(-0.26f, 0.21f, -0.42f, 0.53f, -0.42f, 0.86f)
                verticalLineToRelative(11.93f)
                horizontalLineToRelative(11f)
                verticalLineToRelative(2f)
                lineTo(0f, 24f)
                verticalLineToRelative(-13.93f)
                curveToRelative(0f, -0.96f, 0.43f, -1.85f, 1.19f, -2.44f)
                lineTo(10.09f, 0.66f)
                curveToRelative(1.12f, -0.88f, 2.69f, -0.88f, 3.82f, 0f)
                lineToRelative(8.9f, 6.98f)
                curveToRelative(0.75f, 0.59f, 1.19f, 1.48f, 1.19f, 2.44f)
                close()
                moveTo(22f, 22f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-8.24f)
                lineToRelative(-2f, 1.01f)
                verticalLineToRelative(5.23f)
                close()
                moveTo(23.91f, 13.56f)
                lineToRelative(-6.92f, 3.49f)
                verticalLineToRelative(6.95f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-13.0f)
                curveToRelative(0f, -0.7f, 0.35f, -1.33f, 0.95f, -1.7f)
                curveToRelative(0.59f, -0.37f, 1.32f, -0.4f, 1.95f, -0.09f)
                lineToRelative(6.02f, 4.35f)
                close()
                moveTo(17f, 14.81f)
                lineToRelative(3.08f, -1.56f)
                lineToRelative(-3.08f, -2.23f)
                verticalLineToRelative(3.79f)
                close()
            }
        }.also { _HouseFlag = it}
