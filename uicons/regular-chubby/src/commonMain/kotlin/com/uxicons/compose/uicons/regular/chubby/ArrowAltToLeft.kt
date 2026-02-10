package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowAltToLeft: ImageVector? = null

val Icons.Rc.ArrowAltToLeft: ImageVector
    get() = _ArrowAltToLeft ?: UXIcon(name = "ArrowAltToLeft") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 19f)
                verticalLineToRelative(-4.66f)
                curveToRelative(1.26f, 1.02f, 3.15f, 2.22f, 5.55f, 2.81f)
                curveToRelative(0.44f, 0.11f, 0.9f, -0.09f, 1.11f, -0.49f)
                curveToRelative(0.04f, -0.08f, 0.94f, -1.73f, 1.19f, -3.66f)
                horizontalLineToRelative(11.14f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                horizontalLineTo(10.85f)
                curveToRelative(-0.28f, -1.95f, -1.24f, -3.6f, -1.28f, -3.68f)
                curveToRelative(-0.22f, -0.38f, -0.67f, -0.57f, -1.09f, -0.47f)
                curveToRelative(-2.36f, 0.56f, -4.22f, 1.75f, -5.47f, 2.78f)
                verticalLineTo(5f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(14f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                close()
            }
        }.also { _ArrowAltToLeft = it}
