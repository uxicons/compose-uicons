package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Sink: ImageVector? = null

val Icons.Tr.Sink: ImageVector
    get() = _Sink ?: UXIcon(name = "Sink") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 13f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                reflectiveCurveToRelative(-0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(-6.5f)
                lineTo(12.5f, 4.25f)
                curveToRelative(0f, -1.79f, 1.46f, -3.25f, 3.25f, -3.25f)
                curveToRelative(1.8f, 0f, 3.14f, 1.13f, 3.25f, 2.72f)
                verticalLineToRelative(0.78f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f)
                verticalLineToRelative(-0.81f)
                curveToRelative(-0.14f, -2.13f, -1.93f, -3.69f, -4.25f, -3.69f)
                curveToRelative(-2.35f, 0f, -4.25f, 1.91f, -4.25f, 4.25f)
                verticalLineToRelative(8.75f)
                horizontalLineToRelative(-6.5f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                reflectiveCurveToRelative(-0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(-1f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                curveToRelative(0f, 4.41f, 3.59f, 8f, 8f, 8f)
                horizontalLineToRelative(8f)
                curveToRelative(4.41f, 0f, 8f, -3.59f, 8f, -8f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(16f, 23f)
                horizontalLineToRelative(-8f)
                curveToRelative(-3.86f, 0f, -7f, -3.14f, -7f, -7f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                horizontalLineToRelative(18f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                curveToRelative(0f, 3.86f, -3.14f, 7f, -7f, 7f)
                close()
            }
        }.also { _Sink = it}
