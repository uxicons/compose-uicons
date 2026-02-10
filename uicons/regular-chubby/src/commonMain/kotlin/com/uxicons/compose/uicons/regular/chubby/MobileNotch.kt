package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MobileNotch: ImageVector? = null

val Icons.Rc.MobileNotch: ImageVector
    get() = _MobileNotch ?: UXIcon(name = "MobileNotch") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13f, 17f)
                horizontalLineToRelative(-2f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(2f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19.17f, 2.94f)
                curveToRelative(-0.07f, -0.33f, -0.3f, -0.59f, -0.6f, -0.72f)
                curveToRelative(-0.12f, -0.05f, -3.08f, -1.22f, -6.57f, -1.22f)
                curveToRelative(-3.43f, 0f, -6.43f, 1.17f, -6.56f, 1.22f)
                curveToRelative(-0.31f, 0.12f, -0.54f, 0.4f, -0.61f, 0.72f)
                curveToRelative(-0.03f, 0.16f, -0.83f, 4.0f, -0.83f, 9.05f)
                reflectiveCurveToRelative(0.79f, 8.89f, 0.83f, 9.05f)
                curveToRelative(0.07f, 0.33f, 0.3f, 0.6f, 0.62f, 0.73f)
                curveToRelative(0.13f, 0.05f, 3.19f, 1.22f, 6.55f, 1.22f)
                curveToRelative(3.48f, 0f, 6.44f, -1.17f, 6.57f, -1.22f)
                curveToRelative(0.31f, -0.12f, 0.54f, -0.4f, 0.61f, -0.72f)
                curveToRelative(0.03f, -0.16f, 0.83f, -3.97f, 0.83f, -9.06f)
                curveToRelative(0f, -5.13f, -0.79f, -8.9f, -0.83f, -9.06f)
                close()
                moveTo(17.32f, 20.1f)
                curveToRelative(-0.93f, 0.31f, -3.01f, 0.9f, -5.32f, 0.9f)
                curveToRelative(-2.23f, 0f, -4.37f, -0.6f, -5.32f, -0.91f)
                curveToRelative(-0.21f, -1.22f, -0.68f, -4.32f, -0.68f, -8.09f)
                reflectiveCurveToRelative(0.47f, -6.88f, 0.68f, -8.1f)
                curveToRelative(0.41f, -0.13f, 1.04f, -0.32f, 1.81f, -0.49f)
                curveToRelative(0.09f, 0.8f, 0.2f, 1.25f, 0.2f, 1.28f)
                curveToRelative(0.07f, 0.32f, 0.3f, 0.59f, 0.61f, 0.7f)
                curveToRelative(0.05f, 0.02f, 1.31f, 0.5f, 2.7f, 0.5f)
                curveToRelative(1.43f, 0f, 2.66f, -0.48f, 2.71f, -0.51f)
                curveToRelative(0.3f, -0.12f, 0.53f, -0.38f, 0.6f, -0.7f)
                curveToRelative(0.01f, -0.03f, 0.11f, -0.48f, 0.2f, -1.29f)
                curveToRelative(0.77f, 0.17f, 1.4f, 0.36f, 1.81f, 0.49f)
                curveToRelative(0.21f, 1.2f, 0.68f, 4.28f, 0.68f, 8.1f)
                curveToRelative(0f, 3.79f, -0.47f, 6.89f, -0.68f, 8.1f)
                close()
            }
        }.also { _MobileNotch = it}
