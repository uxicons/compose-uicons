package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChildHead: ImageVector? = null

val Icons.Ts.ChildHead: ImageVector
    get() = _ChildHead ?: UXIcon(name = "ChildHead") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(10f, 12f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                close()
                moveTo(15f, 11f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
                moveTo(24f, 11f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                horizontalLineToRelative(-0.6f)
                curveToRelative(-0.43f, 1.03f, -1.13f, 2.08f, -2.02f, 3f)
                horizontalLineToRelative(0.12f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                verticalLineToRelative(4.5f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-4.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-1.23f)
                curveToRelative(-1.51f, 1.19f, -3.35f, 2.0f, -5.27f, 2.0f)
                horizontalLineToRelative(-0.0f)
                curveToRelative(-1.92f, 0f, -3.76f, -0.81f, -5.27f, -2.0f)
                horizontalLineToRelative(-1.23f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(4.5f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-4.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(0.12f)
                curveToRelative(-0.89f, -0.92f, -1.59f, -1.97f, -2.02f, -3f)
                horizontalLineToRelative(-0.6f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                curveToRelative(0f, -1.52f, 1.14f, -2.79f, 2.62f, -2.98f)
                curveTo(3.33f, 3.42f, 7.29f, 0f, 12f, 0f)
                reflectiveCurveToRelative(8.67f, 3.43f, 9.38f, 8.04f)
                curveToRelative(1.5f, 0.2f, 2.62f, 1.46f, 2.62f, 2.96f)
                close()
                moveTo(23f, 11f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                horizontalLineToRelative(-0.45f)
                lineToRelative(-0.11f, -0.44f)
                curveToRelative(-0.47f, -4.31f, -4.1f, -7.56f, -8.45f, -7.56f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                reflectiveCurveToRelative(1.35f, 3f, 3f, 3f)
                reflectiveCurveToRelative(3f, -1.35f, 3f, -3f)
                horizontalLineToRelative(1f)
                curveToRelative(0f, 2.21f, -1.79f, 4f, -4f, 4f)
                reflectiveCurveToRelative(-4f, -1.79f, -4f, -4f)
                curveToRelative(0f, -0.89f, 0.29f, -1.71f, 0.78f, -2.37f)
                curveToRelative(-2.81f, 1.15f, -4.88f, 3.75f, -5.22f, 6.93f)
                lineToRelative(-0.05f, 0.45f)
                lineToRelative(-0.55f, -0.01f)
                curveToRelative(-1.06f, 0.0f, -1.95f, 0.9f, -1.95f, 2.0f)
                reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(1.29f)
                lineToRelative(0.12f, 0.33f)
                curveToRelative(0.98f, 2.73f, 4.16f, 5.67f, 7.59f, 5.67f)
                horizontalLineToRelative(0.0f)
                curveToRelative(3.42f, 0f, 6.6f, -2.94f, 7.59f, -5.67f)
                lineToRelative(0.12f, -0.33f)
                horizontalLineToRelative(1.29f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                close()
            }
        }.also { _ChildHead = it}
