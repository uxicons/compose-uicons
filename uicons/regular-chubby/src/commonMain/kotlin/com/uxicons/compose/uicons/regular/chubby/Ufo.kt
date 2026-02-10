package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Ufo: ImageVector? = null

val Icons.Rc.Ufo: ImageVector
    get() = _Ufo ?: UXIcon(name = "Ufo") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13f, 15f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                close()
                moveTo(6f, 13f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
                moveTo(18f, 13f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
                moveTo(23f, 14f)
                curveToRelative(0f, 4.4f, -5.29f, 5f, -11f, 5f)
                reflectiveCurveToRelative(-11f, -0.6f, -11f, -4.97f)
                curveToRelative(0f, -3.13f, 2.67f, -4.15f, 5.03f, -4.58f)
                curveToRelative(0.17f, -3.75f, 2.02f, -5.45f, 5.97f, -5.45f)
                reflectiveCurveToRelative(5.8f, 1.7f, 5.97f, 5.45f)
                curveToRelative(2.36f, 0.43f, 5.03f, 1.45f, 5.03f, 4.55f)
                close()
                moveTo(8f, 10.35f)
                curveToRelative(0.5f, 0.24f, 1.69f, 0.65f, 4f, 0.65f)
                curveToRelative(2.29f, 0f, 3.48f, -0.41f, 4f, -0.66f)
                verticalLineToRelative(-0.34f)
                curveToRelative(0f, -3.03f, -0.97f, -4f, -4f, -4f)
                reflectiveCurveToRelative(-4f, 0.97f, -4f, 4f)
                close()
                moveTo(21f, 14.03f)
                curveToRelative(0f, -1.03f, -0.42f, -2.02f, -3.2f, -2.57f)
                curveToRelative(-0.39f, 0.48f, -1.53f, 1.48f, -5.8f, 1.54f)
                curveToRelative(-4.27f, -0.07f, -5.42f, -1.07f, -5.8f, -1.54f)
                curveToRelative(-2.78f, 0.55f, -3.2f, 1.54f, -3.2f, 2.54f)
                curveToRelative(0f, 1.57f, 1.09f, 3f, 9f, 3f)
                reflectiveCurveToRelative(9f, -1.43f, 9f, -2.97f)
                close()
            }
        }.also { _Ufo = it}
