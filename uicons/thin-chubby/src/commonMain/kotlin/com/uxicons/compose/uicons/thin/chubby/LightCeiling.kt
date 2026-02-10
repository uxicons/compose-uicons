package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LightCeiling: ImageVector? = null

val Icons.Tc.LightCeiling: ImageVector
    get() = _LightCeiling ?: UXIcon(name = "LightCeiling") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12.52f, 6.01f)
                lineToRelative(-0.02f, -4.52f)
                curveToRelative(0f, -0.28f, -0.23f, -0.5f, -0.5f, -0.5f)
                horizontalLineToRelative(-0.0f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.23f, -0.5f, 0.5f)
                lineToRelative(0.02f, 4.51f)
                curveToRelative(-7.44f, 0.14f, -10.5f, 3.42f, -10.5f, 11.26f)
                curveToRelative(0f, 0.73f, 0.04f, 1.45f, 0.12f, 2.28f)
                curveToRelative(0.03f, 0.26f, 0.24f, 0.45f, 0.5f, 0.45f)
                horizontalLineToRelative(7.37f)
                curveToRelative(0.02f, 2.07f, 0.94f, 3f, 3.0f, 3f)
                reflectiveCurveToRelative(2.98f, -0.93f, 3.0f, -3f)
                horizontalLineToRelative(7.4f)
                curveToRelative(0.26f, 0f, 0.47f, -0.19f, 0.5f, -0.45f)
                curveToRelative(0.08f, -0.83f, 0.12f, -1.56f, 0.12f, -2.3f)
                curveToRelative(0f, -7.81f, -3.06f, -11.09f, -10.5f, -11.23f)
                close()
                moveTo(12f, 22f)
                curveToRelative(-1.49f, 0f, -1.98f, -0.49f, -2.0f, -2f)
                horizontalLineToRelative(4.0f)
                curveToRelative(-0.01f, 1.51f, -0.5f, 2f, -2.0f, 2f)
                close()
                moveTo(21.94f, 19f)
                horizontalLineToRelative(-19.85f)
                curveToRelative(-0.05f, -0.61f, -0.08f, -1.18f, -0.08f, -1.75f)
                curveToRelative(0f, -7.38f, 2.8f, -10.25f, 10f, -10.25f)
                reflectiveCurveToRelative(10f, 2.87f, 10f, 10.27f)
                curveToRelative(0f, 0.56f, -0.02f, 1.12f, -0.07f, 1.73f)
                close()
            }
        }.also { _LightCeiling = it}
