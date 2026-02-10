package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PhoneRotary: ImageVector? = null

val Icons.Rr.PhoneRotary: ImageVector
    get() = _PhoneRotary ?: UXIcon(name = "PhoneRotary") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 10f)
                curveToRelative(-2.76f, 0f, -5f, 2.24f, -5f, 5f)
                reflectiveCurveToRelative(2.24f, 5f, 5f, 5f)
                reflectiveCurveToRelative(5f, -2.24f, 5f, -5f)
                reflectiveCurveToRelative(-2.24f, -5f, -5f, -5f)
                close()
                moveTo(12f, 18f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                reflectiveCurveToRelative(1.35f, -3f, 3f, -3f)
                reflectiveCurveToRelative(3f, 1.35f, 3f, 3f)
                reflectiveCurveToRelative(-1.35f, 3f, -3f, 3f)
                close()
                moveTo(20.65f, 10.96f)
                curveToRelative(1.88f, -0.2f, 3.35f, -1.78f, 3.35f, -3.71f)
                curveToRelative(0f, -1.42f, -0.56f, -2.76f, -1.59f, -3.79f)
                curveTo(17.84f, -1.11f, 6.16f, -1.11f, 1.59f, 3.46f)
                curveTo(0.56f, 4.49f, 0f, 5.84f, 0f, 7.25f)
                curveToRelative(0f, 1.93f, 1.48f, 3.51f, 3.35f, 3.71f)
                lineToRelative(-2.06f, 3.86f)
                curveToRelative(-0.85f, 1.59f, -1.29f, 3.38f, -1.29f, 5.18f)
                curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
                horizontalLineToRelative(16f)
                curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
                curveToRelative(0f, -1.8f, -0.45f, -3.59f, -1.29f, -5.18f)
                lineToRelative(-2.06f, -3.86f)
                close()
                moveTo(2f, 7.25f)
                curveToRelative(0f, -0.88f, 0.36f, -1.72f, 1.01f, -2.37f)
                curveToRelative(3.87f, -3.87f, 14.12f, -3.87f, 17.99f, 0f)
                curveToRelative(0.65f, 0.65f, 1.01f, 1.49f, 1.01f, 2.37f)
                curveToRelative(0f, 0.96f, -0.79f, 1.75f, -1.75f, 1.75f)
                horizontalLineToRelative(-0.68f)
                lineToRelative(-0.78f, -1.29f)
                curveToRelative(-0.41f, -0.69f, -1.01f, -1.23f, -1.73f, -1.56f)
                curveToRelative(-1.13f, -0.52f, -2.92f, -1.14f, -5.06f, -1.14f)
                reflectiveCurveToRelative(-3.93f, 0.62f, -5.06f, 1.14f)
                curveToRelative(-0.72f, 0.33f, -1.31f, 0.87f, -1.73f, 1.56f)
                lineToRelative(-0.78f, 1.29f)
                horizontalLineToRelative(-0.68f)
                curveToRelative(-0.96f, 0f, -1.75f, -0.79f, -1.75f, -1.75f)
                close()
                moveTo(20f, 22f)
                lineTo(4f, 22f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                curveToRelative(0f, -1.47f, 0.37f, -2.94f, 1.06f, -4.24f)
                lineToRelative(2.82f, -5.28f)
                lineToRelative(1.05f, -1.75f)
                curveToRelative(0.21f, -0.35f, 0.5f, -0.61f, 0.85f, -0.78f)
                curveToRelative(0.95f, -0.44f, 2.45f, -0.96f, 4.22f, -0.96f)
                reflectiveCurveToRelative(3.27f, 0.52f, 4.22f, 0.96f)
                curveToRelative(0.35f, 0.16f, 0.64f, 0.43f, 0.85f, 0.78f)
                lineToRelative(1.05f, 1.75f)
                lineToRelative(2.82f, 5.28f)
                curveToRelative(0.69f, 1.3f, 1.06f, 2.76f, 1.06f, 4.24f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                close()
            }
        }.also { _PhoneRotary = it}
