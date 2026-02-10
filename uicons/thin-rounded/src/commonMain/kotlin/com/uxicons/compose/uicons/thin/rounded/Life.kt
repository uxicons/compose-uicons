package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Life: ImageVector? = null

val Icons.Tr.Life: ImageVector
    get() = _Life ?: UXIcon(name = "Life") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(11.0f, 8.66f)
                curveToRelative(0.29f, 0.22f, 0.65f, 0.34f, 1.0f, 0.34f)
                reflectiveCurveToRelative(0.7f, -0.11f, 1.0f, -0.34f)
                curveToRelative(1.04f, -0.79f, 4.0f, -3.58f, 4.0f, -5.91f)
                curveToRelative(0f, -1.52f, -1.23f, -2.75f, -2.75f, -2.75f)
                curveToRelative(-0.93f, 0f, -1.75f, 0.46f, -2.25f, 1.17f)
                curveToRelative(-0.5f, -0.71f, -1.32f, -1.17f, -2.25f, -1.17f)
                curveToRelative(-1.52f, 0f, -2.75f, 1.23f, -2.75f, 2.75f)
                curveToRelative(0f, 2.33f, 2.96f, 5.12f, 4.0f, 5.91f)
                close()
                moveTo(9.75f, 1f)
                curveToRelative(0.96f, 0f, 1.75f, 0.79f, 1.75f, 1.75f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f)
                curveToRelative(0f, -0.96f, 0.79f, -1.75f, 1.75f, -1.75f)
                reflectiveCurveToRelative(1.75f, 0.79f, 1.75f, 1.75f)
                curveToRelative(0f, 1.61f, -2.15f, 4.01f, -3.61f, 5.12f)
                curveToRelative(-0.23f, 0.18f, -0.55f, 0.18f, -0.78f, 0f)
                curveToRelative(-1.46f, -1.11f, -3.61f, -3.5f, -3.61f, -5.12f)
                curveToRelative(0f, -0.96f, 0.79f, -1.75f, 1.75f, -1.75f)
                close()
                moveTo(12f, 12f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                reflectiveCurveToRelative(1.35f, 3f, 3f, 3f)
                reflectiveCurveToRelative(3f, -1.35f, 3f, -3f)
                reflectiveCurveToRelative(-1.35f, -3f, -3f, -3f)
                close()
                moveTo(12f, 17f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
                close()
                moveTo(21.85f, 13.85f)
                lineToRelative(-5.85f, 5.85f)
                verticalLineToRelative(3.79f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                reflectiveCurveToRelative(-0.5f, -0.22f, -0.5f, -0.5f)
                verticalLineToRelative(-3.5f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(3.5f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                reflectiveCurveToRelative(-0.5f, -0.22f, -0.5f, -0.5f)
                verticalLineToRelative(-3.79f)
                lineToRelative(-5.85f, -5.85f)
                curveToRelative(-0.2f, -0.2f, -0.2f, -0.51f, 0f, -0.71f)
                reflectiveCurveToRelative(0.51f, -0.2f, 0.71f, 0f)
                lineToRelative(5.85f, 5.85f)
                horizontalLineToRelative(6.59f)
                lineToRelative(5.85f, -5.85f)
                curveToRelative(0.2f, -0.2f, 0.51f, -0.2f, 0.71f, 0f)
                reflectiveCurveToRelative(0.2f, 0.51f, 0f, 0.71f)
                close()
            }
        }.also { _Life = it}
