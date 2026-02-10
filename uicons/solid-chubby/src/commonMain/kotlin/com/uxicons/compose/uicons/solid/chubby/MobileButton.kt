package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MobileButton: ImageVector? = null

val Icons.Sc.MobileButton: ImageVector
    get() = _MobileButton ?: UXIcon(name = "MobileButton") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19.17f, 2.94f)
                curveToRelative(-0.07f, -0.33f, -0.3f, -0.59f, -0.6f, -0.72f)
                curveToRelative(-0.12f, -0.05f, -3.08f, -1.22f, -6.57f, -1.22f)
                curveToRelative(-3.43f, 0f, -6.43f, 1.17f, -6.56f, 1.22f)
                curveToRelative(-0.31f, 0.12f, -0.54f, 0.4f, -0.61f, 0.72f)
                curveToRelative(-0.03f, 0.16f, -0.83f, 4.0f, -0.83f, 9.05f)
                reflectiveCurveToRelative(0.79f, 8.89f, 0.83f, 9.05f)
                curveToRelative(0.07f, 0.33f, 0.3f, 0.6f, 0.62f, 0.73f)
                curveToRelative(0.13f, 0.05f, 3.19f, 1.22f, 6.55f, 1.22f)
                curveToRelative(3.48f, 0f, 6.44f, -1.17f, 6.57f, -1.22f)
                curveToRelative(0.31f, -0.12f, 0.54f, -0.4f, 0.6f, -0.72f)
                curveToRelative(0.03f, -0.16f, 0.83f, -3.97f, 0.83f, -9.06f)
                curveToRelative(0f, -5.13f, -0.79f, -8.9f, -0.83f, -9.06f)
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
        }.also { _MobileButton = it}
