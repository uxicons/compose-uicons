package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DataEncryption: ImageVector? = null

val Icons.Bs.DataEncryption: ImageVector
    get() = _DataEncryption ?: UXIcon(name = "DataEncryption") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23f, 12f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-2.51f)
                curveToRelative(-0.6f, -0.46f, -1f, -1.17f, -1f, -1.99f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                curveToRelative(0f, 0.81f, -0.4f, 1.53f, -1f, 1.99f)
                close()
                moveTo(23f, 19.51f)
                verticalLineToRelative(-5.51f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(2.51f)
                curveToRelative(-0.6f, 0.46f, -1f, 1.17f, -1f, 1.99f)
                curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.12f, 2.5f, -2.5f)
                curveToRelative(0f, -0.81f, -0.4f, -1.53f, -1f, -1.99f)
                close()
                moveTo(9f, 12f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(3f)
                close()
                moveTo(12.5f, 7f)
                horizontalLineToRelative(2.5f)
                verticalLineToRelative(9.5f)
                curveToRelative(0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                horizontalLineToRelative(-8f)
                curveToRelative(-1.93f, 0f, -3.5f, -1.57f, -3.5f, -3.5f)
                verticalLineToRelative(-9.5f)
                horizontalLineToRelative(2.5f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -2.76f, 2.24f, -5f, 5f, -5f)
                reflectiveCurveToRelative(5f, 2.24f, 5f, 5f)
                close()
                moveTo(5.5f, 7f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                reflectiveCurveToRelative(-2f, 0.9f, -2f, 2f)
                close()
                moveTo(12f, 10f)
                horizontalLineToRelative(-9f)
                verticalLineToRelative(6.5f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(8f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                close()
            }
        }.also { _DataEncryption = it}
