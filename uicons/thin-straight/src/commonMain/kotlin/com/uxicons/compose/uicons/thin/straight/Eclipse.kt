package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Eclipse: ImageVector? = null

val Icons.Ts.Eclipse: ImageVector
    get() = _Eclipse ?: UXIcon(name = "Eclipse") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 6f)
                curveToRelative(-3.31f, 0f, -6f, 2.69f, -6f, 6f)
                reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
                reflectiveCurveToRelative(6f, -2.69f, 6f, -6f)
                reflectiveCurveToRelative(-2.69f, -6f, -6f, -6f)
                close()
                moveTo(18f, 17f)
                curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                reflectiveCurveToRelative(2.24f, -5f, 5f, -5f)
                reflectiveCurveToRelative(5f, 2.24f, 5f, 5f)
                reflectiveCurveToRelative(-2.24f, 5f, -5f, 5f)
                close()
                moveTo(13.6f, 18.68f)
                curveToRelative(-0.51f, 0.16f, -1.05f, 0.27f, -1.6f, 0.3f)
                verticalLineToRelative(5.02f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-5.02f)
                curveToRelative(-0.91f, -0.07f, -1.77f, -0.3f, -2.56f, -0.69f)
                lineToRelative(-2.51f, 4.35f)
                lineToRelative(-0.86f, -0.5f)
                lineToRelative(2.51f, -4.35f)
                curveToRelative(-0.74f, -0.5f, -1.37f, -1.14f, -1.87f, -1.87f)
                lineToRelative(-4.35f, 2.51f)
                lineToRelative(-0.5f, -0.87f)
                lineToRelative(4.35f, -2.51f)
                curveToRelative(-0.38f, -0.78f, -0.62f, -1.65f, -0.69f, -2.56f)
                lineTo(0f, 12.5f)
                verticalLineToRelative(-1f)
                lineTo(4.52f, 11.5f)
                curveToRelative(0.07f, -0.91f, 0.3f, -1.77f, 0.69f, -2.56f)
                lineTo(0.86f, 6.43f)
                lineToRelative(0.5f, -0.87f)
                lineToRelative(4.35f, 2.51f)
                curveToRelative(0.5f, -0.74f, 1.14f, -1.37f, 1.87f, -1.87f)
                lineTo(5.07f, 1.86f)
                lineToRelative(0.86f, -0.5f)
                lineToRelative(2.51f, 4.35f)
                curveToRelative(0.78f, -0.38f, 1.65f, -0.62f, 2.56f, -0.69f)
                lineTo(11f, 0f)
                horizontalLineToRelative(1f)
                lineTo(12f, 5.02f)
                curveToRelative(0.55f, 0.04f, 1.09f, 0.14f, 1.6f, 0.3f)
                curveToRelative(-0.35f, 0.23f, -0.68f, 0.5f, -0.99f, 0.78f)
                curveToRelative(-0.36f, -0.07f, -0.73f, -0.11f, -1.1f, -0.11f)
                curveToRelative(-3.31f, 0f, -6f, 2.69f, -6f, 6f)
                reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
                curveToRelative(0.38f, 0f, 0.74f, -0.04f, 1.1f, -0.11f)
                curveToRelative(0.31f, 0.28f, 0.64f, 0.55f, 0.99f, 0.78f)
                close()
            }
        }.also { _Eclipse = it}
