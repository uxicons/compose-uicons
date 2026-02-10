package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowAltSquareUp: ImageVector? = null

val Icons.Sc.ArrowAltSquareUp: ImageVector
    get() = _ArrowAltSquareUp ?: UXIcon(name = "ArrowAltSquareUp") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2.19f, 21.14f)
                curveToRelative(0.1f, 0.33f, 0.36f, 0.58f, 0.69f, 0.67f)
                curveToRelative(0.17f, 0.05f, 4.27f, 1.19f, 9.12f, 1.19f)
                reflectiveCurveToRelative(8.95f, -1.14f, 9.12f, -1.19f)
                curveToRelative(0.33f, -0.09f, 0.59f, -0.35f, 0.69f, -0.67f)
                curveToRelative(0.05f, -0.16f, 1.19f, -4.01f, 1.19f, -9.14f)
                curveToRelative(0f, -5.17f, -1.15f, -8.98f, -1.19f, -9.14f)
                curveToRelative(-0.1f, -0.33f, -0.36f, -0.58f, -0.69f, -0.67f)
                curveToRelative(-0.17f, -0.05f, -4.27f, -1.19f, -9.12f, -1.19f)
                reflectiveCurveTo(3.05f, 2.14f, 2.88f, 2.19f)
                curveToRelative(-0.33f, 0.09f, -0.59f, 0.35f, -0.69f, 0.67f)
                curveToRelative(-0.05f, 0.16f, -1.19f, 4.01f, -1.19f, 9.14f)
                curveToRelative(0f, 5.17f, 1.15f, 8.98f, 1.19f, 9.14f)
                close()
                moveTo(7.92f, 11.86f)
                curveToRelative(0.78f, -3.21f, 2.98f, -5.22f, 3.42f, -5.6f)
                curveToRelative(0.03f, -0.02f, 0.59f, -0.53f, 1.29f, -0.04f)
                curveToRelative(0.11f, 0.08f, 2.67f, 2.15f, 3.47f, 5.58f)
                curveToRelative(0.1f, 0.43f, -0.09f, 0.87f, -0.47f, 1.09f)
                curveToRelative(-0.06f, 0.04f, -1.21f, 0.71f, -2.63f, 0.96f)
                verticalLineToRelative(3.15f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-3.14f)
                curveToRelative(-1.4f, -0.23f, -2.54f, -0.86f, -2.6f, -0.89f)
                curveToRelative(-0.39f, -0.22f, -0.59f, -0.67f, -0.49f, -1.11f)
                close()
            }
        }.also { _ArrowAltSquareUp = it}
