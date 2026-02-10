package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PlaneClock: ImageVector? = null

val Icons.Tr.PlaneClock: ImageVector
    get() = _PlaneClock ?: UXIcon(name = "PlaneClock") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 12f)
                curveToRelative(-3.31f, 0f, -6f, 2.69f, -6f, 6f)
                reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
                reflectiveCurveToRelative(6f, -2.69f, 6f, -6f)
                reflectiveCurveToRelative(-2.69f, -6f, -6f, -6f)
                close()
                moveTo(12f, 23f)
                curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                reflectiveCurveToRelative(2.24f, -5f, 5f, -5f)
                reflectiveCurveToRelative(5f, 2.24f, 5f, 5f)
                reflectiveCurveToRelative(-2.24f, 5f, -5f, 5f)
                close()
                moveTo(13.85f, 19.15f)
                curveToRelative(0.2f, 0.2f, 0.2f, 0.51f, 0f, 0.71f)
                reflectiveCurveToRelative(-0.51f, 0.2f, -0.71f, 0f)
                lineToRelative(-1.5f, -1.5f)
                curveToRelative(-0.09f, -0.09f, -0.15f, -0.22f, -0.15f, -0.35f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                reflectiveCurveToRelative(0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineToRelative(2.29f)
                lineToRelative(1.35f, 1.35f)
                close()
                moveTo(24f, 11.5f)
                curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                horizontalLineToRelative(-2.5f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                reflectiveCurveToRelative(0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(2.5f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-4.43f)
                curveToRelative(-0.19f, 0f, -0.36f, -0.11f, -0.45f, -0.28f)
                lineToRelative(-4.0f, -7.96f)
                curveToRelative(-0.26f, -0.47f, -0.76f, -0.77f, -1.31f, -0.77f)
                horizontalLineToRelative(-0.18f)
                curveToRelative(-0.73f, -0.02f, -1.31f, 0.75f, -1.08f, 1.44f)
                lineToRelative(2.0f, 6.92f)
                curveToRelative(0.04f, 0.15f, 0.01f, 0.31f, -0.08f, 0.44f)
                curveToRelative(-0.1f, 0.13f, -0.24f, 0.2f, -0.4f, 0.2f)
                horizontalLineToRelative(-4.45f)
                curveToRelative(-1.2f, 0f, -2.33f, -0.47f, -3.18f, -1.32f)
                lineToRelative(-1.42f, -1.42f)
                curveToRelative(-0.28f, -0.28f, -0.71f, -0.35f, -1.07f, -0.16f)
                curveToRelative(-0.46f, 0.23f, -0.57f, 0.88f, -0.32f, 1.3f)
                lineToRelative(1.61f, 2.83f)
                curveToRelative(0.53f, 0.94f, 1.44f, 1.6f, 2.43f, 1.77f)
                curveToRelative(0.27f, 0.05f, 0.45f, 0.31f, 0.41f, 0.58f)
                curveToRelative(-0.05f, 0.27f, -0.31f, 0.45f, -0.58f, 0.41f)
                curveToRelative(-1.27f, -0.23f, -2.44f, -1.07f, -3.12f, -2.26f)
                lineToRelative(-1.61f, -2.82f)
                curveToRelative(-0.54f, -0.9f, -0.23f, -2.23f, 0.73f, -2.69f)
                curveToRelative(0.75f, -0.38f, 1.65f, -0.25f, 2.23f, 0.34f)
                lineToRelative(1.42f, 1.42f)
                curveToRelative(0.66f, 0.66f, 1.54f, 1.02f, 2.48f, 1.02f)
                horizontalLineToRelative(3.78f)
                lineToRelative(-1.82f, -6.28f)
                curveToRelative(-0.42f, -1.31f, 0.67f, -2.76f, 2.04f, -2.72f)
                horizontalLineToRelative(0.18f)
                curveToRelative(0.92f, 0f, 1.76f, 0.5f, 2.19f, 1.3f)
                lineToRelative(3.88f, 7.7f)
                horizontalLineToRelative(4.12f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                close()
            }
        }.also { _PlaneClock = it}
