package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DoorOpen: ImageVector? = null

val Icons.Tr.DoorOpen: ImageVector
    get() = _DoorOpen ?: UXIcon(name = "DoorOpen") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.5f, 23f)
                horizontalLineToRelative(-3.5f)
                lineTo(20f, 5.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                horizontalLineToRelative(-0.84f)
                curveToRelative(-0.22f, -0.46f, -0.54f, -0.87f, -0.94f, -1.21f)
                curveToRelative(-0.81f, -0.67f, -1.87f, -0.93f, -2.91f, -0.73f)
                lineTo(7.62f, 0.91f)
                curveToRelative(-2.1f, 0.42f, -3.62f, 2.27f, -3.62f, 4.41f)
                lineTo(4f, 23f)
                lineTo(0.5f, 23f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f)
                lineTo(23.5f, 24f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                reflectiveCurveToRelative(-0.22f, -0.5f, -0.5f, -0.5f)
                close()
                moveTo(16.5f, 3f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                lineTo(19f, 23f)
                horizontalLineToRelative(-3f)
                lineTo(16f, 3.5f)
                curveToRelative(0f, -0.17f, -0.01f, -0.34f, -0.04f, -0.5f)
                horizontalLineToRelative(0.54f)
                close()
                moveTo(5f, 5.32f)
                curveToRelative(0f, -1.66f, 1.18f, -3.11f, 2.81f, -3.43f)
                lineToRelative(4.2f, -0.84f)
                curveToRelative(0.73f, -0.15f, 1.49f, 0.04f, 2.08f, 0.52f)
                curveToRelative(0.58f, 0.48f, 0.92f, 1.18f, 0.92f, 1.93f)
                lineTo(15f, 23f)
                lineTo(5f, 23f)
                lineTo(5f, 5.32f)
                close()
                moveTo(13f, 12f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                close()
            }
        }.also { _DoorOpen = it}
