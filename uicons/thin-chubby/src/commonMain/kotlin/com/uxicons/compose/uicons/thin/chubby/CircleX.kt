package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleX: ImageVector? = null

val Icons.Tc.CircleX: ImageVector
    get() = _CircleX ?: UXIcon(name = "CircleX") {
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
                moveTo(12.95f, 12.7f)
                curveToRelative(-0.11f, 0.15f, -0.21f, 0.28f, -0.32f, 0.43f)
                curveToRelative(2.01f, 2.56f, 3.67f, 3.98f, 3.69f, 3.99f)
                curveToRelative(0.21f, 0.18f, 0.24f, 0.49f, 0.06f, 0.7f)
                curveToRelative(-0.18f, 0.21f, -0.49f, 0.24f, -0.7f, 0.06f)
                curveToRelative(-0.08f, -0.07f, -1.69f, -1.43f, -3.68f, -3.94f)
                curveToRelative(-1.99f, 2.51f, -3.6f, 3.87f, -3.68f, 3.94f)
                curveToRelative(-0.21f, 0.18f, -0.53f, 0.15f, -0.7f, -0.06f)
                reflectiveCurveToRelative(-0.15f, -0.53f, 0.06f, -0.7f)
                curveToRelative(0.02f, -0.02f, 1.69f, -1.43f, 3.69f, -3.99f)
                curveToRelative(-2.22f, -2.88f, -3.91f, -6.46f, -3.84f, -6.44f)
                curveToRelative(-0.1f, -0.26f, 0.02f, -0.55f, 0.28f, -0.65f)
                curveToRelative(0.25f, -0.11f, 0.55f, 0.02f, 0.65f, 0.28f)
                curveToRelative(-0.05f, -0.07f, 1.29f, 3.01f, 3.54f, 5.98f)
                curveToRelative(2.23f, -2.96f, 3.6f, -6.09f, 3.54f, -5.98f)
                curveToRelative(0.1f, -0.26f, 0.4f, -0.38f, 0.65f, -0.28f)
                curveToRelative(0.26f, 0.1f, 0.38f, 0.4f, 0.28f, 0.65f)
                curveToRelative(-0.04f, 0.11f, -1.1f, 2.7f, -3.51f, 6.01f)
                close()
            }
        }.also { _CircleX = it}
