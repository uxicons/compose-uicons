package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Challenge: ImageVector? = null

val Icons.Ss.Challenge: ImageVector
    get() = _Challenge ?: UXIcon(name = "Challenge") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16.41f, 15f)
                lineToRelative(-2.48f, 2.48f)
                curveToRelative(0.04f, 0.17f, 0.07f, 0.34f, 0.07f, 0.52f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                curveToRelative(0.18f, 0f, 0.35f, 0.02f, 0.52f, 0.07f)
                lineToRelative(2.48f, -2.48f)
                verticalLineToRelative(-2.59f)
                lineToRelative(3f, -3f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(4f)
                lineToRelative(-3f, 3f)
                horizontalLineToRelative(-2.59f)
                close()
                moveTo(15.97f, 18.27f)
                curveToRelative(-0.14f, 2.08f, -1.86f, 3.73f, -3.97f, 3.73f)
                curveToRelative(-2.21f, 0f, -4f, -1.79f, -4f, -4f)
                curveToRelative(0f, -2.11f, 1.65f, -3.83f, 3.73f, -3.97f)
                lineToRelative(1.82f, -1.82f)
                curveToRelative(-0.49f, -0.13f, -1.01f, -0.21f, -1.55f, -0.21f)
                curveToRelative(-3.31f, 0f, -6f, 2.69f, -6f, 6f)
                reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
                reflectiveCurveToRelative(6f, -2.69f, 6f, -6f)
                curveToRelative(0f, -0.54f, -0.08f, -1.05f, -0.21f, -1.55f)
                lineToRelative(-1.82f, 1.82f)
                close()
                moveTo(24.04f, 8f)
                lineToRelative(-0.04f, -3.0f)
                horizontalLineToRelative(0f)
                curveToRelative(-0.0f, -1.65f, -1.35f, -3.0f, -3f, -3.0f)
                horizontalLineToRelative(-3f)
                lineTo(18f, 0f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-8f)
                lineTo(8f, 0f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-3f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(15.17f)
                lineToRelative(2f, -2f)
                horizontalLineToRelative(2.83f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(4.04f)
                close()
                moveTo(4f, 18f)
                curveToRelative(0f, -4.41f, 3.59f, -8f, 8f, -8f)
                lineTo(0f, 10f)
                verticalLineToRelative(14f)
                horizontalLineToRelative(6.71f)
                curveToRelative(-1.66f, -1.47f, -2.71f, -3.61f, -2.71f, -6f)
                close()
                moveTo(24.08f, 24.0f)
                lineToRelative(-0.03f, -11.22f)
                lineToRelative(-4.12f, 4.12f)
                curveToRelative(0.05f, 0.36f, 0.07f, 0.72f, 0.07f, 1.1f)
                curveToRelative(0f, 2.39f, -1.05f, 4.53f, -2.71f, 6f)
                lineToRelative(6.79f, -0.0f)
                close()
            }
        }.also { _Challenge = it}
