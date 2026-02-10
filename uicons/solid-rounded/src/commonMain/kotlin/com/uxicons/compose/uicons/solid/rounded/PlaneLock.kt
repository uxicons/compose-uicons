package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PlaneLock: ImageVector? = null

val Icons.Sr.PlaneLock: ImageVector
    get() = _PlaneLock ?: UXIcon(name = "PlaneLock") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22f, 14.56f)
                verticalLineToRelative(-1.56f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                reflectiveCurveToRelative(-4f, 1.79f, -4f, 4f)
                verticalLineToRelative(1.56f)
                curveToRelative(-1.19f, 0.69f, -2f, 1.97f, -2f, 3.44f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
                horizontalLineToRelative(4f)
                curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -1.47f, -0.81f, -2.75f, -2f, -3.44f)
                close()
                moveTo(18f, 20.5f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(20f, 14f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                close()
                moveTo(10.46f, 22.31f)
                lineTo(7.79f, 23.87f)
                curveToRelative(-0.64f, 0.23f, -1.35f, 0.14f, -1.9f, -0.25f)
                reflectiveCurveToRelative(-0.89f, -1.02f, -0.89f, -1.7f)
                verticalLineToRelative(-0.0f)
                curveToRelative(0f, -0.82f, 0.41f, -1.58f, 1.1f, -2.04f)
                lineToRelative(1.9f, -1.42f)
                verticalLineToRelative(-4.55f)
                lineToRelative(-4.45f, 1.44f)
                curveToRelative(-0.82f, 0.28f, -1.73f, 0.14f, -2.43f, -0.36f)
                curveToRelative(-0.7f, -0.5f, -1.12f, -1.32f, -1.12f, -2.18f)
                curveToRelative(0f, -1.1f, 0.6f, -2.11f, 1.55f, -2.62f)
                lineToRelative(6.45f, -3.77f)
                verticalLineToRelative(-3.42f)
                curveToRelative(0f, -0.88f, 0.39f, -1.72f, 1.06f, -2.29f)
                curveToRelative(0.55f, -0.46f, 1.23f, -0.7f, 1.94f, -0.7f)
                curveToRelative(0.71f, 0.0f, 1.4f, 0.24f, 1.94f, 0.7f)
                curveToRelative(0.67f, 0.57f, 1.06f, 1.4f, 1.06f, 2.29f)
                verticalLineToRelative(3.42f)
                lineToRelative(1.75f, 1.02f)
                curveToRelative(-2.2f, 0.89f, -3.75f, 3.05f, -3.75f, 5.56f)
                verticalLineToRelative(0.55f)
                curveToRelative(-1.25f, 1.13f, -2f, 2.74f, -2f, 4.45f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 0.82f, 0.17f, 1.6f, 0.47f, 2.31f)
                close()
            }
        }.also { _PlaneLock = it}
