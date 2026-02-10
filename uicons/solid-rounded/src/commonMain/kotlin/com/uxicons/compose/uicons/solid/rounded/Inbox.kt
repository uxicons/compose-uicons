package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Inbox: ImageVector? = null

val Icons.Sr.Inbox: ImageVector
    get() = _Inbox ?: UXIcon(name = "Inbox", viewportWidth = 512f, viewportHeight = 512f) {
            path(fill = SolidColor(Color.Black)) {
                moveTo(448f, 213.33f)
                horizontalLineToRelative(-64f)
                curveToRelative(-23.56f, 0f, -42.67f, 19.1f, -42.67f, 42.67f)
                reflectiveCurveToRelative(-19.1f, 42.67f, -42.67f, 42.67f)
                horizontalLineToRelative(-85.33f)
                curveToRelative(-23.56f, 0f, -42.67f, -19.1f, -42.67f, -42.67f)
                reflectiveCurveTo(151.56f, 213.33f, 128f, 213.33f)
                horizontalLineTo(64f)
                curveToRelative(-35.35f, 0f, -64f, 28.65f, -64f, 64f)
                verticalLineToRelative(85.33f)
                curveToRelative(0.07f, 58.88f, 47.79f, 106.6f, 106.67f, 106.67f)
                horizontalLineToRelative(298.67f)
                curveTo(464.21f, 469.26f, 511.93f, 421.55f, 512f, 362.67f)
                verticalLineToRelative(-85.33f)
                curveTo(512f, 241.99f, 483.35f, 213.33f, 448f, 213.33f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(64f, 170.67f)
                horizontalLineToRelative(384f)
                curveToRelative(11.78f, 0f, 21.33f, -9.55f, 21.33f, -21.33f)
                curveToRelative(0f, -11.78f, -9.55f, -21.33f, -21.33f, -21.33f)
                horizontalLineTo(64f)
                curveToRelative(-11.78f, 0f, -21.33f, 9.55f, -21.33f, 21.33f)
                curveTo(42.67f, 161.12f, 52.22f, 170.67f, 64f, 170.67f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(64f, 85.33f)
                horizontalLineToRelative(384f)
                curveToRelative(11.78f, 0f, 21.33f, -9.55f, 21.33f, -21.33f)
                reflectiveCurveTo(459.78f, 42.67f, 448f, 42.67f)
                horizontalLineTo(64f)
                curveToRelative(-11.78f, 0f, -21.33f, 9.55f, -21.33f, 21.33f)
                reflectiveCurveTo(52.22f, 85.33f, 64f, 85.33f)
                close()
            }
        }.also { _Inbox = it}
