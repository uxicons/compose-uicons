package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TruckBox: ImageVector? = null

val Icons.Sr.TruckBox: ImageVector
    get() = _TruckBox ?: UXIcon(name = "TruckBox") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(7f, 0f)
                lineTo(3f, 0f)
                curveTo(1.34f, 0f, 0f, 1.34f, 0f, 3f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 1.66f, 1.34f, 3f, 3f, 3f)
                horizontalLineToRelative(4f)
                curveToRelative(1.66f, 0f, 3f, -1.34f, 3f, -3f)
                lineTo(10f, 3f)
                curveToRelative(0f, -1.66f, -1.34f, -3f, -3f, -3f)
                close()
                moveTo(5.5f, 5f)
                horizontalLineToRelative(-1f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                horizontalLineToRelative(0f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(1f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                horizontalLineToRelative(0f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                close()
                moveTo(8.94f, 21f)
                curveToRelative(0.03f, 0.16f, 0.06f, 0.33f, 0.06f, 0.5f)
                curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                curveToRelative(0f, -0.17f, 0.02f, -0.34f, 0.06f, -0.5f)
                horizontalLineToRelative(4.88f)
                close()
                moveTo(4f, 19f)
                curveToRelative(-2.21f, 0f, -4f, -1.79f, -4f, -4f)
                verticalLineToRelative(-4.03f)
                curveToRelative(0.84f, 0.64f, 1.87f, 1.03f, 3f, 1.03f)
                horizontalLineToRelative(4f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                lineTo(12f, 3f)
                curveToRelative(0f, -0.21f, -0.04f, -0.41f, -0.06f, -0.61f)
                curveToRelative(1.8f, 0.76f, 3.06f, 2.54f, 3.06f, 4.61f)
                verticalLineToRelative(12f)
                lineTo(4f, 19f)
                close()
                moveTo(19.94f, 21f)
                curveToRelative(0.03f, 0.16f, 0.06f, 0.33f, 0.06f, 0.5f)
                curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                curveToRelative(0f, -0.17f, 0.02f, -0.34f, 0.06f, -0.5f)
                horizontalLineToRelative(4.88f)
                close()
                moveTo(24f, 11f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-7f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(2f)
                curveToRelative(2.76f, 0f, 5f, 2.24f, 5f, 5f)
                close()
                moveTo(17f, 14f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 2.21f, -1.79f, 4f, -4f, 4f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-5f)
                close()
            }
        }.also { _TruckBox = it}
