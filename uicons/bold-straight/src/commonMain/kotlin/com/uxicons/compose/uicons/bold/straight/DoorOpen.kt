package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DoorOpen: ImageVector? = null

val Icons.Bs.DoorOpen: ImageVector
    get() = _DoorOpen ?: UXIcon(name = "DoorOpen") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 21f)
                lineTo(21f, 5.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                horizontalLineToRelative(-1.84f)
                curveToRelative(-0.22f, -0.46f, -0.54f, -0.87f, -0.94f, -1.21f)
                curveToRelative(-0.81f, -0.67f, -1.87f, -0.93f, -2.91f, -0.73f)
                lineTo(5.81f, 1.27f)
                curveToRelative(-1.63f, 0.33f, -2.81f, 1.77f, -2.81f, 3.43f)
                lineTo(3f, 21f)
                lineTo(0f, 21f)
                verticalLineToRelative(3f)
                lineTo(24f, 24f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-3f)
                close()
                moveTo(18f, 5.5f)
                verticalLineToRelative(15.5f)
                horizontalLineToRelative(-2f)
                lineTo(16f, 5f)
                horizontalLineToRelative(1.5f)
                curveToRelative(0.28f, 0f, 0.5f, 0.23f, 0.5f, 0.5f)
                close()
                moveTo(6f, 4.7f)
                curveToRelative(0f, -0.24f, 0.17f, -0.44f, 0.4f, -0.49f)
                lineToRelative(6f, -1.2f)
                curveToRelative(0.2f, -0.04f, 0.35f, 0.05f, 0.41f, 0.1f)
                curveToRelative(0.07f, 0.06f, 0.18f, 0.18f, 0.18f, 0.39f)
                lineTo(13f, 21f)
                lineTo(6f, 21f)
                lineTo(6f, 4.7f)
                close()
                moveTo(12f, 12.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                close()
            }
        }.also { _DoorOpen = it}
