package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _EngineWarning: ImageVector? = null

val Icons.Ts.EngineWarning: ImageVector
    get() = _EngineWarning ?: UXIcon(name = "EngineWarning") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 4f)
                curveToRelative(-4.41f, 0f, -8f, 3.59f, -8f, 8f)
                reflectiveCurveToRelative(3.59f, 8f, 8f, 8f)
                reflectiveCurveToRelative(8f, -3.59f, 8f, -8f)
                reflectiveCurveToRelative(-3.59f, -8f, -8f, -8f)
                close()
                moveTo(12f, 19f)
                curveToRelative(-3.86f, 0f, -7f, -3.14f, -7f, -7f)
                reflectiveCurveToRelative(3.14f, -7f, 7f, -7f)
                reflectiveCurveToRelative(7f, 3.14f, 7f, 7f)
                reflectiveCurveToRelative(-3.14f, 7f, -7f, 7f)
                close()
                moveTo(4.22f, 19.78f)
                lineToRelative(-0.71f, 0.71f)
                curveTo(-1.16f, 15.81f, -1.16f, 8.19f, 3.52f, 3.52f)
                lineToRelative(0.71f, 0.71f)
                curveTo(-0.07f, 8.51f, -0.07f, 15.49f, 4.22f, 19.78f)
                close()
                moveTo(20.49f, 20.48f)
                lineToRelative(-0.71f, -0.71f)
                curveToRelative(4.29f, -4.29f, 4.29f, -11.27f, 0f, -15.56f)
                lineToRelative(0.71f, -0.71f)
                curveToRelative(4.68f, 4.68f, 4.68f, 12.29f, 0f, 16.97f)
                close()
                moveTo(12.5f, 13f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(5f)
                close()
                moveTo(13.0f, 15f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                close()
            }
        }.also { _EngineWarning = it}
