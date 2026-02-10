package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowAltCircleRight: ImageVector? = null

val Icons.Sc.ArrowAltCircleRight: ImageVector
    get() = _ArrowAltCircleRight ?: UXIcon(name = "ArrowAltCircleRight") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(1f, 12f)
                curveToRelative(0f, 5.12f, 1.25f, 11f, 11f, 11f)
                reflectiveCurveToRelative(11f, -5.88f, 11f, -11f)
                reflectiveCurveTo(21.75f, 1f, 12f, 1f)
                reflectiveCurveTo(1f, 6.88f, 1f, 12f)
                close()
                moveTo(12.14f, 7.91f)
                curveToRelative(3.21f, 0.78f, 5.22f, 2.98f, 5.6f, 3.42f)
                curveToRelative(0.02f, 0.03f, 0.53f, 0.59f, 0.04f, 1.29f)
                curveToRelative(-0.08f, 0.11f, -2.15f, 2.67f, -5.58f, 3.47f)
                curveToRelative(-0.43f, 0.1f, -0.87f, -0.09f, -1.09f, -0.47f)
                curveToRelative(-0.04f, -0.06f, -0.71f, -1.21f, -0.96f, -2.63f)
                horizontalLineToRelative(-3.15f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(3.14f)
                curveToRelative(0.23f, -1.4f, 0.86f, -2.54f, 0.89f, -2.6f)
                curveToRelative(0.22f, -0.39f, 0.67f, -0.59f, 1.11f, -0.49f)
                close()
            }
        }.also { _ArrowAltCircleRight = it}
