package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LockOpenAlt: ImageVector? = null

val Icons.Rr.LockOpenAlt: ImageVector
    get() = _LockOpenAlt ?: UXIcon(name = "LockOpenAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(10f, 15f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                close()
                moveTo(23.12f, 5.99f)
                curveToRelative(-0.54f, 0.06f, -1.04f, -0.34f, -1.1f, -0.89f)
                curveToRelative(-0.19f, -1.74f, -1.74f, -3.11f, -3.52f, -3.11f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(2.92f)
                curveToRelative(1.76f, 0.77f, 3f, 2.54f, 3f, 4.58f)
                verticalLineToRelative(6f)
                curveToRelative(0f, 2.76f, -2.24f, 5f, -5f, 5f)
                lineTo(5f, 24f)
                curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                verticalLineToRelative(-6f)
                curveToRelative(0f, -2.76f, 2.24f, -5f, 5f, -5f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0f, -3.03f, 2.47f, -5.5f, 5.5f, -5.5f)
                curveToRelative(2.83f, 0f, 5.2f, 2.1f, 5.51f, 4.89f)
                curveToRelative(0.06f, 0.55f, -0.34f, 1.04f, -0.89f, 1.1f)
                close()
                moveTo(13f, 10f)
                lineTo(5f, 10f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(6f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                horizontalLineToRelative(8f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                verticalLineToRelative(-6f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
            }
        }.also { _LockOpenAlt = it}
