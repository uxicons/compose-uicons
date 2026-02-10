package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FileMinus: ImageVector? = null

val Icons.Sc.FileMinus: ImageVector
    get() = _FileMinus ?: UXIcon(name = "FileMinus") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15.75f, 6.73f)
                curveToRelative(-0.12f, -0.9f, -0.29f, -2.69f, -0.23f, -5.33f)
                curveToRelative(1.49f, 1.23f, 4.36f, 4.24f, 5.77f, 5.59f)
                curveToRelative(-2.33f, 0.1f, -4.48f, -0.12f, -5.54f, -0.27f)
                close()
                moveTo(22f, 12f)
                curveToRelative(0f, 2.97f, -0.34f, 6.09f, -1.0f, 9.19f)
                curveToRelative(-0.09f, 0.4f, -0.41f, 0.72f, -0.8f, 0.81f)
                curveToRelative(-3.01f, 0.67f, -5.8f, 1.01f, -8.2f, 1.01f)
                reflectiveCurveToRelative(-5.19f, -0.34f, -8.2f, -1.01f)
                curveToRelative(-0.4f, -0.09f, -0.72f, -0.41f, -0.8f, -0.81f)
                curveToRelative(-0.66f, -3.09f, -1f, -6.22f, -1f, -9.19f)
                reflectiveCurveToRelative(0.34f, -6.09f, 1.0f, -9.19f)
                curveToRelative(0.09f, -0.4f, 0.41f, -0.72f, 0.8f, -0.81f)
                curveToRelative(3.01f, -0.67f, 5.8f, -1.01f, 8.2f, -1.01f)
                curveToRelative(0.49f, 0f, 1.0f, 0.02f, 1.53f, 0.05f)
                curveToRelative(-0.13f, 4.39f, 0.35f, 6.69f, 0.38f, 6.78f)
                curveToRelative(0.09f, 0.4f, 0.4f, 0.7f, 0.8f, 0.77f)
                curveToRelative(0.12f, 0.02f, 2.46f, 0.42f, 5.38f, 0.42f)
                curveToRelative(0.58f, 0f, 1.18f, -0.02f, 1.79f, -0.06f)
                curveToRelative(0.07f, 1.03f, 0.12f, 2.07f, 0.12f, 3.04f)
                close()
                moveTo(16f, 14f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-6f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(6f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                close()
            }
        }.also { _FileMinus = it}
