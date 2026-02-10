package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _KiwiBird: ImageVector? = null

val Icons.Ss.KiwiBird: ImageVector
    get() = _KiwiBird ?: UXIcon(name = "KiwiBird") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.67f, 5.89f)
                curveToRelative(0.3f, -0.77f, 0.41f, -1.61f, 0.27f, -2.46f)
                curveToRelative(-0.29f, -1.68f, -1.67f, -3.07f, -3.35f, -3.36f)
                curveToRelative(-1.24f, -0.22f, -2.5f, 0.12f, -3.44f, 0.93f)
                curveToRelative(-1.17f, 1.0f, -3.05f, 2.19f, -5.37f, 2.19f)
                horizontalLineToRelative(-0.11f)
                curveTo(4.12f, 3.18f, 0.33f, 6.6f, 0.02f, 10.98f)
                curveToRelative(-0.17f, 2.45f, 0.72f, 4.84f, 2.44f, 6.57f)
                curveToRelative(0.85f, 0.85f, 1.86f, 1.49f, 2.96f, 1.9f)
                lineToRelative(0.57f, 4.55f)
                horizontalLineToRelative(2.19f)
                lineToRelative(-0.5f, -4.04f)
                curveToRelative(0.23f, 0.02f, 0.47f, 0.04f, 0.71f, 0.04f)
                curveToRelative(0.2f, 0f, 0.4f, -0.01f, 0.6f, -0.02f)
                curveToRelative(0.49f, -0.04f, 0.96f, -0.12f, 1.42f, -0.23f)
                lineToRelative(0.53f, 4.25f)
                horizontalLineToRelative(2.17f)
                lineToRelative(-0.71f, -5f)
                curveToRelative(2.73f, -1.44f, 4.59f, -4.27f, 4.59f, -7.48f)
                verticalLineToRelative(-2.89f)
                curveToRelative(0.01f, -0.04f, 0.05f, -0.1f, 0.08f, -0.13f)
                curveToRelative(0.49f, -0.01f, 0.96f, -0.13f, 1.4f, -0.31f)
                curveToRelative(4.08f, 3.2f, 4.51f, 8.81f, 4.51f, 8.81f)
                horizontalLineToRelative(1f)
                curveToRelative(0f, -5.56f, -2.19f, -9.46f, -3.33f, -11.11f)
                close()
                moveTo(17.5f, 6f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
            }
        }.also { _KiwiBird = it}
