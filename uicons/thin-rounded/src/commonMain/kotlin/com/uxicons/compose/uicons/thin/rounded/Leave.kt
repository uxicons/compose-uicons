package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Leave: ImageVector? = null

val Icons.Tr.Leave: ImageVector
    get() = _Leave ?: UXIcon(name = "Leave") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(9f, 12f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                close()
                moveTo(16f, 17.5f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                lineTo(2.5f, 24f)
                curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
                lineTo(0f, 5.32f)
                curveTo(0f, 3.18f, 1.52f, 1.33f, 3.62f, 0.91f)
                lineTo(7.81f, 0.07f)
                curveToRelative(1.03f, -0.2f, 2.09f, 0.06f, 2.91f, 0.73f)
                curveToRelative(0.41f, 0.33f, 0.72f, 0.74f, 0.94f, 1.21f)
                horizontalLineToRelative(0.84f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                verticalLineToRelative(6f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                reflectiveCurveToRelative(-0.5f, -0.22f, -0.5f, -0.5f)
                verticalLineToRelative(-6f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                horizontalLineToRelative(-0.56f)
                curveToRelative(0.02f, 0.17f, 0.06f, 0.33f, 0.06f, 0.5f)
                verticalLineToRelative(19.5f)
                horizontalLineToRelative(1.5f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                reflectiveCurveToRelative(0.5f, 0.22f, 0.5f, 0.5f)
                close()
                moveTo(11f, 3.5f)
                curveToRelative(0f, -0.75f, -0.33f, -1.46f, -0.92f, -1.93f)
                curveToRelative(-0.45f, -0.37f, -1.01f, -0.57f, -1.58f, -0.57f)
                curveToRelative(-0.16f, 0f, -0.33f, 0.02f, -0.49f, 0.05f)
                lineToRelative(-4.2f, 0.84f)
                curveToRelative(-1.63f, 0.33f, -2.81f, 1.77f, -2.81f, 3.43f)
                verticalLineToRelative(16.18f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(8.5f)
                lineTo(11f, 3.5f)
                close()
                moveTo(24f, 14.5f)
                curveToRelative(0f, -0.5f, -0.28f, -1.15f, -0.68f, -1.53f)
                lineToRelative(-2.5f, -2.34f)
                curveToRelative(-0.2f, -0.19f, -0.52f, -0.18f, -0.71f, 0.02f)
                curveToRelative(-0.19f, 0.2f, -0.18f, 0.52f, 0.02f, 0.71f)
                lineToRelative(2.5f, 2.34f)
                curveToRelative(0.09f, 0.09f, 0.16f, 0.19f, 0.21f, 0.3f)
                horizontalLineToRelative(-8.35f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(8.32f)
                curveToRelative(-0.05f, 0.09f, -0.1f, 0.18f, -0.18f, 0.25f)
                lineToRelative(-2.51f, 2.38f)
                curveToRelative(-0.2f, 0.19f, -0.21f, 0.51f, -0.02f, 0.71f)
                curveToRelative(0.1f, 0.1f, 0.23f, 0.15f, 0.36f, 0.15f)
                curveToRelative(0.12f, 0f, 0.25f, -0.05f, 0.34f, -0.14f)
                lineToRelative(2.51f, -2.38f)
                curveToRelative(0.37f, -0.35f, 0.66f, -0.98f, 0.66f, -1.48f)
                close()
            }
        }.also { _Leave = it}
