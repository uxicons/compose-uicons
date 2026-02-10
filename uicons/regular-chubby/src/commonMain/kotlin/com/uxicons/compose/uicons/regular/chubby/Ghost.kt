package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Ghost: ImageVector? = null

val Icons.Rc.Ghost: ImageVector
    get() = _Ghost ?: UXIcon(name = "Ghost") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 1f)
                curveToRelative(-6.31f, 0f, -9f, 2.69f, -9f, 9f)
                verticalLineToRelative(11f)
                curveToRelative(0f, 0.53f, 0.42f, 0.97f, 0.95f, 1.0f)
                curveToRelative(0.55f, 0.03f, 0.99f, -0.38f, 1.04f, -0.91f)
                curveToRelative(0.06f, -0.68f, 0.17f, -1.09f, 1.5f, -1.09f)
                curveToRelative(1.23f, 0f, 1.5f, 0.27f, 1.5f, 1.5f)
                verticalLineToRelative(0.5f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                curveToRelative(0f, -1.59f, 0.41f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.41f, 2f, 2f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0f, -1.23f, 0.27f, -1.5f, 1.5f, -1.5f)
                curveToRelative(1.34f, 0f, 1.44f, 0.41f, 1.5f, 1.09f)
                curveToRelative(0.05f, 0.53f, 0.48f, 0.94f, 1.04f, 0.91f)
                curveToRelative(0.53f, -0.02f, 0.95f, -0.47f, 0.95f, -1.0f)
                verticalLineToRelative(-11f)
                curveToRelative(0f, -6.31f, -2.69f, -9f, -9f, -9f)
                close()
                moveTo(19f, 18.21f)
                curveToRelative(-0.43f, -0.14f, -0.93f, -0.21f, -1.5f, -0.21f)
                curveToRelative(-1.16f, 0f, -2.03f, 0.29f, -2.62f, 0.87f)
                curveToRelative(-0.66f, -0.58f, -1.62f, -0.87f, -2.88f, -0.87f)
                reflectiveCurveToRelative(-2.22f, 0.29f, -2.88f, 0.87f)
                curveToRelative(-0.58f, -0.58f, -1.46f, -0.87f, -2.62f, -0.87f)
                curveToRelative(-0.57f, 0f, -1.07f, 0.07f, -1.5f, 0.21f)
                verticalLineToRelative(-8.21f)
                curveToRelative(0f, -5.17f, 1.83f, -7f, 7f, -7f)
                reflectiveCurveToRelative(7f, 1.83f, 7f, 7f)
                close()
                moveTo(10f, 10f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                close()
                moveTo(16f, 10f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                close()
            }
        }.also { _Ghost = it}
