package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Sink: ImageVector? = null

val Icons.Rc.Sink: ImageVector
    get() = _Sink ?: UXIcon(name = "Sink") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.72f, 12.31f)
                curveToRelative(-0.19f, -0.2f, -0.45f, -0.31f, -0.72f, -0.31f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-4.04f)
                curveToRelative(-0.0f, -2.44f, 0.05f, -5.88f, 1.21f, -8.24f)
                curveToRelative(0.44f, -1.16f, 4.48f, -1.22f, 3.83f, 1.24f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                curveToRelative(0f, -2.69f, -1.31f, -4f, -4f, -4f)
                curveToRelative(-0.66f, -0.03f, -2.76f, 0.07f, -3.57f, 1.77f)
                curveToRelative(-1.41f, 2.78f, -1.47f, 6.57f, -1.47f, 9.23f)
                horizontalLineToRelative(-3.96f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-3f)
                curveToRelative(-0.55f, -0.01f, -1.03f, 0.49f, -1.0f, 1.04f)
                curveToRelative(0.29f, 6.89f, 3.68f, 9.96f, 11.0f, 9.96f)
                reflectiveCurveToRelative(10.71f, -3.07f, 11.0f, -9.96f)
                curveToRelative(0.01f, -0.27f, -0.09f, -0.54f, -0.28f, -0.73f)
                close()
                moveTo(12f, 21f)
                curveToRelative(-5.93f, 0f, -8.44f, -1.92f, -8.93f, -7f)
                horizontalLineToRelative(17.86f)
                curveToRelative(-0.49f, 5.08f, -3.0f, 7f, -8.93f, 7f)
                close()
            }
        }.also { _Sink = it}
