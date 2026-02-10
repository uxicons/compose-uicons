package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Life: ImageVector? = null

val Icons.Ss.Life: ImageVector
    get() = _Life ?: UXIcon(name = "Life") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 11f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                reflectiveCurveToRelative(1.12f, -2.5f, 2.5f, -2.5f)
                close()
                moveTo(16f, 18.44f)
                verticalLineToRelative(5.56f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(-5.56f)
                lineTo(1.82f, 12.73f)
                lineToRelative(1.36f, -1.47f)
                lineToRelative(6.21f, 5.74f)
                horizontalLineToRelative(5.22f)
                lineToRelative(6.21f, -5.74f)
                lineToRelative(1.36f, 1.47f)
                lineToRelative(-6.18f, 5.7f)
                close()
                moveTo(12f, 9.17f)
                reflectiveCurveToRelative(5f, -3.49f, 5f, -6.39f)
                curveToRelative(0f, -1.53f, -1.12f, -2.77f, -2.5f, -2.77f)
                reflectiveCurveToRelative(-2.5f, 1.24f, -2.5f, 2.77f)
                curveToRelative(0f, -1.53f, -1.12f, -2.77f, -2.5f, -2.77f)
                reflectiveCurveToRelative(-2.5f, 1.24f, -2.5f, 2.77f)
                curveToRelative(0f, 2.9f, 5f, 6.39f, 5f, 6.39f)
                close()
            }
        }.also { _Life = it}
