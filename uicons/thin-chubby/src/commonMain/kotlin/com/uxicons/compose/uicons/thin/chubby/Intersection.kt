package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Intersection: ImageVector? = null

val Icons.Tc.Intersection: ImageVector
    get() = _Intersection ?: UXIcon(name = "Intersection") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19.5f, 23f)
                curveToRelative(-0.3f, 0.0f, -0.54f, -0.28f, -0.49f, -0.58f)
                curveToRelative(0.01f, -0.06f, 0.99f, -6.46f, 0.99f, -12.42f)
                curveToRelative(0f, -5.83f, -2.17f, -8f, -8f, -8f)
                reflectiveCurveToRelative(-8f, 2.17f, -8f, 8f)
                curveToRelative(0f, 5.96f, 0.98f, 12.36f, 0.99f, 12.42f)
                curveToRelative(0.04f, 0.27f, -0.14f, 0.53f, -0.42f, 0.57f)
                curveToRelative(-0.27f, 0.04f, -0.53f, -0.14f, -0.57f, -0.42f)
                curveToRelative(-0.01f, -0.07f, -1.01f, -6.54f, -1.01f, -12.58f)
                curveToRelative(0f, -6.31f, 2.69f, -9f, 9f, -9f)
                reflectiveCurveToRelative(9f, 2.69f, 9f, 9f)
                curveToRelative(0f, 6.04f, -1.0f, 12.51f, -1.01f, 12.58f)
                curveToRelative(-0.04f, 0.25f, -0.25f, 0.42f, -0.49f, 0.42f)
                close()
            }
        }.also { _Intersection = it}
