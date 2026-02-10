package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DominoEffect: ImageVector? = null

val Icons.Ts.DominoEffect: ImageVector
    get() = _DominoEffect ?: UXIcon(name = "DominoEffect") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 4f)
                verticalLineToRelative(16f)
                horizontalLineToRelative(3f)
                lineTo(24f, 4f)
                horizontalLineToRelative(-3f)
                close()
                moveTo(23f, 19f)
                horizontalLineToRelative(-1f)
                lineTo(22f, 5f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(14f)
                close()
                moveTo(17f, 20f)
                horizontalLineToRelative(3f)
                lineTo(20f, 4f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(16f)
                close()
                moveTo(18f, 5f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(14f)
                horizontalLineToRelative(-1f)
                lineTo(18f, 5f)
                close()
                moveTo(12.7f, 8.6f)
                curveToRelative(-0.27f, -0.36f, -0.7f, -0.6f, -1.2f, -0.6f)
                lineTo(3.65f, 8f)
                lineToRelative(0.95f, -1.2f)
                curveToRelative(0.6f, -0.72f, 0.51f, -1.8f, -0.22f, -2.4f)
                curveToRelative(-0.32f, -0.27f, -0.71f, -0.4f, -1.09f, -0.4f)
                curveToRelative(-0.49f, 0f, -0.97f, 0.21f, -1.31f, 0.61f)
                lineToRelative(-1.98f, 2.75f)
                verticalLineToRelative(1.65f)
                lineToRelative(2.77f, -3.78f)
                curveToRelative(0.13f, -0.15f, 0.32f, -0.23f, 0.53f, -0.23f)
                curveToRelative(0.12f, 0f, 0.29f, 0.03f, 0.45f, 0.16f)
                curveToRelative(0.3f, 0.25f, 0.34f, 0.7f, 0.07f, 1.01f)
                lineToRelative(-1.32f, 1.67f)
                verticalLineToRelative(1.16f)
                horizontalLineToRelative(9f)
                curveToRelative(0.28f, 0f, 0.5f, 0.23f, 0.5f, 0.5f)
                reflectiveCurveToRelative(-0.23f, 0.5f, -0.5f, 0.5f)
                horizontalLineToRelative(-4.33f)
                lineToRelative(-3f, 7f)
                lineTo(0f, 17f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(4.83f)
                lineToRelative(3f, -7f)
                horizontalLineToRelative(3.67f)
                curveToRelative(0.17f, 0f, 0.34f, -0.04f, 0.49f, -0.09f)
                lineToRelative(-2.53f, 8.34f)
                lineToRelative(2.87f, 0.87f)
                lineToRelative(4.65f, -15.31f)
                lineToRelative(-2.87f, -0.87f)
                lineToRelative(-1.42f, 4.66f)
                close()
                moveTo(15.73f, 5.48f)
                lineToRelative(-4.07f, 13.4f)
                lineToRelative(-0.96f, -0.29f)
                lineToRelative(4.07f, -13.4f)
                lineToRelative(0.96f, 0.29f)
                close()
            }
        }.also { _DominoEffect = it}
