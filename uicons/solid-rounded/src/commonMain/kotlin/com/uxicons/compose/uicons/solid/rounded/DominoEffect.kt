package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DominoEffect: ImageVector? = null

val Icons.Sr.DominoEffect: ImageVector
    get() = _DominoEffect ?: UXIcon(name = "DominoEffect") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 5f)
                verticalLineToRelative(14f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                lineTo(22f, 5f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                close()
                moveTo(19f, 4f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(14f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                lineTo(20f, 5f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                close()
                moveTo(16.65f, 4.05f)
                curveToRelative(-0.53f, -0.18f, -1.09f, 0.11f, -1.26f, 0.63f)
                lineToRelative(-4.67f, 14f)
                curveToRelative(-0.17f, 0.52f, 0.11f, 1.09f, 0.63f, 1.26f)
                curveToRelative(0.1f, 0.04f, 0.21f, 0.05f, 0.32f, 0.05f)
                curveToRelative(0.42f, 0f, 0.81f, -0.27f, 0.95f, -0.68f)
                lineToRelative(4.67f, -14f)
                curveToRelative(0.17f, -0.52f, -0.11f, -1.09f, -0.63f, -1.26f)
                close()
                moveTo(7.69f, 11f)
                lineToRelative(-1.91f, 5.08f)
                curveToRelative(-0.66f, 1.76f, -2.34f, 2.92f, -4.21f, 2.92f)
                horizontalLineToRelative(-0.57f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-9f)
                curveToRelative(0f, -0.03f, 0.01f, -0.05f, 0.01f, -0.07f)
                curveToRelative(-0.0f, -0.03f, -0.01f, -0.05f, -0.01f, -0.07f)
                curveToRelative(0f, -0.23f, 0.07f, -0.46f, 0.2f, -0.65f)
                lineToRelative(2.53f, -3.64f)
                curveToRelative(0.55f, -0.66f, 1.54f, -0.75f, 2.2f, -0.2f)
                curveToRelative(0.66f, 0.55f, 0.75f, 1.54f, 0.2f, 2.2f)
                lineToRelative(-1.14f, 1.43f)
                lineToRelative(7.58f, -0.01f)
                curveToRelative(0.96f, 0f, 1.71f, 0.88f, 1.45f, 1.88f)
                curveToRelative(-0.17f, 0.68f, -0.84f, 1.13f, -1.54f, 1.13f)
                horizontalLineToRelative(-3.79f)
                close()
            }
        }.also { _DominoEffect = it}
