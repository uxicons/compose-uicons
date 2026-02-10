package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ScreenShield: ImageVector? = null

val Icons.Tr.ScreenShield: ImageVector
    get() = _ScreenShield ?: UXIcon(name = "ScreenShield") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19.5f, 2f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                verticalLineToRelative(8.5f)
                horizontalLineToRelative(-22f)
                verticalLineToRelative(-8.5f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                reflectiveCurveToRelative(-0.22f, -0.5f, -0.5f, -0.5f)
                curveToRelative(-2.48f, 0f, -4.5f, 2.02f, -4.5f, 4.5f)
                verticalLineToRelative(9f)
                curveToRelative(0f, 2.48f, 2.02f, 4.5f, 4.5f, 4.5f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-5f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(11f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                reflectiveCurveToRelative(-0.22f, -0.5f, -0.5f, -0.5f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(7f)
                curveToRelative(2.48f, 0f, 4.5f, -2.02f, 4.5f, -4.5f)
                verticalLineToRelative(-9f)
                curveToRelative(0f, -2.48f, -2.02f, -4.5f, -4.5f, -4.5f)
                close()
                moveTo(19.5f, 19f)
                horizontalLineToRelative(-15f)
                curveToRelative(-1.76f, 0f, -3.2f, -1.31f, -3.45f, -3f)
                horizontalLineToRelative(21.9f)
                curveToRelative(-0.24f, 1.69f, -1.69f, 3f, -3.45f, 3f)
                close()
                moveTo(11.55f, 13.34f)
                curveToRelative(0.27f, 0.19f, 0.58f, 0.2f, 0.87f, 0.04f)
                curveToRelative(1.19f, -0.48f, 5.08f, -2.36f, 5.08f, -6.46f)
                verticalLineToRelative(-3.31f)
                curveToRelative(0.0f, -1.08f, -0.69f, -2.03f, -1.71f, -2.37f)
                lineToRelative(-3.63f, -1.2f)
                curveToRelative(-0.1f, -0.03f, -0.21f, -0.03f, -0.31f, 0f)
                lineToRelative(-3.63f, 1.2f)
                curveToRelative(-1.02f, 0.34f, -1.71f, 1.29f, -1.71f, 2.37f)
                verticalLineToRelative(3.31f)
                curveToRelative(-0.0f, 3.61f, 3.87f, 5.83f, 5.05f, 6.42f)
                close()
                moveTo(7.5f, 3.6f)
                curveToRelative(0f, -0.65f, 0.41f, -1.22f, 1.03f, -1.42f)
                lineToRelative(3.47f, -1.15f)
                lineToRelative(3.47f, 1.15f)
                curveToRelative(0.61f, 0.2f, 1.03f, 0.78f, 1.03f, 1.42f)
                verticalLineToRelative(3.31f)
                curveToRelative(-0.0f, 3.47f, -3.41f, 5.11f, -4.46f, 5.53f)
                lineToRelative(-0.02f, 0.01f)
                lineToRelative(-0.02f, -0.01f)
                curveToRelative(-1.06f, -0.53f, -4.5f, -2.49f, -4.5f, -5.53f)
                verticalLineToRelative(-3.31f)
                close()
            }
        }.also { _ScreenShield = it}
