package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Eject: ImageVector? = null

val Icons.Rc.Eject: ImageVector
    get() = _Eject ?: UXIcon(name = "Eject") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(1.72f, 17.99f)
                curveToRelative(0.14f, 0.04f, 3.55f, 1.01f, 10.28f, 1.01f)
                reflectiveCurveToRelative(10.14f, -0.97f, 10.28f, -1.01f)
                curveToRelative(0.51f, -0.15f, 0.82f, -0.67f, 0.69f, -1.19f)
                curveToRelative(-0.03f, -0.13f, -0.79f, -3.23f, -4.2f, -8.34f)
                curveToRelative(-3.27f, -4.91f, -5.87f, -7.02f, -6.16f, -7.25f)
                curveToRelative(-0.36f, -0.29f, -0.87f, -0.29f, -1.24f, 0f)
                curveToRelative(-0.29f, 0.23f, -2.89f, 2.34f, -6.16f, 7.25f)
                curveToRelative(-3.41f, 5.11f, -4.17f, 8.21f, -4.2f, 8.34f)
                curveToRelative(-0.12f, 0.52f, 0.18f, 1.04f, 0.69f, 1.19f)
                close()
                moveTo(6.89f, 9.57f)
                curveToRelative(2.26f, -3.39f, 4.17f, -5.37f, 5.11f, -6.24f)
                curveToRelative(0.94f, 0.88f, 2.85f, 2.85f, 5.11f, 6.24f)
                curveToRelative(2.11f, 3.16f, 3.14f, 5.5f, 3.6f, 6.73f)
                curveToRelative(-1.42f, 0.28f, -4.34f, 0.7f, -8.71f, 0.7f)
                reflectiveCurveToRelative(-7.28f, -0.43f, -8.71f, -0.7f)
                curveToRelative(0.46f, -1.23f, 1.49f, -3.56f, 3.6f, -6.73f)
                close()
                moveTo(22.28f, 21.99f)
                curveToRelative(-0.14f, 0.04f, -3.55f, 1.01f, -10.28f, 1.01f)
                reflectiveCurveToRelative(-10.14f, -0.97f, -10.28f, -1.01f)
                curveToRelative(-0.53f, -0.15f, -0.83f, -0.71f, -0.68f, -1.24f)
                curveToRelative(0.15f, -0.53f, 0.71f, -0.84f, 1.24f, -0.68f)
                curveToRelative(0.03f, 0.01f, 3.31f, 0.93f, 9.72f, 0.93f)
                reflectiveCurveToRelative(9.69f, -0.92f, 9.72f, -0.93f)
                curveToRelative(0.53f, -0.15f, 1.08f, 0.15f, 1.24f, 0.68f)
                curveToRelative(0.15f, 0.53f, -0.15f, 1.08f, -0.68f, 1.24f)
                close()
            }
        }.also { _Eject = it}
