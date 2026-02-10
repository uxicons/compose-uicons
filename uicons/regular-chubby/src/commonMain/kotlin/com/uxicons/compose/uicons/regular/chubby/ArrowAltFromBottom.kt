package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowAltFromBottom: ImageVector? = null

val Icons.Rc.ArrowAltFromBottom: ImageVector
    get() = _ArrowAltFromBottom ?: UXIcon(name = "ArrowAltFromBottom") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 21f)
                horizontalLineToRelative(-6f)
                verticalLineTo(10.85f)
                curveToRelative(1.95f, -0.28f, 3.6f, -1.24f, 3.68f, -1.28f)
                curveToRelative(0.38f, -0.22f, 0.57f, -0.67f, 0.47f, -1.09f)
                curveToRelative(-1.05f, -4.46f, -4.38f, -7.15f, -4.53f, -7.25f)
                curveToRelative(-0.69f, -0.5f, -1.26f, 0.01f, -1.28f, 0.04f)
                curveToRelative(-0.57f, 0.49f, -3.46f, 3.11f, -4.48f, 7.3f)
                curveToRelative(-0.11f, 0.44f, 0.09f, 0.9f, 0.49f, 1.11f)
                curveToRelative(0.08f, 0.04f, 1.73f, 0.94f, 3.66f, 1.19f)
                verticalLineToRelative(10.14f)
                horizontalLineTo(5f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(14f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
            }
        }.also { _ArrowAltFromBottom = it}
