package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HeadVr: ImageVector? = null

val Icons.Rr.HeadVr: ImageVector
    get() = _HeadVr ?: UXIcon(name = "HeadVr") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 5f)
                horizontalLineToRelative(-0.77f)
                curveToRelative(-0.16f, -0.23f, -0.3f, -0.43f, -0.43f, -0.58f)
                curveTo(17.36f, 1.16f, 13.49f, -0.45f, 9.45f, 0.11f)
                curveTo(4.46f, 0.79f, 0.5f, 4.95f, 0.05f, 9.98f)
                curveToRelative(-0.25f, 2.77f, 0.54f, 5.5f, 2.21f, 7.69f)
                curveToRelative(0.48f, 0.62f, 0.74f, 1.46f, 0.74f, 2.35f)
                verticalLineToRelative(0.97f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                horizontalLineToRelative(7f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                horizontalLineToRelative(0.49f)
                curveToRelative(2.5f, 0f, 4.63f, -1.87f, 4.96f, -4.34f)
                lineToRelative(0.07f, -0.52f)
                curveToRelative(0.07f, -0.55f, -0.31f, -1.05f, -0.86f, -1.12f)
                curveToRelative(-0.55f, -0.07f, -1.05f, 0.31f, -1.12f, 0.86f)
                lineToRelative(-0.07f, 0.52f)
                curveToRelative(-0.2f, 1.49f, -1.48f, 2.61f, -2.98f, 2.61f)
                horizontalLineToRelative(-1.49f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                lineTo(6f, 22.0f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-0.97f)
                curveToRelative(0f, -1.33f, -0.41f, -2.6f, -1.15f, -3.57f)
                curveToRelative(-1.37f, -1.79f, -2.02f, -4.03f, -1.81f, -6.3f)
                curveToRelative(0.01f, -0.05f, 0.01f, -0.11f, 0.02f, -0.16f)
                lineTo(10.13f, 10.0f)
                curveToRelative(0.45f, 1.72f, 2.01f, 3f, 3.87f, 3f)
                horizontalLineToRelative(7f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(9.72f, 2.09f)
                curveToRelative(3.03f, -0.42f, 5.95f, 0.66f, 7.97f, 2.91f)
                horizontalLineToRelative(-3.69f)
                curveToRelative(-1.86f, 0f, -3.43f, 1.28f, -3.87f, 3f)
                lineTo(2.51f, 8f)
                curveToRelative(1.1f, -3.1f, 3.87f, -5.45f, 7.21f, -5.91f)
                close()
                moveTo(22f, 10f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-7f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                horizontalLineToRelative(7f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(2f)
                close()
            }
        }.also { _HeadVr = it}
