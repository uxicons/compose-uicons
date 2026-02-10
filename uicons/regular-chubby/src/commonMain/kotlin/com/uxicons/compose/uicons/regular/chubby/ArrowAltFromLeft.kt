package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowAltFromLeft: ImageVector? = null

val Icons.Rc.ArrowAltFromLeft: ImageVector
    get() = _ArrowAltFromLeft ?: UXIcon(name = "ArrowAltFromLeft") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 19f)
                verticalLineToRelative(-6f)
                horizontalLineTo(13.15f)
                curveToRelative(0.28f, 1.95f, 1.24f, 3.6f, 1.28f, 3.68f)
                curveToRelative(0.22f, 0.38f, 0.67f, 0.57f, 1.09f, 0.47f)
                curveToRelative(4.46f, -1.05f, 7.15f, -4.38f, 7.25f, -4.53f)
                curveToRelative(0.5f, -0.69f, -0.01f, -1.26f, -0.04f, -1.28f)
                curveToRelative(-0.49f, -0.57f, -3.11f, -3.46f, -7.3f, -4.48f)
                curveToRelative(-0.44f, -0.11f, -0.9f, 0.09f, -1.11f, 0.49f)
                curveToRelative(-0.04f, 0.08f, -0.94f, 1.73f, -1.19f, 3.66f)
                horizontalLineTo(3f)
                verticalLineTo(5f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(14f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                close()
            }
        }.also { _ArrowAltFromLeft = it}
