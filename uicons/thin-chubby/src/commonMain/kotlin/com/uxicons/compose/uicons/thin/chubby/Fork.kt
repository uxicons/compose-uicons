package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Fork: ImageVector? = null

val Icons.Tc.Fork: ImageVector
    get() = _Fork ?: UXIcon(name = "Fork") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.67f, 8.47f)
                curveToRelative(-0.24f, -0.12f, -0.55f, -0.02f, -0.67f, 0.23f)
                curveToRelative(-0.01f, 0.02f, -0.94f, 1.88f, -2.8f, 3.74f)
                curveToRelative(-1.52f, 1.53f, -3.07f, 2.45f, -3.56f, 2.73f)
                curveToRelative(-0.58f, -0.15f, -2.48f, -0.73f, -4.02f, -2.08f)
                lineTo(20.28f, 4.38f)
                curveToRelative(0.19f, -0.2f, 0.19f, -0.51f, -0.0f, -0.71f)
                curveToRelative(-0.2f, -0.19f, -0.51f, -0.19f, -0.71f, 0.0f)
                lineTo(10.92f, 12.38f)
                curveToRelative(-1.34f, -1.55f, -1.91f, -3.46f, -2.06f, -4.04f)
                curveToRelative(0.27f, -0.48f, 1.17f, -2.03f, 2.71f, -3.58f)
                curveToRelative(1.83f, -1.84f, 3.7f, -2.8f, 3.72f, -2.81f)
                curveToRelative(0.25f, -0.12f, 0.34f, -0.43f, 0.22f, -0.67f)
                reflectiveCurveToRelative(-0.42f, -0.35f, -0.67f, -0.22f)
                curveToRelative(-0.08f, 0.04f, -2.02f, 1.03f, -3.98f, 3.0f)
                curveToRelative(-1.97f, 1.98f, -2.94f, 3.92f, -2.98f, 4.0f)
                curveToRelative(-0.05f, 0.1f, -0.06f, 0.21f, -0.04f, 0.33f)
                curveToRelative(0.02f, 0.12f, 0.58f, 2.68f, 2.38f, 4.71f)
                lineTo(1.2f, 22.15f)
                curveToRelative(-0.19f, 0.2f, -0.19f, 0.51f, 0.0f, 0.71f)
                curveToRelative(0.1f, 0.1f, 0.23f, 0.15f, 0.35f, 0.15f)
                reflectiveCurveToRelative(0.26f, -0.05f, 0.35f, -0.15f)
                lineTo(10.92f, 13.8f)
                curveToRelative(2.02f, 1.8f, 4.57f, 2.36f, 4.69f, 2.39f)
                curveToRelative(0.03f, 0.01f, 0.07f, 0.01f, 0.1f, 0.01f)
                curveToRelative(0.08f, 0f, 0.15f, -0.02f, 0.23f, -0.05f)
                curveToRelative(0.08f, -0.04f, 2.02f, -1.03f, 3.98f, -3.0f)
                curveToRelative(1.97f, -1.98f, 2.94f, -3.92f, 2.98f, -4.0f)
                curveToRelative(0.12f, -0.25f, 0.02f, -0.55f, -0.23f, -0.67f)
                close()
            }
        }.also { _Fork = it}
