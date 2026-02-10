package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Intersection: ImageVector? = null

val Icons.Rc.Intersection: ImageVector
    get() = _Intersection ?: UXIcon(name = "Intersection") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19.0f, 23f)
                curveToRelative(-0.61f, 0.01f, -1.09f, -0.56f, -0.99f, -1.16f)
                curveToRelative(0.01f, -0.06f, 0.99f, -6.28f, 0.99f, -11.84f)
                curveToRelative(0f, -5.17f, -1.83f, -7f, -7f, -7f)
                reflectiveCurveToRelative(-7f, 1.83f, -7f, 7f)
                curveToRelative(0f, 5.57f, 0.98f, 11.78f, 0.99f, 11.84f)
                curveToRelative(0.09f, 0.55f, -0.28f, 1.06f, -0.83f, 1.15f)
                curveToRelative(-0.54f, 0.09f, -1.06f, -0.28f, -1.15f, -0.83f)
                curveToRelative(-0.04f, -0.26f, -1.01f, -6.43f, -1.01f, -12.16f)
                curveToRelative(0f, -6.31f, 2.69f, -9.0f, 9f, -9.0f)
                reflectiveCurveToRelative(9f, 2.69f, 9f, 9f)
                curveToRelative(0f, 5.73f, -0.97f, 11.9f, -1.01f, 12.16f)
                curveToRelative(-0.08f, 0.49f, -0.5f, 0.84f, -0.99f, 0.84f)
                close()
            }
        }.also { _Intersection = it}
