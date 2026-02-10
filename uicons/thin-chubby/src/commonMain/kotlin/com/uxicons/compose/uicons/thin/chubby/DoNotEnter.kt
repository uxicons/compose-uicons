package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DoNotEnter: ImageVector? = null

val Icons.Tc.DoNotEnter: ImageVector
    get() = _DoNotEnter ?: UXIcon(name = "DoNotEnter") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 1f)
                curveToRelative(-7.81f, 0f, -11f, 3.19f, -11f, 11f)
                reflectiveCurveToRelative(3.19f, 11f, 11f, 11f)
                reflectiveCurveToRelative(11f, -3.19f, 11f, -11f)
                reflectiveCurveToRelative(-3.19f, -11f, -11f, -11f)
                close()
                moveTo(12f, 22f)
                curveToRelative(-7.2f, 0f, -10f, -2.8f, -10f, -10f)
                reflectiveCurveToRelative(2.8f, -10f, 10f, -10f)
                reflectiveCurveToRelative(10f, 2.8f, 10f, 10f)
                reflectiveCurveToRelative(-2.8f, 10f, -10f, 10f)
                close()
                moveTo(18.32f, 9.51f)
                curveToRelative(-0.09f, -0.02f, -2.17f, -0.51f, -6.32f, -0.51f)
                reflectiveCurveToRelative(-6.24f, 0.49f, -6.32f, 0.51f)
                curveToRelative(-0.16f, 0.04f, -0.29f, 0.15f, -0.35f, 0.3f)
                curveToRelative(-0.01f, 0.03f, -0.33f, 0.85f, -0.33f, 2.18f)
                reflectiveCurveToRelative(0.32f, 2.15f, 0.33f, 2.18f)
                curveToRelative(0.06f, 0.15f, 0.19f, 0.27f, 0.35f, 0.3f)
                curveToRelative(0.09f, 0.02f, 2.17f, 0.51f, 6.32f, 0.51f)
                reflectiveCurveToRelative(6.23f, -0.49f, 6.32f, -0.51f)
                curveToRelative(0.16f, -0.04f, 0.29f, -0.15f, 0.35f, -0.3f)
                curveToRelative(0.01f, -0.03f, 0.33f, -0.85f, 0.33f, -2.18f)
                reflectiveCurveToRelative(-0.32f, -2.15f, -0.33f, -2.18f)
                curveToRelative(-0.06f, -0.15f, -0.19f, -0.26f, -0.35f, -0.3f)
                close()
                moveTo(17.81f, 13.57f)
                curveToRelative(-0.68f, 0.13f, -2.63f, 0.43f, -5.81f, 0.43f)
                reflectiveCurveToRelative(-5.13f, -0.3f, -5.81f, -0.43f)
                curveToRelative(-0.08f, -0.29f, -0.19f, -0.84f, -0.19f, -1.57f)
                reflectiveCurveToRelative(0.11f, -1.27f, 0.19f, -1.57f)
                curveToRelative(0.68f, -0.13f, 2.63f, -0.43f, 5.81f, -0.43f)
                reflectiveCurveToRelative(5.13f, 0.3f, 5.81f, 0.43f)
                curveToRelative(0.08f, 0.29f, 0.19f, 0.84f, 0.19f, 1.57f)
                reflectiveCurveToRelative(-0.11f, 1.27f, -0.19f, 1.57f)
                close()
            }
        }.also { _DoNotEnter = it}
