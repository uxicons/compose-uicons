package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DownToLine: ImageVector? = null

val Icons.Sc.DownToLine: ImageVector
    get() = _DownToLine ?: UXIcon(name = "DownToLine") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23f, 21.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-19f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(19f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                close()
                moveTo(11.46f, 18.84f)
                curveToRelative(0.33f, 0.21f, 0.75f, 0.21f, 1.08f, 0f)
                curveToRelative(3.28f, -2.1f, 6.07f, -4.89f, 8.3f, -8.29f)
                curveToRelative(0.33f, -0.49f, 0.13f, -1.21f, -0.41f, -1.45f)
                curveToRelative(-0.11f, -0.05f, -1.07f, -0.48f, -3.47f, -0.75f)
                curveToRelative(0.03f, -0.64f, 0.04f, -1.29f, 0.04f, -1.84f)
                curveToRelative(0f, -1.58f, -0.13f, -3.18f, -0.24f, -4.25f)
                curveToRelative(-0.04f, -0.44f, -0.37f, -0.79f, -0.8f, -0.88f)
                curveToRelative(-2.52f, -0.5f, -5.4f, -0.5f, -7.91f, 0f)
                curveToRelative(-0.43f, 0.09f, -0.76f, 0.44f, -0.8f, 0.88f)
                curveToRelative(-0.11f, 1.07f, -0.24f, 2.67f, -0.24f, 4.25f)
                curveToRelative(0f, 0.55f, 0.02f, 1.21f, 0.04f, 1.84f)
                curveToRelative(-2.4f, 0.27f, -3.36f, 0.7f, -3.47f, 0.75f)
                curveToRelative(-0.54f, 0.24f, -0.74f, 0.97f, -0.41f, 1.45f)
                curveToRelative(2.23f, 3.41f, 5.02f, 6.2f, 8.3f, 8.29f)
                close()
            }
        }.also { _DownToLine = it}
