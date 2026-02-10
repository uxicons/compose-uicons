package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BarsSort: ImageVector? = null

val Icons.Rc.BarsSort: ImageVector
    get() = _BarsSort ?: UXIcon(name = "BarsSort") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.99f, 3.86f)
                curveToRelative(-0.09f, 0.55f, -0.6f, 0.92f, -1.15f, 0.83f)
                curveToRelative(-0.04f, -0.01f, -4.37f, -0.69f, -9.84f, -0.69f)
                reflectiveCurveToRelative(-9.8f, 0.68f, -9.84f, 0.69f)
                curveToRelative(-0.53f, 0.09f, -1.06f, -0.28f, -1.15f, -0.83f)
                curveToRelative(-0.09f, -0.55f, 0.28f, -1.06f, 0.83f, -1.15f)
                curveToRelative(0.18f, -0.03f, 4.52f, -0.71f, 10.16f, -0.71f)
                reflectiveCurveToRelative(9.98f, 0.68f, 10.16f, 0.71f)
                curveToRelative(0.55f, 0.09f, 0.92f, 0.6f, 0.83f, 1.15f)
                close()
                moveTo(16.14f, 11.51f)
                curveToRelative(-1.64f, -0.23f, -4.22f, -0.51f, -7.14f, -0.51f)
                reflectiveCurveToRelative(-5.5f, 0.28f, -7.14f, 0.51f)
                curveToRelative(-0.55f, 0.08f, -0.93f, 0.58f, -0.85f, 1.13f)
                reflectiveCurveToRelative(0.58f, 0.93f, 1.13f, 0.85f)
                curveToRelative(1.58f, -0.22f, 4.05f, -0.49f, 6.86f, -0.49f)
                reflectiveCurveToRelative(5.28f, 0.27f, 6.86f, 0.49f)
                curveToRelative(0.54f, 0.08f, 1.05f, -0.3f, 1.13f, -0.85f)
                curveToRelative(0.08f, -0.55f, -0.3f, -1.05f, -0.85f, -1.13f)
                close()
                moveTo(10.1f, 20.2f)
                curveToRelative(-2.76f, -0.27f, -5.44f, -0.27f, -8.2f, 0f)
                curveToRelative(-0.55f, 0.05f, -0.95f, 0.54f, -0.9f, 1.09f)
                curveToRelative(0.06f, 0.55f, 0.52f, 0.94f, 1.09f, 0.9f)
                curveToRelative(2.63f, -0.26f, 5.18f, -0.26f, 7.8f, 0f)
                curveToRelative(0.54f, 0.06f, 1.04f, -0.35f, 1.09f, -0.9f)
                curveToRelative(0.06f, -0.55f, -0.35f, -1.04f, -0.9f, -1.09f)
                close()
            }
        }.also { _BarsSort = it}
