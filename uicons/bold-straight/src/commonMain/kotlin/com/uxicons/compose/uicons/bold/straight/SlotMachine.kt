package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SlotMachine: ImageVector? = null

val Icons.Bs.SlotMachine: ImageVector
    get() = _SlotMachine ?: UXIcon(name = "SlotMachine") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 2.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.12f, -2.5f, 2.5f)
                curveToRelative(0f, 0.81f, 0.4f, 1.53f, 1f, 1.99f)
                verticalLineToRelative(6.01f)
                curveToRelative(0f, 0.28f, -0.23f, 0.5f, -0.5f, 0.5f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(-2f)
                curveTo(18f, 4.04f, 13.96f, 0f, 9f, 0f)
                reflectiveCurveTo(0f, 4.04f, 0f, 9f)
                verticalLineToRelative(15f)
                lineTo(18f, 24f)
                lineTo(18f, 14f)
                horizontalLineToRelative(1.5f)
                curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
                lineTo(23f, 4.49f)
                curveToRelative(0.6f, -0.46f, 1f, -1.17f, 1f, -1.99f)
                close()
                moveTo(5f, 11f)
                verticalLineToRelative(3f)
                lineTo(3f, 14f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(2f)
                close()
                moveTo(8f, 11f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-3f)
                close()
                moveTo(13f, 11f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-3f)
                close()
                moveTo(9f, 3f)
                curveToRelative(2.97f, 0f, 5.43f, 2.17f, 5.91f, 5f)
                lineTo(3.09f, 8f)
                curveToRelative(0.48f, -2.83f, 2.94f, -5f, 5.91f, -5f)
                close()
                moveTo(3f, 21f)
                verticalLineToRelative(-4f)
                lineTo(15f, 17f)
                verticalLineToRelative(4f)
                lineTo(3f, 21f)
                close()
            }
        }.also { _SlotMachine = it}
