package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Leave: ImageVector? = null

val Icons.Rr.Leave: ImageVector
    get() = _Leave ?: UXIcon(name = "Leave") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 15f)
                curveToRelative(0f, 0.62f, -0.24f, 1.2f, -0.68f, 1.63f)
                lineToRelative(-2.07f, 2.07f)
                curveToRelative(-0.2f, 0.2f, -0.45f, 0.29f, -0.71f, 0.29f)
                reflectiveCurveToRelative(-0.51f, -0.1f, -0.71f, -0.29f)
                curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0f, -1.41f)
                lineToRelative(1.29f, -1.29f)
                horizontalLineToRelative(-6.13f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(6.13f)
                lineToRelative(-1.29f, -1.29f)
                curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0f, -1.41f)
                reflectiveCurveToRelative(1.02f, -0.39f, 1.41f, 0f)
                lineToRelative(2.07f, 2.07f)
                curveToRelative(0.44f, 0.44f, 0.68f, 1.02f, 0.68f, 1.63f)
                close()
                moveTo(6.5f, 11f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(16f, 19f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                lineTo(3f, 24f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                lineTo(0f, 5.62f)
                curveTo(0f, 3.25f, 1.69f, 1.18f, 4.02f, 0.72f)
                lineTo(7.22f, 0.08f)
                curveToRelative(1.18f, -0.24f, 2.39f, 0.07f, 3.32f, 0.83f)
                curveToRelative(0.38f, 0.31f, 0.67f, 0.69f, 0.9f, 1.09f)
                horizontalLineToRelative(0.56f)
                curveToRelative(2.21f, 0f, 4f, 1.79f, 4f, 4f)
                verticalLineToRelative(5f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-5f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                horizontalLineToRelative(0f)
                reflectiveCurveToRelative(0f, 0f, 0f, 0f)
                verticalLineToRelative(18.0f)
                horizontalLineToRelative(1f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                close()
                moveTo(10f, 4.0f)
                curveToRelative(0f, -0.6f, -0.27f, -1.17f, -0.73f, -1.55f)
                curveToRelative(-0.36f, -0.3f, -0.81f, -0.45f, -1.27f, -0.45f)
                curveToRelative(-0.13f, 0f, -0.26f, 0.01f, -0.4f, 0.04f)
                lineToRelative(-3.2f, 0.64f)
                curveToRelative(-1.4f, 0.28f, -2.41f, 1.52f, -2.41f, 2.94f)
                verticalLineToRelative(15.38f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(7f)
                lineTo(10f, 4.0f)
                close()
            }
        }.also { _Leave = it}
