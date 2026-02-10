package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Tie: ImageVector? = null

val Icons.Rr.Tie: ImageVector
    get() = _Tie ?: UXIcon(name = "Tie") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17.84f, 15.87f)
                lineToRelative(-2.8f, -9.87f)
                lineToRelative(0.86f, -3.02f)
                curveToRelative(0.23f, -0.69f, 0.11f, -1.45f, -0.32f, -2.04f)
                curveToRelative(-0.43f, -0.59f, -1.11f, -0.94f, -1.84f, -0.94f)
                horizontalLineToRelative(-3.49f)
                curveToRelative(-0.73f, 0f, -1.41f, 0.35f, -1.84f, 0.94f)
                curveToRelative(-0.43f, 0.59f, -0.54f, 1.35f, -0.33f, 2.0f)
                lineToRelative(0.87f, 3.06f)
                lineToRelative(-2.79f, 9.83f)
                curveToRelative(-0.5f, 1.5f, -0.07f, 3.16f, 1.1f, 4.22f)
                lineToRelative(4.05f, 3.69f)
                curveToRelative(0.19f, 0.17f, 0.43f, 0.26f, 0.67f, 0.26f)
                reflectiveCurveToRelative(0.48f, -0.09f, 0.67f, -0.26f)
                lineToRelative(4.05f, -3.69f)
                curveToRelative(1.17f, -1.06f, 1.6f, -2.72f, 1.12f, -4.18f)
                close()
                moveTo(10.04f, 2.11f)
                curveToRelative(0.04f, -0.05f, 0.1f, -0.11f, 0.22f, -0.11f)
                horizontalLineToRelative(3.49f)
                curveToRelative(0.11f, 0f, 0.18f, 0.06f, 0.22f, 0.11f)
                curveToRelative(0.04f, 0.05f, 0.07f, 0.13f, 0.03f, 0.28f)
                lineToRelative(-0.74f, 2.61f)
                horizontalLineToRelative(-2.49f)
                lineToRelative(-0.76f, -2.65f)
                curveToRelative(-0.04f, -0.11f, 0f, -0.19f, 0.04f, -0.24f)
                close()
                moveTo(15.38f, 18.57f)
                lineToRelative(-3.38f, 3.07f)
                lineToRelative(-3.38f, -3.07f)
                curveToRelative(-0.58f, -0.53f, -0.8f, -1.36f, -0.54f, -2.15f)
                lineToRelative(2.67f, -9.42f)
                horizontalLineToRelative(2.49f)
                lineToRelative(2.69f, 9.46f)
                curveToRelative(0.25f, 0.75f, 0.03f, 1.58f, -0.55f, 2.11f)
                close()
            }
        }.also { _Tie = it}
