package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CV: ImageVector? = null

val Icons.Tr.CV: ImageVector
    get() = _CV ?: UXIcon(name = "CV") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(6f, 5.5f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                reflectiveCurveToRelative(0.5f, 0.22f, 0.5f, 0.5f)
                curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                reflectiveCurveToRelative(-0.5f, -0.22f, -0.5f, -0.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                close()
                moveTo(13.02f, 10.85f)
                curveToRelative(0.37f, 0.19f, 0.81f, 0.2f, 1.19f, 0.04f)
                curveToRelative(0.4f, -0.17f, 0.71f, -0.54f, 0.81f, -0.98f)
                lineToRelative(1.49f, -6.03f)
                curveToRelative(0.08f, -0.32f, -0.16f, -0.62f, -0.48f, -0.62f)
                horizontalLineToRelative(0f)
                curveToRelative(-0.23f, 0f, -0.43f, 0.16f, -0.48f, 0.38f)
                lineToRelative(-1.5f, 6.03f)
                curveToRelative(-0.03f, 0.14f, -0.12f, 0.25f, -0.23f, 0.3f)
                curveToRelative(-0.12f, 0.05f, -0.24f, 0.05f, -0.35f, -0.01f)
                curveToRelative(-0.1f, -0.05f, -0.18f, -0.15f, -0.21f, -0.26f)
                lineToRelative(-1.6f, -6.07f)
                curveToRelative(-0.06f, -0.22f, -0.26f, -0.37f, -0.48f, -0.37f)
                curveToRelative(-0.33f, 0f, -0.57f, 0.31f, -0.48f, 0.63f)
                lineToRelative(1.59f, 6.05f)
                curveToRelative(0.09f, 0.39f, 0.35f, 0.72f, 0.72f, 0.91f)
                close()
                moveTo(22f, 4.5f)
                verticalLineToRelative(9.52f)
                curveToRelative(0f, 1.74f, -0.68f, 3.37f, -1.9f, 4.6f)
                lineToRelative(-3.48f, 3.48f)
                curveToRelative(-1.23f, 1.23f, -2.86f, 1.9f, -4.6f, 1.9f)
                horizontalLineToRelative(-5.51f)
                curveToRelative(-2.48f, 0f, -4.5f, -2.02f, -4.5f, -4.5f)
                lineTo(2f, 4.5f)
                curveTo(2f, 2.02f, 4.02f, 0f, 6.5f, 0f)
                horizontalLineToRelative(11f)
                curveToRelative(2.48f, 0f, 4.5f, 2.02f, 4.5f, 4.5f)
                close()
                moveTo(12.02f, 23f)
                curveToRelative(0.34f, 0f, 0.66f, -0.04f, 0.98f, -0.1f)
                verticalLineToRelative(-5.4f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(5.4f)
                curveToRelative(0.06f, -0.32f, 0.1f, -0.65f, 0.1f, -0.98f)
                lineTo(21f, 4.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                lineTo(6.5f, 1f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(15f)
                curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                horizontalLineToRelative(5.51f)
                close()
                moveTo(20.62f, 16f)
                horizontalLineToRelative(-5.12f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(5.12f)
                curveToRelative(0.7f, -0.27f, 1.35f, -0.68f, 1.9f, -1.23f)
                lineToRelative(3.48f, -3.48f)
                curveToRelative(0.55f, -0.55f, 0.96f, -1.2f, 1.23f, -1.9f)
                close()
            }
        }.also { _CV = it}
