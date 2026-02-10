package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TugrikSign: ImageVector? = null

val Icons.Sr.TugrikSign: ImageVector
    get() = _TugrikSign ?: UXIcon(name = "TugrikSign") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 1f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                horizontalLineTo(13f)
                verticalLineToRelative(7.08f)
                lineToRelative(5.66f, -2.02f)
                curveToRelative(0.52f, -0.19f, 1.09f, 0.08f, 1.28f, 0.61f)
                curveToRelative(0.19f, 0.52f, -0.08f, 1.09f, -0.61f, 1.28f)
                lineToRelative(-6.34f, 2.26f)
                verticalLineToRelative(1.88f)
                lineToRelative(5.66f, -2.02f)
                curveToRelative(0.52f, -0.19f, 1.09f, 0.09f, 1.28f, 0.61f)
                curveToRelative(0.19f, 0.52f, -0.08f, 1.09f, -0.61f, 1.28f)
                lineToRelative(-6.34f, 2.26f)
                verticalLineToRelative(7.8f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-7.08f)
                lineToRelative(-5.66f, 2.02f)
                curveToRelative(-0.11f, 0.04f, -0.22f, 0.06f, -0.34f, 0.06f)
                curveToRelative(-0.41f, 0f, -0.8f, -0.25f, -0.94f, -0.66f)
                curveToRelative(-0.19f, -0.52f, 0.08f, -1.09f, 0.61f, -1.28f)
                lineToRelative(6.34f, -2.26f)
                verticalLineToRelative(-1.88f)
                lineToRelative(-5.66f, 2.02f)
                curveToRelative(-0.11f, 0.04f, -0.22f, 0.06f, -0.34f, 0.06f)
                curveToRelative(-0.41f, 0f, -0.8f, -0.25f, -0.94f, -0.66f)
                curveToRelative(-0.19f, -0.52f, 0.08f, -1.09f, 0.61f, -1.28f)
                lineToRelative(6.34f, -2.26f)
                verticalLineTo(2f)
                horizontalLineTo(3f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineTo(21f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                close()
            }
        }.also { _TugrikSign = it}
