package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TruckLoading: ImageVector? = null

val Icons.Ts.TruckLoading: ImageVector
    get() = _TruckLoading ?: UXIcon(name = "TruckLoading") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.5f, 1f)
                horizontalLineToRelative(2.5f)
                lineTo(24f, 0f)
                horizontalLineToRelative(-2.5f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(14.63f)
                lineToRelative(-3.89f, 1.21f)
                lineToRelative(-3.12f, -9.83f)
                lineTo(0.08f, 12.3f)
                lineToRelative(2.98f, 9.79f)
                lineTo(0.04f, 23.02f)
                lineToRelative(0.3f, 0.95f)
                lineToRelative(17.2f, -5.34f)
                curveToRelative(-0.34f, 0.54f, -0.54f, 1.18f, -0.54f, 1.87f)
                curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                reflectiveCurveToRelative(3.5f, -1.57f, 3.5f, -3.5f)
                reflectiveCurveToRelative(-1.57f, -3.5f, -3.5f, -3.5f)
                curveToRelative(-0.17f, 0f, -0.34f, 0.01f, -0.5f, 0.04f)
                lineTo(20f, 2.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(1.32f, 12.95f)
                lineToRelative(10.01f, -3.18f)
                lineToRelative(2.82f, 8.87f)
                lineToRelative(-10.14f, 3.15f)
                lineTo(1.32f, 12.95f)
                close()
                moveTo(23f, 20.5f)
                curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                reflectiveCurveToRelative(1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                close()
                moveTo(8.86f, 13.32f)
                lineToRelative(0.3f, 0.95f)
                lineToRelative(-3.62f, 1.15f)
                lineToRelative(-0.3f, -0.95f)
                lineToRelative(3.62f, -1.15f)
                close()
            }
        }.also { _TruckLoading = it}
