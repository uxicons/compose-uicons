package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PersonPregnant: ImageVector? = null

val Icons.Rr.PersonPregnant: ImageVector
    get() = _PersonPregnant ?: UXIcon(name = "PersonPregnant") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8.5f, 2.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                close()
                moveTo(18f, 14.5f)
                curveToRelative(0f, 1.71f, -0.95f, 4.51f, -1.05f, 4.83f)
                curveToRelative(-0.14f, 0.4f, -0.52f, 0.67f, -0.94f, 0.67f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-3.19f)
                curveToRelative(-0.47f, -0.17f, -0.91f, -0.44f, -1.25f, -0.83f)
                curveToRelative(-0.57f, -0.65f, -0.83f, -1.5f, -0.73f, -2.36f)
                lineToRelative(0.89f, -7.14f)
                curveToRelative(0.25f, -1.99f, 1.95f, -3.49f, 3.95f, -3.49f)
                reflectiveCurveToRelative(3.7f, 1.5f, 3.95f, 3.49f)
                lineToRelative(0.01f, 0.05f)
                curveToRelative(1.92f, 0.9f, 3.18f, 2.82f, 3.18f, 4.96f)
                close()
                moveTo(16f, 14.5f)
                curveToRelative(0f, -1.5f, -0.97f, -2.83f, -2.41f, -3.31f)
                curveToRelative(-0.36f, -0.12f, -0.63f, -0.44f, -0.68f, -0.82f)
                lineToRelative(-0.08f, -0.63f)
                curveToRelative(-0.12f, -0.99f, -0.97f, -1.74f, -1.97f, -1.74f)
                reflectiveCurveToRelative(-1.84f, 0.75f, -1.97f, 1.74f)
                lineToRelative(-0.19f, 1.53f)
                lineToRelative(2.85f, 1.9f)
                curveToRelative(0.46f, 0.31f, 0.58f, 0.93f, 0.28f, 1.39f)
                curveToRelative(-0.19f, 0.29f, -0.51f, 0.45f, -0.83f, 0.45f)
                curveToRelative(-0.19f, 0f, -0.38f, -0.05f, -0.55f, -0.17f)
                lineToRelative(-2.01f, -1.34f)
                lineToRelative(-0.42f, 3.39f)
                curveToRelative(-0.04f, 0.29f, 0.05f, 0.57f, 0.24f, 0.79f)
                curveToRelative(0.19f, 0.22f, 0.46f, 0.34f, 0.75f, 0.34f)
                horizontalLineToRelative(6.27f)
                curveToRelative(0.31f, -1.01f, 0.73f, -2.58f, 0.73f, -3.5f)
                close()
            }
        }.also { _PersonPregnant = it}
