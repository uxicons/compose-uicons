package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Pan: ImageVector? = null

val Icons.Ts.Pan: ImageVector
    get() = _Pan ?: UXIcon(name = "Pan") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14f, 0f)
                curveTo(8.49f, 0f, 4f, 4.49f, 4f, 10f)
                curveToRelative(0f, 1.85f, 0.51f, 3.59f, 1.39f, 5.08f)
                lineTo(-0.0f, 20.47f)
                lineToRelative(3.54f, 3.54f)
                lineToRelative(5.39f, -5.39f)
                curveToRelative(1.49f, 0.88f, 3.23f, 1.39f, 5.08f, 1.39f)
                curveToRelative(5.51f, 0f, 10f, -4.49f, 10f, -10f)
                reflectiveCurveTo(19.51f, 0f, 14f, 0f)
                close()
                moveTo(3.53f, 22.59f)
                lineToRelative(-2.12f, -2.12f)
                lineToRelative(4.54f, -4.54f)
                curveToRelative(0.6f, 0.81f, 1.31f, 1.52f, 2.12f, 2.12f)
                lineToRelative(-4.54f, 4.54f)
                close()
                moveTo(14f, 19f)
                curveToRelative(-4.96f, 0f, -9f, -4.04f, -9f, -9f)
                reflectiveCurveTo(9.04f, 1f, 14f, 1f)
                reflectiveCurveToRelative(9f, 4.04f, 9f, 9f)
                reflectiveCurveToRelative(-4.04f, 9f, -9f, 9f)
                close()
                moveTo(19f, 10f)
                horizontalLineToRelative(1f)
                curveToRelative(0f, 3.31f, -2.69f, 6f, -6f, 6f)
                reflectiveCurveToRelative(-6f, -2.69f, -6f, -6f)
                reflectiveCurveToRelative(2.69f, -6f, 6f, -6f)
                verticalLineToRelative(1f)
                curveToRelative(-2.76f, 0f, -5f, 2.24f, -5f, 5f)
                reflectiveCurveToRelative(2.24f, 5f, 5f, 5f)
                reflectiveCurveToRelative(5f, -2.24f, 5f, -5f)
                close()
            }
        }.also { _Pan = it}
