package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Rhombus: ImageVector? = null

val Icons.Tc.Rhombus: ImageVector
    get() = _Rhombus ?: UXIcon(name = "Rhombus") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.34f, 10.29f)
                curveToRelative(-2.28f, -3.5f, -5.19f, -6.45f, -8.64f, -8.77f)
                curveToRelative(-1.03f, -0.69f, -2.37f, -0.69f, -3.4f, 0f)
                curveTo(6.84f, 3.83f, 3.94f, 6.78f, 1.66f, 10.29f)
                curveToRelative(-0.68f, 1.04f, -0.68f, 2.39f, 0f, 3.43f)
                curveToRelative(2.28f, 3.5f, 5.19f, 6.45f, 8.64f, 8.77f)
                curveToRelative(0.52f, 0.35f, 1.11f, 0.52f, 1.7f, 0.52f)
                reflectiveCurveToRelative(1.18f, -0.17f, 1.7f, -0.52f)
                curveToRelative(3.46f, -2.31f, 6.36f, -5.26f, 8.64f, -8.77f)
                curveToRelative(0.68f, -1.04f, 0.68f, -2.39f, 0f, -3.43f)
                close()
                moveTo(21.5f, 13.17f)
                curveToRelative(-2.21f, 3.39f, -5.02f, 6.24f, -8.36f, 8.48f)
                curveToRelative(-0.69f, 0.47f, -1.59f, 0.47f, -2.29f, 0f)
                curveToRelative(-3.34f, -2.24f, -6.16f, -5.09f, -8.36f, -8.48f)
                curveToRelative(-0.46f, -0.71f, -0.46f, -1.63f, 0f, -2.34f)
                curveTo(4.7f, 7.44f, 7.51f, 4.59f, 10.86f, 2.35f)
                curveToRelative(0.69f, -0.47f, 1.59f, -0.47f, 2.29f, 0f)
                curveToRelative(3.34f, 2.24f, 6.16f, 5.09f, 8.36f, 8.48f)
                curveToRelative(0.46f, 0.71f, 0.46f, 1.63f, 0f, 2.34f)
                close()
            }
        }.also { _Rhombus = it}
