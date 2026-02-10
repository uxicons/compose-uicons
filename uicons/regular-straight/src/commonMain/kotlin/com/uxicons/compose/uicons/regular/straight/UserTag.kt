package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserTag: ImageVector? = null

val Icons.Rs.UserTag: ImageVector
    get() = _UserTag ?: UXIcon(name = "UserTag") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(8f, 12f)
                curveToRelative(3.31f, 0f, 6f, -2.69f, 6f, -6f)
                reflectiveCurveTo(11.31f, 0f, 8f, 0f)
                reflectiveCurveTo(2f, 2.69f, 2f, 6f)
                reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
                close()
                moveTo(8f, 2f)
                curveToRelative(2.21f, 0f, 4f, 1.79f, 4f, 4f)
                reflectiveCurveToRelative(-1.79f, 4f, -4f, 4f)
                reflectiveCurveToRelative(-4f, -1.79f, -4f, -4f)
                reflectiveCurveToRelative(1.79f, -4f, 4f, -4f)
                close()
                moveTo(23.17f, 16.11f)
                lineToRelative(-4.75f, -4.76f)
                lineToRelative(-6.44f, 0.85f)
                lineToRelative(-0.5f, 6.27f)
                lineToRelative(4.68f, 4.7f)
                curveToRelative(0.54f, 0.53f, 1.24f, 0.82f, 2.0f, 0.82f)
                curveToRelative(0.0f, 0f, 0.01f, 0f, 0.01f, 0f)
                curveToRelative(0.76f, -0.0f, 1.47f, -0.3f, 2.0f, -0.84f)
                lineToRelative(3.0f, -3.04f)
                curveToRelative(1.09f, -1.1f, 1.08f, -2.9f, -0.01f, -3.99f)
                close()
                moveTo(21.76f, 18.7f)
                lineToRelative(-3.0f, 3.04f)
                curveToRelative(-0.16f, 0.16f, -0.37f, 0.25f, -0.59f, 0.25f)
                horizontalLineToRelative(-0.0f)
                curveToRelative(-0.22f, 0f, -0.43f, -0.09f, -0.58f, -0.24f)
                lineToRelative(-4.03f, -4.05f)
                lineToRelative(0.3f, -3.73f)
                lineToRelative(3.86f, -0.51f)
                lineToRelative(4.05f, 4.06f)
                curveToRelative(0.32f, 0.32f, 0.33f, 0.85f, 0.01f, 1.18f)
                close()
                moveTo(4.5f, 14f)
                horizontalLineToRelative(5.33f)
                lineToRelative(-0.16f, 2f)
                horizontalLineToRelative(-5.17f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(5.5f)
                lineTo(0f, 24f)
                verticalLineToRelative(-5.5f)
                curveToRelative(0f, -2.48f, 2.02f, -4.5f, 4.5f, -4.5f)
                close()
                moveTo(18f, 16.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                close()
            }
        }.also { _UserTag = it}
