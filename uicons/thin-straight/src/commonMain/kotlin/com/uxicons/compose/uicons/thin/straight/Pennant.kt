package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Pennant: ImageVector? = null

val Icons.Ts.Pennant: ImageVector
    get() = _Pennant ?: UXIcon(name = "Pennant") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3.82f, 4.62f)
                curveToRelative(0.71f, -0.44f, 1.18f, -1.23f, 1.18f, -2.12f)
                curveTo(5f, 1.12f, 3.88f, 0f, 2.5f, 0f)
                reflectiveCurveTo(0f, 1.12f, 0f, 2.5f)
                curveToRelative(0f, 1.21f, 0.86f, 2.22f, 2f, 2.45f)
                lineTo(2f, 24f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-3.16f)
                lineTo(23.86f, 12.5f)
                lineTo(3.82f, 4.62f)
                close()
                moveTo(1f, 2.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                curveToRelative(-0.91f, 0f, -1.5f, -0.69f, -1.5f, -1.5f)
                close()
                moveTo(3f, 5.38f)
                lineToRelative(18.14f, 7.13f)
                lineTo(3f, 19.76f)
                lineTo(3f, 5.38f)
                close()
            }
        }.also { _Pennant = it}
