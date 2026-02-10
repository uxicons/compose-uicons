package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Risk: ImageVector? = null

val Icons.Sr.Risk: ImageVector
    get() = _Risk ?: UXIcon(name = "Risk") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13f, 9f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                close()
                moveTo(12f, 13f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
                moveTo(22.46f, 17.88f)
                curveToRelative(-0.81f, 1.44f, -2.65f, 1.95f, -4.08f, 1.15f)
                lineToRelative(-0.57f, -0.32f)
                curveToRelative(-0.82f, 0.73f, -1.77f, 1.3f, -2.8f, 1.69f)
                verticalLineToRelative(0.61f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                reflectiveCurveToRelative(-3f, -1.35f, -3f, -3f)
                verticalLineToRelative(-0.5f)
                curveToRelative(-1.09f, -0.36f, -2.11f, -0.94f, -2.99f, -1.69f)
                lineToRelative(-0.39f, 0.22f)
                curveToRelative(-1.44f, 0.81f, -3.27f, 0.29f, -4.08f, -1.15f)
                curveToRelative(-0.81f, -1.44f, -0.3f, -3.27f, 1.15f, -4.09f)
                lineToRelative(0.33f, -0.18f)
                curveToRelative(-0.1f, -0.54f, -0.15f, -1.08f, -0.15f, -1.63f)
                curveToRelative(0f, -0.54f, 0.05f, -1.07f, 0.14f, -1.6f)
                lineToRelative(-0.32f, -0.18f)
                curveToRelative(-1.44f, -0.81f, -1.96f, -2.64f, -1.15f, -4.09f)
                curveToRelative(0.39f, -0.7f, 1.03f, -1.2f, 1.81f, -1.42f)
                curveToRelative(0.77f, -0.22f, 1.58f, -0.12f, 2.28f, 0.27f)
                lineToRelative(0.36f, 0.2f)
                curveToRelative(0.89f, -0.77f, 1.91f, -1.35f, 3.02f, -1.72f)
                verticalLineToRelative(-0.46f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                reflectiveCurveToRelative(3f, 1.35f, 3f, 3f)
                verticalLineToRelative(0.57f)
                curveToRelative(1.04f, 0.39f, 2.0f, 0.97f, 2.83f, 1.71f)
                lineToRelative(0.55f, -0.31f)
                curveToRelative(0.7f, -0.39f, 1.51f, -0.49f, 2.28f, -0.27f)
                curveToRelative(0.77f, 0.22f, 1.41f, 0.72f, 1.81f, 1.42f)
                curveToRelative(0.81f, 1.44f, 0.3f, 3.27f, -1.15f, 4.09f)
                lineToRelative(-0.6f, 0.34f)
                curveToRelative(0.08f, 0.47f, 0.12f, 0.95f, 0.12f, 1.44f)
                curveToRelative(0f, 0.49f, -0.04f, 0.99f, -0.12f, 1.47f)
                lineToRelative(0.61f, 0.34f)
                curveToRelative(1.44f, 0.81f, 1.96f, 2.64f, 1.15f, 4.09f)
                close()
                moveTo(17.4f, 13.87f)
                lineToRelative(-4.18f, -7.17f)
                curveToRelative(-0.55f, -0.94f, -1.9f, -0.94f, -2.45f, 0f)
                lineToRelative(-4.18f, 7.17f)
                curveToRelative(-0.55f, 0.94f, 0.13f, 2.13f, 1.22f, 2.13f)
                horizontalLineToRelative(8.36f)
                curveToRelative(1.09f, 0f, 1.77f, -1.19f, 1.22f, -2.13f)
                close()
            }
        }.also { _Risk = it}
