package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowAltToTop: ImageVector? = null

val Icons.Rc.ArrowAltToTop: ImageVector
    get() = _ArrowAltToTop ?: UXIcon(name = "ArrowAltToTop") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5f, 3f)
                horizontalLineToRelative(4.66f)
                curveToRelative(-1.02f, 1.26f, -2.22f, 3.15f, -2.81f, 5.55f)
                curveToRelative(-0.11f, 0.44f, 0.09f, 0.9f, 0.49f, 1.11f)
                curveToRelative(0.08f, 0.04f, 1.73f, 0.94f, 3.66f, 1.19f)
                verticalLineToRelative(11.14f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineTo(10.85f)
                curveToRelative(1.95f, -0.28f, 3.6f, -1.24f, 3.68f, -1.28f)
                curveToRelative(0.38f, -0.22f, 0.57f, -0.67f, 0.47f, -1.09f)
                curveToRelative(-0.56f, -2.36f, -1.75f, -4.22f, -2.78f, -5.47f)
                horizontalLineToRelative(4.63f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                horizontalLineTo(5f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                close()
            }
        }.also { _ArrowAltToTop = it}
