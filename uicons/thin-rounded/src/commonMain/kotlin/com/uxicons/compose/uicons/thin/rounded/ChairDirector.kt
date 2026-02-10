package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChairDirector: ImageVector? = null

val Icons.Tr.ChairDirector: ImageVector
    get() = _ChairDirector ?: UXIcon(name = "ChairDirector") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.5f, 0f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(0.5f)
                lineTo(1f, 1f)
                lineTo(1f, 0.5f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                reflectiveCurveTo(0f, 0.22f, 0f, 0.5f)
                lineTo(0f, 11.15f)
                curveToRelative(0f, 1.33f, 0.74f, 2.54f, 1.94f, 3.13f)
                lineToRelative(8.95f, 4.47f)
                lineTo(2.28f, 23.05f)
                curveToRelative(-0.25f, 0.12f, -0.35f, 0.42f, -0.22f, 0.67f)
                curveToRelative(0.12f, 0.25f, 0.43f, 0.35f, 0.67f, 0.22f)
                lineToRelative(9.28f, -4.64f)
                lineToRelative(9.28f, 4.64f)
                curveToRelative(0.24f, 0.12f, 0.55f, 0.03f, 0.67f, -0.22f)
                curveToRelative(0.12f, -0.25f, 0.02f, -0.55f, -0.22f, -0.67f)
                lineToRelative(-8.61f, -4.3f)
                lineToRelative(8.95f, -4.47f)
                curveToRelative(1.19f, -0.6f, 1.94f, -1.8f, 1.94f, -3.13f)
                lineTo(24.0f, 0.5f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                close()
                moveTo(12f, 18.19f)
                lineToRelative(-7.9f, -3.95f)
                curveToRelative(1.88f, 0.38f, 4.57f, 0.76f, 7.9f, 0.76f)
                reflectiveCurveToRelative(6.03f, -0.38f, 7.9f, -0.76f)
                lineToRelative(-7.9f, 3.95f)
                close()
                moveTo(23f, 11.15f)
                curveToRelative(0f, 0.49f, -0.14f, 0.95f, -0.4f, 1.34f)
                curveToRelative(-0.04f, 0.02f, -4.13f, 1.51f, -10.61f, 1.51f)
                reflectiveCurveTo(1.44f, 12.51f, 1.4f, 12.49f)
                curveToRelative(-0.25f, -0.39f, -0.4f, -0.85f, -0.4f, -1.34f)
                verticalLineToRelative(-2.15f)
                lineTo(23f, 9.0f)
                verticalLineToRelative(2.15f)
                close()
                moveTo(23f, 8f)
                lineTo(1f, 8f)
                lineTo(1f, 2f)
                lineTo(23f, 2f)
                verticalLineToRelative(6f)
                close()
            }
        }.also { _ChairDirector = it}
