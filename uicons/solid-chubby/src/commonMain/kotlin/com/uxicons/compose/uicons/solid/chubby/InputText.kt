package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _InputText: ImageVector? = null

val Icons.Sc.InputText: ImageVector
    get() = _InputText ?: UXIcon(name = "InputText") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.2f, 5.63f)
                curveToRelative(-0.1f, -0.32f, -0.35f, -0.56f, -0.68f, -0.66f)
                curveToRelative(-0.14f, -0.04f, -3.46f, -0.97f, -9.53f, -0.97f)
                reflectiveCurveToRelative(-9.39f, 0.93f, -9.53f, 0.97f)
                curveToRelative(-0.32f, 0.09f, -0.57f, 0.34f, -0.68f, 0.66f)
                curveToRelative(-0.03f, 0.1f, -0.8f, 2.53f, -0.8f, 6.37f)
                reflectiveCurveToRelative(0.77f, 6.27f, 0.8f, 6.37f)
                curveToRelative(0.1f, 0.32f, 0.35f, 0.56f, 0.68f, 0.66f)
                curveToRelative(0.14f, 0.04f, 3.46f, 0.97f, 9.53f, 0.97f)
                reflectiveCurveToRelative(9.39f, -0.93f, 9.53f, -0.97f)
                curveToRelative(0.32f, -0.09f, 0.57f, -0.34f, 0.68f, -0.66f)
                curveToRelative(0.03f, -0.1f, 0.8f, -2.53f, 0.8f, -6.37f)
                reflectiveCurveToRelative(-0.77f, -6.27f, -0.8f, -6.37f)
                close()
                moveTo(10.75f, 16f)
                horizontalLineToRelative(-0.0f)
                curveToRelative(-0.55f, -0.0f, -1.0f, -0.45f, -1.0f, -1f)
                horizontalLineToRelative(-2.5f)
                reflectiveCurveToRelative(0f, 0.01f, 0f, 0.01f)
                curveToRelative(-0.01f, 0.55f, -0.45f, 0.99f, -1f, 0.99f)
                horizontalLineToRelative(-0.01f)
                curveToRelative(-0.55f, -0.0f, -0.99f, -0.44f, -0.99f, -0.99f)
                curveToRelative(0f, -0.13f, 0.02f, -1.36f, 0.81f, -3.47f)
                curveToRelative(0.76f, -2.01f, 1.52f, -2.99f, 1.67f, -3.17f)
                curveToRelative(0.38f, -0.46f, 1.16f, -0.46f, 1.54f, 0f)
                curveToRelative(0.15f, 0.18f, 0.91f, 1.16f, 1.67f, 3.17f)
                curveToRelative(0.8f, 2.12f, 0.81f, 3.34f, 0.81f, 3.47f)
                curveToRelative(-0.0f, 0.55f, -0.45f, 1.0f, -1f, 1.0f)
                close()
                moveTo(9.06f, 12.23f)
                curveToRelative(0.1f, 0.28f, 0.19f, 0.53f, 0.26f, 0.77f)
                horizontalLineToRelative(-1.65f)
                curveToRelative(0.07f, -0.24f, 0.16f, -0.49f, 0.26f, -0.77f)
                curveToRelative(0.19f, -0.52f, 0.39f, -0.95f, 0.56f, -1.31f)
                curveToRelative(0.18f, 0.36f, 0.37f, 0.79f, 0.56f, 1.31f)
                close()
            }
        }.also { _InputText = it}
