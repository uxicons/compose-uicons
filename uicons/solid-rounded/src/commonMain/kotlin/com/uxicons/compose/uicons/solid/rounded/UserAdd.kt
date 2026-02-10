package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserAdd: ImageVector? = null

val Icons.Sr.UserAdd: ImageVector
    get() = _UserAdd ?: UXIcon(name = "UserAdd", viewportWidth = 512f, viewportHeight = 512f) {
            path(fill = SolidColor(Color.Black)) {
                moveTo(490.67f, 234.67f)
                horizontalLineTo(448f)
                verticalLineTo(192f)
                curveToRelative(0f, -11.78f, -9.55f, -21.33f, -21.33f, -21.33f)
                curveToRelative(-11.78f, 0f, -21.33f, 9.55f, -21.33f, 21.33f)
                verticalLineToRelative(42.67f)
                horizontalLineToRelative(-42.67f)
                curveToRelative(-11.78f, 0f, -21.33f, 9.55f, -21.33f, 21.33f)
                curveToRelative(0f, 11.78f, 9.55f, 21.33f, 21.33f, 21.33f)
                horizontalLineToRelative(42.67f)
                verticalLineTo(320f)
                curveToRelative(0f, 11.78f, 9.55f, 21.33f, 21.33f, 21.33f)
                curveToRelative(11.78f, 0f, 21.33f, -9.55f, 21.33f, -21.33f)
                verticalLineToRelative(-42.67f)
                horizontalLineToRelative(42.67f)
                curveToRelative(11.78f, 0f, 21.33f, -9.55f, 21.33f, -21.33f)
                curveTo(512f, 244.22f, 502.45f, 234.67f, 490.67f, 234.67f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(192f, 128f)
                moveToRelative(-128f, 0f)
                arcToRelative(128f, 128f, 0f, isMoreThanHalf = true, isPositiveArc = true, 256f, 0f)
                arcToRelative(128f, 128f, 0f, isMoreThanHalf = true, isPositiveArc = true, -256f, 0f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(192f, 298.67f)
                curveToRelative(-105.99f, 0.12f, -191.88f, 86.01f, -192f, 192f)
                curveTo(0f, 502.45f, 9.55f, 512f, 21.33f, 512f)
                horizontalLineToRelative(341.33f)
                curveToRelative(11.78f, 0f, 21.33f, -9.55f, 21.33f, -21.33f)
                curveTo(383.88f, 384.68f, 297.99f, 298.78f, 192f, 298.67f)
                close()
            }
        }.also { _UserAdd = it}
