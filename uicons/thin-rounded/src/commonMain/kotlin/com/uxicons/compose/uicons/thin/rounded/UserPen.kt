package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserPen: ImageVector? = null

val Icons.Tr.UserPen: ImageVector
    get() = _UserPen ?: UXIcon(name = "UserPen") {
            path(fill = SolidColor(Color.Black)) {
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
                moveTo(12.77f, 15.94f)
                curveToRelative(-1.15f, -0.61f, -2.45f, -0.94f, -3.77f, -0.94f)
                curveToRelative(-4.41f, 0f, -8f, 3.59f, -8f, 8f)
                verticalLineToRelative(0.5f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                reflectiveCurveToRelative(-0.5f, -0.22f, -0.5f, -0.5f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0f, -4.96f, 4.04f, -9f, 9f, -9f)
                curveToRelative(1.48f, 0f, 2.94f, 0.37f, 4.24f, 1.06f)
                curveToRelative(0.24f, 0.13f, 0.34f, 0.43f, 0.2f, 0.68f)
                curveToRelative(-0.13f, 0.24f, -0.43f, 0.33f, -0.68f, 0.2f)
                close()
                moveTo(23.27f, 11.73f)
                curveToRelative(-0.94f, -0.94f, -2.59f, -0.94f, -3.54f, 0f)
                lineToRelative(-7.71f, 7.71f)
                curveToRelative(-0.66f, 0.66f, -1.02f, 1.54f, -1.02f, 2.48f)
                verticalLineToRelative(1.59f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(1.59f)
                curveToRelative(0.94f, 0f, 1.81f, -0.36f, 2.48f, -1.02f)
                lineToRelative(7.71f, -7.71f)
                curveToRelative(0.47f, -0.47f, 0.73f, -1.1f, 0.73f, -1.77f)
                reflectiveCurveToRelative(-0.26f, -1.3f, -0.73f, -1.77f)
                close()
                moveTo(22.56f, 14.56f)
                lineToRelative(-7.71f, 7.71f)
                curveToRelative(-0.47f, 0.47f, -1.1f, 0.73f, -1.77f, 0.73f)
                horizontalLineToRelative(-1.09f)
                verticalLineToRelative(-1.09f)
                curveToRelative(0f, -0.67f, 0.26f, -1.29f, 0.73f, -1.77f)
                lineToRelative(7.71f, -7.71f)
                curveToRelative(0.57f, -0.57f, 1.55f, -0.57f, 2.12f, 0f)
                curveToRelative(0.28f, 0.28f, 0.44f, 0.66f, 0.44f, 1.06f)
                reflectiveCurveToRelative(-0.16f, 0.78f, -0.44f, 1.06f)
                close()
            }
        }.also { _UserPen = it}
