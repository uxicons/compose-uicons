package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ParkingSlash: ImageVector? = null

val Icons.Ts.ParkingSlash: ImageVector
    get() = _ParkingSlash ?: UXIcon(name = "ParkingSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.5f, 0f)
                lineTo(2.5f, 0f)
                curveTo(1.12f, 0f, 0f, 1.12f, 0f, 2.5f)
                lineTo(0f, 24f)
                lineTo(24f, 24f)
                lineTo(24f, 2.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(21.5f, 1f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                lineTo(23f, 22.29f)
                lineTo(14.58f, 13.87f)
                curveToRelative(1.96f, -0.48f, 3.42f, -2.26f, 3.42f, -4.37f)
                curveToRelative(0f, -2.48f, -2.02f, -4.5f, -4.5f, -4.5f)
                horizontalLineToRelative(-4f)
                curveToRelative(-1.02f, 0f, -1.91f, 0.62f, -2.29f, 1.5f)
                lineTo(1.85f, 1.15f)
                curveToRelative(0.2f, -0.09f, 0.41f, -0.15f, 0.65f, -0.15f)
                lineTo(21.5f, 1f)
                close()
                moveTo(8.01f, 7.31f)
                curveToRelative(0.1f, -0.74f, 0.73f, -1.31f, 1.49f, -1.31f)
                horizontalLineToRelative(4f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                curveToRelative(0f, 1.86f, -1.46f, 3.39f, -3.3f, 3.49f)
                lineToRelative(-5.69f, -5.69f)
                close()
                moveTo(1f, 2.5f)
                curveToRelative(0f, -0.23f, 0.05f, -0.45f, 0.15f, -0.65f)
                lineTo(22.29f, 23f)
                lineTo(1f, 23f)
                lineTo(1f, 2.5f)
                close()
                moveTo(10.46f, 14f)
                horizontalLineToRelative(-2.46f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-1f)
                lineTo(7f, 10.54f)
                lineToRelative(1f, 1f)
                verticalLineToRelative(1.47f)
                horizontalLineToRelative(1.47f)
                lineToRelative(1f, 1f)
                close()
            }
        }.also { _ParkingSlash = it}
