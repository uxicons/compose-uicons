package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DominoEffect: ImageVector? = null

val Icons.Rr.DominoEffect: ImageVector
    get() = _DominoEffect ?: UXIcon(name = "DominoEffect") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17.28f, 5.32f)
                lineToRelative(-4.67f, 14f)
                curveToRelative(-0.14f, 0.42f, -0.53f, 0.68f, -0.95f, 0.68f)
                curveToRelative(-0.1f, 0f, -0.21f, -0.02f, -0.32f, -0.05f)
                curveToRelative(-0.52f, -0.17f, -0.81f, -0.74f, -0.63f, -1.26f)
                lineToRelative(4.67f, -14f)
                curveToRelative(0.17f, -0.52f, 0.74f, -0.81f, 1.26f, -0.63f)
                curveToRelative(0.52f, 0.17f, 0.81f, 0.74f, 0.63f, 1.26f)
                close()
                moveTo(13.03f, 9.87f)
                curveToRelative(0.26f, -1.0f, -0.49f, -1.88f, -1.45f, -1.88f)
                lineToRelative(-7.58f, 0.01f)
                lineToRelative(1.14f, -1.43f)
                curveToRelative(0.55f, -0.66f, 0.46f, -1.65f, -0.2f, -2.2f)
                curveToRelative(-0.66f, -0.55f, -1.65f, -0.46f, -2.2f, 0.2f)
                lineTo(0.2f, 8.21f)
                curveToRelative(-0.13f, 0.19f, -0.2f, 0.42f, -0.2f, 0.65f)
                curveToRelative(0f, 0.63f, 0.51f, 1.14f, 1.14f, 1.14f)
                horizontalLineToRelative(4.79f)
                lineToRelative(-1.9f, 5.05f)
                curveToRelative(-0.44f, 1.17f, -1.56f, 1.95f, -2.81f, 1.95f)
                horizontalLineToRelative(-0.23f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(0.23f)
                curveToRelative(2.07f, 0f, 3.95f, -1.3f, 4.68f, -3.24f)
                lineToRelative(1.78f, -4.76f)
                horizontalLineToRelative(3.79f)
                curveToRelative(0.7f, 0f, 1.37f, -0.45f, 1.54f, -1.13f)
                close()
                moveTo(23f, 4f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(14f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                lineTo(24f, 5f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                close()
                moveTo(19f, 4f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(14f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                lineTo(20f, 5f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                close()
            }
        }.also { _DominoEffect = it}
