package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PersonBurst: ImageVector? = null

val Icons.Sr.PersonBurst: ImageVector
    get() = _PersonBurst ?: UXIcon(name = "PersonBurst") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.5f, 2.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                close()
                moveTo(20f, 6f)
                horizontalLineToRelative(-2f)
                curveToRelative(-2.21f, 0f, -4f, 1.79f, -4f, 4f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 1.47f, 0.81f, 2.75f, 2f, 3.44f)
                verticalLineToRelative(6.56f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(6f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-6.56f)
                curveToRelative(1.19f, -0.69f, 2f, -1.97f, 2f, -3.44f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                close()
                moveTo(14.33f, 5.26f)
                lineTo(12.0f, 0.95f)
                curveToRelative(-0.31f, -0.58f, -0.92f, -0.95f, -1.58f, -0.95f)
                reflectiveCurveToRelative(-1.27f, 0.36f, -1.58f, 0.95f)
                lineToRelative(-1.28f, 2.4f)
                lineTo(3.17f, 1.06f)
                curveToRelative(-0.63f, -0.33f, -1.38f, -0.21f, -1.87f, 0.3f)
                curveToRelative(-0.49f, 0.51f, -0.58f, 1.27f, -0.19f, 1.92f)
                lineToRelative(2.66f, 3.98f)
                lineToRelative(-2.91f, 1.34f)
                curveTo(0.32f, 8.88f, -0.01f, 9.43f, -0.0f, 10.04f)
                curveToRelative(0.01f, 0.61f, 0.37f, 1.15f, 0.95f, 1.4f)
                lineToRelative(2.85f, 1.18f)
                reflectiveCurveToRelative(-1.5f, 2.96f, -1.52f, 2.99f)
                curveToRelative(-0.22f, 0.6f, -0.08f, 1.26f, 0.37f, 1.72f)
                curveToRelative(0.45f, 0.46f, 1.1f, 0.61f, 1.73f, 0.4f)
                lineToRelative(3.18f, -1.2f)
                lineToRelative(1.36f, 2.54f)
                curveToRelative(0.31f, 0.59f, 0.92f, 0.95f, 1.58f, 0.95f)
                horizontalLineToRelative(0.02f)
                curveToRelative(0.67f, -0.01f, 1.28f, -0.38f, 1.58f, -0.98f)
                lineToRelative(1.19f, -2.33f)
                curveToRelative(-0.82f, -1.04f, -1.3f, -2.34f, -1.3f, -3.69f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -1.93f, 0.92f, -3.64f, 2.33f, -4.74f)
                close()
            }
        }.also { _PersonBurst = it}
