package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Seedling: ImageVector? = null

val Icons.Sc.Seedling: ImageVector
    get() = _Seedling ?: UXIcon(name = "Seedling") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.66f, 5.29f)
                curveToRelative(-0.96f, 3.68f, -2.81f, 5.53f, -6.49f, 6.49f)
                curveToRelative(-0.88f, 0.23f, -1.88f, 0.31f, -2.68f, 0.33f)
                verticalLineToRelative(9.48f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                verticalLineToRelative(-9.48f)
                curveToRelative(-0.8f, -0.03f, -1.77f, -0.11f, -2.64f, -0.33f)
                curveToRelative(-3.68f, -0.96f, -5.53f, -2.81f, -6.49f, -6.49f)
                curveToRelative(-0.96f, -3.68f, 0.13f, -4.76f, 3.81f, -3.81f)
                reflectiveCurveToRelative(5.53f, 2.81f, 6.49f, 6.49f)
                curveToRelative(0.22f, 0.83f, 0.31f, 1.73f, 0.35f, 2.49f)
                curveToRelative(0.04f, -0.76f, 0.14f, -1.66f, 0.35f, -2.49f)
                curveToRelative(0.96f, -3.68f, 2.81f, -5.53f, 6.49f, -6.49f)
                curveToRelative(3.68f, -0.96f, 4.76f, 0.13f, 3.8f, 3.81f)
                close()
            }
        }.also { _Seedling = it}
