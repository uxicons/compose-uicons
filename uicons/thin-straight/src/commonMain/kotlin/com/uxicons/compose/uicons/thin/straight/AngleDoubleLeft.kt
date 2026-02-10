package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AngleDoubleLeft: ImageVector? = null

val Icons.Ts.AngleDoubleLeft: ImageVector
    get() = _AngleDoubleLeft ?: UXIcon(name = "AngleDoubleLeft") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(2.15f, 12.35f)
                lineToRelative(10.83f, 10.83f)
                lineToRelative(-0.71f, 0.71f)
                lineTo(1.44f, 13.06f)
                curveToRelative(-0.28f, -0.28f, -0.44f, -0.66f, -0.44f, -1.06f)
                reflectiveCurveToRelative(0.16f, -0.78f, 0.44f, -1.06f)
                lineTo(12.27f, 0.11f)
                lineToRelative(0.71f, 0.71f)
                lineTo(2.15f, 11.65f)
                curveToRelative(-0.1f, 0.1f, -0.15f, 0.22f, -0.15f, 0.35f)
                reflectiveCurveToRelative(0.05f, 0.26f, 0.15f, 0.35f)
                close()
                moveTo(22.35f, 0.82f)
                lineToRelative(-0.71f, -0.71f)
                lineToRelative(-11.42f, 11.42f)
                curveToRelative(-0.26f, 0.26f, -0.26f, 0.68f, 0f, 0.94f)
                lineToRelative(11.42f, 11.42f)
                lineToRelative(0.71f, -0.71f)
                lineToRelative(-11.18f, -11.18f)
                lineTo(22.35f, 0.82f)
                close()
            }
        }.also { _AngleDoubleLeft = it}
