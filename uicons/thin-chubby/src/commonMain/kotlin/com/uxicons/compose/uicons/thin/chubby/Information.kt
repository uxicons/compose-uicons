package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Information: ImageVector? = null

val Icons.Tc.Information: ImageVector
    get() = _Information ?: UXIcon(name = "Information") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17.98f, 22.62f)
                curveToRelative(-0.07f, 0.27f, -0.34f, 0.43f, -0.61f, 0.36f)
                curveToRelative(0.03f, -0.01f, -2.37f, -0.54f, -5.38f, -0.54f)
                curveToRelative(-3.0f, -0.01f, -5.44f, 0.53f, -5.38f, 0.54f)
                curveToRelative(-0.26f, 0.07f, -0.54f, -0.09f, -0.61f, -0.36f)
                curveToRelative(-0.07f, -0.27f, 0.1f, -0.54f, 0.36f, -0.61f)
                curveToRelative(0.09f, -0.02f, 2.09f, -0.5f, 5.12f, -0.56f)
                lineToRelative(0.05f, -11.91f)
                curveToRelative(0f, -2.62f, -0.93f, -3.55f, -3.56f, -3.55f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                reflectiveCurveToRelative(0.22f, -0.5f, 0.5f, -0.5f)
                curveToRelative(3.19f, 0f, 4.56f, 1.36f, 4.56f, 4.56f)
                lineToRelative(-0.05f, 11.9f)
                curveToRelative(3.03f, 0.05f, 5.03f, 0.53f, 5.12f, 0.56f)
                curveToRelative(0.27f, 0.07f, 0.43f, 0.34f, 0.36f, 0.61f)
                close()
                moveTo(10f, 2.5f)
                curveToRelative(0f, -0.95f, 0.55f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.55f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.55f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.55f, -1.5f, -1.5f)
                close()
                moveTo(11f, 2.5f)
                curveToRelative(0f, 0.4f, 0.1f, 0.5f, 0.5f, 0.5f)
                reflectiveCurveToRelative(0.5f, -0.1f, 0.5f, -0.5f)
                reflectiveCurveToRelative(-0.1f, -0.5f, -0.5f, -0.5f)
                reflectiveCurveToRelative(-0.5f, 0.1f, -0.5f, 0.5f)
                close()
            }
        }.also { _Information = it}
