package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Guide: ImageVector? = null

val Icons.Tr.Guide: ImageVector
    get() = _Guide ?: UXIcon(name = "Guide") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(6.5f, 12f)
                curveToRelative(3.31f, 0f, 6f, -2.69f, 6f, -6f)
                curveToRelative(0f, -0.34f, -0.04f, -0.67f, -0.09f, -1f)
                horizontalLineToRelative(2.09f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                reflectiveCurveToRelative(-0.22f, -0.5f, -0.5f, -0.5f)
                horizontalLineToRelative(-2.35f)
                curveTo(11.32f, 1.67f, 9.11f, 0f, 6.5f, 0f)
                curveTo(3.19f, 0f, 0.5f, 2.69f, 0.5f, 6f)
                reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
                close()
                moveTo(6.5f, 1f)
                curveToRelative(2.04f, 0f, 3.8f, 1.24f, 4.58f, 3f)
                lineTo(1.92f, 4f)
                curveToRelative(0.77f, -1.76f, 2.53f, -3f, 4.58f, -3f)
                close()
                moveTo(1.6f, 5f)
                horizontalLineToRelative(9.8f)
                curveToRelative(0.07f, 0.32f, 0.1f, 0.66f, 0.1f, 1f)
                curveToRelative(0f, 2.76f, -2.24f, 5f, -5f, 5f)
                reflectiveCurveTo(1.5f, 8.76f, 1.5f, 6f)
                curveToRelative(0f, -0.34f, 0.04f, -0.68f, 0.1f, -1f)
                close()
                moveTo(12.13f, 17.25f)
                curveToRelative(0.57f, 0.98f, 0.87f, 2.11f, 0.87f, 3.25f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                reflectiveCurveToRelative(-0.5f, -0.22f, -0.5f, -0.5f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -0.97f, -0.25f, -1.92f, -0.73f, -2.75f)
                curveToRelative(-0.14f, -0.24f, -0.06f, -0.55f, 0.18f, -0.68f)
                curveToRelative(0.23f, -0.14f, 0.54f, -0.06f, 0.68f, 0.18f)
                close()
                moveTo(23.35f, 1.58f)
                curveToRelative(-0.03f, -0.02f, -3.28f, -1.46f, -3.47f, -1.52f)
                curveToRelative(-0.44f, -0.13f, -0.9f, -0.05f, -1.27f, 0.23f)
                curveToRelative(-0.38f, 0.28f, -0.6f, 0.73f, -0.6f, 1.2f)
                verticalLineToRelative(7.02f)
                curveToRelative(0f, 0.78f, -0.37f, 1.53f, -1f, 2f)
                lineToRelative(-4.27f, 3.2f)
                curveToRelative(-0.26f, 0.19f, -0.58f, 0.3f, -0.9f, 0.3f)
                horizontalLineToRelative(-5.33f)
                curveToRelative(-3.58f, 0f, -6.5f, 2.92f, -6.5f, 6.5f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -3.03f, 2.47f, -5.5f, 5.5f, -5.5f)
                horizontalLineToRelative(5.33f)
                curveToRelative(0.54f, 0f, 1.07f, -0.18f, 1.5f, -0.5f)
                lineToRelative(4.27f, -3.2f)
                curveToRelative(0.88f, -0.66f, 1.4f, -1.7f, 1.4f, -2.8f)
                verticalLineToRelative(-2.19f)
                lineToRelative(4.35f, -2.17f)
                curveToRelative(0.41f, -0.28f, 0.65f, -0.76f, 0.65f, -1.28f)
                reflectiveCurveToRelative(-0.24f, -0.99f, -0.65f, -1.28f)
                close()
                moveTo(22.84f, 3.27f)
                lineToRelative(-3.84f, 1.92f)
                lineTo(19f, 1.48f)
                curveToRelative(0f, -0.15f, 0.07f, -0.3f, 0.2f, -0.39f)
                curveToRelative(0.05f, -0.04f, 0.14f, -0.09f, 0.26f, -0.09f)
                curveToRelative(0.04f, 0f, 0.43f, 0.12f, 0.58f, 0.19f)
                lineToRelative(2.76f, 1.24f)
                curveToRelative(0.12f, 0.1f, 0.19f, 0.26f, 0.19f, 0.43f)
                curveToRelative(0f, 0.19f, -0.08f, 0.36f, -0.16f, 0.42f)
                close()
            }
        }.also { _Guide = it}
