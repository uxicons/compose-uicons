package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CurlingIron: ImageVector? = null

val Icons.Tr.CurlingIron: ImageVector
    get() = _CurlingIron ?: UXIcon(name = "CurlingIron") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 3f)
                curveToRelative(0f, -0.8f, -0.31f, -1.55f, -0.88f, -2.12f)
                curveToRelative(-1.17f, -1.17f, -3.07f, -1.17f, -4.24f, 0f)
                lineToRelative(-9.88f, 9.88f)
                verticalLineToRelative(-10.26f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                reflectiveCurveToRelative(-0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(10.27f)
                curveToRelative(-0.02f, 0.01f, -0.04f, 0.0f, -0.06f, 0.01f)
                curveToRelative(-1.78f, -0.64f, -3.79f, -0.22f, -5.16f, 1.15f)
                lineToRelative(-0.82f, 0.82f)
                curveToRelative(-0.2f, 0.2f, -0.2f, 0.51f, 0f, 0.71f)
                reflectiveCurveToRelative(0.51f, 0.2f, 0.71f, 0f)
                lineToRelative(0.82f, -0.82f)
                curveToRelative(0.96f, -0.96f, 2.31f, -1.33f, 3.6f, -1.06f)
                lineToRelative(-5.98f, 5.98f)
                curveToRelative(-0.71f, 0.71f, -1.11f, 1.66f, -1.11f, 2.67f)
                reflectiveCurveToRelative(0.39f, 1.96f, 1.11f, 2.67f)
                reflectiveCurveToRelative(1.66f, 1.11f, 2.67f, 1.11f)
                reflectiveCurveToRelative(1.96f, -0.39f, 2.67f, -1.11f)
                lineToRelative(6.3f, -6.3f)
                lineToRelative(0.83f, 0.83f)
                curveToRelative(0.2f, 0.2f, 0.51f, 0.2f, 0.71f, 0f)
                reflectiveCurveToRelative(0.2f, -0.51f, 0f, -0.71f)
                lineToRelative(-1.38f, -1.38f)
                lineToRelative(10.21f, -10.21f)
                curveToRelative(0.57f, -0.57f, 0.88f, -1.32f, 0.88f, -2.12f)
                close()
                moveTo(5.75f, 22.19f)
                curveToRelative(-1.05f, 1.05f, -2.88f, 1.05f, -3.93f, 0f)
                curveToRelative(-0.53f, -0.52f, -0.81f, -1.22f, -0.81f, -1.97f)
                reflectiveCurveToRelative(0.29f, -1.44f, 0.81f, -1.97f)
                lineToRelative(6.3f, -6.3f)
                lineToRelative(3.93f, 3.93f)
                close()
                moveTo(22.41f, 4.41f)
                lineTo(12.21f, 14.62f)
                lineTo(9.38f, 11.79f)
                lineTo(19.59f, 1.59f)
                curveToRelative(0.78f, -0.78f, 2.05f, -0.78f, 2.83f, 0f)
                curveToRelative(0.38f, 0.38f, 0.59f, 0.88f, 0.59f, 1.41f)
                reflectiveCurveToRelative(-0.21f, 1.04f, -0.59f, 1.41f)
                close()
            }
        }.also { _CurlingIron = it}
