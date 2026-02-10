package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleJ: ImageVector? = null

val Icons.Sc.CircleJ: ImageVector
    get() = _CircleJ ?: UXIcon(name = "CircleJ") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 1f)
                curveToRelative(-7.71f, 0f, -11f, 3.29f, -11f, 11f)
                reflectiveCurveToRelative(3.29f, 11f, 11f, 11f)
                reflectiveCurveToRelative(11f, -3.29f, 11f, -11f)
                reflectiveCurveToRelative(-3.29f, -11f, -11f, -11f)
                close()
                moveTo(15.63f, 6.88f)
                curveToRelative(0.01f, 0.12f, 0.37f, 3.09f, 0.37f, 5.62f)
                curveToRelative(0f, 1.36f, 0f, 5.5f, -4.4f, 5.5f)
                curveToRelative(-2.15f, 0f, -3.48f, -0.88f, -4.06f, -2.7f)
                curveToRelative(-0.17f, -0.53f, 0.12f, -1.09f, 0.65f, -1.26f)
                curveToRelative(0.53f, -0.17f, 1.09f, 0.12f, 1.26f, 0.65f)
                curveToRelative(0.26f, 0.81f, 0.7f, 1.3f, 2.15f, 1.3f)
                curveToRelative(1.31f, 0f, 2.4f, -0.26f, 2.4f, -3.5f)
                curveToRelative(0f, -2.41f, -0.35f, -5.35f, -0.36f, -5.38f)
                curveToRelative(-0.07f, -0.55f, 0.32f, -1.05f, 0.87f, -1.11f)
                curveToRelative(0.55f, -0.07f, 1.05f, 0.32f, 1.11f, 0.87f)
                close()
            }
        }.also { _CircleJ = it}
