package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _OilTank: ImageVector? = null

val Icons.Bs.OilTank: ImageVector
    get() = _OilTank ?: UXIcon(name = "OilTank") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22f, 21.01f)
                curveToRelative(0f, 1.66f, -1.34f, 3f, -3f, 3f)
                reflectiveCurveToRelative(-3f, -1.34f, -3f, -3f)
                reflectiveCurveToRelative(1.34f, -3f, 3f, -3f)
                reflectiveCurveToRelative(3f, 1.34f, 3f, 3f)
                close()
                moveTo(10f, 21.01f)
                horizontalLineToRelative(4f)
                curveToRelative(0.0f, -1.08f, 0.36f, -2.14f, 1.02f, -3f)
                horizontalLineToRelative(-6.04f)
                curveToRelative(0.66f, 0.86f, 1.02f, 1.92f, 1.02f, 3f)
                close()
                moveTo(5f, 18.01f)
                curveToRelative(-1.66f, 0f, -3f, 1.34f, -3f, 3f)
                reflectiveCurveToRelative(1.34f, 3f, 3f, 3f)
                reflectiveCurveToRelative(3f, -1.34f, 3f, -3f)
                reflectiveCurveToRelative(-1.34f, -3f, -3f, -3f)
                close()
                moveTo(24f, 9f)
                curveToRelative(-0.2f, 4.92f, -0.91f, 5.49f, -1.57f, 7f)
                horizontalLineToRelative(-20.85f)
                curveToRelative(-0.66f, -1.51f, -1.37f, -2.09f, -1.57f, -7f)
                curveToRelative(0.2f, -4.92f, 0.91f, -5.48f, 1.57f, -7f)
                horizontalLineToRelative(6.43f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(6.43f)
                curveToRelative(0.66f, 1.51f, 1.37f, 2.09f, 1.57f, 7f)
                close()
                moveTo(21f, 9f)
                curveToRelative(0f, -1.82f, -0.3f, -3.19f, -0.54f, -4f)
                horizontalLineToRelative(-16.91f)
                curveToRelative(-0.24f, 0.81f, -0.54f, 2.17f, -0.54f, 4f)
                reflectiveCurveToRelative(0.3f, 3.19f, 0.54f, 4f)
                horizontalLineToRelative(16.91f)
                curveToRelative(0.24f, -0.81f, 0.54f, -2.17f, 0.54f, -4f)
                close()
                moveTo(12f, 6f)
                lineTo(10.23f, 7.73f)
                curveToRelative(-0.98f, 0.98f, -0.98f, 2.56f, 0f, 3.54f)
                curveToRelative(0.49f, 0.49f, 1.13f, 0.73f, 1.77f, 0.73f)
                reflectiveCurveToRelative(1.28f, -0.24f, 1.77f, -0.73f)
                curveToRelative(0.98f, -0.98f, 0.98f, -2.56f, 0f, -3.54f)
                close()
            }
        }.also { _OilTank = it}
