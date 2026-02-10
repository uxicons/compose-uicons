package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleJ: ImageVector? = null

val Icons.Tc.CircleJ: ImageVector
    get() = _CircleJ ?: UXIcon(name = "CircleJ") {
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
                moveTo(15.58f, 6.44f)
                curveToRelative(0.02f, 0.14f, 0.42f, 3.36f, 0.42f, 6.11f)
                curveToRelative(0f, 3.72f, -1.43f, 5.45f, -4.5f, 5.45f)
                curveToRelative(-2.09f, 0f, -3.35f, -0.73f, -3.97f, -2.29f)
                curveToRelative(-0.1f, -0.26f, 0.02f, -0.55f, 0.28f, -0.65f)
                curveToRelative(0.26f, -0.1f, 0.55f, 0.02f, 0.65f, 0.28f)
                curveToRelative(0.46f, 1.16f, 1.37f, 1.66f, 3.04f, 1.66f)
                curveToRelative(2.49f, 0f, 3.5f, -1.29f, 3.5f, -4.45f)
                curveToRelative(0f, -2.69f, -0.41f, -5.95f, -0.42f, -5.99f)
                curveToRelative(-0.04f, -0.27f, 0.16f, -0.52f, 0.43f, -0.56f)
                curveToRelative(0.27f, -0.03f, 0.52f, 0.16f, 0.56f, 0.43f)
                close()
            }
        }.also { _CircleJ = it}
