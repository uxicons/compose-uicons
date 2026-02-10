package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RampLoading: ImageVector? = null

val Icons.Rr.RampLoading: ImageVector
    get() = _RampLoading ?: UXIcon(name = "RampLoading") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.0f, 24f)
                lineTo(5.0f, 24f)
                curveToRelative(-1.05f, 0f, -2.0f, -0.53f, -2.55f, -1.42f)
                curveToRelative(-0.55f, -0.89f, -0.6f, -1.98f, -0.13f, -2.92f)
                lineToRelative(2.72f, -5.45f)
                curveToRelative(0.68f, -1.36f, 2.05f, -2.21f, 3.58f, -2.21f)
                horizontalLineToRelative(6.76f)
                curveToRelative(1.52f, 0f, 2.9f, 0.85f, 3.58f, 2.21f)
                lineToRelative(2.72f, 5.45f)
                curveToRelative(0.47f, 0.94f, 0.42f, 2.03f, -0.13f, 2.92f)
                curveToRelative(-0.55f, 0.89f, -1.5f, 1.42f, -2.55f, 1.42f)
                close()
                moveTo(8.62f, 14f)
                curveToRelative(-0.76f, 0f, -1.45f, 0.42f, -1.79f, 1.1f)
                lineToRelative(-2.72f, 5.45f)
                curveToRelative(-0.23f, 0.45f, -0.04f, 0.83f, 0.04f, 0.97f)
                curveToRelative(0.09f, 0.14f, 0.35f, 0.47f, 0.85f, 0.47f)
                horizontalLineToRelative(13.99f)
                curveToRelative(0.5f, 0f, 0.76f, -0.33f, 0.85f, -0.47f)
                curveToRelative(0.09f, -0.14f, 0.27f, -0.52f, 0.04f, -0.97f)
                lineToRelative(-2.72f, -5.45f)
                curveToRelative(-0.34f, -0.68f, -1.03f, -1.1f, -1.79f, -1.1f)
                horizontalLineToRelative(-6.76f)
                close()
                moveTo(22f, 12f)
                lineTo(22f, 5f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                lineTo(7f, 0f)
                curveTo(4.24f, 0f, 2f, 2.24f, 2f, 5f)
                verticalLineToRelative(7f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                lineTo(4f, 5f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(10f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                verticalLineToRelative(7f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                close()
            }
        }.also { _RampLoading = it}
