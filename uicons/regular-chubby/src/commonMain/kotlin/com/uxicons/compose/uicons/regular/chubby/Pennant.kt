package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Pennant: ImageVector? = null

val Icons.Rc.Pennant: ImageVector
    get() = _Pennant ?: UXIcon(name = "Pennant") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.75f, 10.69f)
                lineToRelative(-0.78f, -0.73f)
                curveToRelative(-3.7f, -3.47f, -8.23f, -5.78f, -13.17f, -6.73f)
                curveToRelative(0.01f, -0.09f, 0.01f, -0.18f, 0.01f, -0.28f)
                curveToRelative(0f, -1.22f, -0.72f, -1.95f, -1.94f, -1.95f)
                reflectiveCurveToRelative(-1.94f, 0.73f, -1.94f, 1.95f)
                curveToRelative(0f, 0.83f, 0.34f, 1.44f, 0.94f, 1.74f)
                lineTo(3.88f, 22f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-2.23f)
                curveToRelative(5.3f, -0.83f, 10.16f, -3.21f, 14.09f, -6.89f)
                lineToRelative(0.78f, -0.73f)
                curveToRelative(0.2f, -0.19f, 0.32f, -0.45f, 0.32f, -0.73f)
                reflectiveCurveToRelative(-0.11f, -0.54f, -0.32f, -0.73f)
                close()
                moveTo(18.6f, 11.42f)
                curveToRelative(-3.56f, 3.33f, -7.94f, 5.51f, -12.73f, 6.33f)
                lineTo(5.87f, 5.09f)
                curveToRelative(4.78f, 0.81f, 9.17f, 2.99f, 12.73f, 6.33f)
                horizontalLineToRelative(0f)
                close()
            }
        }.also { _Pennant = it}
