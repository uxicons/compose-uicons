package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HoldingHandDinner: ImageVector? = null

val Icons.Bs.HoldingHandDinner: ImageVector
    get() = _HoldingHandDinner ?: UXIcon(name = "HoldingHandDinner") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 13f)
                horizontalLineToRelative(-1.05f)
                curveToRelative(-0.46f, -5.05f, -4.34f, -9.12f, -9.31f, -9.86f)
                curveToRelative(0.22f, -0.32f, 0.36f, -0.71f, 0.36f, -1.14f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                reflectiveCurveToRelative(-2f, 0.9f, -2f, 2f)
                curveToRelative(0f, 0.42f, 0.13f, 0.81f, 0.36f, 1.14f)
                curveTo(5.39f, 3.88f, 1.51f, 7.95f, 1.05f, 13f)
                lineTo(0f, 13f)
                verticalLineToRelative(3f)
                lineTo(3.12f, 16f)
                curveToRelative(-0.23f, 0.44f, -0.42f, 0.91f, -0.52f, 1.42f)
                lineToRelative(-1.32f, 6.58f)
                horizontalLineToRelative(3.06f)
                lineToRelative(1.2f, -5.99f)
                curveToRelative(0.23f, -1.16f, 1.26f, -2.01f, 2.45f, -2.01f)
                horizontalLineToRelative(4.6f)
                curveToRelative(0.56f, -0.03f, 0.91f, 0.79f, 0.43f, 1.12f)
                curveToRelative(-0.0f, 0.22f, -4.26f, 0.65f, -4.43f, 0.71f)
                lineToRelative(0.41f, 2.97f)
                lineToRelative(4.11f, -0.55f)
                curveToRelative(0.87f, -0.12f, 1.64f, -0.56f, 2.2f, -1.18f)
                lineToRelative(3.05f, -2.73f)
                curveToRelative(0.38f, -0.34f, 0.95f, -0.38f, 1.27f, -0.09f)
                curveToRelative(0.42f, 0.53f, 0.42f, 0.8f, -0.02f, 1.33f)
                lineToRelative(-7.11f, 6.42f)
                horizontalLineToRelative(4.35f)
                lineToRelative(4.8f, -4.22f)
                curveToRelative(0.81f, -0.73f, 1.27f, -1.78f, 1.27f, -2.87f)
                curveToRelative(0f, -0.31f, -0.05f, -0.61f, -0.12f, -0.9f)
                horizontalLineToRelative(1.18f)
                verticalLineToRelative(-3f)
                close()
                moveTo(4.07f, 13f)
                curveToRelative(0.49f, -3.94f, 3.86f, -7f, 7.93f, -7f)
                reflectiveCurveToRelative(7.44f, 3.06f, 7.93f, 7f)
                lineTo(4.07f, 13f)
                close()
            }
        }.also { _HoldingHandDinner = it}
