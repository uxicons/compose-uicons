package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DoorHanger: ImageVector? = null

val Icons.Ss.DoorHanger: ImageVector
    get() = _DoorHanger ?: UXIcon(name = "DoorHanger") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 0f)
                curveToRelative(-3.43f, 0f, -6.33f, 2.45f, -6.9f, 5.83f)
                lineToRelative(-0.2f, 1.17f)
                horizontalLineToRelative(5.09f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
                horizontalLineToRelative(-4f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(12f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(-17f)
                curveToRelative(0f, -3.86f, -3.14f, -7f, -7f, -7f)
                close()
            }
        }.also { _DoorHanger = it}
