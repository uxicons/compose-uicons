package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Tie: ImageVector? = null

val Icons.Tr.Tie: ImageVector
    get() = _Tie ?: UXIcon(name = "Tie") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16.85f, 17.27f)
                lineToRelative(-2.83f, -12.72f)
                lineToRelative(0.89f, -2.23f)
                curveToRelative(0.18f, -0.54f, 0.09f, -1.12f, -0.25f, -1.59f)
                curveToRelative(-0.34f, -0.46f, -0.86f, -0.73f, -1.43f, -0.73f)
                horizontalLineToRelative(-2.47f)
                curveToRelative(-0.57f, 0f, -1.09f, 0.27f, -1.43f, 0.73f)
                curveToRelative(-0.34f, 0.46f, -0.42f, 1.04f, -0.23f, 1.61f)
                lineToRelative(0.88f, 2.2f)
                lineToRelative(-2.81f, 12.68f)
                curveToRelative(-0.4f, 1.19f, -0.05f, 2.51f, 0.88f, 3.36f)
                lineToRelative(3.62f, 3.29f)
                curveToRelative(0.1f, 0.09f, 0.22f, 0.13f, 0.34f, 0.13f)
                reflectiveCurveToRelative(0.24f, -0.04f, 0.34f, -0.13f)
                lineToRelative(3.62f, -3.29f)
                curveToRelative(0.93f, -0.85f, 1.28f, -2.17f, 0.89f, -3.31f)
                close()
                moveTo(10.15f, 1.32f)
                curveToRelative(0.15f, -0.2f, 0.37f, -0.32f, 0.62f, -0.32f)
                horizontalLineToRelative(2.47f)
                curveToRelative(0.25f, 0f, 0.47f, 0.12f, 0.62f, 0.32f)
                curveToRelative(0.14f, 0.2f, 0.18f, 0.45f, 0.12f, 0.66f)
                lineToRelative(-0.81f, 2.03f)
                horizontalLineToRelative(-2.32f)
                lineToRelative(-0.8f, -2.0f)
                curveToRelative(-0.08f, -0.23f, -0.04f, -0.48f, 0.11f, -0.69f)
                close()
                moveTo(15.29f, 19.84f)
                lineToRelative(-3.29f, 2.99f)
                lineToRelative(-3.29f, -2.99f)
                curveToRelative(-0.64f, -0.58f, -0.88f, -1.49f, -0.59f, -2.35f)
                lineToRelative(2.77f, -12.48f)
                horizontalLineToRelative(2.2f)
                lineToRelative(2.79f, 12.53f)
                curveToRelative(0.27f, 0.82f, 0.04f, 1.72f, -0.6f, 2.3f)
                close()
            }
        }.also { _Tie = it}
