package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PhoneFlip: ImageVector? = null

val Icons.Tr.PhoneFlip: ImageVector
    get() = _PhoneFlip ?: UXIcon(name = "PhoneFlip") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.27f, 1.77f)
                lineToRelative(-1.12f, -0.98f)
                curveToRelative(-1.02f, -1.02f, -2.75f, -1.07f, -3.85f, 0.05f)
                lineToRelative(-1.87f, 2.45f)
                curveToRelative(-1.05f, 1.05f, -1.05f, 2.76f, 0f, 3.8f)
                lineToRelative(1.49f, 1.53f)
                curveToRelative(-1.62f, 3.8f, -4.61f, 6.8f, -8.29f, 8.3f)
                lineToRelative(-1.53f, -1.49f)
                curveToRelative(-0.51f, -0.51f, -1.18f, -0.79f, -1.9f, -0.79f)
                reflectiveCurveToRelative(-1.39f, 0.28f, -1.85f, 0.75f)
                lineToRelative(-2.54f, 1.96f)
                curveToRelative(-1.05f, 1.05f, -1.05f, 2.76f, -0.02f, 3.78f)
                lineToRelative(1.02f, 1.17f)
                curveToRelative(1.1f, 1.1f, 2.58f, 1.71f, 4.19f, 1.71f)
                curveToRelative(7.75f, 0f, 18.02f, -10.28f, 18.02f, -18.02f)
                curveToRelative(0f, -1.6f, -0.61f, -3.09f, -1.73f, -4.21f)
                close()
                moveTo(5.98f, 23f)
                curveToRelative(-1.34f, 0f, -2.57f, -0.5f, -3.46f, -1.39f)
                lineToRelative(-1.02f, -1.18f)
                curveToRelative(-0.66f, -0.66f, -0.66f, -1.73f, -0.05f, -2.35f)
                lineToRelative(2.54f, -1.96f)
                curveToRelative(0.32f, -0.32f, 0.74f, -0.5f, 1.2f, -0.5f)
                reflectiveCurveToRelative(0.88f, 0.18f, 1.2f, 0.5f)
                curveToRelative(0f, 0f, 1.77f, 1.73f, 1.77f, 1.73f)
                curveToRelative(0.14f, 0.14f, 0.34f, 0.18f, 0.53f, 0.11f)
                curveToRelative(4.17f, -1.59f, 7.56f, -4.98f, 9.29f, -9.28f)
                curveToRelative(0.07f, -0.18f, 0.03f, -0.39f, -0.11f, -0.54f)
                lineToRelative(-1.73f, -1.77f)
                curveToRelative(-0.66f, -0.66f, -0.66f, -1.73f, 0.04f, -2.44f)
                lineToRelative(1.87f, -2.45f)
                curveToRelative(0.66f, -0.66f, 1.73f, -0.66f, 2.42f, 0.02f)
                lineToRelative(1.12f, 0.98f)
                curveToRelative(0.91f, 0.91f, 1.41f, 2.14f, 1.41f, 3.48f)
                curveToRelative(0f, 7.16f, -9.86f, 17.02f, -17.02f, 17.02f)
                close()
            }
        }.also { _PhoneFlip = it}
