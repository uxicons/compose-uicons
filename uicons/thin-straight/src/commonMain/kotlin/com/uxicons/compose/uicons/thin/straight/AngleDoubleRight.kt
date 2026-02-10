package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AngleDoubleRight: ImageVector? = null

val Icons.Ts.AngleDoubleRight: ImageVector
    get() = _AngleDoubleRight ?: UXIcon(name = "AngleDoubleRight") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(11.73f, 23.89f)
                lineToRelative(-0.71f, -0.71f)
                lineToRelative(10.83f, -10.83f)
                curveToRelative(0.09f, -0.1f, 0.15f, -0.22f, 0.15f, -0.35f)
                reflectiveCurveToRelative(-0.05f, -0.26f, -0.15f, -0.35f)
                lineTo(11.03f, 0.82f)
                lineToRelative(0.71f, -0.71f)
                lineToRelative(10.83f, 10.83f)
                curveToRelative(0.28f, 0.28f, 0.44f, 0.66f, 0.44f, 1.06f)
                reflectiveCurveToRelative(-0.16f, 0.78f, -0.44f, 1.06f)
                lineToRelative(-10.83f, 10.83f)
                close()
                moveTo(13.77f, 12.47f)
                curveToRelative(0.13f, -0.13f, 0.2f, -0.29f, 0.2f, -0.47f)
                reflectiveCurveToRelative(-0.07f, -0.34f, -0.2f, -0.47f)
                lineTo(2.35f, 0.11f)
                lineToRelative(-0.71f, 0.71f)
                lineToRelative(11.18f, 11.18f)
                lineTo(1.65f, 23.18f)
                lineToRelative(0.71f, 0.71f)
                lineToRelative(11.42f, -11.42f)
                close()
            }
        }.also { _AngleDoubleRight = it}
