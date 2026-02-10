package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LockOpenAlt: ImageVector? = null

val Icons.Sr.LockOpenAlt: ImageVector
    get() = _LockOpenAlt ?: UXIcon(name = "LockOpenAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24.01f, 4.89f)
                curveToRelative(-0.31f, -2.79f, -2.67f, -4.89f, -5.51f, -4.89f)
                curveToRelative(-3.03f, 0f, -5.5f, 2.47f, -5.5f, 5.5f)
                verticalLineToRelative(2.5f)
                lineTo(5f, 8f)
                curveToRelative(-2.76f, 0f, -5f, 2.24f, -5f, 5f)
                verticalLineToRelative(6f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(8f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                verticalLineToRelative(-6f)
                curveToRelative(0f, -2.05f, -1.24f, -3.81f, -3f, -4.58f)
                verticalLineToRelative(-2.92f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                curveToRelative(1.78f, 0f, 3.33f, 1.36f, 3.52f, 3.11f)
                curveToRelative(0.06f, 0.55f, 0.56f, 0.94f, 1.1f, 0.89f)
                curveToRelative(0.55f, -0.06f, 0.94f, -0.56f, 0.89f, -1.1f)
                close()
                moveTo(10f, 17f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(2f)
                close()
            }
        }.also { _LockOpenAlt = it}
