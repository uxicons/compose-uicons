package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HillAvalanche: ImageVector? = null

val Icons.Ts.HillAvalanche: ImageVector
    get() = _HillAvalanche ?: UXIcon(name = "HillAvalanche") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(0f, 21.5f)
                curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(20.71f)
                lineToRelative(-23.21f, -23.21f)
                close()
                moveTo(1f, 3.21f)
                lineTo(20.79f, 23f)
                horizontalLineToRelative(-18.29f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                close()
                moveTo(8.03f, 5.97f)
                curveToRelative(-1.36f, -1.3f, -1.36f, -3.65f, 0f, -4.95f)
                curveToRelative(1.11f, -1.11f, 2.82f, -1.34f, 4.17f, -0.58f)
                curveToRelative(0.56f, -0.29f, 1.18f, -0.44f, 1.8f, -0.44f)
                curveToRelative(1.87f, 0f, 3.48f, 1.31f, 3.88f, 3.12f)
                curveToRelative(1.8f, 0.41f, 3.12f, 2.02f, 3.12f, 3.88f)
                curveToRelative(0f, 2.21f, -1.79f, 4f, -4f, 4f)
                verticalLineToRelative(-1f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                curveToRelative(0f, -1.49f, -1.12f, -2.76f, -2.61f, -2.96f)
                curveToRelative(-0.93f, -0.15f, -1.88f, 0.19f, -2.53f, 0.86f)
                lineToRelative(-0.71f, -0.7f)
                curveToRelative(0.71f, -0.73f, 1.66f, -1.14f, 2.67f, -1.18f)
                curveToRelative(-0.41f, -1.18f, -1.53f, -2.02f, -2.81f, -2.02f)
                curveToRelative(-0.65f, -0.01f, -1.28f, 0.25f, -1.83f, 0.62f)
                curveToRelative(-1.01f, -0.83f, -2.5f, -0.83f, -3.44f, 0.12f)
                curveToRelative(-0.97f, 0.93f, -0.97f, 2.6f, 0f, 3.54f)
                lineToRelative(10f, 10f)
                curveToRelative(0.94f, 0.94f, 2.59f, 0.94f, 3.54f, 0f)
                curveToRelative(0.97f, -0.93f, 0.97f, -2.6f, 0f, -3.54f)
                lineToRelative(0.71f, -0.71f)
                curveToRelative(1.36f, 1.3f, 1.36f, 3.65f, 0f, 4.95f)
                curveToRelative(-1.3f, 1.36f, -3.65f, 1.36f, -4.95f, 0f)
                close()
            }
        }.also { _HillAvalanche = it}
