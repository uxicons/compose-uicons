package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Scale: ImageVector? = null

val Icons.Ts.Scale: ImageVector
    get() = _Scale ?: UXIcon(name = "Scale") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.5f, 2f)
                horizontalLineToRelative(-5.03f)
                curveToRelative(-1.1f, -1.23f, -2.69f, -2f, -4.47f, -2f)
                reflectiveCurveToRelative(-3.37f, 0.77f, -4.47f, 2f)
                lineTo(2.5f, 2f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(19.5f)
                horizontalLineToRelative(24f)
                lineTo(24f, 4.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(12f, 1f)
                curveToRelative(2.76f, 0f, 5f, 2.24f, 5f, 5f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-5.29f)
                lineToRelative(1.84f, -3.68f)
                lineToRelative(-0.9f, -0.45f)
                lineToRelative(-2.06f, 4.12f)
                horizontalLineToRelative(-3.59f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -2.76f, 2.24f, -5f, 5f, -5f)
                close()
                moveTo(23f, 23f)
                lineTo(1f, 23f)
                lineTo(1f, 4.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(4.3f)
                curveToRelative(-0.51f, 0.88f, -0.81f, 1.91f, -0.81f, 3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -1.09f, -0.29f, -2.12f, -0.81f, -3f)
                horizontalLineToRelative(4.3f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(18.5f)
                close()
            }
        }.also { _Scale = it}
