package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BarsStaggered: ImageVector? = null

val Icons.Rc.BarsStaggered: ImageVector
    get() = _BarsStaggered ?: UXIcon(name = "BarsStaggered") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(1.01f, 4.69f)
                curveToRelative(-0.08f, -0.55f, 0.3f, -1.05f, 0.85f, -1.13f)
                curveToRelative(0.15f, -0.02f, 3.84f, -0.54f, 8.64f, -0.54f)
                reflectiveCurveToRelative(8.49f, 0.52f, 8.64f, 0.54f)
                curveToRelative(0.55f, 0.08f, 0.93f, 0.58f, 0.85f, 1.13f)
                curveToRelative(-0.08f, 0.55f, -0.6f, 0.93f, -1.13f, 0.85f)
                curveToRelative(-0.04f, -0.01f, -3.71f, -0.52f, -8.36f, -0.52f)
                reflectiveCurveToRelative(-8.32f, 0.52f, -8.36f, 0.52f)
                curveToRelative(-0.55f, 0.08f, -1.05f, -0.3f, -1.13f, -0.85f)
                close()
                moveTo(22.14f, 11.54f)
                curveToRelative(-0.15f, -0.02f, -3.85f, -0.54f, -8.64f, -0.54f)
                reflectiveCurveToRelative(-8.49f, 0.52f, -8.64f, 0.54f)
                curveToRelative(-0.55f, 0.08f, -0.93f, 0.58f, -0.85f, 1.13f)
                curveToRelative(0.08f, 0.55f, 0.58f, 0.93f, 1.13f, 0.85f)
                curveToRelative(0.04f, -0.01f, 3.71f, -0.52f, 8.36f, -0.52f)
                reflectiveCurveToRelative(8.32f, 0.52f, 8.36f, 0.52f)
                curveToRelative(0.54f, 0.08f, 1.06f, -0.3f, 1.13f, -0.85f)
                curveToRelative(0.08f, -0.55f, -0.3f, -1.05f, -0.85f, -1.13f)
                close()
                moveTo(19.14f, 19.54f)
                curveToRelative(-0.15f, -0.02f, -3.85f, -0.54f, -8.64f, -0.54f)
                reflectiveCurveToRelative(-8.49f, 0.52f, -8.64f, 0.54f)
                curveToRelative(-0.55f, 0.08f, -0.93f, 0.58f, -0.85f, 1.13f)
                curveToRelative(0.08f, 0.55f, 0.58f, 0.93f, 1.13f, 0.85f)
                curveToRelative(0.04f, -0.01f, 3.71f, -0.52f, 8.36f, -0.52f)
                reflectiveCurveToRelative(8.32f, 0.52f, 8.36f, 0.52f)
                curveToRelative(0.54f, 0.08f, 1.06f, -0.3f, 1.13f, -0.85f)
                curveToRelative(0.08f, -0.55f, -0.3f, -1.05f, -0.85f, -1.13f)
                close()
            }
        }.also { _BarsStaggered = it}
