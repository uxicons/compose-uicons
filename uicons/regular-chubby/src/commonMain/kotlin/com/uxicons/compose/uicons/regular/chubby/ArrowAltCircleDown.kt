package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowAltCircleDown: ImageVector? = null

val Icons.Rc.ArrowAltCircleDown: ImageVector
    get() = _ArrowAltCircleDown ?: UXIcon(name = "ArrowAltCircleDown") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 1f)
                curveTo(6.88f, 1f, 1f, 2.25f, 1f, 12f)
                reflectiveCurveToRelative(5.88f, 11f, 11f, 11f)
                reflectiveCurveToRelative(11f, -1.25f, 11f, -11f)
                reflectiveCurveTo(17.12f, 1f, 12f, 1f)
                close()
                moveTo(12f, 21f)
                curveToRelative(-5.4f, 0f, -9f, -1.53f, -9f, -9f)
                reflectiveCurveTo(6.6f, 3f, 12f, 3f)
                reflectiveCurveToRelative(9f, 1.53f, 9f, 9f)
                reflectiveCurveToRelative(-3.6f, 9f, -9f, 9f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.6f, 11.03f)
                curveToRelative(-0.06f, -0.03f, -1.21f, -0.66f, -2.6f, -0.89f)
                verticalLineToRelative(-3.14f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(3.15f)
                curveToRelative(-1.41f, 0.25f, -2.57f, 0.93f, -2.63f, 0.96f)
                curveToRelative(-0.38f, 0.22f, -0.56f, 0.66f, -0.47f, 1.09f)
                curveToRelative(0.8f, 3.43f, 3.36f, 5.5f, 3.47f, 5.58f)
                curveToRelative(0.7f, 0.5f, 1.26f, -0.01f, 1.29f, -0.04f)
                curveToRelative(0.44f, -0.38f, 2.65f, -2.4f, 3.42f, -5.6f)
                curveToRelative(0.11f, -0.44f, -0.09f, -0.89f, -0.49f, -1.11f)
                close()
            }
        }.also { _ArrowAltCircleDown = it}
