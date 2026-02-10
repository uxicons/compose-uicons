package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TabletAndroid: ImageVector? = null

val Icons.Sc.TabletAndroid: ImageVector
    get() = _TabletAndroid ?: UXIcon(name = "TabletAndroid") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19.88f, 2.67f)
                curveToRelative(-0.1f, -0.28f, -0.32f, -0.5f, -0.59f, -0.6f)
                curveToRelative(-0.12f, -0.04f, -2.89f, -1.06f, -7.29f, -1.06f)
                reflectiveCurveToRelative(-7.17f, 1.02f, -7.28f, 1.06f)
                curveToRelative(-0.28f, 0.1f, -0.49f, 0.32f, -0.59f, 0.6f)
                curveToRelative(-0.05f, 0.13f, -1.12f, 3.23f, -1.12f, 9.34f)
                reflectiveCurveToRelative(1.08f, 9.21f, 1.12f, 9.34f)
                curveToRelative(0.1f, 0.28f, 0.32f, 0.5f, 0.59f, 0.6f)
                curveToRelative(0.12f, 0.04f, 2.89f, 1.06f, 7.28f, 1.06f)
                reflectiveCurveToRelative(7.17f, -1.02f, 7.29f, -1.06f)
                curveToRelative(0.28f, -0.1f, 0.49f, -0.32f, 0.59f, -0.6f)
                curveToRelative(0.05f, -0.13f, 1.12f, -3.23f, 1.12f, -9.34f)
                reflectiveCurveToRelative(-1.08f, -9.21f, -1.12f, -9.34f)
                close()
                moveTo(13f, 20f)
                horizontalLineToRelative(-2f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(2f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                close()
            }
        }.also { _TabletAndroid = it}
