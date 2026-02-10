package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DownToLine: ImageVector? = null

val Icons.Tc.DownToLine: ImageVector
    get() = _DownToLine ?: UXIcon(name = "DownToLine") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23f, 22.5f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                horizontalLineToRelative(-21f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                reflectiveCurveToRelative(0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(21f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                close()
                moveTo(3.08f, 11.27f)
                curveToRelative(-0.18f, -0.26f, -0.04f, -0.66f, 0.27f, -0.75f)
                curveToRelative(0.05f, -0.02f, 1.28f, -0.41f, 3.66f, -0.69f)
                curveToRelative(-0.04f, -3.48f, 0.56f, -7.87f, 0.56f, -7.84f)
                curveToRelative(0.02f, -0.17f, 0.13f, -0.31f, 0.29f, -0.39f)
                curveToRelative(0.06f, -0.03f, 1.37f, -0.61f, 4.14f, -0.61f)
                reflectiveCurveToRelative(4.09f, 0.58f, 4.14f, 0.61f)
                curveToRelative(0.15f, 0.07f, 0.26f, 0.22f, 0.29f, 0.39f)
                curveToRelative(0.01f, 0.03f, 0.6f, 4.33f, 0.56f, 7.84f)
                curveToRelative(2.38f, 0.28f, 3.6f, 0.67f, 3.66f, 0.69f)
                curveToRelative(0.31f, 0.09f, 0.45f, 0.49f, 0.27f, 0.75f)
                curveToRelative(-2.32f, 3.55f, -5.23f, 6.46f, -8.65f, 8.65f)
                curveToRelative(-0.16f, 0.1f, -0.38f, 0.1f, -0.54f, 0f)
                curveToRelative(-3.42f, -2.19f, -6.33f, -5.09f, -8.65f, -8.65f)
                close()
                moveTo(4.31f, 11.3f)
                curveToRelative(2.12f, 3.08f, 4.7f, 5.63f, 7.69f, 7.6f)
                curveToRelative(2.99f, -1.97f, 5.58f, -4.52f, 7.69f, -7.6f)
                curveToRelative(-0.64f, -0.15f, -1.73f, -0.36f, -3.27f, -0.53f)
                curveToRelative(-0.26f, -0.03f, -0.45f, -0.25f, -0.45f, -0.51f)
                lineToRelative(0.01f, -0.29f)
                curveToRelative(0.01f, -0.11f, 0.01f, -0.22f, 0.01f, -0.33f)
                curveToRelative(0f, -2.98f, -0.39f, -6.24f, -0.52f, -7.23f)
                curveToRelative(-0.47f, -0.15f, -1.61f, -0.43f, -3.48f, -0.43f)
                reflectiveCurveToRelative(-3.01f, 0.28f, -3.48f, 0.43f)
                curveToRelative(-0.13f, 0.98f, -0.52f, 4.24f, -0.52f, 7.23f)
                curveToRelative(0f, 0.11f, 0.01f, 0.22f, 0.01f, 0.33f)
                lineToRelative(0.01f, 0.29f)
                curveToRelative(0.01f, 0.26f, -0.19f, 0.48f, -0.45f, 0.51f)
                curveToRelative(-1.53f, 0.16f, -2.63f, 0.38f, -3.27f, 0.53f)
                close()
            }
        }.also { _DownToLine = it}
