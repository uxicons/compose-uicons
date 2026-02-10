package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Meat: ImageVector? = null

val Icons.Bs.Meat: ImageVector
    get() = _Meat ?: UXIcon(name = "Meat") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17.4f, 6.6f)
                curveToRelative(0.66f, 0.66f, 0.8f, 1.6f, 0.3f, 2.1f)
                reflectiveCurveToRelative(-1.44f, 0.36f, -2.1f, -0.3f)
                reflectiveCurveToRelative(-0.8f, -1.6f, -0.3f, -2.1f)
                curveToRelative(0.5f, -0.5f, 1.44f, -0.36f, 2.1f, 0.3f)
                close()
                moveTo(22.36f, 13.36f)
                curveToRelative(-5.21f, 5.22f, -12.66f, 5.62f, -12.98f, 5.64f)
                lineToRelative(-0.66f, 0.03f)
                lineToRelative(-0.81f, -0.81f)
                lineToRelative(-2.43f, 2.43f)
                curveToRelative(0.33f, 0.36f, 0.53f, 0.83f, 0.53f, 1.35f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                curveToRelative(0.52f, 0f, 1.0f, 0.2f, 1.35f, 0.53f)
                lineToRelative(2.43f, -2.43f)
                lineToRelative(-0.83f, -0.83f)
                lineToRelative(0.05f, -0.69f)
                curveToRelative(0.02f, -0.32f, 0.67f, -7.95f, 5.63f, -12.94f)
                curveToRelative(2.57f, -2.57f, 7.29f, -2.03f, 10.52f, 1.2f)
                curveToRelative(3.23f, 3.23f, 3.77f, 7.95f, 1.2f, 10.52f)
                close()
                moveTo(15.36f, 14.46f)
                curveToRelative(-1.27f, -0.48f, -2.48f, -1.27f, -3.52f, -2.3f)
                curveToRelative(-1.04f, -1.04f, -1.8f, -2.24f, -2.27f, -3.46f)
                curveToRelative(-0.95f, 2.27f, -1.35f, 4.41f, -1.49f, 5.45f)
                lineToRelative(1.8f, 1.8f)
                curveToRelative(1.02f, -0.12f, 3.16f, -0.49f, 5.48f, -1.48f)
                close()
                moveTo(19.04f, 4.96f)
                curveToRelative(-1.27f, -1.27f, -2.87f, -1.96f, -4.23f, -1.96f)
                curveToRelative(-0.81f, 0f, -1.53f, 0.24f, -2.05f, 0.76f)
                curveToRelative(-1.38f, 1.38f, -0.83f, 4.25f, 1.2f, 6.28f)
                curveToRelative(1.05f, 1.05f, 2.33f, 1.73f, 3.6f, 1.92f)
                curveToRelative(1.1f, 0.16f, 2.06f, -0.1f, 2.68f, -0.71f)
                curveToRelative(1.38f, -1.38f, 0.83f, -4.25f, -1.2f, -6.28f)
                close()
            }
        }.also { _Meat = it}
