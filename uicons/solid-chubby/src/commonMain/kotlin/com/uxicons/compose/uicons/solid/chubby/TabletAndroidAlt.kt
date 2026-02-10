package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TabletAndroidAlt: ImageVector? = null

val Icons.Sc.TabletAndroidAlt: ImageVector
    get() = _TabletAndroidAlt ?: UXIcon(name = "TabletAndroidAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(3.09f, 15f)
                curveToRelative(-0.06f, -0.9f, -0.09f, -1.9f, -0.09f, -3f)
                curveToRelative(0f, -6.1f, 1.08f, -9.21f, 1.12f, -9.34f)
                curveToRelative(0.1f, -0.28f, 0.32f, -0.5f, 0.59f, -0.6f)
                curveToRelative(0.12f, -0.04f, 2.89f, -1.06f, 7.29f, -1.06f)
                reflectiveCurveToRelative(7.17f, 1.02f, 7.29f, 1.06f)
                curveToRelative(0.28f, 0.1f, 0.49f, 0.32f, 0.59f, 0.6f)
                curveToRelative(0.05f, 0.13f, 1.12f, 3.23f, 1.12f, 9.34f)
                curveToRelative(0f, 1.1f, -0.04f, 2.1f, -0.09f, 3f)
                close()
                moveTo(20.73f, 17f)
                curveToRelative(-0.32f, 2.8f, -0.82f, 4.25f, -0.85f, 4.33f)
                curveToRelative(-0.1f, 0.28f, -0.32f, 0.5f, -0.59f, 0.6f)
                curveToRelative(-0.12f, 0.04f, -2.89f, 1.06f, -7.29f, 1.06f)
                reflectiveCurveToRelative(-7.17f, -1.02f, -7.29f, -1.06f)
                curveToRelative(-0.28f, -0.1f, -0.49f, -0.32f, -0.59f, -0.6f)
                curveToRelative(-0.03f, -0.09f, -0.53f, -1.53f, -0.85f, -4.33f)
                horizontalLineToRelative(17.46f)
                close()
                moveTo(14f, 20f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-2f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(2f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                close()
            }
        }.also { _TabletAndroidAlt = it}
