package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PumpMedical: ImageVector? = null

val Icons.Sr.PumpMedical: ImageVector
    get() = _PumpMedical ?: UXIcon(name = "PumpMedical") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.83f, 3.56f)
                curveToRelative(-0.31f, 0.46f, -0.93f, 0.58f, -1.39f, 0.28f)
                lineToRelative(-0.73f, -0.49f)
                curveToRelative(-1.31f, -0.88f, -2.86f, -1.34f, -4.44f, -1.34f)
                horizontalLineToRelative(-2.27f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(4.78f)
                curveToRelative(1.97f, 0f, 3.9f, 0.58f, 5.55f, 1.68f)
                lineToRelative(0.73f, 0.49f)
                curveToRelative(0.46f, 0.31f, 0.58f, 0.93f, 0.28f, 1.39f)
                close()
                moveTo(20f, 15.4f)
                verticalLineToRelative(3.6f)
                curveToRelative(0f, 2.76f, -2.24f, 5f, -5f, 5f)
                horizontalLineToRelative(-6f)
                curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                verticalLineToRelative(-3.6f)
                curveToRelative(0f, -3.27f, 2.04f, -6.2f, 5.03f, -7.4f)
                horizontalLineToRelative(5.94f)
                curveToRelative(2.99f, 1.21f, 5.03f, 4.14f, 5.03f, 7.4f)
                close()
                moveTo(16f, 16.0f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                close()
            }
        }.also { _PumpMedical = it}
