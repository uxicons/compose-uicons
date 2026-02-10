package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowAltCircleLeft: ImageVector? = null

val Icons.Rc.ArrowAltCircleLeft: ImageVector
    get() = _ArrowAltCircleLeft ?: UXIcon(name = "ArrowAltCircleLeft") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23f, 12f)
                curveToRelative(0f, -5.12f, -1.25f, -11f, -11f, -11f)
                reflectiveCurveTo(1f, 6.88f, 1f, 12f)
                reflectiveCurveToRelative(1.25f, 11f, 11f, 11f)
                reflectiveCurveToRelative(11f, -5.88f, 11f, -11f)
                close()
                moveTo(3f, 12f)
                curveTo(3f, 6.6f, 4.53f, 3f, 12f, 3f)
                reflectiveCurveToRelative(9f, 3.6f, 9f, 9f)
                reflectiveCurveToRelative(-1.53f, 9f, -9f, 9f)
                reflectiveCurveTo(3f, 17.4f, 3f, 12f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.97f, 15.6f)
                curveToRelative(0.03f, -0.06f, 0.66f, -1.21f, 0.89f, -2.6f)
                horizontalLineToRelative(3.14f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-3.15f)
                curveToRelative(-0.25f, -1.41f, -0.93f, -2.57f, -0.96f, -2.63f)
                curveToRelative(-0.22f, -0.38f, -0.66f, -0.56f, -1.09f, -0.47f)
                curveToRelative(-3.43f, 0.8f, -5.5f, 3.36f, -5.58f, 3.47f)
                curveToRelative(-0.5f, 0.7f, 0.01f, 1.26f, 0.04f, 1.29f)
                curveToRelative(0.38f, 0.44f, 2.4f, 2.65f, 5.6f, 3.42f)
                curveToRelative(0.44f, 0.11f, 0.89f, -0.09f, 1.11f, -0.49f)
                close()
            }
        }.also { _ArrowAltCircleLeft = it}
