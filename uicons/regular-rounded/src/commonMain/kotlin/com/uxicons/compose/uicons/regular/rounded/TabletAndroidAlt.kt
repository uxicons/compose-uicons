package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TabletAndroidAlt: ImageVector? = null

val Icons.Rr.TabletAndroidAlt: ImageVector
    get() = _TabletAndroidAlt ?: UXIcon(name = "TabletAndroidAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16f, 0f)
                horizontalLineToRelative(-8f)
                curveTo(5.24f, 0f, 3f, 2.24f, 3f, 5f)
                verticalLineToRelative(14f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(8f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                lineTo(21f, 5f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                close()
                moveTo(8f, 2f)
                horizontalLineToRelative(8f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                verticalLineToRelative(11f)
                lineTo(5f, 16f)
                lineTo(5f, 5f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                close()
                moveTo(16f, 22f)
                horizontalLineToRelative(-8f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                close()
                moveTo(14f, 20f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-2f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(2f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                close()
            }
        }.also { _TabletAndroidAlt = it}
