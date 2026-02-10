package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DoorOpen: ImageVector? = null

val Icons.Ts.DoorOpen: ImageVector
    get() = _DoorOpen ?: UXIcon(name = "DoorOpen") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 23f)
                lineTo(20f, 4.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                horizontalLineToRelative(-1.55f)
                curveToRelative(-0.11f, -0.56f, -0.41f, -1.06f, -0.86f, -1.43f)
                curveTo(14.5f, 0.09f, 13.75f, -0.1f, 13.01f, 0.05f)
                lineTo(6.01f, 1.45f)
                curveToRelative(-1.17f, 0.23f, -2.01f, 1.26f, -2.01f, 2.45f)
                lineTo(4f, 23f)
                lineTo(0f, 23f)
                verticalLineToRelative(1f)
                lineTo(24f, 24f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-4f)
                close()
                moveTo(19f, 4.5f)
                lineTo(19f, 23f)
                horizontalLineToRelative(-3f)
                lineTo(16f, 3f)
                horizontalLineToRelative(1.5f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                close()
                moveTo(5f, 3.9f)
                curveToRelative(0f, -0.71f, 0.51f, -1.33f, 1.21f, -1.47f)
                lineToRelative(7f, -1.4f)
                curveToRelative(0.44f, -0.09f, 0.9f, 0.03f, 1.25f, 0.31f)
                reflectiveCurveToRelative(0.55f, 0.71f, 0.55f, 1.16f)
                lineTo(15f, 23f)
                lineTo(5f, 23f)
                lineTo(5f, 3.9f)
                close()
                moveTo(13f, 12f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                close()
            }
        }.also { _DoorOpen = it}
