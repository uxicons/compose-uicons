package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UsbPendrive: ImageVector? = null

val Icons.Tr.UsbPendrive: ImageVector
    get() = _UsbPendrive ?: UXIcon(name = "UsbPendrive") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14f, 5.5f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                reflectiveCurveToRelative(0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                reflectiveCurveToRelative(-0.5f, -0.22f, -0.5f, -0.5f)
                close()
                moveTo(9.5f, 6f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                reflectiveCurveToRelative(-0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                close()
                moveTo(21f, 11.5f)
                verticalLineToRelative(3.5f)
                curveToRelative(0f, 4.96f, -4.04f, 9f, -9f, 9f)
                reflectiveCurveTo(3f, 19.96f, 3f, 15f)
                verticalLineToRelative(-3.5f)
                curveToRelative(0f, -1.39f, 0.82f, -2.58f, 2f, -3.15f)
                lineTo(5f, 2.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(9f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                verticalLineToRelative(5.85f)
                curveToRelative(1.18f, 0.56f, 2f, 1.76f, 2f, 3.15f)
                close()
                moveTo(6f, 8.05f)
                curveToRelative(0.17f, -0.02f, 0.33f, -0.05f, 0.5f, -0.05f)
                horizontalLineToRelative(11f)
                curveToRelative(0.17f, 0f, 0.34f, 0.03f, 0.5f, 0.05f)
                lineTo(18f, 2.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                lineTo(7.5f, 1f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(5.55f)
                close()
                moveTo(20f, 11.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                lineTo(6.5f, 9f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(3.5f)
                curveToRelative(0f, 4.41f, 3.59f, 8f, 8f, 8f)
                reflectiveCurveToRelative(8f, -3.59f, 8f, -8f)
                verticalLineToRelative(-3.5f)
                close()
            }
        }.also { _UsbPendrive = it}
