package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DiceThree: ImageVector? = null

val Icons.Sc.DiceThree: ImageVector
    get() = _DiceThree ?: UXIcon(name = "DiceThree") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.81f, 2.86f)
                curveToRelative(-0.1f, -0.33f, -0.36f, -0.58f, -0.69f, -0.67f)
                curveToRelative(-0.17f, -0.05f, -4.27f, -1.19f, -9.12f, -1.19f)
                reflectiveCurveTo(3.05f, 2.14f, 2.88f, 2.19f)
                curveToRelative(-0.33f, 0.09f, -0.59f, 0.35f, -0.69f, 0.67f)
                curveToRelative(-0.05f, 0.16f, -1.19f, 4.01f, -1.19f, 9.14f)
                curveToRelative(0f, 5.17f, 1.15f, 8.98f, 1.19f, 9.14f)
                curveToRelative(0.1f, 0.33f, 0.36f, 0.58f, 0.69f, 0.67f)
                curveToRelative(0.17f, 0.05f, 4.27f, 1.19f, 9.12f, 1.19f)
                reflectiveCurveToRelative(8.95f, -1.14f, 9.12f, -1.19f)
                curveToRelative(0.33f, -0.09f, 0.59f, -0.35f, 0.69f, -0.67f)
                curveToRelative(0.05f, -0.16f, 1.19f, -4.01f, 1.19f, -9.14f)
                curveToRelative(0f, -5.17f, -1.15f, -8.98f, -1.19f, -9.14f)
                close()
                moveTo(7.46f, 8.45f)
                curveToRelative(-0.82f, 0f, -1.48f, -0.66f, -1.48f, -1.48f)
                reflectiveCurveToRelative(0.66f, -1.48f, 1.48f, -1.48f)
                reflectiveCurveToRelative(1.48f, 0.66f, 1.48f, 1.48f)
                reflectiveCurveToRelative(-0.66f, 1.48f, -1.48f, 1.48f)
                close()
                moveTo(12f, 13.48f)
                curveToRelative(-0.82f, 0f, -1.48f, -0.66f, -1.48f, -1.48f)
                reflectiveCurveToRelative(0.66f, -1.48f, 1.48f, -1.48f)
                reflectiveCurveToRelative(1.48f, 0.66f, 1.48f, 1.48f)
                reflectiveCurveToRelative(-0.66f, 1.48f, -1.48f, 1.48f)
                close()
                moveTo(16.54f, 18.52f)
                curveToRelative(-0.82f, 0f, -1.48f, -0.66f, -1.48f, -1.48f)
                reflectiveCurveToRelative(0.66f, -1.48f, 1.48f, -1.48f)
                reflectiveCurveToRelative(1.48f, 0.66f, 1.48f, 1.48f)
                reflectiveCurveToRelative(-0.66f, 1.48f, -1.48f, 1.48f)
                close()
            }
        }.also { _DiceThree = it}
