package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Patient: ImageVector? = null

val Icons.Tr.Patient: ImageVector
    get() = _Patient ?: UXIcon(name = "Patient") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(9f, 12f)
                curveToRelative(3.31f, 0f, 6f, -2.69f, 6f, -6f)
                reflectiveCurveToRelative(-2.69f, -6f, -6f, -6f)
                reflectiveCurveToRelative(-6f, 2.69f, -6f, 6f)
                reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
                close()
                moveTo(9f, 1f)
                curveToRelative(2.76f, 0f, 5f, 2.24f, 5f, 5f)
                reflectiveCurveToRelative(-2.24f, 5f, -5f, 5f)
                reflectiveCurveToRelative(-5f, -2.24f, -5f, -5f)
                reflectiveCurveToRelative(2.24f, -5f, 5f, -5f)
                close()
                moveTo(12.29f, 15.71f)
                curveToRelative(-1.04f, -0.47f, -2.15f, -0.71f, -3.29f, -0.71f)
                curveToRelative(-4.41f, 0f, -8f, 3.59f, -8f, 8f)
                verticalLineToRelative(0.5f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                reflectiveCurveToRelative(-0.5f, -0.22f, -0.5f, -0.5f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0f, -4.96f, 4.04f, -9f, 9f, -9f)
                curveToRelative(1.29f, 0f, 2.54f, 0.27f, 3.71f, 0.8f)
                curveToRelative(0.25f, 0.11f, 0.36f, 0.41f, 0.25f, 0.66f)
                curveToRelative(-0.11f, 0.25f, -0.41f, 0.36f, -0.66f, 0.25f)
                close()
                moveTo(24f, 19.5f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                horizontalLineToRelative(-1.88f)
                curveToRelative(-0.16f, 0f, -0.33f, 0.17f, -0.43f, 0.41f)
                lineToRelative(-1.05f, 2.78f)
                curveToRelative(-0.19f, 0.5f, -0.59f, 0.81f, -1.05f, 0.81f)
                curveToRelative(-0.01f, 0f, -0.03f, 0f, -0.04f, 0f)
                curveToRelative(-0.49f, -0.02f, -0.9f, -0.39f, -1.06f, -0.93f)
                lineToRelative(-1.94f, -6.87f)
                curveToRelative(-0.04f, -0.16f, -0.13f, -0.2f, -0.14f, -0.2f)
                curveToRelative(-0.02f, 0f, -0.07f, 0.04f, -0.12f, 0.16f)
                lineToRelative(-1.05f, 2.78f)
                curveToRelative(-0.24f, 0.64f, -0.78f, 1.06f, -1.36f, 1.06f)
                horizontalLineToRelative(-1.88f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                reflectiveCurveToRelative(0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(1.88f)
                curveToRelative(0.16f, 0f, 0.33f, -0.17f, 0.43f, -0.41f)
                lineToRelative(1.05f, -2.78f)
                curveToRelative(0.2f, -0.52f, 0.62f, -0.83f, 1.1f, -0.81f)
                curveToRelative(0.49f, 0.02f, 0.9f, 0.39f, 1.06f, 0.93f)
                lineToRelative(1.94f, 6.87f)
                curveToRelative(0.04f, 0.16f, 0.13f, 0.2f, 0.14f, 0.2f)
                curveToRelative(0.02f, 0f, 0.07f, -0.04f, 0.12f, -0.16f)
                lineToRelative(1.05f, -2.78f)
                curveToRelative(0.24f, -0.64f, 0.78f, -1.06f, 1.36f, -1.06f)
                horizontalLineToRelative(1.88f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                close()
            }
        }.also { _Patient = it}
