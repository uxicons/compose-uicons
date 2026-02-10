package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LandMineOn: ImageVector? = null

val Icons.Bs.LandMineOn: ImageVector
    get() = _LandMineOn ?: UXIcon(name = "LandMineOn") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.8f, 21f)
                lineToRelative(-0.57f, -4.0f)
                curveToRelative(-0.24f, -1.71f, -1.73f, -3.0f, -3.46f, -3.0f)
                horizontalLineToRelative(-1.77f)
                verticalLineToRelative(-2f)
                lineTo(7f, 12f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-1.77f)
                curveToRelative(-1.73f, 0f, -3.22f, 1.29f, -3.46f, 3.0f)
                lineToRelative(-0.57f, 4.0f)
                lineTo(0f, 21f)
                verticalLineToRelative(3f)
                lineTo(24f, 24f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-1.2f)
                close()
                moveTo(4.74f, 17.43f)
                curveToRelative(0.03f, -0.24f, 0.25f, -0.43f, 0.49f, -0.43f)
                horizontalLineToRelative(13.53f)
                curveToRelative(0.25f, 0f, 0.46f, 0.18f, 0.49f, 0.43f)
                lineToRelative(0.51f, 3.57f)
                lineTo(4.23f, 21f)
                lineToRelative(0.51f, -3.57f)
                close()
                moveTo(13.5f, 7f)
                horizontalLineToRelative(-3f)
                lineTo(10.5f, 0f)
                horizontalLineToRelative(3f)
                lineTo(13.5f, 7f)
                close()
                moveTo(18.56f, 9.56f)
                lineToRelative(-2.12f, -2.12f)
                lineToRelative(5f, -5f)
                lineToRelative(2.12f, 2.12f)
                lineToRelative(-5f, 5f)
                close()
                moveTo(5.44f, 9.56f)
                lineTo(0.44f, 4.56f)
                lineTo(2.56f, 2.44f)
                lineTo(7.56f, 7.44f)
                lineToRelative(-2.12f, 2.12f)
                close()
            }
        }.also { _LandMineOn = it}
