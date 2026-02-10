package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ObjectUnion: ImageVector? = null

val Icons.Sc.ObjectUnion: ImageVector
    get() = _ObjectUnion ?: UXIcon(name = "ObjectUnion") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15.5f, 23f)
                curveToRelative(-2.96f, 0f, -5.94f, -0.65f, -6.06f, -0.67f)
                curveToRelative(-0.38f, -0.08f, -0.68f, -0.38f, -0.76f, -0.76f)
                curveToRelative(-0.03f, -0.12f, -0.6f, -2.78f, -0.67f, -5.57f)
                curveToRelative(-2.79f, -0.06f, -5.45f, -0.64f, -5.57f, -0.67f)
                curveToRelative(-0.38f, -0.08f, -0.68f, -0.38f, -0.76f, -0.76f)
                curveToRelative(-0.03f, -0.12f, -0.67f, -3.1f, -0.67f, -6.06f)
                reflectiveCurveToRelative(0.64f, -5.94f, 0.67f, -6.07f)
                curveToRelative(0.08f, -0.38f, 0.38f, -0.68f, 0.76f, -0.76f)
                curveToRelative(0.12f, -0.03f, 3.1f, -0.67f, 6.06f, -0.67f)
                reflectiveCurveToRelative(5.94f, 0.65f, 6.06f, 0.67f)
                curveToRelative(0.38f, 0.08f, 0.68f, 0.38f, 0.76f, 0.76f)
                curveToRelative(0.03f, 0.12f, 0.6f, 2.78f, 0.67f, 5.57f)
                curveToRelative(2.79f, 0.06f, 5.45f, 0.64f, 5.57f, 0.67f)
                curveToRelative(0.38f, 0.08f, 0.68f, 0.38f, 0.76f, 0.76f)
                curveToRelative(0.03f, 0.12f, 0.67f, 3.1f, 0.67f, 6.06f)
                reflectiveCurveToRelative(-0.65f, 5.94f, -0.67f, 6.06f)
                curveToRelative(-0.08f, 0.38f, -0.38f, 0.68f, -0.76f, 0.76f)
                curveToRelative(-0.12f, 0.03f, -3.1f, 0.67f, -6.06f, 0.67f)
                close()
            }
        }.also { _ObjectUnion = it}
