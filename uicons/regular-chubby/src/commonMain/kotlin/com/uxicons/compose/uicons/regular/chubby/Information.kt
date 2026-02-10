package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Information: ImageVector? = null

val Icons.Rc.Information: ImageVector
    get() = _Information ?: UXIcon(name = "Information") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17.97f, 22.24f)
                curveToRelative(-0.13f, 0.54f, -0.69f, 0.86f, -1.21f, 0.73f)
                curveToRelative(-0.02f, -0.01f, -1.94f, -0.47f, -4.76f, -0.47f)
                reflectiveCurveToRelative(-4.74f, 0.47f, -4.76f, 0.47f)
                curveToRelative(-0.54f, 0.13f, -1.08f, -0.19f, -1.21f, -0.73f)
                curveToRelative(-0.13f, -0.54f, 0.19f, -1.08f, 0.73f, -1.21f)
                curveToRelative(0.08f, -0.02f, 1.72f, -0.42f, 4.24f, -0.51f)
                verticalLineToRelative(-10.46f)
                curveToRelative(0f, -2.34f, -0.71f, -3.06f, -3.06f, -3.06f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                curveToRelative(3.45f, 0f, 5.06f, 1.61f, 5.06f, 5.06f)
                verticalLineToRelative(10.46f)
                curveToRelative(2.52f, 0.09f, 4.17f, 0.49f, 4.24f, 0.51f)
                curveToRelative(0.54f, 0.13f, 0.86f, 0.68f, 0.73f, 1.21f)
                close()
                moveTo(11.5f, 4f)
                curveToRelative(1.01f, 0f, 1.5f, -0.49f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.49f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.49f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.49f, 1.5f, 1.5f, 1.5f)
                close()
            }
        }.also { _Information = it}
