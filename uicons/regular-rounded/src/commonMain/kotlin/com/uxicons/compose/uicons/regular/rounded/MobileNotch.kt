package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MobileNotch: ImageVector? = null

val Icons.Rr.MobileNotch: ImageVector
    get() = _MobileNotch ?: UXIcon(name = "MobileNotch") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.04f, 0f)
                curveToRelative(-0.03f, -0.0f, -6.06f, -0.0f, -6.09f, 0f)
                curveToRelative(-2.74f, 0.02f, -4.96f, 2.26f, -4.96f, 5.0f)
                verticalLineToRelative(14f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(6f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                lineTo(20f, 5f)
                curveTo(20f, 2.26f, 17.78f, 0.03f, 15.04f, 0f)
                close()
                moveTo(18f, 19.0f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                horizontalLineToRelative(-6f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                lineTo(6f, 5f)
                curveToRelative(0f, -1.45f, 1.04f, -2.67f, 2.41f, -2.94f)
                lineToRelative(0.69f, 1.39f)
                curveToRelative(0.17f, 0.34f, 0.52f, 0.55f, 0.9f, 0.55f)
                horizontalLineToRelative(4f)
                curveToRelative(0.38f, 0f, 0.72f, -0.21f, 0.9f, -0.55f)
                lineToRelative(0.69f, -1.39f)
                curveToRelative(1.37f, 0.27f, 2.41f, 1.49f, 2.41f, 2.94f)
                verticalLineToRelative(14f)
                close()
                moveTo(13f, 20.0f)
                horizontalLineToRelative(-2f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                horizontalLineToRelative(0f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(2f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                horizontalLineToRelative(0f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                close()
            }
        }.also { _MobileNotch = it}
