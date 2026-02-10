package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Life: ImageVector? = null

val Icons.Bs.Life: ImageVector
    get() = _Life ?: UXIcon(name = "Life") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 11f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                reflectiveCurveToRelative(1.12f, -2.5f, 2.5f, -2.5f)
                close()
                moveTo(22.52f, 13.6f)
                lineToRelative(-2.04f, -2.2f)
                lineToRelative(-6.07f, 5.6f)
                horizontalLineToRelative(-4.83f)
                lineToRelative(-6.07f, -5.6f)
                lineToRelative(-2.04f, 2.2f)
                lineToRelative(6.52f, 6.02f)
                verticalLineToRelative(4.38f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-4.38f)
                lineToRelative(6.52f, -6.02f)
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
