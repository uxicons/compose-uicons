package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _OilTank: ImageVector? = null

val Icons.Ss.OilTank: ImageVector
    get() = _OilTank ?: UXIcon(name = "OilTank") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22f, 21f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                curveToRelative(-1.3f, 0f, -2.4f, -0.84f, -2.82f, -2f)
                horizontalLineToRelative(-8.37f)
                curveToRelative(-0.41f, 1.16f, -1.51f, 2f, -2.82f, 2f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                reflectiveCurveToRelative(1.35f, -3f, 3f, -3f)
                curveToRelative(1.3f, 0f, 2.4f, 0.84f, 2.82f, 2f)
                horizontalLineToRelative(8.37f)
                curveToRelative(0.41f, -1.16f, 1.51f, -2f, 2.82f, -2f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                close()
                moveTo(12f, 7.4f)
                lineTo(10.93f, 8.45f)
                curveToRelative(-0.58f, 0.58f, -0.58f, 1.53f, 0.01f, 2.11f)
                curveToRelative(0.57f, 0.57f, 1.55f, 0.57f, 2.12f, 0f)
                curveToRelative(0.28f, -0.28f, 0.44f, -0.66f, 0.44f, -1.06f)
                reflectiveCurveToRelative(-0.16f, -0.78f, -0.44f, -1.06f)
                close()
                moveTo(24f, 9f)
                curveToRelative(-0.14f, 4.8f, -1.0f, 5.91f, -1.47f, 7f)
                horizontalLineToRelative(-21.05f)
                curveToRelative(-0.47f, -1.09f, -1.33f, -2.21f, -1.47f, -7f)
                curveToRelative(0.14f, -4.8f, 1.0f, -5.91f, 1.47f, -7f)
                horizontalLineToRelative(6.53f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(6.53f)
                curveToRelative(0.47f, 1.09f, 1.33f, 2.21f, 1.47f, 7f)
                close()
                moveTo(15.5f, 9.5f)
                curveToRelative(0f, -0.94f, -0.36f, -1.81f, -1.03f, -2.48f)
                lineToRelative(-2.47f, -2.42f)
                lineToRelative(-2.48f, 2.42f)
                curveToRelative(-1.36f, 1.36f, -1.36f, 3.58f, 0f, 4.95f)
                curveToRelative(0.66f, 0.66f, 1.54f, 1.02f, 2.48f, 1.02f)
                reflectiveCurveToRelative(1.81f, -0.36f, 2.48f, -1.02f)
                curveToRelative(0.66f, -0.66f, 1.02f, -1.54f, 1.02f, -2.48f)
                close()
            }
        }.also { _OilTank = it}
