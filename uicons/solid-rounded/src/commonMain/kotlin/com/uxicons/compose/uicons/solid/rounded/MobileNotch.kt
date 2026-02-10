package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MobileNotch: ImageVector? = null

val Icons.Sr.MobileNotch: ImageVector
    get() = _MobileNotch ?: UXIcon(name = "MobileNotch") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.6f, 0.04f)
                lineToRelative(-0.71f, 1.41f)
                curveToRelative(-0.17f, 0.34f, -0.52f, 0.55f, -0.9f, 0.55f)
                horizontalLineToRelative(-4f)
                curveToRelative(-0.38f, 0f, -0.72f, -0.21f, -0.9f, -0.55f)
                lineTo(8.4f, 0.04f)
                curveToRelative(-2.48f, 0.3f, -4.4f, 2.41f, -4.4f, 4.96f)
                verticalLineToRelative(14f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(6f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                lineTo(20f, 5f)
                curveTo(20f, 2.45f, 18.07f, 0.33f, 15.6f, 0.04f)
                close()
                moveTo(13f, 21f)
                horizontalLineToRelative(-2f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(2f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                close()
            }
        }.also { _MobileNotch = it}
