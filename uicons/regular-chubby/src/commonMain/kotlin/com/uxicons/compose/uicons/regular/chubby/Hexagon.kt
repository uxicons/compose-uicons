package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Hexagon: ImageVector? = null

val Icons.Rc.Hexagon: ImageVector
    get() = _Hexagon ?: UXIcon(name = "Hexagon") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.5f, 11.69f)
                curveToRelative(-1.27f, -3.82f, -3.06f, -7.03f, -5.49f, -9.81f)
                curveToRelative(-0.14f, -0.17f, -0.34f, -0.28f, -0.56f, -0.32f)
                curveToRelative(-0.11f, -0.02f, -2.76f, -0.55f, -5.46f, -0.55f)
                reflectiveCurveToRelative(-5.35f, 0.52f, -5.46f, 0.55f)
                curveToRelative(-0.22f, 0.04f, -0.41f, 0.16f, -0.56f, 0.32f)
                curveToRelative(-2.42f, 2.79f, -4.22f, 6.0f, -5.49f, 9.81f)
                curveToRelative(-0.07f, 0.2f, -0.07f, 0.43f, 0f, 0.63f)
                curveToRelative(1.27f, 3.82f, 3.06f, 7.03f, 5.49f, 9.81f)
                curveToRelative(0.14f, 0.17f, 0.34f, 0.28f, 0.56f, 0.32f)
                curveToRelative(0.11f, 0.02f, 2.76f, 0.55f, 5.46f, 0.55f)
                reflectiveCurveToRelative(5.35f, -0.52f, 5.46f, -0.55f)
                curveToRelative(0.22f, -0.04f, 0.41f, -0.16f, 0.56f, -0.32f)
                curveToRelative(2.42f, -2.79f, 4.22f, -6.0f, 5.49f, -9.81f)
                curveToRelative(0.07f, -0.2f, 0.07f, -0.43f, 0f, -0.63f)
                close()
                moveTo(16.73f, 20.55f)
                curveToRelative(-0.77f, 0.14f, -2.77f, 0.45f, -4.73f, 0.45f)
                reflectiveCurveToRelative(-3.96f, -0.31f, -4.73f, -0.45f)
                curveToRelative(-2.07f, -2.45f, -3.63f, -5.25f, -4.76f, -8.55f)
                curveToRelative(1.13f, -3.3f, 2.69f, -6.11f, 4.76f, -8.55f)
                curveToRelative(0.77f, -0.14f, 2.77f, -0.45f, 4.73f, -0.45f)
                reflectiveCurveToRelative(3.96f, 0.31f, 4.73f, 0.45f)
                curveToRelative(2.07f, 2.45f, 3.63f, 5.25f, 4.76f, 8.55f)
                curveToRelative(-1.13f, 3.3f, -2.69f, 6.11f, -4.76f, 8.55f)
                close()
            }
        }.also { _Hexagon = it}
