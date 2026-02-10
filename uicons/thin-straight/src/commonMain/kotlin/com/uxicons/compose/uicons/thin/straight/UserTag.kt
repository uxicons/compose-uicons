package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserTag: ImageVector? = null

val Icons.Ts.UserTag: ImageVector
    get() = _UserTag ?: UXIcon(name = "UserTag") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.29f, 16.68f)
                lineToRelative(-4.78f, -4.8f)
                lineToRelative(-6.04f, 0.8f)
                lineToRelative(-0.47f, 5.87f)
                lineToRelative(4.73f, 4.75f)
                curveToRelative(0.46f, 0.46f, 1.06f, 0.7f, 1.71f, 0.7f)
                horizontalLineToRelative(0.01f)
                curveToRelative(0.65f, -0.0f, 1.25f, -0.26f, 1.71f, -0.72f)
                lineToRelative(3.15f, -3.19f)
                curveToRelative(0.93f, -0.94f, 0.93f, -2.48f, -0.01f, -3.41f)
                close()
                moveTo(22.59f, 19.39f)
                lineToRelative(-3.15f, 3.19f)
                curveToRelative(-0.27f, 0.27f, -0.62f, 0.42f, -1.0f, 0.42f)
                curveToRelative(-0.36f, 0.01f, -0.74f, -0.15f, -1.01f, -0.41f)
                lineToRelative(-4.4f, -4.42f)
                lineToRelative(0.37f, -4.61f)
                lineToRelative(4.75f, -0.63f)
                lineToRelative(4.43f, 4.45f)
                curveToRelative(0.55f, 0.55f, 0.56f, 1.45f, 0.01f, 2.0f)
                close()
                moveTo(17f, 16f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                close()
                moveTo(9f, 12f)
                curveToRelative(3.31f, 0f, 6f, -2.69f, 6f, -6f)
                reflectiveCurveTo(12.31f, 0f, 9f, 0f)
                reflectiveCurveTo(3f, 2.69f, 3f, 6f)
                reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
                close()
                moveTo(9f, 1f)
                curveToRelative(2.76f, 0f, 5f, 2.24f, 5f, 5f)
                reflectiveCurveToRelative(-2.24f, 5f, -5f, 5f)
                reflectiveCurveToRelative(-5f, -2.24f, -5f, -5f)
                reflectiveCurveTo(6.24f, 1f, 9f, 1f)
                close()
                moveTo(4f, 14f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-6f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(6f)
                lineTo(0f, 24f)
                verticalLineToRelative(-6f)
                curveToRelative(0f, -2.21f, 1.79f, -4f, 4f, -4f)
                close()
            }
        }.also { _UserTag = it}
