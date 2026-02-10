package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TruckLadder: ImageVector? = null

val Icons.Ss.TruckLadder: ImageVector
    get() = _TruckLadder ?: UXIcon(name = "TruckLadder") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(0f, 3f)
                lineTo(2f, 3f)
                lineTo(2f, 7f)
                lineTo(0f, 7f)
                verticalLineToRelative(2f)
                lineTo(14f, 9f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                lineTo(12f, 3f)
                horizontalLineToRelative(2f)
                lineTo(14f, 1f)
                lineTo(0f, 1f)
                lineTo(0f, 3f)
                close()
                moveTo(4f, 3f)
                horizontalLineToRelative(2f)
                lineTo(6f, 7f)
                horizontalLineToRelative(-2f)
                lineTo(4f, 3f)
                close()
                moveTo(10f, 7f)
                horizontalLineToRelative(-2f)
                lineTo(8f, 3f)
                horizontalLineToRelative(2f)
                lineTo(10f, 7f)
                close()
                moveTo(11.94f, 21f)
                curveToRelative(0.03f, 0.16f, 0.06f, 0.33f, 0.06f, 0.5f)
                curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                curveToRelative(0f, -0.17f, 0.02f, -0.34f, 0.06f, -0.5f)
                horizontalLineToRelative(4.88f)
                close()
                moveTo(4.94f, 21f)
                curveToRelative(0.03f, 0.16f, 0.06f, 0.33f, 0.06f, 0.5f)
                curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                curveToRelative(0f, -0.17f, 0.02f, -0.34f, 0.06f, -0.5f)
                lineTo(4.94f, 21f)
                close()
                moveTo(0f, 11f)
                lineTo(14f, 11f)
                verticalLineToRelative(8f)
                lineTo(0f, 19f)
                lineTo(0f, 11f)
                close()
                moveTo(21.94f, 21f)
                curveToRelative(0.03f, 0.16f, 0.06f, 0.33f, 0.06f, 0.5f)
                curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                curveToRelative(0f, -0.17f, 0.02f, -0.34f, 0.06f, -0.5f)
                horizontalLineToRelative(4.88f)
                close()
                moveTo(23.72f, 12f)
                horizontalLineToRelative(-7.72f)
                lineTo(16.0f, 6f)
                horizontalLineToRelative(3.56f)
                curveToRelative(1.29f, 0f, 2.44f, 0.82f, 2.85f, 2.05f)
                lineToRelative(1.32f, 3.95f)
                close()
                moveTo(24.0f, 14f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(8f)
                close()
            }
        }.also { _TruckLadder = it}
